<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello Human</h1>
	<h1>Hello ${ name }</h1>
	<p>Welcome to SpringBoot!</p>
	<c:out value="${2+2}"/>

</body>
</html>