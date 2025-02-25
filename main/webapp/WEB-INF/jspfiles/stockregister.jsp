<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Add Stock</title>
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
        .form-container input[type="name"],
        .form-container input[type="number"] {
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
           
        }
        .form-container input[type="submit"]:hover {
            background: #ff8c69;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Register Here</h1>
        <form action="stockregistry" method="post">
            <input type="text" name="productid" placeholder="ProductID"/><br>
            <input type="name" name="name" placeholder="ProductName"/><br>
            <input type="number" name="price" placeholder="Price"/><br>
            <input type="submit" value="Register here">
        </form>
    </div>
</body>
</html>
