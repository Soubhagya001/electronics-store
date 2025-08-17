<%@page import="pack1.ProductBean"%>
<%@page import="pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Page</title>
<style>
body {
  background: #eef2f3;
  font-family: 'Segoe UI', sans-serif;
}

.edit-box {
  width: 350px;
  margin: 100px auto;
  background: #fff;
  padding: 25px;
  border-radius: 8px;
  box-shadow: 0 3px 10px rgba(0,0,0,0.1);
}

h1 {
  text-align: center;
  margin-bottom: 20px;
}

input[type="text"] {
  width: 100%;
  padding: 10px;
  margin: 10px 0;
  border-radius: 4px;
  border: 1px solid #ccc;
}

input[type="submit"] {
  width: 100%;
  padding: 10px;
  background-color: #0077b6;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type="submit"]:hover {
  background-color: #023e8a;
}

</style>

</head>
<body><center>
		<h1>
			<%
				AdminBean abean=(AdminBean)session.getAttribute("abean");
				ProductBean pb=(ProductBean)request.getAttribute("pbean");
				out.println("Hello "+abean.getA_fname()+" Please Edit!!!!");
			%>
			<form action="update" method="post">
			product Price <input type="text" name=pprice value="<%= pb.getP_price()%>"><br><br>
			product Quantity <input type="text" name=pqty value="<%= pb.getP_qty()%>"><br><br>
			<input type="hidden" name=pcode value="<%= pb.getP_code()%>">
			<input type="submit" value="Update"><br><br>
			</form>
		</h1>
	</center>

</body>
</html>