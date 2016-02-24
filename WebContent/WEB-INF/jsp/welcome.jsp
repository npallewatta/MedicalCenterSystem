<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<c:choose>
	<c:when test="${not empty sessionScope.login}">
		<h2>Welcome ${login.role}</h2>

		<c:choose>
			<c:when test="${login.role eq 'admin'}">
				<jsp:include page="admin.jsp" />
			</c:when>
			<c:when test="${login.role eq 'doctor'}">
				<jsp:include page="doctor.jsp" />
			</c:when>
			<c:when test="${login.role eq 'receptionist'}">
				<jsp:include page="receptionist.jsp" />
			</c:when>
			<c:otherwise>
				<jsp:include page="bill.jsp" />
			</c:otherwise>
		</c:choose>
	</c:when>
	<c:otherwise>
   		<jsp:include page="bill.jsp" />
	</c:otherwise>
</c:choose>
</body>
</html>