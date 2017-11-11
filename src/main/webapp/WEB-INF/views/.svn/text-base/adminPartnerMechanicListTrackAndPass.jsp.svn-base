<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<%-- VARIABLES --%>
<%
	
%>
<<jsp:include page="header.jsp" />


<%-- HTML5 --%>
<hr>
<div class="container">
	<section id="sectionListTrackAndPass">
	<h1 id="mechanicAdmin"><spring:message code="adm.meca.track.title" text=""/></h1>
	<nav id="listTrack">
		<b><spring:message code="adm.meca.track.desc" text=""/></b>
	</nav>

	
	<article id="trackDataTable">
		
			<table class="dataTables" border="1" >
				<thead>
					<tr>
						<th><spring:message code="adm.meca.name" text=""/></th>
						<th><spring:message code="adm.meca.domain" text=""/></th>
						<th><spring:message code="adm.meca.type" text=""/></th>
						<th><spring:message code="adm.modif" text=""/></th>
						<th><spring:message code="adm.del" text=""/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${tracksAvailable}" var="track">
					<form action="modifyOrDeleteTrack.adminMechanicPartner" method="post">
						<tr>
							<td>${track.name}</td>
							<td>${track.domain}</td>
							<td>${track.type}</td>
								<td><input type="submit" name="trackChoiceToModify"  id="trackChoiceToModify" value="<spring:message code="adm.modif" text=""/>" /></td>
								<td><input type="submit" name="trackChoiceToDelete" id="trackChoiceToDelete" value="<spring:message code="adm.del" text=""/>" /></td>
						</tr>
						<input type="hidden" name="idTrack" id=${track.id} value=${track.id}>
					</form>
					</c:forEach>
				</tbody>
			</table>
			</br>
			
			<form action="returnViewAdminMechanicPartnerToAddTrack.adminMechanicPartner">
				<input type="submit" id="linkAdminMechanicPartnerToAddTrack" value="<spring:message code="adm.meca.add.track" text=""/>"  />
			</form>
			
			<c:if test="${empty tracksAvailable and fn:length(tracksAvailable) == 0}">
				<p id="messageKo"><spring:message code="adm.track.null" text=""/></p>
			</c:if>
		
	</article>

	<hr>
	<nav id="listPass">
		<b><spring:message code="adm.meca.pass.desc" text=""/></b>
	</nav>
	
	
	<article id="passDataTable">
			<table class="dataTables" border="1">
				<thead>
					<tr>
						<th><spring:message code="adm.meca.name" text=""/></th>
						<th><spring:message code="adm.meca.domain" text=""/></th>
						<th><spring:message code="adm.meca.type" text=""/></th>
						<th><spring:message code="adm.meca.price" text=""/>/<spring:message code="adm.meca.period" text=""/></th>
						<th><spring:message code="adm.meca.dur" text=""/></th>
						<th><spring:message code="adm.meca.age" text=""/></th>
						<th><spring:message code="adm.modif" text=""/></th>
						<th><spring:message code="adm.del" text=""/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${passAvailable}" var="pass">
						<tr>
							<td>${pass.track.name}</td>
							<td>${pass.track.domain}</td>
							<td>${pass.track.type}</td>
							<td>${pass.price.price} / ${pass.period.name}</td>
							<td>${pass.duration.numberOfDays}</td>
							<td>${pass.ageCategory.name}</td>
							<form action="modifyOrDeletePass.adminMechanicPartner" method="post">
								<input type="hidden" name="idPass" id=${pass.id} value=${pass.id}>
								<td><input type="submit" name="passChoiceToModify" id="passChoiceToModify" value="<spring:message code="adm.modif" text=""/>" /></td>
							</form>
							<form action="modifyOrDeletePass.adminMechanicPartner" method="post">
								<input type="hidden" name="idPass" id=${pass.id} value=${pass.id}>
								<td><input type="submit" name="passChoiceToDelete" id="passChoiceToDelete" value="<spring:message code="adm.del" text=""/>" /></td>
							</form>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			</br>
				
			<form action="returnViewAdminMechanicPartnerToAddPass.adminMechanicPartner">
				<input type="submit" id="linkAdminMechanicPartnerToAddPass" value="<spring:message code="adm.meca.add.price" text=""/>"  />
			</form>
			
			<c:if test="${empty passAvailable and fn:length(passAvailable) == 0}">
				<p id="messageKo"><spring:message code="adm.price.null" text=""/></p>
			</c:if>
	</article>
	
</section>
</div>

<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		$('#dataTables').dataTable();
	});
</script>

<jsp:include page="footer.jsp" />