<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%-- VARIABLES --%>
<%
	
%>

<%-- HTML5 --%>
<section id="sectionBookingCongratulation">

	<ol id="bookingStatus" class="bookStatus" data-progtrckr-steps="5">
	    <li class="bookStatus-done"><spring:message code="booking.flatChoice" text="unknow"/></li>
	    <li class="bookStatus-done"><spring:message code="booking.equipment" text="unknow"/></li>
	    <li class="bookStatus-done"><spring:message code="booking.pass" text="unknow"/></li>
	    <li class="bookStatus-done"><spring:message code="booking.summary" text="unknow"/></li>
	    <li class="bookStatus-done"><spring:message code="booking.payment" text="unknow"/></li>	    
	</ol>
	<hr>

	<div class="container">
	
		<div>
			
			<div class="hero-unit">
				<article id="bookingCongratulationConfirmation">
					<spring:message code="booking.yourOrder" text="unknow"/>
					<b>#<c:out value="${booking.id}"/></b> 
					<spring:message code="booking.isConfirmed" text="unknow"/><br>
					<spring:message code="booking.thankYou" text="unknow"/>
				</article>
			</div>
			
			<hr>
			
			<div class="row">
				<div class="span4">
					<h4><spring:message code="booking.bookingHistory" text="unknow"/></h4>
					<spring:message code="booking.informationHistory" text="unknow"/>
					<br /><br />
					<a href="history.customer" class="btn" id="bookingCancel">
					<spring:message code="booking.accessHistory" text="unknow"/>
					 &raquo;</a>
				</div>
			
				<div class="span8">
					<h4><spring:message code="booking.feedBack" text="unknow"/></h4>
					<spring:message code="booking.leaveComment" text="unknow"/>
					<jsp:include page="commentsInput.jsp" />
				</div>
			</div>
			
		</div>
		
	</div>
	
</section>

<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
</script>