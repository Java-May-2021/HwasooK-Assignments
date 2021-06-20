<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">
</head>
<body>
<form method="POST" action="/login">
<select name="thisUser">
<c:forEach items="${users}" var="user">
<option value="${user.id}">${user.firstName} ${user.lastName}</option>
</c:forEach>
</select>
<button>Login!</button>

</body>
</html>