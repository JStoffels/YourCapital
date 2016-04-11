<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<header>
	<h1>YourCapital</h1>
</header>
<title>YourCapital Home Page</title>
</head>
<body>
	<p>Test Kandidaat!</p>
	<p>${LijstTotaal}</p>
	<form method="get">
		First Name: <br> <input type="text" name="firstname"><br>
		<br>
		<input type="submit" value="Search">
	</form>	
	<c:forEach items="${LijstTotaal}" var="kandidaat">
		<li>${kandidaat.leeftijd}</li>
		<li>${kandidaat.naam}</li>
		<li>${kandidaat.arrSkills}</li>
	</c:forEach>
</body>
</html>