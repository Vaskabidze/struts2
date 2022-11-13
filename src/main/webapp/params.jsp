<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 09.11.2022
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Params</title>
</head>
<body>
<h1>Params</h1>
<p>
    <%
    String name = request.getParameter("name");
    String surname = request.getParameter("surname");

    %>
    <%= "You'r name " + name + " " + surname%>

</p>

</body>
</html>
