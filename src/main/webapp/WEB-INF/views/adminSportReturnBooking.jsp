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
			<h1><spring:message code="adm.sport.book" text=""/> #${booking.id} <spring:message code="adm.sport.book.return" text=""/></h1>

			<article id="bookingDataTable">

				<c:if test="${empty booking and fn:length(booking) == 0}">
					<p id="messageKo"><spring:message code="adm.sport.book.null" text=""/></p>
				</c:if>

				<c:forEach items="${booking.guests}" var="guest">
					
					<h3><spring:message code="adm.sport.book.guest" text=""/> ${guest.name} ${guest.surname}</h3>
					
					<table id="dataTables" class="display">
						<thead>
							<tr>
								<th><spring:message code="adm.sport.book.equip" text=""/></th>
								<th><spring:message code="adm.sport.book.date" text=""/></th>
								<th><spring:message code="adm.sport.book.accept" text=""/></th>
								<th><spring:message code="adm.sport.book.comm" text=""/></th>
								<th><spring:message code="adm.return" text=""/></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${guest.guestEquipments}" var="return">
								<tr>
								<form method="POST" action="updateGuestEquipment.adminSportPartner">
									<input type="hidden" name="bookingId" id="bookingId" value="${booking.id}" />
									<input type="hidden" name="id" id="id" value="${return.id}" />
									<td>${return.equipment.service.name}</td>
									<td>
										<input class="datepicker" 
											id="returnDate" name="returnDate" value="${return.returnDate}"/>
									</td>
									<td>
										<select id="returnStateAccepted" name="returnStateAccepted">
											<option selected value="${return.returnStateAccepted}">${return.returnStateAccepted}</option>
											<option value="true"><spring:message code="adm.true" text=""/></option>
											<option value="false"><spring:message code="adm.false" text=""/></option> 
										</select>
									</td>
									<td><input id="returnComments" 		name="returnComments" 		value="${return.returnComments}"/></td>
									<td>
										<input type="submit" name="update" id="update" value="<spring:message code="adm.modif" text=""/>" />
									</td>
								</form>
								</tr>
							</c:forEach>
						</tbody>
					</table>
	
				</c:forEach>

				<hr>
				<c:if test="${messageOk != null}">
					<p id="messageOk"><spring:message code="adm.sport.book.upd" text=""/></p>
				</c:if>
				<c:if test="${messagKo != null}">
					<p id="messageKo"><spring:message code="adm.error" text=""/></p>
				</c:if>

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
		
		$(".datepicker").datepicker();
	</script>