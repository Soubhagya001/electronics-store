<%@page import="pack2.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Page</title>
</head>
<body><center>
		<h1>
<%
    CustomerBean cb = (CustomerBean) session.getAttribute("cbean");
    int charge = (Integer) request.getAttribute("charge");
%>

    <h2>Hello <%= cb.getFname() %>!</h2>
    <p>You have been charged ₹<%= charge %></p>
    <p>Your order is placed successfully!</p>
    <a href="ViewCustomerProductsServlet">View More Products</a><br>
    <a href="logout">Logout</a>


		</h1>
	</center>

</body>
</html>