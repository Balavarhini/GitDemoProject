<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<style>
	       .message.error {
	           color: red;
	       }
	       .message.success {
	           color: green;
	       }

	       input[type="text"], input[type="password"], input[type="number"], input[type="date"], select, button {
	           padding: 10px;
	           border: 2px solid #5b9bd5; /* Light blue */
	           border-radius: 5px;
	       }

	       /* Hide number input spinners in most modern browsers */
	       input[type="number"]::-webkit-outer-spin-button,
	       input[type="number"]::-webkit-inner-spin-button {
	           -webkit-appearance: none;
	           margin: 0;
	       }

	       /* For Firefox */
	       input[type="number"] {
	           -moz-appearance: textfield;
	       }

	       /* Apply transparent background to the entire table */
	       table {
	           width: 100%;
	           border-collapse: collapse;
	           background-color: rgba(255, 255, 255, 0.7); /* semi-transparent background */
	           border-radius: 10px; /* Optional: for rounded corners */
	           border: 2px solid #5b9bd5; /* Light blue */
	       }

	       /* Make table cells also semi-transparent */
	       th, td {
	           padding: 10px;
	           border: 2px solid #5b9bd5; /* Light blue */
	           text-align: center;
	           background-color: rgba(255, 255, 255, 0.5); /* transparent background for cells */
	       }

	       /* Optional: Add hover effect to table rows */
	       tr:hover {
	           background-color: rgba(0, 0, 0, 0.1);
	       }</style>
</head>
<body style="background-image: url('images/translist.jpeg'); background-size:cover; background-position:absolute; background-repeat: no-repeat; text-align:center">
    <table>
        <tr>
            <th>Vehicle Number</th>
            <th>Owner Name</th>
            <th>Contact</th>
            <th>Delivery-To</th>
            <th>Date</th>
        </tr>
        <c:forEach items="${trans}" var="c">
            <tr>
                <td>${c.vehiclenumber}</td>
                <td>${c.ownername}</td>
                <td>${c.contact}</td>
                <td>${c.delivery}</td>
                <td>${c.date}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
