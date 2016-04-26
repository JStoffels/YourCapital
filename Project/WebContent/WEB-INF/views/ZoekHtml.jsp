<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/stylemain.css" />
<script src="resources/js/jsmain.js"></script>
<title>YourCapital Home Page</title>
</head>
<body>
	<div class="container">
		<p align="center">
			<img src="/Project/resources/img/Banner.jpg" />
		</p>

		<h2>Zoekscherm...</h2>
		<p></p>
		<div id="maakVenster">
			<div id="spacer">
				<form:form id="form" method="get" modelAttribute="kandidaat">
					<div class="form-group">
						<form:label path="naam">
							<p>Naam:</p>
						</form:label>
						<form:input class="form-control" path="naam" value=""
							placeholder="naam" autofocus="autofocus" maxlength="25" />
					</div>
					<div class="form-group">
						<form:label path="leeftijd">
							<p>Leeftijd:</p>
						</form:label>
						<form:input class="form-control" path="leeftijd" value=""
							placeholder="leeftijd" oninput="maxLengthCheck(this)"
							maxlength="2" type="number" min="18" max="67" />
					</div>
					<div class="form-group">
						<form:label path="woonplaats">
							<p>Woonplaats:</p>
						</form:label>
						<form:input class="form-control" placeholder="woonplaats"
							maxlength="25" path="woonplaats" value="" />
					</div>
					<p></p>
					<p style="font-size: 5px">&nbsp</p>
			</div>
		</div>
		<input class="btn btn-lg btn-primary btn-block" type="submit" value="Zoek">
			<p></p>
		<a href="/Project/carousel"><input class="btn btn-lg btn-primary btn-block" action="/Project/carousel" value="Carousel"></a>
		</form:form>

		<hr>
		<p></p>
		<h2>Resultaat:</h2>
		<div align="center" id="maakVenster2">
			<div id="spacer">
				<form:form>
					<c:forEach items="${kandidaten}" var="kandidaat">

						<c:if test="${kandidaat.naam.equalsIgnoreCase(namen)}">
							<div id="maakVenster3">
								<div id="spacer2">
									<p>
										<a id="black"
											href="<c:url value="/zoekkandidaat/${kandidaat.id}"/>">
									</p>
									<img class="crt" align="left"
										style="margin-right: 2%; border-style: inset; border-width: 2px; border-color: black; width: 80px; height: 80px; border-radius: 15px; background-color: white;"
										src="${kandidaat.foto}" />
									<div id="relative" align="left" style="pointer-events:none;">

										<strong>Naam: ${kandidaat.naam}</strong></a> <br> <strong>Leeftijd:
											${kandidaat.leeftijd}</strong> <br> <strong>Woonplaats:
											${kandidaat.woonplaats}</strong>
									</div>
									<p style="font-size: 15px">&nbsp</p>
									<a href="<c:url value="/zoekkandidaat/${kandidaat.id}"/>">
										<div class="right">
											<input id="lineHeight"
												class="btn btn-lg btn-primary btn-block" value="View">
									</a>
								</div>
								<p style="font-size: 1px">&nbsp</p>
							</div>
			</div>
			</c:if>
			<c:if test="${leeftijd == kandidaat.leeftijd}">
				<div id="maakVenster3">
					<div id="spacer2">
						<p>
							<a id="black" href="<c:url value="/zoekkandidaat/${kandidaat.id}"/>">
						</p>
						<img class="crt" align="left"
							style="margin-right: 2%; border-style: inset; border-width: 2px; border-color: black; width: 80px; height: 80px; border-radius: 15px; background-color: white;"
							src="${kandidaat.foto}" />
						<div id="relative" align="left" style="pointer-events:none;">

							<strong>Naam: ${kandidaat.naam}</strong></a> <br> <strong>Leeftijd:
								${kandidaat.leeftijd}</strong> <br> <strong>Woonplaats:
								${kandidaat.woonplaats}</strong>
						</div>
						<p style="font-size: 15px">&nbsp</p>
						<a href="<c:url value="/zoekkandidaat/${kandidaat.id}"/>">
							<div class="right">
								<input id="lineHeight" class="btn btn-lg btn-primary btn-block"
									value="View">
						</a>
						<div class="right"></div>
						<p style="font-size: 1px">&nbsp</p>
					</div>
				</div>
		</div>
		</c:if>
		<c:if test="${kandidaat.woonplaats.equalsIgnoreCase(woonplaats)}">
			<div id="maakVenster3">
				<div id="spacer2">
					<p>
						<a id="black" href="<c:url value="/zoekkandidaat/${kandidaat.id}"/>">
					</p>
					<img class="crt" align="left"
						style="margin-right: 2%; border-style: inset; border-width: 2px; border-color: black; width: 80px; height: 80px; border-radius: 15px; background-color: white;"
						src="${kandidaat.foto}" />
					<div id="relative" align="left" style="pointer-events:none;">

						<strong>Naam: ${kandidaat.naam}</strong></a> <br> <strong>Leeftijd:
							${kandidaat.leeftijd}</strong> <br> <strong>Woonplaats:
							${kandidaat.woonplaats}</strong>
					</div>
					<p style="font-size: 15px">&nbsp</p>
					<a href="<c:url value="/zoekkandidaat/${kandidaat.id}"/>">
						<div class="right">
							<input id="lineHeight" class="btn btn-lg btn-primary btn-block"
								value="View">
					</a>
					<div class="right"></div>
					<p style="font-size: 1px">&nbsp</p>
				</div>
			</div>
	</div>
	</c:if>

	</c:forEach>
	</form:form>
	</div>
	</div>


	<p>last update: 25 april</p>
	</div>
</body>
</html>