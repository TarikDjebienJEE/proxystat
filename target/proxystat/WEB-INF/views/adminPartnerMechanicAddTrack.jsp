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

<jsp:include page="header.jsp" />

<%-- HTML5 --%>
<hr>
<div class="container">
<section id="sectionCreateTrack">

<h1>Création d'un type de forfait</h1>

	<%-- FORMULAIRE DE CREATION D'UN TRACK --%>
		<hr>
		<form method="post" action="createTrack.adminMechanicPartner" class="form-horizontal">	
			<fieldset>
				<div class="control-group">
					<label for="trackname">Nom</label>
					<div>	
						<input id="trackname" name="trackname" />
						* champ obligatoire
					</div>	
				</div>
				<div class="control-group">
					<label for="trackdomain">Domaine</label> 
					<div>	
						<input id="trackdomain" name="trackdomain" />
						* champ obligatoire
					</div>
				</div>
				<div class="control-group">
					<label for="tracktype">Type</label> 
					<div>	
						<input id="tracktype" name="tracktype" />
						* champ obligatoire
					</div>
				</div>
				<div class="form-actions">
					<input id="createTrack_button" value="Enregistrer" type="submit" /> 
					<input value="Reinitialiser" type="reset" />
				</div>
			</fieldset>
		</form>
		
		<a id="linkAdminMechanicPartnerToAddTrack" href="track.adminMechanicPartner" accesskey="3" title="">Retour</a>
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