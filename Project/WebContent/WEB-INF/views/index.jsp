<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html >
  <head>
      	<script>
  		function onOver(){
      		$('img').mouseenter(function() {
             $(this).animate({
                 height: '+=50px'
             }, { duration: 200, queue: false });
         });
      		
      		window.onload = function(){
                $(document).ready(function() {
                                        onOver();
                    
                    });               
           	 }
    	  }
  		
		function goBack() {
	    	window.history.back();
	}
  		</script>
    <meta charset="UTF-8">
    <title>Choose your character!</title>
        
    <link rel='stylesheet' href='/Project/resources/css/stylesheet.css'>

        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
  <body>
	<style>
    	#black{
		color:black;

  </style>

	<header>
		<h1>Choose your character!</h1>
		<div align="center"><br><button onclick="goBack()">Return</button></div>
		<!--<div id="fps">Framerate: 0/60 FPS</div>-->
	</header>

	<div id="contentContainer" class="trans3d"> 
	
	<section id="carouselContainer" class="trans3d">
	
	<c:forEach items="${kandidaten}" var="kandidaat">	
		<figure id="item${kandidaat.id}" class="carouselItem trans3d"><div class="carouselItemInner trans3d">
		<a id="black" href="<c:url value="/kandidaat/${kandidaat.id}"/>"><img id="imgborder" src="${kandidaat.foto}" height="125px"/>
		<p style="font-size:25px; color:black;">${kandidaat.naam}</a></p></div></figure>
	</c:forEach>
	</section>
	</div>
    <script src='http://www.johnblazek.net/codepen-resources/3d-carousel/js/libs.min.js'></script>

        <script src="${pageContext.request.contextPath}/resources/js/index.js"></script>
  </body>
</html>
