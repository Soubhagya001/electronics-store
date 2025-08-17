<%@page import="pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Order</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background: #f4f4f4;
    margin: 0;
    padding: 0;
  }

  h1, h2 {
    color: #333;
  }

  center {
    margin-top: 50px;
  }

  form {
    background: white;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 2px 6px rgba(0,0,0,0.2);
    display: inline-block;
  }

  input[type="text"], input[type="password"], input[type="number"] {
    padding: 8px;
    width: 250px;
    margin: 8px 0;
    border: 1px solid #ccc;
    border-radius: 4px;
  }

  input[type="submit"], button, a.button {
    background-color: #007bff;
    color: white;
    padding: 10px 18px;
    margin-top: 12px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    text-decoration: none;
    font-size: 14px;
  }

  input[type="submit"]:hover, a.button:hover {
    background-color: #0056b3;
  }

  table {
    border-collapse: collapse;
    margin: 20px auto;
    background: white;
    box-shadow: 0 2px 6px rgba(0,0,0,0.1);
  }

  th, td {
    padding: 12px 16px;
    border: 1px solid #ddd;
  }

  th {
    background-color: #007bff;
    color: white;
  }

  tr:nth-child(even) {
    background-color: #f9f9f9;
  }

  .error {
    color: red;
    margin-top: 10px;
  }

  .message {
    color: green;
    margin-top: 10px;
  }
</style>

</head>
<body><center>
		<h1>
			<%
			AdminBean abean=(AdminBean)session.getAttribute("abean");
			String data=(String)request.getAttribute("msg");
			out.println("Hello "+abean.getA_fname()+"<br><br>");
			out.println(data+"<br><br>");
			%>
			<a href="AddProduct.html">Add product</a><br><br>
				<a href="view1">View Product</a><br><br>
				<a href="logout">Logout</a><br><br>
		</h1>
	</center>

</body>
</html>