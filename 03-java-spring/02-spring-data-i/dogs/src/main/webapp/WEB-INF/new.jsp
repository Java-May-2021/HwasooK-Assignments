<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a New Dog</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">

</head>
<body>

	<div class="container">
	<h1>Add A New Dog</h1>
	<hr>
	
		<form:form method="POST" action="/add" modelAttribute="dog">
		<p>
		<form:label path="name">Name:
		<form:errors path="name"/>
		<form:input path="name"/></form:label>
		</p>
		
		<p>
		<form:label path="breed">Breed:
		<form:errors path="breed"/>
		<form:input path="breed"/></form:label>
		</p>
		
		<p>
		<form:label path="age">Age:
		<form:errors path="age"/>
		<form:input path="age"/></form:label>
		</p>
		<button>AddPup</button>
		</form:form>
				
	
	
		<hr>
		<c:forEach items="${errors}" var="err">
		<p>${err}</p>
		</c:forEach>
		
		<form action="/htmlway" method="POST">
			<div class="form-group">
				<label for="name">Name</label>
				<Input type="text" name="name">
			</div>
			<div class="form-group">
				<label for="breed">Breed</label>
				<Input type="text" name="breed">
			</div>
			<div class="form-group">
				<label for="age">Age</label>
				<Input type="text" name="age">
			</div>
			<button>Add Pet</button>
		</form>
	
	</div>


</body>
</html>