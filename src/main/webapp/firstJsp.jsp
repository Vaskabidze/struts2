<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 09.11.2022
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h1>Testing JSP</h1>
<p>
    <%@ page import="com.example.webtest.StringClass" %>


    <%
        java.util.Date now = new java.util.Date();
        String date = "Текущее время: " + now;
    %>

    <%= date %>

    <%
        for (int i = 1; i < 5; i++) {
            out.println("<p>" + "Hello is " + i + "</p>");
        }
    %>
</p>
<p>
    <% StringClass stringClass = new StringClass(); %>
    <%= stringClass.getString() %>
</p>
</body>
</html>
