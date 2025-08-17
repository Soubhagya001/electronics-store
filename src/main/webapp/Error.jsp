<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><center><h1>
			<%
				String data=(String)request.getAttribute("msg");
				//response.sendError(HttpServletResponse.SC_NOT_FOUND,data);
			%>
			<%= data%><br><br>
			
			<a href="AddProduct.html">Add Product</a><br>
			<a href="view1">View product</a><br><br>
			<a href="logout">Logout</a><br><br>
</body>
</html>