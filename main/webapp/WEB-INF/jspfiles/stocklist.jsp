<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>
<table border="1">
	<tr>
		<th>SerialNumber</th>
	    <th>ProductId</th>
	    <th>product</th>
	    <th>Price</th>
		
		</tr>
		<c:forEach items="${sto}" var="c">
			<tr>
				<td>${c.sno}</td>
				<td>${c.productid}</td>
				<td>${c.name}</td>
				<td>${c.price}</td>
				
				</tr>
				</c:forEach>
				</table>
				</body>
				</html>