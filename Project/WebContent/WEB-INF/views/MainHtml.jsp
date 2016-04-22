<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
	<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css"/>
	
	
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
	    
	    
	}
	#maakVenster3{
		border-style: solid;
	    border-radius:10px;
	    border-width: 2px;
	    background-color:#7E8587;
	    position: relative;
		float: left;
	   	width: 300px;
	   	margin-left:4.5%;
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
	}
	#right{
		position: relative;
		align: right;
		float: right;
	}
	#relative{
	position:relative;
	}
	#smallbtn{
	width: 300px;
	}
	
</style>
	
	<title>YourCapital Home Page</title>
	</head>
	<body>
			<div class="container">
				<p align="center"><img src="http://vamers.com/wp-content/uploads/2013/08/Vamers-Games-LEGO-Marvel-Super-Heroes-Banner.jpg"/></p>
			 	
				<h2>Kandidaat toevoegen </h2>
				
				<p></p>
				<div id="maakVenster">
					<div id="spacer">
						<form:form id="form" method="post" modelAttribute="kandidaat">
							<div class="form-group">
								<form:label path="naam">
								<p>Naam:</p>
								</form:label>
								<form:input class="form-control" path="naam" value="" maxlength="25" required="required"/>
							</div>
							<div class="form-group">
								<form:label path="leeftijd">
								<p>Leeftijd:</p>
								</form:label>
								<form:input class="form-control" path="leeftijd" value="" type="number" required="required" min="18" max="67" maxlength="2"/>	
							</div>
							<div class="form-group">
								<form:label path="woonplaats">
								<p>Woonplaats:</p>
								</form:label>
								<form:input  class="form-control" path="woonplaats" value="" maxlength="25" required="required"/>	
							
							</div>	
							<p></p>
							
							<p style="font-size:5px">&nbsp</p>
							
					</div>
				</div>
				
				<input class="btn btn-lg btn-primary btn-block" type="submit" value="Toevoegen">
	
				</form:form>
				
				<hr>
				<p></p>
				<a href="http://10.2.22.50/Project/zoek"><form class="btn btn-lg btn-primary btn-block" id="right" action="/Project/zoek">Zoekpagina</form></a>
				
			 	<a href="http://10.2.22.50/Project/carousel"><form class="btn btn-lg btn-primary btn-block" id="right" action="/Project/carousel">Carousel</form></a>
				
				<h2>Huidige Kandidaten</h2>
				<div align="center" id="maakVenster2">
					<div id="spacer">
						<c:forEach items="${kandidaten}" var="kandidaat">	
							<div id="maakVenster3">
								<div id="spacer">	
										<p><a id="black" href="<c:url value="/kandidaat/${kandidaat.id}"/>"></p>
										<img class="crt" align="left" style=" margin-right: 2%; border-style: inset; border-width: 2px; border-color: black; width:80px;height:80px;border-radius:15px;background-color:white;"src="${kandidaat.foto}"/>
										<div id="relative">
										
										<strong>Naam: ${kandidaat.naam}</strong></a>
										<br><strong>Leeftijd: ${kandidaat.leeftijd}</strong>
										<br><strong>Woonplaats: ${kandidaat.woonplaats}</strong>							
										</div>									
									<a href="<c:url value="/delete/${kandidaat.id}"/>">
									<div class="right">
									<input class="btn btn-lg btn-primary btn-block" type="submit" value="Delete"></a> 
									</div>
									<p style="font-size:1px">&nbsp</p>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>
				<p>Last update: 21 april 2016</p>
					<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
				<script src="resources/bootstrap/js/bootstrap.min.js"></script>
			</div>
	</body>
</html>