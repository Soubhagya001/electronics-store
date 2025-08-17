<%@page import="pack1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buy Product</title>
</head>
<body>
<center>
	<h1>
		<%
		  String pcode = request.getParameter("pcode");
        ArrayList<ProductBean> list = (ArrayList<ProductBean>) session.getAttribute("productlist");

		if (list == null || pcode == null) {
		%>
    <p class="error">Session expired or invalid product selected. Please try again.</p>
    <a href="ViewCustomerProductsServlet">Back</a>
	<%
    return;
	}

	ProductBean pb = null;
	for (ProductBean p : list) {
    if (p.getP_code().equals(pcode)) {
        pb = p;
        break;
    	}
	}

	if (pb == null) {
	%>
    <p class="error">Product not found.</p>
    <a href="ViewCustomerProductsServlet">Back</a>
	<%
    return;
	}
	%>


    <h2>Buy Product</h2>
    <form action="BuyProductServlet" method="post">
        <input type="hidden" name="pcode" value="<%= pb.getP_code() %>">
        <p>Product Name: <%= pb.getP_name() %></p>
        <p>Company: <%= pb.getP_comp() %></p>
        <p>Price: ₹<%= pb.getP_price() %></p>
        <p>Available Quantity: <%= pb.getP_qty() %></p>
        <label>Enter Quantity to Buy:</label><br>
        <input type="number" name="reqqty" required min="1" max="<%= pb.getP_qty() %>"><br><br>
        <input type="submit" value="Buy">
    </form>

		
	</h1>
</center>
</body>
</html>