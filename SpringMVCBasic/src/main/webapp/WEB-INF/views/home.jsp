<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h2>Hello World!</h2>
	<h1>Hii</h1>
	<%
		String fname = (String) request.getAttribute("fname");
		String lname = (String) request.getAttribute("lname");
	%>
	
	<p><label>First Name: </label><%= fname %></p>
	<p><label>Last Name: </label><%= lname %></p>
</body>
</html>
