<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<style>
	       body {
	           font-family: Arial, sans-serif;
	           background-color: #f3f3f3;
	           padding: 20px;
	       }
	       table {
	           width: 100%;
	           border-collapse: collapse;
	           margin: 20px 0;
	           font-size: 16px;
	           background-color: #fff;
	       }
	       table th, table td {
	           padding: 12px 15px;
	           border: 1px solid #ddd;
	           text-align: left;
	       }
	       table th {
	           background-color: #4CAF50;
	           color: #fff;
	       }
	       table tr:nth-child(even) {
	           background-color: #f9f9f9;
	       }
	       table tr:nth-child(odd) {
	           background-color: #fff;
	       }
	       table tr:hover {
	           background-color: #f1f1f1;
	       }
	       button {
	           padding: 8px 12px;
	           margin: 5px;
	           border: none;
	           border-radius: 3px;
	           background-color: #4CAF50;
	           color: white;
	           cursor: pointer;
	           font-size: 14px;
	       }
	       button a {
	           text-decoration: none;
	           color: white;
	       }
	       button:hover {
	           background-color: #45a049;
	       }
	   </style>
	<body>
<table border="1">
	<tr>
		<th>OrderId</th>
	    <th>ConsumerId</th>
	    <th>products</th>
	    <th>Price</th>
		<th>location</th>
		<th>Yet To Delivery</th>
		</tr>
		<c:forEach items="${bill}" var="c">
			<tr>
				<td>${c.orderid}</td>
				<td>${c.consumerid}</td>
				<td>${c.products}</td>
				<td>${c.price}</td>
				<td>${c.location}</td>
				<td>${c.date}</td>
				</tr>
				</c:forEach>
				</table>
				</body>
				</html>