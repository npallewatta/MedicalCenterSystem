<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Medical Center System Login</title>
</head>
<body>
<form action="login.htm" method="post">
username<input type="text" name="username"/><br>
password<input type="text" name="password"/><br>
<input type="submit" value="Submit" /><br>
</form>
<c:if test="${not empty login}">
   <p>${login.firstName}<p>
</c:if>
</body> 
</html>