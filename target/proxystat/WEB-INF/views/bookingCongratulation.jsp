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
	    <li class="bookStatus-done">Flat choice</li>
	    <li class="bookStatus-done">Equipment</li>
	    <li class="bookStatus-done">Pass</li>
	    <li class="bookStatus-done">Summary</li>
	    <li class="bookStatus-done">Payment</li>
	</ol>
	<hr>

	<div class="container">
	
		<div>
			
			<div class="hero-unit">
				<article id="bookingCongratulationConfirmation">
					Your order <b>#<c:out value="${booking.id}"/></b> is confirmed.<br>
					Thank you.
				</article>
			</div>
			
			<hr>
			
			<div class="row">
				<div class="span4">
					<h4>Booking history</h4>
					You can access your booking history and eventually cancel your order<br /><br />
					<a href="history.customer" class="btn" id="bookingCancel">Access booking history &raquo;</a>
				</div>
			
				<div class="span8">
					<h4>Feedback</h4>
					Leave a comment !
					<jsp:include page="commentsInput.jsp" />
				</div>
			</div>
			
		</div>
		
	</div>
	
</section>

<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
</script>