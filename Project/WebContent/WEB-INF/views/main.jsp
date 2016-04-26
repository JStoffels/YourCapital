<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="/Project/resources/css/stylemain.css" />
<script src="/Project/resources/js/jsmain.js"></script>

<title>YourCapital Home Page</title>
</head>
<body>
	<div class="container">
		<p align="center">
			<img src="/Project/resources/img/Banner.jpg" />
		</p>
		<hr>
		<p></p>
		<a href="/Project/home">
		<form class="btn btn-lg btn-primary btn-block" id="right" action="/Project/home">
		Aanmelden als beheerder
		</form></a> 
		</div>
		<p></p>
		<div class="container">
		<a href="/Project/zoek">
		<form class="btn btn-lg btn-primary btn-block" id="right" action="/Project/zoek">
		Aanmelden als gebruiker
		</form></a>
		</div>
		<p></p>
		<div class="container">
		<a href="/Project/carousel">
		<form class="btn btn-lg btn-primary btn-block" id="right" action="/Project/carousel">
		Overzicht carousel
		</form>
		</a>
		<p>Last update: 25 april 2016</p>
		</div>
</body>
</html>