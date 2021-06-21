<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Category Name: <c:out value="${category.name}"/></h1>

    <h3>Products:</h3> 
   	<ul>
		<c:forEach items="${ category.products }" var="product">
			<li>${ product.name }</li>			
		</c:forEach>
	</ul>
	
				<form action="/categories/${category.id}" method="POST">
		
			<label>Select products for the category: ${category.name}: </label> 
			
			<select name="product">
			
				<c:forEach items="${notInCategory}" var="prod">
				
			        	<option value="${prod.id}">${prod.name}</option>
			        	
			    </c:forEach> 
			    
			</select> 
			
			<button class="btn btn-outline-secondary btn-sm">Add</button>
			
		</form><br>
<!-- ... -->
</body>
</html>