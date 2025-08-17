<%@page import="pack2.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="pack2.CustomerBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer HomePage</title>
</head>
<body><center>
		<h1>
 			<%
				CustomerBean cb = (CustomerBean) session.getAttribute("cbean");
			%>
			<h2>Welcome <%= cb.getFname() %>!</h2>
			<a href="ViewCustomerProductsServlet">View Products</a><br>
			<a href="logout">Logout</a>
			
		</h1>
	</center>

</body>
</html>