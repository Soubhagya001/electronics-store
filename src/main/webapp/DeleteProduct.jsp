<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Delete Product</title>
  <link rel="stylesheet" href="css/viewproduct.css"> <!-- or custom CSS -->
</head>
<body>
  <center>
    <h1>Product Deletion Status</h1>
    <%
      String msg = (String) request.getAttribute("msg");
      if (msg != null) {
    %>
      <p class="message"><%= msg %></p>
    <%
      } else {
    %>
      <p class="error">No response message received.</p>
    <%
      }
    %>
    <a href="AddProduct.html">Add product</a><br><br>
				<a href="view1">View Product Back to Product List</a><br><br>
				<a href="logout">Logout</a><br><br>
  </center>
</body>
</html>
