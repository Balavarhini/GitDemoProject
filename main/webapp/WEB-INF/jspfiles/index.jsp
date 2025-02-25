<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <title>User</title>
    <style>
        body {
            background-image: url('images/home.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            text-align: center;
            font-family: Arial, sans-serif;
            color: #333;
        }
        h1 {
            font-size: 2.5em;
            color: #444;
            margin-top: 20px;
        }
        a {
            display: inline-block;
            margin: 10px 0;
            padding: 10px 20px;
            text-decoration: none;
            color: white;
            background-color: orange;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        a:hover {
            background-color: #FF4500;
        }
    </style>
</head>
<body>
    <h1>Farm...</h1>
    <a href="admin">Admin</a><br><br>
    <a href="consumer">Consumer</a><br><br>
    <a href="supplier">Supplier</a><br><br>
    <a href="workerlogin">Worker</a>
</body>
</html>
