package com.mcs.controller;

import java.util.List;

import com.mcs.dao.LoginManager;
import com.mcs.dao.PatientDetailsManager;
import com.mcs.entity.Login;
import com.mcs.entity.PatientDetails;

public class PatientDetailsController {

	public void saveDescription(PatientDetails patientDetails) {
		
		PatientDetailsManager patientDetailsManager = new PatientDetailsManager();
		patientDetailsManager.saveDescription(patientDetails);		
		
	}
	
	public List<PatientDetails> getPatientDescription(String firstName, String surName){
		
		PatientDetailsManager patientDetailsManager = new PatientDetailsManager();
		return patientDetailsManager.getDescription(firstName, surName);
		
	}
	
}
