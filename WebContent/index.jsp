<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Medical Center System Login</title>
</head>
<body>
	<form action="login.htm" method="post">
	
		<div class="inset">
			<p>
				<label for="email">EMAIL ADDRESS</label> <input type="text"
					name="username" id="email" >
			</p>
			<p>
				<label for="password">PASSWORD</label> <input type="password"
					name="password" id="password">
			</p>
			<p>
				<input type="checkbox" name="remember" id="remember"> <label
					for="remember">Remember</label>
			</p>
		</div>
		<p class="p-container">
			<span>Forgot password ?</span> <input type="submit" name="go" id="go"
				value="Log in">
		</p>
	</form>
</body>
</html>