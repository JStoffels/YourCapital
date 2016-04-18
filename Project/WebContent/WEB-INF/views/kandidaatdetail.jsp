<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<header>
	<img src="http://vamers.com/wp-content/uploads/2013/08/Vamers-Games-LEGO-Marvel-Super-Heroes-Banner.jpg"/>
	
</header>
<title>Kandidaat overzicht</title>
</head>
<body>

		<h1>Kandidaat: ${kandidaat.naam}</h1>
		<p>${kandidaat.leeftijd}</p>
		Kandidaat ID ${kandidaat.id}:
		<p></p>
	
		<form:form id="form" method="post" modelAttribute="kandidaat">
			<form:label path="naam">
				<p>Skill toevoegen:</p>
			</form:label>
			<form:input path="naam" value=".." />
				<p></p>
			<input type="submit" value="Voeg toe">
		</form:form>
		<p>Skill verwijderen:</p>
		<c:forEach items="${skills}" var="skill">
			<li>"${skill.naam}"
			<a href="<c:url value="/deleteskill/${skill.id}"/>">
			<input type="submit" value="Delete"></a></li>
		</c:forEach>
		
	<script>
		window.onload = function() {
		var h1 = document.getElementsByTagName('h1')[0];
		var img = document.getElementsByTagName('img')[0];
		var size_span = document.getElementById('size');
		var size = 0;

		img.onclick = function() {
			img.width = (img.width) + 10;
			img.heigth = (img.heigth) + 10;
			size_span.innerText = size;
			size = size + 10;
			if (size % 15 == 0)
				document.body.style.backgroundColor = "green";
			else
				document.body.style.backgroundColor = "blue";
		}

		h1.onclick = function() {
			img.width = (img.width) - 10;
			img.heigth = (img.heigth) - 10;
			size.span_innerTekst = size;
			size = size - 10;
			if (size % 25 == 0)
				document.body.style.backgroundColor = "purple";
			else
				document.body.style.backgroundColor = "red";
			}
		}
	</script>
</body>
</html>