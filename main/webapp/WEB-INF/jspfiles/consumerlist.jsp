<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
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
        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px 0;
            font-size: 18px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
            background: #fff;
            border-radius: 10px;
            overflow: hidden;
        }
        table th, table td {
            padding: 12px 15px;
            border: 1px solid #ddd;
            text-align: center;
        }
        table th {
            background-color: #fcb69f;
            color: #fff;
        }
        table tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        table tr:hover {
            background-color: #f1c27d;
            color: #fff;
        }
        button {
            padding: 10px 15px;
            margin: 5px;
            border: none;
            border-radius: 5px;
            background-color: #FFA07A; /* Light Salmon */
            color: white;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        button a {
            text-decoration: none;
            color: inherit;
        }
        button:hover {
            background-color: #FF7F50; /* Coral */
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th>ConsumerId</th>
            <th>ConsumerName</th>
            <th>CardNumber</th>
            <th>Address</th>
            <th>Card.ExpDate</th>
        </tr>
        <c:forEach items="${consu}" var="c">
            <tr>
                <td>${c.consumerid}</td>
                <td>${c.name}</td>
                <td>${c.cardnumber}</td>
                <td>${c.address}</td>
                <td>${c.expirydate}</td>
                <td>
                    <button><a href="updateConsumer?consumerid=${c.consumerid}">Renew</a></button>
                    <button><a href="deleteConsumer?consumerid=${c.consumerid}">Delete</a></button>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
