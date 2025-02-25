<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
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
        }
    </style>
</head>
<body style="background-image: url('images/milkproducts.jpeg'); background-size:cover; background-position:absolute; background-repeat: no-repeat; text-align:center">
    <h2>Product List</h2>

    <form action="orderpro" method="post">
        consumerId:<br>
        <input type="text" name="consumerid" value="${consumerid}" readonly><br>

        products:<br>
        <input type="text" name="products"><br>

        OrderId:<br>
        <input type="text" name="orderid"><br>

        Location:<br>
        <input type="text" name="location"><br>

        Order Within:<br>
        <input type="date" name="date"><br><br><br>

        <table>
            <tr>
                <th>Item</th>
                <th>Quantity</th>
                <th>Price</th>
                <th>Extended</th>
            </tr>
            <tr>
                <td>Milk</td>
                <td><input type="number" name="quantity1" value="1" onchange="calculateTotal()"></td>
                <td><input type="text" name="price1" value="500" readonly>RS</td>
                <td><input type="text" name="extended1" value="500" readonly>RS</td>
            </tr>
            <tr>
                <td>Curd</td>
                <td><input type="number" name="quantity2" value="1" onchange="calculateTotal()"></td>
                <td><input type="text" name="price2" value="200" readonly>RS</td>
                <td><input type="text" name="extended2" value="200" readonly>RS</td>
            </tr>
            <tr>
                <td>Ghee</td>
                <td><input type="number" name="quantity3" value="10" onchange="calculateTotal()"></td>
                <td><input type="text" name="price3" value="20" readonly>RS</td>
                <td><input type="text" name="extended3" value="200" readonly>RS</td>
            </tr>
            <tr>
                <td>ButterMilk</td>
                <td><input type="number" name="quantity4" value="10" onchange="calculateTotal()"></td>
                <td><input type="text" name="price4" value="20" readonly>RS</td>
                <td><input type="text" name="extended4" value="200" readonly>RS</td>
            </tr>
            <tr>
                <td>Paneer</td>
                <td><input type="number" name="quantity5" value="10" onchange="calculateTotal()"></td>
                <td><input type="text" name="price5" value="20" readonly>RS</td>
                <td><input type="text" name="extended5" value="200" readonly>RS</td>
            </tr>
            <tr>
                <td colspan="3"><strong>Total Amount</strong></td>
                <td><input type="text" name="totalAmount" id="totalAmount" readonly>RS</td>
            </tr>
        </table>

        <br>
        <button type="submit">Order</button>
    </form><br><br><br>

    <form action="searchconsumer" method="post">
        <input type="text" name="search" value="${consumerid}" readonly>
        <button type="submit">View History</button>
        <c:if test="${not empty errorMessage}">
            <div class="message error">${errorMessage}</div>
        </c:if>
    </form>

    <script>
        function calculateTotal() {
            let qty1 = document.getElementsByName("quantity1")[0].value;
            let price1 = document.getElementsByName("price1")[0].value;
            let extended1 = qty1 * price1;
            document.getElementsByName("extended1")[0].value = extended1;

            let qty2 = document.getElementsByName("quantity2")[0].value;
            let price2 = document.getElementsByName("price2")[0].value;
            let extended2 = qty2 * price2;
            document.getElementsByName("extended2")[0].value = extended2;

            let qty3 = document.getElementsByName("quantity3")[0].value;
            let price3 = document.getElementsByName("price3")[0].value;
            let extended3 = qty3 * price3;
            document.getElementsByName("extended3")[0].value = extended3;

            let qty5 = document.getElementsByName("quantity5")[0].value;
            let price5 = document.getElementsByName("price5")[0].value;
            let extended5 = qty5 * price5;
            document.getElementsByName("extended5")[0].value = extended5;

            let qty4 = document.getElementsByName("quantity4")[0].value;
            let price4 = document.getElementsByName("price4")[0].value;
            let extended4 = qty4 * price4;
            document.getElementsByName("extended4")[0].value = extended4;

            let totalAmount = extended1 + extended2 + extended3 + extended4 + extended5;
            document.getElementById("totalAmount").value = totalAmount;
        }

        calculateTotal(); // Initial calculation
    </script>
</body>
</html>
