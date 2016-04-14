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
<title>Kandidaat overzicht</title>
</head>
<body>
<h1>Kandidaat: ${kandidaat.naam}</h1>
<p>ID: ${kandidaat.id}</p>
<p>Leeftijd: ${kandidaat.leeftijd}</p>


</body>
</html>