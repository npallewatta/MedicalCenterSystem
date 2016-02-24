<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Doctor</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js">
	
</script>

</head>
<body>
	
	<c:if test="${not empty sessionScope.login}">
		
		<c:if test="${sessionScope.login.role eq 'doctor'}">

			<form action="doctor.htm" method="post" id="searchform" onsubmit="">
				<input type="hidden" name="patientDetailsId" id="patientDetailsId">
				<input type="hidden" name="url" id="url">
				<%=DateFormat.getDateInstance().format(new Date())%>
				<br>
				<p>
				<fieldset>
					<legend>Search Patient</legend>
					First Name<input type="text" name="firstName" id="firstName">
					Surname<input type="text" name="surName" id="surName"><br>
					<br> <input type="submit" value="get patient data"
						id="pdsearch" onclick="return validateForm()">
					<c:if test="${not empty patientDetails}">
						<select id="patientDropdown">
							<c:forEach items="${patientDetails}" var="patientDetails">
								<input type="hidden" name="${patientDetails.id}"
									id="${patientDetails.id}" value="${patientDetails.description}">
								<option value="${patientDetails.id}" >${patientDetails.firstName}
									${patientDetails.surName}</option>
								

							</c:forEach>
						</select>
						<script type="text/javascript">
							function getSelected() {
								var e = document
										.getElementById("patientDropdown");
								var selectedId = e.options[e.selectedIndex].value;
								
								document.getElementById("patientDetailsId").value = selectedId;
								if((document.getElementById(selectedId).value) == 'undefined' || (document.getElementById(selectedId).value) == ""){
										document.getElementById("description").value =  new Date()
								}else{
											document.getElementById("description").value = document
										.getElementById(selectedId).value + "\n\n" + new Date() + "\n";
								}
							}
							document.getElementById("patientDropdown")
									.addEventListener("click", getSelected);
						</script>
					</c:if>
				</fieldset>

				<p>
				<fieldset>
					<legend>Patient Profile</legend>
					<textarea rows="15" cols="50" id="description" name="description"
						id="description"></textarea>

					<input type="hidden" name="pdi" id="pdi">
					<!-- 					<input type="hidden" name="patientDetailsFirstName" id="patientDetailsFirstName"> -->
					<!-- 					<input type="hidden" name="patientDetailsSurName" id="patientDetailsSurName"> -->
					<!-- 					<input type="hidden" name="patientDetailsTelephone" id="patientDetailsTelephone"> -->
					<!-- 					<input type="hidden" name="patientDetailsAddress" id="patientDetailsAddress"> -->
					<!-- 					<input type="hidden" name="patientDetailsAge" id="patientDetailsAge"> -->
					<!-- 					<input type="hidden" name="patientDetailsPreviousDescription" id="patientDetailsPreviousDescription"> -->
					<br><br> <input type="submit" value="submit"
						onclick="getpatientId()">
				</fieldset>
			</form>
			<script>
				function validateForm() {
					var firstName = document.forms["searchform"]["firstName"].value;
					var surName = document.forms["searchform"]["surName"].value;
					document.getElementById("url").value="doctor.htm";
					if (firstName == null || firstName == "" || surName == null
							|| surName == "") {
						alert("Both First name and surnmae are required");
						return false;
					}
				}
				function getpatientId() {
					document.getElementById("url").value="patient.htm";
				}
			</script>
		</c:if>
	</c:if>
</body>
<div id="div1"></div>
</html>