<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
    <head>
        <title>Supply Products</title>
        <style>
          /*  body {
                background-image: url('images/supplier.jpeg');
                background-size: contain;
                background-repeat: no-repeat;
                text-align: center;
                font-family: Arial, sans-serif;
                padding: 20px;
				margin-left: 50px;
                color: #fff;
				background-position:absolute;
            }
*/
            h1 {
                color: #5b9bd5;
                font-size: 2.5em;
                margin-bottom: 20px;
            }

            form {
                background-color: rgba(255, 255, 255, 0.8); /* Light background for the form */
                padding: 20px;
				border: 2px solid #5b9bd5;
                border-radius: 10px;
                width:12%;
                margin: 0 auto;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            }

            input[type="text"], input[type="number"], input[type="date"], select, input[type="submit"] {
                padding: 10px;
                border: 2px  solid #5b9bd5; /* Blue border */
                border-radius: 5px;
                margin: 5px 0;
                width: 100%; /* Make input fields span the entire form width */
                box-sizing: border-box; /* Ensures padding doesn't affect width */
            }

            input[type="submit"] {
                background-color: #5b9bd5; /* Blue background */
                color: white;
                cursor: pointer;
                font-size: 1.1em;
            }

            input[type="submit"]:hover {
                background-color: #0056b3; /* Darker blue on hover */
            }

            .message.error {
                color: red;
                margin-top: 10px;
            }

            /* Optional: Add some styling for the select dropdown */
            select {
                padding: 10px;
                border: 2px solid #007BFF;
                border-radius: 5px;
                width: 100%; /* Ensure it fits the width of the form */
            }

        </style>
    </head>
    <body>	<body style="background-image: url('images/supplier.jpeg');	margin-left: 90px; background-size:contain; background-position:center center; background-repeat: no-repeat;  text-align:center">


        <h1>Supply Here</h1>
        <form action="productsupply" method="post">
            <input type="text" name="supplierid" value="${supplierid}" readonly/><br><br>
            <input type="text" name="supplyid" placeholder="SupplyID"/><br><br>
            <input type="text" name="partyname" placeholder="Name"/><br><br>
            <select name="type">
                <option value="Cow-Milk">Cow Milk</option>
                <option value="Buffalo-Milk">Buffalo Milk</option>
            </select><br><br>
            <input type="number" name="qty" placeholder="Qty"/> liter<br><br>
            <input type="date" name="date" placeholder="Date"/><br><br>
            <input type="submit" value="Supply Here"/>
        </form><br><br>

        <form action="searchsupplier" method="post">
            <input type="text" name="search" value="${supplierid}" readonly><br><br>
            <input type="submit" value="View History"/>
            <c:if test="${not empty errorMessage}">
                <div class="message error">${errorMessage}</div>
            </c:if>
        </form>

    </body>
</html>
