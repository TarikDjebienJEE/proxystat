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
			<h1><spring:message code="booking.bookingHistory" text="unknow"/></h1>
			<nav id="bookingHistory" />
			<hr>

			<div class="alert alert-info">
				<spring:message code="booking.alertInfo" text="unknow"/>
			</div>

			<article id="bookingDataTable">

				<c:if test="${empty bookings and fn:length(bookings) == 0}">
					<p id="messageKo"><spring:message code="booking.noBooking" text="unknow"/></p>
				</c:if>
				<table id="dataTables" class="display">
					<thead>
						<tr>
							<th>ID</th>
							<th><spring:message code="booking.bookingDate" text="unknow"/></th>
							<th><spring:message code="booking.startDate" text="unknow"/></th>
							<th><spring:message code="booking.endDate" text="unknow"/></th>
							<th><spring:message code="booking.totalPrice" text="unknow"/></th>
							<th><spring:message code="booking.amountPaid" text="unknow"/></th>
							<th><spring:message code="booking.advancePaid" text="unknow"/></th>
							<th><spring:message code="booking.cancel" text="unknow"/></th>
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
										   		<spring:message code="booking.alreadyCanceled" text="unknow"/>
										   	</c:when>
										   	<c:when test="${booking.beforeTwoWeeks}">
										   		<a href="returnViewContact.contact" class="btn btn-warning" id="bookingCancel">Contact ProxyStation</a>
										   	</c:when>
										   	<c:otherwise>
									   			<input type="hidden" name="id" id="id" value="${booking.id}" /> 
												<input type="submit" name="bookingCancel" id="bookingCancel" value="<spring:message code="booking.cancel" text="unknow"/>" />
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
						<p id="messageOk"><spring:message code="booking.bookingCanceled" text="unknow"/></p>
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