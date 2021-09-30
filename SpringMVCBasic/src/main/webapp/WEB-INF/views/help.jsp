<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- JSP Expression language NO NEED TO GET ATTRIBUTE directly use ${key} defined in controller ModelAndView --%>
<%-- isELignored = false will allow to read expression language --%>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<title>Help Page</title>
</head>
<body>
	<h2>Help Page!</h2>
	<%--
		String email = (String) request.getAttribute("email");
		String contact = (String) request.getAttribute("contact");
	--%>
	<p><label>Contact: </label>${contact}</p>
	<p><label>Email: </label>${email}<%--= email --%></p>
</body>
</html>
