<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<title>Update Card</title>
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
		<h1>Update Card</h1>
		<form action="updatecards" method="post">
			<input type="text" name="consumerid" value="${consumer.consumerid}" readonly/>
			<input type="hidden" name="password" value="${consumer.password}"/><br><br>
			<input type="text" name="name" value="${consumer.name}"/><br><br>
			<input type="text" name="cardnumber" value="${consumer.cardnumber}"/><br><br>
			<input type="text" name="address" value="${consumer.address}"/><br><br>
			<input type="date" name="expirydate" value="${consumer.expirydate}"/><br><br>
			<input type="submit" value="update here">
		</form>
	</body>
</html>