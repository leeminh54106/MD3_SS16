<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 8/2/2024
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/editC" method="post">
    <input type="text" name="id" placeholder="id" value="${category.id}" readonly> <br>
    <input type="text" name="name" placeholder="name" value="${category.name}"> <br>
    <input type="radio" name="status" value="true" ${category.status ? "checked":''}> Active<br>
    <input type="radio" name="status" value="false" ${!category.status?'checked':''}> Inactive<br>
    <button type="submit">UPDATE</button>
</form>
</body>
</html>
