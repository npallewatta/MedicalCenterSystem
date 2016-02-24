package com.mcs.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mcs.entity.Login;
import com.mcs.entity.PatientDetails;

public class FrontController {

	public void getController(HttpServletRequest request, HttpServletResponse response) {

		String url = request.getRequestURI();
		PatientDetails patientDetails = null;

		if (url.equals("/MedicalCenterSystem/login.htm")) {

			LoginController loginController = new LoginController();
			loginController.validateLogin(request, response);

		} else if (url.equals("/MedicalCenterSystem/doctor.htm") && request.getParameter("url").equals("patient.htm")) {
			int id = Integer.parseInt(request.getParameter("patientDetailsId"));

			String patientDescription = request.getParameter("description");

			HttpSession session = request.getSession();
			List<PatientDetails> list = (List) session.getAttribute("patientDetails");

			if (list.size() == 1) {
				patientDetails = list.get(0);
			} else {
				for (Iterator iterator = list.iterator(); iterator.hasNext();) {
					PatientDetails patientDetails2 = (PatientDetails) iterator.next();
					if (patientDetails2.getId() == id) {
						patientDetails = patientDetails2;
					}

				}

			}

			patientDetails.setId(id);

			Date today = Calendar.getInstance().getTime();
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String reportDate = df.format(today);

			patientDetails.setDescriptionDate(reportDate);
			patientDetails.setDescription(patientDescription);

			PatientDetailsController patientDetailsController = new PatientDetailsController();
			patientDetailsController.saveDescription(patientDetails);

			request.setAttribute("page", "WEB-INF/jsp/welcome.jsp");

		} else if (url.equals("/MedicalCenterSystem/doctor.htm") && request.getParameter("url").equals("doctor.htm")) {
			String firstName = request.getParameter("firstName");
			String surName = request.getParameter("surName");
			String firstName1 = request.getParameter("patientDetailsFirstName");

			PatientDetailsController patientDetailsController = new PatientDetailsController();
			List<PatientDetails> patientDetailsList = patientDetailsController.getPatientDescription(firstName,
					surName);

			request.setAttribute("patientDetails", patientDetailsList);
			HttpSession ses = request.getSession(true);
			ses.setAttribute("patientDetails", patientDetailsList);
			request.setAttribute("page", "WEB-INF/jsp/welcome.jsp");

		} else if (url.equals("/MedicalCenterSystem/patientdetails.htm")) {
			String firstName = request.getParameter("patientFirstName");
			String surName = request.getParameter("patientSurName");
			String telephone = request.getParameter("telephone");
			String address = request.getParameter("address");
			String ageValue = request.getParameter("age");
			int age = 0;
			if (ageValue != null && ageValue != "") {
				age = Integer.parseInt(ageValue);
			}

			patientDetails = new PatientDetails();
			patientDetails.setFirstName(firstName);
			patientDetails.setSurName(surName);
			patientDetails.setTelephone(telephone);
			patientDetails.setAddress(address);
			patientDetails.setAge(age);

			PatientDetailsController patientDetailsController = new PatientDetailsController();
			patientDetailsController.saveDescription(patientDetails);

			request.setAttribute("page", "WEB-INF/jsp/patientdetails.jsp");
			
		}else if (url.equals("/MedicalCenterSystem/bill.htm")) {
			BillController billController = new BillController();
			billController.getDrugList(request, response);
		}

	}

}
