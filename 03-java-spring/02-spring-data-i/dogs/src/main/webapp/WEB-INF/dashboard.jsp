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
<h3>Welcome ${user.firstName} ${user.lastName}</h3>
<a href="add">Add A New Dog</a> | <a href="/toys/new">Gift Dog A Toy</a>
<hr>

<p>All Dogs Will Be Displayed Here</p>

<table class="table table-dark">
<thead>
<tr>
<td>Action</td>
<td>Name</td>
<td>Species</td>
<td>Age</td>
<td>Number of Likes</td>
</thead>
<tbody>
<c:forEach items="${allDogs}" var="dog">
<tr>

<td>
<c:choose>
<c:when test="${dog.likers.contains(user)}">
<a href="/unlike/${dog.id}">Unlike</a>
</c:when>
<c:otherwise>
<a href="/like/${dog.id}">Like</a>
</c:otherwise>
</c:choose>
</td>

<td><a href="/show/${dog.id}">${dog.name}</a></td>
<td>${dog.breed}</td>
<td>${dog.age}</td>
<td>${dog.likers.size()}</td>
</tr>
</c:forEach>


</tbody>
</table>


</div>
</body>
</html>