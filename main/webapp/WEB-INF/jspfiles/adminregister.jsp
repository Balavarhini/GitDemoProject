<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Register Admin</title>
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
        input[type="text"], input[type="password"] {
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
			margin-top:360px;
			justify-content:center;
		}
    </style>
</head>
<body>
    <h1>Admin-Register</h1>
    <form action="adminregistry" method="post">
        <input type="text" name="adminid" placeholder="AdminID"/><br><br>
        
        <c:if test="${not empty errorMessage}">
            <div class="message error">${errorMessage}</div>
        </c:if>
        <c:if test="${not empty successMessage}">
            <div class="message success">${successMessage}</div>
        </c:if>
        
        <input type="password" name="password" placeholder="Password"/><br><br>
        <input type="text" name="name" placeholder="Name"/><br><br>
        <input type="text" name="department" placeholder="Department"/><br><br>
        <input type="submit" value="Register here">
    </form>
</body>
</html>
