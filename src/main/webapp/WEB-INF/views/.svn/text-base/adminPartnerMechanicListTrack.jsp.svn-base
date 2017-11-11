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
		
			<table id="dataTables" class="display">
				<thead>
					<tr>
						<th><spring:message code="adm.meca.name" text=""/></th>
						<th><spring:message code="adm.meca.dom" text=""/></th>
						<th><spring:message code="adm.meca.type" text=""/></th>
						<th><spring:message code="adm.modif" text=""/></th>
						<th><spring:message code="adm.del" text=""/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${tracksAvailable}" var="track">
						<tr>
							<td>${track.name}</td>
							<td>${track.domain}</td>
							<td>${track.type}</td>
							<form action="modifyOrDeleteTrack.adminMechanicPartner" method="post">
								<input type="hidden" name="idTrack" id=${track.id} value=${track.id}>
								<td><input type="submit" name="trackChoiceToModify"  id="trackChoiceToModify" value="<spring:message code="adm.modif" text=""/>" /></td>
							</form>
							<form action="modifyOrDeleteTrack.adminMechanicPartner" method="post">
								<input type="hidden" name="idTrack" id=${track.id} value=${track.id}>
								<td><input type="submit" name="trackChoiceToDelete" id="trackChoiceToDelete" value="<spring:message code="adm.del" text=""/>" /></td>
							</form>
						</tr>
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
			
			<c:if test="${messageKoDeleteTrack != null}">
				<p id="messageKo">${messageKoDeleteTrack}</p>
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