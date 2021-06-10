<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display All Books</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<h1>Welcome to Books dot Com</h1>
	<a href="/add">Add A New Book</a>
	<hr>
	<p>All Books Will Be Displayed Here</p>
	
	<table class="table table-dark">
	<thead>
	<tr>
	<td>id</td>
	<td>title</td>
	<td>language</td>
	<td>Description</td>
	<td>Number of Pages</td>
	</thead>
	<tbody>
	
		<c:forEach items="${allBooks}" var="book">
			<tr>
			<td>${book.id}</td>
			<td>${book.title}</td>
			<td>${book.language}</td>
			<td>${book.description}</td>
			<td>${book.numberOfPages}</td>
			</tr>
		</c:forEach>

	</tbody>
	</table>
	
	
	
	</div>
</body>
</html>