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
		<section id="sectionAdministrationCategory">
			<h1>Equipment listing to prepare</h1>
			<hr>
			
			<nav id="listCategory">
				<p class="alert alert-info">You can print the listing using your web browser</p>
			</nav>

			<article id="listingDataTable">

				<c:if test="${empty listings and fn:length(listings) == 0}">
					<p id="messageKo">Any equipment to prepare for coming week. Click "Show all" to see historical data</p>
				</c:if>

				<table id="dataTables" class="display">
					<thead>
						<tr>
							<th>Equipment</th>
							<th>Date</th>
							<th>Quantity</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listings}" var="listing">
							<tr>
								<td>${listing.equipment.service.name} : ${listing.equipment.service.description}</td>
								<td>${listing.preparationDate}</td>
								<td>${listing.quantity}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
	
				<br>
				<form method="get" action="fullListing.adminSportPartner">
					<input id="showAll" value="Show all" type="submit" />
				</form>

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