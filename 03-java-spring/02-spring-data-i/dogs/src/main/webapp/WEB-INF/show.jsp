<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deg Details</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>Details For ${dog.name}</h1>
<hr>
<p>Name: ${dog.name}</p>
<p>Breed: ${dog.breed}</p>
<p>Age: ${dog.age}</p>
<hr>

<c:choose>
<c:when test="${dog.tag != null}">
<h1>Dog has been registered!</h1>
<p>City: ${dog.tag.city}</p>
<p>State: ${dog.tag.state}</p>
</c:when>
<c:otherwise>
<h3>Register This Dog</h3>
<form:form method="POST" action="/tag/${dog.id}" modelAttribute="tag">
<div class="form-group">
<form:label path="city">City</form:label>
<form:errors path="city"/>
<form:input path="city"/>
</div>
<div class="form-group">
<form:label path="state">State</form:label>
<form:errors path="state"/>
<form:input path="state"/>
</div>
<button>Register</button>
</form:form>
</c:otherwise>
</c:choose>
<a href="/edit/${dog.id}" class="btn btn-danger">Edit</a>

</div>


</body>
</html>