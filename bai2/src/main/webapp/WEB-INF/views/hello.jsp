<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 8/1/2024
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="greeting" method="get">
    <input type="text" name="searchQuery">
    <button type="submit">search</button>
</form>
<br>
<p>${result}</p>
</body>
</html>
