<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<form method="POST" action="/addjoke">
<p><label>Name</label>
<input type="text" name="name"></p>

<p><label>Email</label>
<input type="text" name="email"></p>

<p><textarea name="joke"></textarea>
<button>Submit</button></p>
</form>
</body>
</html>