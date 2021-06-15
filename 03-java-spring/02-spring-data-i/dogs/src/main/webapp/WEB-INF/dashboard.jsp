<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display All Dogs</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">
</head>
<body>
<c:out value="${2+2}"/>



<div class="container">
<h1>Welcome to Dogs dot Com</h1>
<a href="add">Add A New Dog</a>
<hr>

<p>All Dogs Will Be Displayed Here</p>

<table class="table table-dark">
<thead>
<tr>
<td>id</td>
<td>Name</td>
<td>Species</td>
<td>Age</td>
</thead>
<tbody>

<c:forEach items="${allDogs}" var="dog">
<tr>
<td>${dog.id}</td>
<td><a href="/show/${dog.id}">${dog.name}</a></td>
<td>${dog.breed}</td>
<td>${dog.age}</td>
</tr>
</c:forEach>


</tbody>
</table>


</div>
</body>
</html>