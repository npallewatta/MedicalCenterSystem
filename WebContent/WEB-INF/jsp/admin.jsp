<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<h2>admin view</h2>
<form action="patientdetails.htm" method="post" onsubmit="return validate()">
<table>
<tr><td>First Name</td><td><input type="text" id="patientFirstName" name="patientFirstName"/></td></tr>
<tr><td>Surname</td><td><input type="text" id="patientSurName" name="patientSurName"/></td></tr>
<tr><td>Telephone</td><td><input type="text" id="telephone" name="telephone"/></td></tr>
<tr><td>Address</td><td><input type="text" id="address" name="address"/></td></tr>
<tr><td>Age</td><td><input type="text" id="age" name="age"/></td></tr>
</table>
<input type="submit" value="save patient details">
</form>
<script>
function validate(){
	var patientFirstName = document.getElementById("patientFirstName").value;
	var patientSurName = document.getElementById("patientSurName").value;
	var age = document.getElementById("age").value;
	
	if(patientFirstName==""||patientSurName==""){
		alert("Firstname and Surname required.");
		return false;
	}
	
	if(isNaN(age)){
		alert("Invalid value for age.");
		return false;
	}
}

</script>
</body>
</html>