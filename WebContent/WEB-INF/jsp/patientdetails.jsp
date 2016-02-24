<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Patient Details</title>
<script>
function validate(){
	
	if(isNaN(document.getElementById("age").value))
	{
		alert("Age should be a number");
		return false;
	}
	else{
		return true;
	}
}
</script>
</head>
<body>
<div>
<form action="patientdetails.htm" method="post" onsubmit="return validate()">
<table>
<tr><td>First Name</td><td><input type="text" id="patientFirstName" name="patientFirstName" /></td></tr>
<tr><td>Surname</td><td><input type="text" id="patientSurName" name="patientSurName"/></td></tr>
<tr><td>Telephone</td><td><input type="text" id="telephone" name="telephone"/></td></tr>
<tr><td>Address</td><td><input type="text" id="address" name="address"/></td></tr>
<tr><td>Age</td><td><input type="text" id="age" name="age"/></td></tr>
</table>
<input type="submit" value="save patient" >
</form>
</div>
</body>
</html>