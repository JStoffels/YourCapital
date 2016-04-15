<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<header>
	<p><img src="http://vamers.com/wp-content/uploads/2013/08/Vamers-Games-LEGO-Marvel-Super-Heroes-Banner.jpg"/></p>
	<h1><h1>
</header>
<title>YourCapital Home Page</title>
</head>
<body>
	<h2>Zoekscherm...</h2>
	<p></p>
	<form:form id="form" method="post" modelAttribute="Kandidaat">
		
		<p>Kandidaat zoeken:</p>
		<form:label path="naam">
		<p>Naam:</p>
		</form:label>
		<form:input path="naam" value=".."/>
		
		<form:label path="leeftijd">
		<p>Leeftijd:</p>
		</form:label>
		<form:input path="leeftijd" value=".."/>	
			
		<p></p>
		<input type="submit" value="Search">
	</form:form>
	<p></p>
	<p>Kandidaten in database:</p>
	<c:forEach items="${kandidaten}" var="kandidaat">		
			<p><a href="<c:url value="/kandidaat/${kandidaat.id}"/>">
			Kandidaat ID: ${kandidaat.id}, naam ${kandidaat.naam}</a> <a href="<c:url value="/delete/${kandidaat.id}"/>"><input type="submit" value="Delete"></a> </p>
	</c:forEach>
	
	<p>last update: 15 april</p>
</body>
</html>