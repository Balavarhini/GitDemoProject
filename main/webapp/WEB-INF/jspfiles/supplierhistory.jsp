<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head><b>History</b>
	<		<style>
		           body {
		               font-family: Arial, sans-serif;
		               background-color: #f4f4f4;
		               text-align: center;
		               padding: 20px;
		           }

		           table {
		               width: 80%;
		               margin: 20px auto;
		               border-collapse: collapse;
		               border: 2px solid #007BFF; /* Blue border */
		               background-color: #ffffff;
		           }

		           th, td {
		               padding: 12px;
		               border: 1px solid #007BFF; /* Blue border for cells */
		               text-align: center;
		           }

		           th {
		               background-color: #007BFF; /* Blue background for header */
		               color: white;
		           }

		           tr:nth-child(even) {
		               background-color: #f2f2f2;
		           }

		           tr:hover {
		               background-color: #d1e7ff; /* Light blue background on hover */
		           }
		       </style></head>
	<body>
		<table border="1">
		<tr>
			<th>SupplierID</th>
		    <th>SupplyID</th>
		    <th>Type</th>
		    <th>Quantity</th>
		    <th>Date</th></tr>
		<c:if test="${not empty con}">
		<c:forEach items="${con}" var="con">
		<tr>
			<td>${con.supplierid}</td>
			<td>${con.supplyid}</td>
			<td>${con.type}</td>
			<td>${con.quantity}</td>
			<td>${con.date}</td></tr>
		</c:forEach>
		</c:if>
		</body>
		</html>