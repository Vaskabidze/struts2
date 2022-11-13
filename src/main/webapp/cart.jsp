<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 09.11.2022
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Cart</h1>
<%@page import="com.example.webtest.Cart" %>
<%Cart cart = (Cart) session.getAttribute("Cart");%>
<p>Name: <%= cart.name%></p>
<p>Quantity: <%= cart.quantity%></p>
</body>
</html>
