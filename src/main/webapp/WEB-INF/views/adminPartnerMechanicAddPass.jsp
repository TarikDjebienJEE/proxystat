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

<h1><spring:message code="adm.meca.price.create" text=""/></h1>

	<%-- FORMULAIRE DE CREATION D'UN PASS --%>
		<hr>	
		<form method="post" action="createPass.adminMechanicPartner" class="form-horizontal">	
			<fieldset>
				<div class="control-group">
					<label for="trackname"><spring:message code="adm.meca.name" text=""/></label>
					<div>
						<select id="trackidChoice" name="trackidChoice">
							<c:forEach items="${tracksAvailable}" var="track">
									<option value=${track.id}>${track.name}</option>
							</c:forEach>	
					    </select>
						<spring:message code="adm.compulsory" text=""/>
					</div>
				</div>
				<div class="control-group">
					<label for="passPrice"><spring:message code="adm.meca.price" text=""/></label>
					<div>
						<select id="priceChoice" name="priceChoice">
							<c:forEach items="${pricesAvailable}" var="price">
									<option value=${price.id}>${price.price}</option>
							</c:forEach>	
					    </select>
						<spring:message code="adm.compulsory" text=""/>
					</div>
				</div>
				<div class="control-group">
					<label for="passPeriode"><spring:message code="adm.meca.period" text=""/></label>
					<div>
						<select id="periodChoice" name="periodChoice">
							<c:forEach items="${periodAvailable}" var="period">
									<option value=${period.id}>${period.name}</option>
							</c:forEach>	
					    </select>
						<spring:message code="adm.compulsory" text=""/>
					</div>
				</div>
				<div class="control-group">	
					<label for="passNbOfDays"><spring:message code="adm.meca.dur" text=""/></label> 
					<div>
						<select id="durationChoice" name="durationChoice">
							<c:forEach items="${durationAvailable}" var="duration">
									<option value=${duration.id}>${duration.name}</option>
							</c:forEach>	
					    </select>
						<spring:message code="adm.compulsory" text=""/>
					</div>
				</div>
				<div class="control-group">	
					<label for="passAgeCategory"><spring:message code="adm.meca.age" text=""/></label> 
					<div>
						<select id="ageCategoryChoice" name="ageCategoryChoice">
							<c:forEach items="${ageCategoryAvailable}" var="ageCategory">
									<option value=${ageCategory.id}>${ageCategory.name}</option>
							</c:forEach>	
					    </select>
						<spring:message code="adm.compulsory" text=""/>
					</div>
				</div>
				<div class="form-actions">	
					<input id="createPass_button" value="Enregistrer" type="submit"  /> 
				</div>
			</fieldset>
		</form>
		
		<a id="linkAdminMechanicPartnerToAddPass" href="pass.adminMechanicPartner" title=""><spring:message code="adm.return" text=""/></a>
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