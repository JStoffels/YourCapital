<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/Project/resources/css/stylemain.css" />
<script src="/Project/resources/js/jsmain.js"></script>
	
	<title>YourCapital DetailPagina</title>
	</head>
	<body>
	<div class="container"> 
	<p align="center"><img src="http://10.2.22.50/Project/resources/img/Banner.jpg" /></p>
	
	
	<a href="http://10.2.22.50/Project/zoek"><form class="btn btn-lg btn-primary btn-block" action="/Project/zoek">Zoekpagina</form></a>
	<p></p>
	<a href="http://10.2.22.50/Project/carousel"><form class="btn btn-lg btn-primary btn-block" action="/Project/carousel">Carousel</form></a>	
	<p></p>
	<div id="maakVenster2">
	
	<img id="left" style="margin-left:2%; margin-right:2%; margin-top:1%" src="${kandidaat.foto}" height="350px">
	
	<p></p>
	
	<h1>Kandidaat: ${kandidaat.naam}</h1>
		<p>Leeftijd: ${kandidaat.leeftijd}</p>
		<p>Kandidaat ID: ${kandidaat.id}</p>
		<p>Woonplaats: ${kandidaat.woonplaats}</p>
		<p><strong>Skills: </strong><c:forEach items="${skills}" var="skill">
			<li>"${skill.naam}"
			</li>
			<p>
		</c:forEach>			
		<form:form id="form" method="post" modelAttribute="kandidaat">
			<form:label path="naam">
			</form:label>
			</form:form>
		<p></p>
		<p></p>
		</div>
		</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>