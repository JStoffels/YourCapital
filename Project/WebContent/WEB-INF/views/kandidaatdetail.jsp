<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.min.css"/>
	
	
		<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
		<script>
		var root_url = '<c:url value="/" />';
		function eternal(){
			$('img').fadeToggle(4000, function(){
				eternal();
			});
		}
	
		function onClick(){
		$('img').click(function() {
		       $(this).toggle(1000);
		   });
		}
		
		function createBtn(){
			$(".crt").toggle(1000);
		}
	
		window.onload = function(){
			$(document).ready(function() {
				onLeave();
				onOver();
				onClick();
				$(".create_btn").click(createBtn);
				$(".create_btn").on('click',function(){
			        var r= $('<input type="button" value="new button"/>');
			        $("body").append(r);
			    });
						//eternal();
			});
		}
		</script>
	
	<style>
	img {
	    /*opacity: 0.4;
	    /*filter: alpha(opacity=40); /* For IE8 and earlier */
	    	/*background="http://vignette1.wikia.nocookie.net/disney/images/7/7e/Lego-marvel-superhero-Heroes_roster.png/revision/latest/scale-to-width-down/1024?cb=20150827225219"*/
	    border-radius:1000px;
	    border-style: inset;
	    border-width: 2px;
	    vertical-align: text-bottom;
	    
	} 
	body {
	    background-color: #324045;
	} 
	h2{
		color:white;
	}
	#black{
		color:black;
	}
	#maakVenster{
	
	    border-radius:10px;
	    background-color:#26B0BF;
	    margin-bottom:1%;
	}
	#maakVenster2{
		border-style: solid;
	    border-radius:10px;
	    border-width: 2px;
	    background-color:#B6BFC2;
	    overflow:hidden;
	    margin-left: 25%;
	    margin-right: 25%;
	    margin-bottom: 5%; 
	    margin-top: 1%;
	    font-family: verdana;
	}
	#maakVenster3{
		border-style: solid;
	    border-radius:10px;
	    border-width: 2px;
	    background-color:#7E8587;
	    position: relative;
		float: left;
	   	width: 300px;
	   	margin-left:2%;
	   	margin-top:2%;
	   	margin-bottom:1%;
	   	
	}
	#maakVenster3.a{
		color: #7E8587;
	}
	#spacer{
		margin-left:2%;
	    margin-right:5%;
	
	}
	#spacer2{
		margin-left:5%;
	    margin-right:5%;
	    margin-bottom:5%;
	    position: relative;
		float: right;
	   	width: 300px;
	}
	hr { 
	    display: block;
	    margin-top: 0.5em;
	    margin-bottom: 0.5em;
	    margin-left: auto;
	    margin-right: auto;
	    border-style: inset;
	    border-width: 1px;
		color:white;
	} 
	#left{
		position: relative;
		float: left;
		margin-left: 5%;
		margin-top: 5%;
		margin-bottom: 5%;
		margin-right: 5%;
	}
	#right{
		position: relative;
		align: right;
		float: right;
		margin-top: 5%;
		margin-bottom: 5%;
	}
	#relative{
	position:relative;
	}
	
</style>
	
	<title>YourCapital DetailPagina</title>
	</head>
	<body>
	<div class="container"> 
	<p align="center"><img src="http://vamers.com/wp-content/uploads/2013/08/Vamers-Games-LEGO-Marvel-Super-Heroes-Banner.jpg"/></p>
	
	<div id="maakVenster2">
	
	<img id="left" src="${kandidaat.foto}" height="350px">
	
	<p></p>
	
	<h1>Kandidaat: ${kandidaat.naam}</h1>
		<p>Leeftijd: ${kandidaat.leeftijd}</p>
		<p>Kandidaat ID: ${kandidaat.id}</p>
		<p>Woonplaats: ${kandidaat.woonplaats}</p>
		<p>Skills: <c:forEach items="${skills}" var="skill">
			<li>"${skill.naam}"
			<a href="<c:url value="/deleteskill/${skill.id}/${kandidaat.id}"/>">
			<input type="submit" value="Delete"></a></li>
			<p>
		</c:forEach>
			
		<form:form id="form" method="post" modelAttribute="kandidaat">
			<form:label path="naam">
				
			</form:label>
			<form:input path="naam" value="Voeg vaardigheid toe..." onFocus="value=''"/>
			
				<p></p>
			<input type="submit" value="Voeg toe">
		</form:form>
		<p></p>
		<a href="http://10.2.22.50/Project/zoek"><form class="btn btn-lg btn-primary btn-block" action="/Project/zoek">Zoekpagina</form></a>
		<a href="http://10.2.22.50/Project/home"><form class="btn btn-lg btn-primary btn-block" action="/Project/zoek">Home</form></a>
		<p></p>
		</div>
		</div>
	
				
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
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>