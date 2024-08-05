<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 8/2/2024
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/addC">Add</a>
<table border="10" cellpadding="10" cellspacing="10">
    <thead>
    <tr>
        <th>STT</th>
        <th>NAME</th>
        <th>STATUS</th>
        <th colspan="2">ACTION</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${Categories}" var="c" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td>${c.name}</td>
            <td>${c.status ? "Active" : "Inactive"}</td>
            <td>
                <a href="<%=request.getContextPath()%>/editC/${c.id}">Edit</a>
            </td>
            <td>
                <a href="<%=request.getContextPath()%>/deleteC/${c.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
