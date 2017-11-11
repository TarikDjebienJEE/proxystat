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

<jsp:include page="header.jsp" />

<%-- HTML5 --%>
<hr>
<div class="container">
	<section id="sectionModifyTrack">

		<h1>Modification d'un tarif pour un type de forfait</h1>
		<hr>
		
		<form method="post" action="modifyPass.adminMechanicPartner" class="form-horizontal">
			<fieldset>
				<div class="control-group" >
					<label for="trackname">Nom</label>
					<div>
						<select id="trackidChoice" name="trackidChoice">
							<c:forEach items="${tracksAvailable}" var="track">
								<c:if test="${passToModify.track.id==track.id}">
									<option value=${passToModify.track.id } selected="selected">${passToModify.track.name}</option>
								</c:if>
								<c:if test="${passToModify.track.id!=track.id}">
									<option value=${track.id}>${track.name}</option>
								</c:if>
							</c:forEach>
						</select> 
						* champs obligatoire 
					</div>
				</div>
				<div class="control-group">		
					<label for="passPrice">Prix</label> 
					<div>
						<select id="priceChoice" name="priceChoice">
							<c:forEach items="${pricesAvailable}" var="price">
								<c:if test="${passToModify.price.id==price.id}">
									<option value=${passToModify.price.id } selected="selected">${passToModify.price.price}</option>
								</c:if>
								<c:if test="${passToModify.price.id!=price.id}">
									<option value=${price.id}>${price.price}</option>
								</c:if>
							</c:forEach>
						</select> 
						* champs obligatoire 
					</div>
				</div>							
				<div class="control-group">
					<label for="passPeriode">Période</label>
					<div>
						<select id="periodChoice" name="periodChoice">
							<c:forEach items="${periodAvailable}" var="period">
								<c:if test="${passToModify.period.id==period.id}">
									<option value=${passToModify.period.id } selected="selected">${passToModify.period.name}</option>
								</c:if>
								<c:if test="${passToModify.period.id!=period.id}">
									<option value=${period.id}>${period.name}</option>
								</c:if>
							</c:forEach>
						</select> 
						* champs obligatoire 
					</div>	
				</div>
				<div class="control-group">		
					<label for="passNbOfDays">Nombre de jours</label>
					<div>
						<select id="durationChoice" name="durationChoice">
							<c:forEach items="${durationAvailable}" var="duration">
								<c:if test="${passToModify.duration.id==duration.id}">
									<option value=${passToModify.duration.id } selected="selected">${passToModify.duration.name}</option>
								</c:if>
								<c:if test="${passToModify.duration.id!=duration.id}">
									<option value=${duration.id}>${duration.name}</option>
								</c:if>
							</c:forEach>
						</select> 
						* champs obligatoire 
					</div>	
				</div>
				<div class="control-group">		
					<label for="passAgeCategory">Catégorie d'age</label>
					<div>
						<select id="ageCategoryChoice" name="ageCategoryChoice">
							<c:forEach items="${ageCategoryAvailable}" var="ageCategory">
								<c:if test="${passToModify.ageCategory.id==ageCategory.id}">
									<option value=${passToModify.ageCategory.id } selected="selected">${passToModify.ageCategory.name}</option>
								</c:if>
								<c:if test="${passToModify.ageCategory.id!=ageCategory.id}">
									<option value=${ageCategory.id}>${ageCategory.name}</option>
								</c:if>
							</c:forEach>
						</select> 
						* champs obligatoire 
					</div>
				</div>
				<div class="form-actions">
					<input id="modifyPass_button" value="Modifier" type="submit" /> 
					<input type="hidden" name="idPass" id=${passToModify.id} value=${passToModify.id}>
				</div>
			</fieldset>
		</form>

		<a id="linkAdminMechanicPartnerToAddPass"
			href="pass.adminMechanicPartner" title="">Retour</a>

		<c:if test="${messageOk != null}">
			<p id="messageOk">${messageOk}</p>
		</c:if>
		<c:if test="${messageKo != null}">
			<p id="messageKo">${messageKo}</p>
		</c:if>

	</section>
</div>

<jsp:include page="footer.jsp" />

<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		
		$('.control-group > label').addClass('control-label');
		$('.control-group > div').addClass('controls');
		
	});
</script>