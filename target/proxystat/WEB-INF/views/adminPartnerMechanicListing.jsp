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
			<h1>Liste des forfaits à préparer</h1>
			<hr>
			
			<nav id="listPass">
				<p class="alert alert-info">Vous pouvez imprimer la liste en utilisant votre navigateur web</p>
			</nav>

			<article id="listingDataTable">

				<c:if test="${empty listings and fn:length(listings) == 0}">
					<p id="messageKo">Aucun forfait à préparer pour cette semaine. Cliquez sur "Show all" pour voir l'ensemble sur toutes les dates disponibles</p>
				</c:if>

				<table id="dataTables" class="display">
					<thead>
						<tr>
							<th>Type de forfait</th>
							<th>Date d'arrivée</th>
							<th>Detail personne (Nom/Prenom)</th>
							<th>Numéro de réservation</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listings}" var="listing">
							<tr>
								<td>${listing.pass.track.name}</td>
								<td>${listing.preparationDate}</td>
								<td>${listing.guest.name} ${listing.guest.surname}</td>
								<td>${listing.guest.id}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
	
				<br>
				<form method="get" action="fullListing.adminMechanicPartner">
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