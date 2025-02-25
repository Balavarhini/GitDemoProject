<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
	<link rel="stylesheet" href="css/style.css">
	<head>
		<title>Login Admin</title>
	</head>
	<body style="background-image: url('images/login.jpeg'); background-size: cover; background-repeat: no-repeat; text-align:center">
		<h1>Login Here</h1>
		<form action="adminloginn" method="post">
			
			<input type="text" name="adminid" placeholder="AdminID"/><br><br>
			<input type="password" name="password" placeholder="Password"/><br><br>
			<input type="submit" value="Login here">
		</form>
	</body>
</html>