<%@page import="java.util.Iterator"%>
<%@page import="pack1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pack1.AdminBean"%>

<%@ page import="java.util.*, pack1.ProductBean, pack1.AdminBean, pack2.CustomerBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Product Page</title>
<style>
body {
  background: #f8f9fa;
  font-family: 'Segoe UI', sans-serif;
}

h2 {
  text-align: center;
  margin-top: 30px;
  color: #212529;
}

table {
  margin: 40px auto;
  width: 90%;
  border-collapse: collapse;
  background: white;
  box-shadow: 0 2px 10px rgba(0,0,0,0.05);
}

th, td {
  padding: 14px 20px;
  border: 1px solid #dee2e6;
  text-align: center;
}

th {
  background-color: #1d3557;
  color: white;
}

tr:nth-child(even) {
  background-color: #f1f3f5;
}

a.button {
  padding: 6px 14px;
  background-color: #ff6b6b;
  color: white;
  text-decoration: none;
  border-radius: 5px;
  margin: 0 4px;
  font-size: 14px;
}

a.button:hover {
  background-color: #e63946;
}

</style>

</head>
<body>
<center>
<h1>
	<%@ page import="java.util.*, pack1.ProductBean, pack1.AdminBean, pack2.CustomerBean" %>
<%
    AdminBean abean = (AdminBean) session.getAttribute("abean");
    CustomerBean cbean = (CustomerBean) session.getAttribute("cbean");
    ArrayList<ProductBean> products = (ArrayList<ProductBean>) session.getAttribute("productlist");
%>

    <h2>Product List</h2>

    <% if (abean != null) { %>
      <p>Hello Admin <b><%= abean.getA_fname() %></b>, here are your product details:</p>

      <% if (products == null || products.isEmpty()) { %>
        <p>No products available.</p>
      <% } else { %>
        <table>
          <tr>
            <th>Code</th><th>Name</th><th>Company</th><th>Price</th><th>Qty</th><th>Actions</th>
          </tr>
          <% for (ProductBean pb : products) { %>
            <tr>
              <td><%= pb.getP_code() %></td>
              <td><%= pb.getP_name() %></td>
              <td><%= pb.getP_comp() %></td>
              <td><%= pb.getP_price() %></td>
              <td><%= pb.getP_qty() %></td>
              <td>
                <a class="button" href="edit?pcode=<%= pb.getP_code() %>">Edit</a>
                <a class="button" href="delete?pcode=<%= pb.getP_code() %>">Delete</a>
              </td>
            </tr>
          <% } %>
        </table>
      <% } %>

    <% } else if (cbean != null) { %>
      <p>Hello <b><%= cbean.getFname() %></b>, here are the available products to buy:</p>

      <% if (products == null || products.isEmpty()) { %>
        <p>No products available.</p>
      <% } else { %>
        <table>
          <tr>
            <th>Code</th><th>Name</th><th>Company</th><th>Price</th><th>Qty</th><th>Buy</th>
          </tr>
          <% for (ProductBean pb : products) { %>
            <tr>
              <td><%= pb.getP_code() %></td>
              <td><%= pb.getP_name() %></td>
              <td><%= pb.getP_comp() %></td>
              <td><%= pb.getP_price() %></td>
              <td><%= pb.getP_qty() %></td>
              <td><a class="button" href="BuyProduct.jsp?pcode=<%= pb.getP_code() %>">Buy</a></td>
            </tr>
          <% } %>
        </table>
      <% } %>

    <% } else { %>
      <p class="error">Session expired. Please login again.</p>
    <% } %>

    <br>
    <a href="logout" class="button">Logout</a>
 
	
</h1>
</center>
</body>
</html>