<!DOCTYPE html>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<link rel="stylesheet" type="text/css"
	href="MedicalCenterSystem/css/style.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ABC Bill</title>
</head>
<body >
	<form action="bill.htm" method="post" id="dataForm" onload="loadData()">
	
	<c:if test="${not empty drugList}">
	<select>
		<c:forEach items="${drugList}" var="drug">
			<option value="${drug.id}">${drug.name}</option>
		</c:forEach>
	</select>
	</c:if>
	
		<div class="left">
			<table>
				<tr>
					<td>Consultant</td>
					<td>
						<%
							out.print(new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
						%>
					</td>
				</tr>
				<tr>
					<td>Patient</td>
					<td></td>
				</tr>
			</table>
		</div>
		<input type="submit" value="Create" /><br>
	</form>
	<script>
	(function() {	
	
		alert("submitting");
		//document.getElementById("dataForm").submit();
	})();
	
	</script>
</body>
</html>