<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<header>
	<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
	<script>
	
	function eternal(){
		$('img').fadeToggle(4000, function(){
			eternal();
		});
	}
	function onOver(){
	$('img').mouseenter(function() {
	       $(this).animate({
	           height: '+=50px'
	       }, { duration: 200, queue: false });
	   });
	}
	function onLeave(){
		$('img').mouseleave(function() {
		       $(this).animate({
		           height: '-=50px'
		       }, { duration: 200, queue: false });
		   });
		}
	function onClick(){
	$('img').click(function() {
	       $(this).toggle(1000);
	   });
	}
	window.onload = function(){
		$(document).ready(function() {
			onLeave();
			onOver();
			onClick();
			//eternal();
		});
	}
	</script>
	
	<p><img position="relative" id="js" src="http://vamers.com/wp-content/uploads/2013/08/Vamers-Games-LEGO-Marvel-Super-Heroes-Banner.jpg"/></p>

</header>
<title>YourCapital Home Page</title>
</head>
<body>
	<h2>Zoekscherm...</h2>
<<<<<<< HEAD
	<p>Lijst met kandidaten:</p>
	<c:forEach items="${kandidaten}" var="kandidaat">
		<li>"${kandidaat.naam}" is "${kandidaat.leeftijd}" jaar oud </li>
	</c:forEach>
=======
>>>>>>> refs/remotes/origin/master
	<p></p>
	<form:form id="form" method="post" modelAttribute="Kandidaat">
		
		<p>Kandidaat toevoegen:</p>
		<form:label path="naam">
		<p>Naam:</p>
		</form:label>
		<form:input path="naam" value=".."/>
		
		<form:label path="leeftijd">
		<p>Leeftijd:</p>
		</form:label>
<<<<<<< HEAD

		<form:input path="leeftijd"/>	
=======
		<form:input path="leeftijd" value=".."/>	
>>>>>>> refs/remotes/origin/master
			
		<p></p>
		<input type="submit" value="Search">
	</form:form>
	<p></p>
<<<<<<< HEAD


=======
	<p>Kandidaten in database:</p>
>>>>>>> refs/remotes/origin/master
	<c:forEach items="${kandidaten}" var="kandidaat">		
			<p><a href="<c:url value="/kandidaat/${kandidaat.id}"/>">
<<<<<<< HEAD
			Kandidaat ${kandidaat.id}: 
			${kandidaat.naam}, ${kandidaat.leeftijd}</a> <a href="<c:url value="/delete/${kandidaat.id}"/>"><input type="submit" value ="Delete"></a> </p>
=======
			Kandidaat ID: ${kandidaat.id}, naam ${kandidaat.naam}</a> <a href="<c:url value="/delete/${kandidaat.id}"/>"><input type="submit" value="Delete"></a> </p>
>>>>>>> refs/remotes/origin/master
	</c:forEach>
	

	<p>last update: 14 april</p>
</body>
</html>