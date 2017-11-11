<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>


<%-- HEAD --%>
<jsp:include page="header.jsp" />

<%-- BODY --%>

	<hr>
	<div class="container">
		

		<%-- HTML5 --%>
		<section id="sectionAdministrationBookingOfCustomer">
			<h1>Booking of Customer</h1>
			<nav id="bookingCustomer" />
			<hr>

			<div class="alert alert-info">
				Voici les bookings du client 
			</div>

			<article id="bookingDataTable">

				<c:if test="${empty bookings and fn:length(bookings) == 0}">
					<p id="messageKo">No bookings available</p>
				</c:if>

				<table id="dataTables" class="display">
					<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Booking date</th>
							<th>Start date</th>
							<th>End date</th>
							<th>NumberOfPersons</th>
							<th>Amount paid</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${bookings}" var="booking">
							<tr>
								<td>#${booking.id}</td>
								<td>${booking.customer.name} ${booking.customer.surname}</td>
								<td>${booking.bookingDate}</td>
								<td>${booking.startDate}</td>
								<td>${booking.endDate}</td>
								<td>${booking.numberOfPersons}</td>
								<td>${booking.amountPaid}</td>
							</tr>

						</c:forEach>
					</tbody>
				</table>

			</article>

		</section>

		<%-- FOOTER : pied de page --%>
		<jsp:include page="footer.jsp" />
	</div>

	<%-- Javascript --%>
	<script type="text/javascript" charset="utf-8">
		$(document).ready(function() {
			$('#dataTables').dataTable();
		});
	</script>