<%@page import="pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product Page</title>

</head>
<body><center>
		<h1>
			<%
				AdminBean abean=(AdminBean)session.getAttribute("abean");
				String data=(String)request.getAttribute("msg");
				out.println(abean.getA_fname()+" "+data);
			%>
			<a href="AddProduct.html">Add product</a><br><br>
				<a href="view1">View Product</a><br><br>
				<a href="logout">Logout</a><br><br>
		</h1>
	</center>

</body>
</html>