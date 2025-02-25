<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<title>Supplier Register-Form</title>
		<style>
				
				    body {
				        background-image: url('images/login.jpeg');
				        background-size: cover;
				        background-repeat: no-repeat;
				        text-align: center;
				        font-family: Arial, sans-serif;
				        color: #333;
				    }
				    h1 {
				        color: #4a8bc2; /* Light blue */
				    }
				    input[type="text"], input[type="password"] ,input[type="date"]{
				        padding: 10px;
				        border: 2px solid #5b9bd5; /* Light blue */
				        border-radius: 5px;
				    }
				    input[type="submit"] {
				        padding: 10px 20px;
				        color: white;
				        background-color: #5b9bd5; /* Light blue */
				        border: none;
				        border-radius: 5px;
				        cursor: pointer;
				        transition: background-color 0.3s ease;
				    }
				    input[type="submit"]:hover {
				        background-color: #4a8bc2; /* Slightly darker light blue */
				    }
				    .message.error {
				        color: red;
				    }
				    .message.success {
				        color: green;
				    }
					form{
						margin-top:340px;
						justify-content:center;
					}
				</style>
	</head>
	<body align="center">
		<h1>Supplier Register</h1>
		<form action="supreg" method="post">
		<input type="text" name="supplierid" placeholder="SupplierID"/><br><br>
			<c:if test="${not empty errorMessage}">
							<div class="message error">${errorMessage}</div>
							
						<c:if test="${not empty successMessage}">
							<div class="message success">${successMessage}</div>	
		<input type="text" name="name" placeholder="Name"/><br><br>
		<input type="text" name="cardnumber" placeholder="CardNumber"/><br><br>
		<input type="text" name="address" placeholder="Address"/><br><br>
	<input type="date" name="expirydate" placeholder="ExpiryDate"/><br><br>
		<input type="password" name="password" placeholder="Password"/><br><br>
			<input type="submit" value="Register here">
		</form>
	</body>
</html>