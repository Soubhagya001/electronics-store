<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
</head>
<body>
<center>
	<h1>
		<%
			session.invalidate();
			out.println("Loggout Successfully!!!!");
		%>
	</h1>
	<jsp:include page="index.html"/>
</center>

</body>
</html>