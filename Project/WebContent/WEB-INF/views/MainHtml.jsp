<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="/Project/resources/css/stylemain.css" />
<script src="resources/js/jsmain.js"></script>

<title>YourCapital Admin Page</title>
</head>
<body>
	<div class="container">
		<p align="center">
			<img src="resources/img/Banner.jpg" />
		</p>
		<h2>Kandidaat toevoegen</h2>
		<p></p>
		<div id="maakVenster">
			<div id="spacer">
				<form:form id="form" method="post" modelAttribute="kandidaat">
					<div class="form-group">
						<form:label path="naam">
							<p>Naam:</p>
						</form:label>
						<form:input class="form-control" autofocus="autofocus"
							placeholder="naam" autocomplete="off" path="naam" value=""
							maxlength="25" required="required" />
					</div>
					<div class="form-group">
						<form:label path="leeftijd">
							<p>Leeftijd:</p>
						</form:label>
						<form:input oninput="maxLengthCheck(this)" class="form-control"
							path="leeftijd" placeholder="leeftijd" autocomplete="off"
							maxlength="2" value="" required="required" type="number" min="18"
							max="67" />
					</div>
					<div class="form-group">
						<form:label path="woonplaats">
							<p>Woonplaats:</p>
						</form:label>
						<form:input class="form-control" path="woonplaats"
							placeholder="woonplaats" autocomplete="off" value=""
							maxlength="25" required="required" />
					</div>
					<p></p>
					<p style="font-size: 5px">&nbsp</p>
			</div>
		</div>

		<input class="btn btn-lg btn-primary btn-block" type="submit"
			value="Toevoegen">
		</form:form>
		<hr>
		<p></p>
		<div>
		<a href="/Project/carousel">
		<form class="btn btn-lg btn-primary btn-block" id="right" action="/Project/carousel">Carousel</form></a>
		</div>
		<p></p>
		<h2>Huidige Kandidaten</h2>
		<div align="center" id="maakVenster2">
			<div id="spacer">
				<c:forEach items="${kandidaten}" var="kandidaat">
					<div id="maakVenster3">                                    
						<div id="spacer2">						
						<a href="<c:url value="/delete/${kandidaat.id}"/>">                       
                    <img class="crt" align="right" style=" display:block; position:relative; margin-top:1%; margin-right: -3%; border-style: solid; 
                    border-width: 2px; border-color: black; width:30px;height:30px;border-radius:15px;"src="resources/img/close.jpg"/>
							<p>
								<a id="black" href="<c:url value="/kandidaat/${kandidaat.id}"/>">
							</p>
							<img class="crt" align="left"
								style="margin-right: 2%; border-style: inset; border-width: 2px; border-color: black; width: 80px; height: 80px; border-radius: 15px; background-color: white;"
								src="${kandidaat.foto}" />
							<div id="relative" align="left" style="pointer-events:none;">

								<strong>${kandidaat.naam}</strong></a><br> <strong>Leeftijd:
									${kandidaat.leeftijd} jaar</strong><br> <strong>Woonplaats:
									${kandidaat.woonplaats}</strong>
							</div>
							<p style="font-size: 15px">&nbsp</p>
							<a href="<c:url value="/kandidaat/${kandidaat.id}"/>">
								<div class="right">
									<input id="lineHeight" class="btn btn-lg btn-primary btn-block"
										type="submit" value="Details">
							</a>
						</div>
						<p style="font-size: 1px">&nbsp</p>
					</div>
			</div>
			</c:forEach>
		</div>
	</div>
	<p>Last update: 25 april 2016</p>
	</div>
</body>
</html>