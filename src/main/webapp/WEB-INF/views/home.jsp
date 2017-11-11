<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<link type="text/css" href="<%=request.getContextPath()%>/resources/css/home.css" rel="stylesheet" media="screen">

<body>

	<jsp:include page="header.jsp" />
	
	

	  <div id="myCarousel" class="carousel slide">
      	<div class="carousel-inner">
        	
        	<div class="item active">
			  <img src="<%=request.getContextPath()%>/resources/img/home_1.jpg" alt=""/>
		      <div class="container">
            	<div class="carousel-caption">
			        <h1>ProxyStation</h1>
			        <p class="lead">
				        <a href="<%=request.getContextPath()%>/home.security?locale=en"/>
		  				<a href="<%=request.getContextPath()%>/home.security?locale=fr"/>
		  				<spring:message code="home.header" text=""/>
		  			</p>
			        <p>
				        <a href="creation.customer" class="btn btn-primary btn-large">
				        	<spring:message code="home.signup" text=""/>
			  			</a>
					</p>
			        <p>
				        <spring:message code="home.signup.message" text=""/>
					</p>
		      	</div>
		      </div>
		    </div>
		    
		    <div class="item">
		      <img src="<%=request.getContextPath()%>/resources/img/home_2.jpg" alt=""/>
		      <div class="container">
            	<div class="carousel-caption">
			        <h1>ProxyStation</h1>
			        <p>
				        <a href="creation.customer" class="btn btn-primary btn-large">
				        	<spring:message code="home.signup" text=""/>
			  			</a>
			        </p>
		      	</div>
		      </div>
		    </div>
		    
		    <div class="item">
		      <img src="<%=request.getContextPath()%>/resources/img/home_3.jpg" alt=""/>
		      <div class="container">
            	<div class="carousel-caption">
			        <h1>ProxyStation</h1>
			        <p>
				        <a href="creation.customer" class="btn btn-primary btn-large">
				        	<spring:message code="home.signup" text=""/>
			  			</a>
			  		</p>
		      	</div>
		      </div>
		    </div>
		    
		 </div>
		 
		 <a class="carousel-control left"  href="#myCarousel" data-slide="prev">&lsaquo;</a>
      	 <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
      	 
	  </div>

	<div class="container">

      <div class="row">
        <div class="span4">
          <h2>
		  	<spring:message code="home.box.flat.title" text=""/>
		  </h2>
          <p>
		  	<spring:message code="home.box.flat.content" text=""/>
		  </p>
        </div>
        <div class="span4">
          <h2>
		  	<spring:message code="home.box.equipment.title" text=""/>
          </h2>
          <p>
		  	<spring:message code="home.box.equipment.content" text=""/>
		  </p>
       </div>
        <div class="span4">
          <h2>
		  	<spring:message code="home.box.pass.title" text=""/>
		  </h2>
          <p>
		  	<spring:message code="home.box.pass.content" text=""/>
          </p>
          
        </div>
      </div>

      <hr>
      
	 <sec:authorize access="isAuthenticated()">
	 	<jsp:include page="commentsQuotations.jsp" />
	 </sec:authorize>

	</div>

<jsp:include page="footer.jsp" />

<script type="text/javascript" src='<%=request.getContextPath()%>/resources/bootstrap-carousel/bootstrap-carousel.js'></script>

<script type="text/javascript">
	
	$('#myCarousel').carousel({  
		  interval: 2000
	});  
	
</script>