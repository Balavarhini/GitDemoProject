<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Transport Register</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #ffecd2, #fcb69f);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .form-container {
            background: #fff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
            text-align: center;
        }
        .form-container h1 {
            margin-bottom: 20px;
            color: #333;
        }
        .form-container input[type="text"],
        .form-container input[type="number"],
        .form-container input[type="date"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        .form-container input[type="submit"] {
            background: #fcb69f;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            color: #fff;
            font-size: 16px;
            cursor: pointer;
            transition:0.3s ease;
        }
        .form-container input[type="submit"]:hover {
            background: #ff8c69;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Transport-Register</h1>
        <form action="transportreg" method="post">
            <input type="text" name="vnumber" placeholder="VehicleNumber"/><br>
            <input type="text" name="name" placeholder="ownername"/><br>
            <input type="number" name="contact" placeholder="Contact"/><br>
            <input type="text" name="delivery" placeholder="DeliverTo"/><br>
            <input type="date" name="date" placeholder="Date"/><br>
            <input type="submit" value="Register here">
        </form>
    </div>
</body>
</html>
