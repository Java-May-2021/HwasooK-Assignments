<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a new Book</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">

</head>
<body>

	<div class="container">
	<h1>Add A New Book</h1>
	<hr>
	
		<form:form method="POST" action="/add" modelAttribute="book">
		<p>
		<form:label path="title">Title:
		<form:errors path="title"/>
		<form:input path="title"/></form:label>
		</p>
		
		<p>
		<form:label path="language">Language:
		<form:errors path="language"/>
		<form:input path="language"/></form:label>
		</p>
		
		<p>
		<form:label path="description">Description:
		<form:errors path="description"/>
		<form:input path="description"/></form:label>
		</p>		
		
		<p>
		<form:label path="numberOfPages">numberOfPages:
		<form:errors path="numberOfPages"/>
		<form:input path="numberOfPages"/></form:label>
		</p>
		<button>Add Book</button>
		</form:form>
				
	
		<hr>
	
		<c:forEach items="${errors}" var="err">
		<p>${err}</p>
		
		</c:forEach>
	
		<form action="/htmlway" method="POST">
			<div class="form-group">
				<label for="title">Title</label>
				<Input type="text" name="title">
			</div>
			<div class="form-group">
				<label for="description">Description</label>
				<Input type="text" name="description">
			</div>
			<div class="form-group">
				<label for="language">Language</label>
				<Input type="text" name="language">
			</div>
			
			
			<div class="form-group">
				<label for="numberOfPages">numberOfPages</label>
				<Input type="text" name="numberOfPages">
			</div>
			<button>Add Book</button>
		</form>
	
	</div>


</body>
</html>