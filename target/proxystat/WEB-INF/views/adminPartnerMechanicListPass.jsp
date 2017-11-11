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
	<h1 id="mechanicAdmin">Administration des tarifs par forfaits disponibles dans votre société</h1>

	<nav id="listPass">
		<b>Liste des forfaits avec tarifs par période</b>
	</nav>
	
	
	<article id="passDataTable">
			<table id="dataTables" class="display">
				<thead>
					<tr>
						<th>Nom</th>
						<th>Domaine</th>
						<th>Type</th>
						<th>Prix/Periode</th>
						<th>Durée</th>
						<th>Catégorie d'Age</th>
						<th>Modifier</th>
						<th>Supprimer</th>
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
								<td><input type="submit" name="passChoiceToModify" id="passChoiceToModify" value="Modifier" /></td>
							</form>
							<form action="modifyOrDeletePass.adminMechanicPartner" method="post">
								<input type="hidden" name="idPass" id=${pass.id} value=${pass.id}>
								<td><input type="submit" name="passChoiceToDelete" id="passChoiceToDelete" value="Supprimer" /></td>
							</form>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			</br>
				
			<form action="returnViewAdminMechanicPartnerToAddPass.adminMechanicPartner">
				<input type="submit" id="linkAdminMechanicPartnerToAddPass" value="Ajouter un tarif pour forfait"  />
			</form>
			
			<c:if test="${empty passAvailable and fn:length(passAvailable) == 0}">
				<p id="messageKo">Pas de tarifs pour les forfaits disponibles</p>
			</c:if>
			<c:if test="${messageKoDeletePass != null}">
				<p id="messageKo">${messageKoDeletePass}</p>
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