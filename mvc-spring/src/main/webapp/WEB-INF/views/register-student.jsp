<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save student</title>
</head>
<body>
	<h1 align = "center"> Welcome to Andhra University</h1>
	<hr>
	
	<br>
	<br>
	<form:form method="post" action="../student/save" modelAttribute="student">
		<div align="center">
				<label>Name : </label>
				<input type="text" name="name" placeholder="Enter Name">
				<br>
				<br>
				<label>ID : </label>
				<input type="text" name="id" placeholder="Enter ID">
				<br>
				<br>
				<label>College : </label>
				<input type="text" name="college" placeholder="Enter College">
				<br>
				<br>
				<label>Location : </label>
				<input type="text" name="location" placeholder="Enter Location">
				<br>
				<br>
				<input type="submit" value="save">
		</div>
	</form:form>

</body>
</html>

<!--  student.name
student.id
student.college
student.location

http://localhost:8080/mvc-spring/onboard/student.save
../student/save
 -->

