<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html>
	<head>
		<title>Rit Detail View</title>
	</head>
	<body>
		<h1>Kandidaat: ${kandidaat.naam}</h1>
		<p>${kandidaat.leeftijd}</p>
			Kandidaat ID ${kandidaat.id}: 
		<p></p>
		
		<form:form id="form" method="post" modelAttribute="Kandidaat">
			<form:label path="skill">
			<p>Skill toevoegen:</p>
			</form:label>
			<form:input path="skill" value=".."/>
			<p></p>
			<input type="submit" value="ADD">
		</form:form>
		
	</body>
</html>