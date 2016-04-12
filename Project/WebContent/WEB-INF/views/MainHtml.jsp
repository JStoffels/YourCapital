<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<header>
	<h1>YourCapital</h1>
</header>
<title>YourCapital Home Page</title>
</head>
<body>
	<h2>Zoekscherm...</h2>
	<p>Lijst met kandidaten:</p>
	<c:forEach items="${LijstTotaal}" var="kandidaat">
		<li>"${kandidaat.naam}" is "${kandidaat.leeftijd}" jaar oud en heeft
			de volgende vaardigheden: "${kandidaat.arrSkills}".</li>
	</c:forEach>
	<p></p>
	<form:form id="form" method="post" modelAttribute="Kandidaat">
		<form:label path="naam">
		Zoek op naam: 
		</form:label>
		<form:input path="naam" />
		<form:label path="leeftijd">
		Zoek op leeftijd: 
		</form:label>
		<form:input path="leeftijd" />
		<input type="submit" value="Search">
	</form:form>
	<p></p>
	
	<c:forEach items="${LijstTotaal}" var="kandidaat">
		<c:if test="${naam == kandidaat.naam}">
		<p>${kandidaat.naam}, ${kandidaat.leeftijd}, ${kandidaat.arrSkills}</p>
		</c:if>
	</c:forEach>
	
	<c:forEach items="${LijstTotaal}" var="kandidaat">
		<c:if test="${leeftijd == kandidaat.leeftijd}">
		<p>${kandidaat.naam}, ${kandidaat.leeftijd}, ${kandidaat.arrSkills}</p>
		</c:if>
	</c:forEach>
	<p>last update: 12 april</p>
</body>
</html>