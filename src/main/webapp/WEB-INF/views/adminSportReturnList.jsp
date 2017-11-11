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
			<h1><spring:message code="adm.sport.return.title" text=""/></h1>

			<article id="bookingListDataTable">

				<c:if test="${empty bookings and fn:length(bookings) == 0}">
					<p id="messageKo"><spring:message code="adm.sport.return.any" text=""/></p>
				</c:if>

				<table id="dataTables" class="display">
					<thead>
						<tr>
							<th><spring:message code="adm.sport.return.id" text=""/></th>
							<th><spring:message code="adm.sport.return.cust" text=""/></th>
							<th><spring:message code="adm.sport.return.guest" text=""/></th>
							<th><spring:message code="adm.sport.return.start" text=""/></th>
							<th><spring:message code="adm.sport.return.end" text=""/></th>
							<th><spring:message code="adm.sport.return.man" text=""/></th>
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
									<input type="submit" name="bookingReturn" id="bookingReturn" value="<spring:message code="adm.display" text=""/>" />
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