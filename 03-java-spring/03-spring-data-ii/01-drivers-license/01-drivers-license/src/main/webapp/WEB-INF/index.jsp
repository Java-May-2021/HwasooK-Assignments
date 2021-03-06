<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Persons and Licenses</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">
</head>
<body>
<h1>Persons and Licenses</h1>
<hr>
<a href="/persons/new">Create a Person</a> | <a href="/licenses/create">Create License</a>
<hr>
<table>
<tr>
<th>id</th>
<th>first name</th>
<th>last name</th>
</tr>
<tbody>
<c:forEach items="${persons}" var="person">
<tr>
<td>${person.id}</td>
<td>${person.firstName}</td>
<td>${person.lastName}</td>
</tr>
</c:forEach>

</tbody>

</table>
</body>
</html>