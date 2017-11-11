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
			<h1><spring:message code="adm.sport.list.title" text=""/></h1>
			<hr>
			
			<nav id="listCategory">
				<p class="alert alert-info"><spring:message code="adm.sport.list.desc" text=""/></p>
			</nav>

			<article id="listingDataTable">

				<c:if test="${empty listings and fn:length(listings) == 0}">
					<p id="messageKo"><spring:message code="adm.sport.list.show" text=""/></p>
				</c:if>

				<table id="dataTables" class="display">
					<thead>
						<tr>
							<th><spring:message code="adm.sport.list.equip" text=""/></th>
							<th><spring:message code="adm.sport.list.date" text=""/></th>
							<th><spring:message code="adm.sport.list.quant" text=""/></th>
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
					<input id="showAll" value="<spring:message code="adm.show" text=""/>" type="submit" />
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