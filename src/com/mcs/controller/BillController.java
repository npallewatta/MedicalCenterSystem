package com.mcs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mcs.dao.BillManager;
import com.mcs.entity.Drug;

public class BillController {
	
	BillManager billManager = new BillManager();
	
	public void getDrugList(HttpServletRequest request, HttpServletResponse response){
		List<Drug> drugList = billManager.getDrugList();
		request.setAttribute("drugList", drugList);
		request.setAttribute("page", "WEB-INF/jsp/welcome.htm");
	}

}
