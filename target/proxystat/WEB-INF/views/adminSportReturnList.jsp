<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%-- VARIABLES --%>
<%
	
%>

<%-- HEAD --%>
<jsp:include page="header.jsp" />

<%-- BODY --%>

	<hr>
	<div class="container">


		<%-- HTML5 --%>
		<section id="sectionAdministrationReturn">
			<h1>Bookings : select booking return</h1>

			<article id="bookingListDataTable">

				<c:if test="${empty bookings and fn:length(bookings) == 0}">
					<p id="messageKo">Any bookings</p>
				</c:if>

				<table id="dataTables" class="display">
					<thead>
						<tr>
							<th>ID</th>
							<th>Customer</th>
							<th>Number of guests</th>
							<th>Start date</th>
							<th>End date</th>
							<th>Manage return</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${bookings}" var="booking">
							<tr>
								<td>${booking.id}</td>
								<td>${booking.customer.name} ${booking.customer.surname}</td>
								<td>${booking.numberOfPersons}</td>
								<td>${booking.startDate}</td>
								<td>${booking.endDate}</td>
								
								<form method="get" action="returnBookingDetail.adminSportPartner">
								<td>
									<input type="hidden" name="id" id="id" value="${booking.id}" /> 
									<input type="submit" name="bookingReturn" id="bookingReturn" value="Display" />
								</td>
								</form>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</article>

		</section>

	</div>
	
	<%-- FOOTER : pied de page --%>
	<jsp:include page="footer.jsp" />
	

	<%-- Javascript --%>
	<script type="text/javascript" charset="utf-8">
		$(document).ready(function() {
			$('#dataTables').dataTable();
		});
	</script>