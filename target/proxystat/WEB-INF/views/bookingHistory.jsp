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
		<section id="sectionAdministrationCategory">
			<h1>Booking history</h1>
			<nav id="bookingHistory" />
			<hr>

			<div class="alert alert-info">
				You can cancel your booking up to 2 weeks before the start date
			</div>

			<article id="bookingDataTable">

				<c:if test="${empty bookings and fn:length(bookings) == 0}">
					<p id="messageKo">No bookings available</p>
				</c:if>

				<table id="dataTables" class="display">
					<thead>
						<tr>
							<th>ID</th>
							<th>Booking date</th>
							<th>Start date</th>
							<th>End date</th>
							<th>Total price</th>
							<th>Amount paid</th>
							<th>Advance paid</th>
							<th>Cancel</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${bookings}" var="booking">

							<tr>
								<td>#${booking.id}</td>
								<td>${booking.bookingDate}</td>
								<td>${booking.startDate}</td>
								<td>${booking.endDate}</td>
								<td>${booking.totalPrice}</td>
								<td>${booking.amountPaid}</td>
								<td>${booking.advancePaid}</td>
								
								<form method="POST" action="cancelBooking.customer">
									<td>
										<c:choose>
											<c:when test="${booking.canceled}">
										   		Already canceled
										   	</c:when>
										   	<c:when test="${booking.beforeTwoWeeks}">
										   		<a href="returnViewContact.contact" class="btn btn-warning" id="bookingCancel">Contact ProxyStation</a>
										   	</c:when>
										   	<c:otherwise>
									   			<input type="hidden" name="id" id="id" value="${booking.id}" /> 
												<input type="submit" name="bookingCancel" id="bookingCancel" value="Cancel" />
										   	</c:otherwise>
										</c:choose>
									</td>
								</form>
								
							</tr>

						</c:forEach>
					</tbody>
				</table>

				<div class="form-actions">
					<c:if test="${messageOk != null}">
						<p id="messageOk">Booking canceled</p>
					</c:if>
				</div>

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