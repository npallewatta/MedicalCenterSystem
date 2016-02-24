package com.mcs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mcs.dao.LoginManager;
import com.mcs.entity.Login;

public class LoginController {

	public void validateLogin(HttpServletRequest request, HttpServletResponse response) {
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		Login login = new Login();
		login.setUserName(userName);
		login.setPassword(password);

		
		LoginManager loginManager = new LoginManager();
		login = loginManager.validateLogin(login);
		
		HttpSession session = request.getSession();
		session.setAttribute("login", login);

		request.setAttribute("page", "WEB-INF/jsp/welcome.jsp");
	}
	
}
