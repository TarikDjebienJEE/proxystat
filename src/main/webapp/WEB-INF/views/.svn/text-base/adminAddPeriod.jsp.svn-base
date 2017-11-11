<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@page import="com.dreamit.proxystat.model.controllers.AdministrationController"%>
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

	<hr>
	<div class="container">

<%-- HTML5 --%>
	<section id="sectionCreate">

	<h1><spring:message code="adm.period.create" text=""/></h1>
	<hr>

	<form method="post" action="createNewPeriod.admin" class="form-horizontal">
		<fieldset>
			<div class="control-group">
				<label for="name"><spring:message code="adm.period.name" text=""/></label>
				<div>
					<input id="name" name="name" value="${name}" />
					<spring:message code="adm.compulsory" text=""/>
				</div>
			</div>
			<div class="control-group">
				<label for="startDate"><spring:message code="adm.period.start" text=""/></label>
				<div>
					<input id="startDate" name="startDate" value="${startDate}" class="datepick" />
					<spring:message code="adm.compulsory" text=""/>
				</div>
			</div>
			<div class="control-group">
				<label for="endDate"><spring:message code="adm.period.end" text=""/></label>
				<div>
					<input id="endDate" name="endDate" value="${endDate}" class="datepick" />
					<spring:message code="adm.compulsory" text=""/>
				</div>
			</div>
			<div class="control-group">
				<label for="periodType"><spring:message code="adm.period.type" text=""/></label>
				<div>
					<input name="periodType" type="radio" value="<%= AdministrationController.FRONT_PERIOD_HOLIDAY %>"/><spring:message code="adm.period.type.hol" text=""/><br />
					<input name="periodType" type="radio" value="<%= AdministrationController.FRONT_PERIOD_STANDARD %>"/><spring:message code="adm.period.type.stand" text=""/><br /> 
					<spring:message code="adm.compulsory" text=""/>
				</div>
			</div>
			<div class="form-actions">
				<input id="create" value="<spring:message code="adm.save" text=""/>" type="submit" />
			</div>
		</fieldset>  
	</form>

	<c:if test="${messageKo != null}">
			<p id="messageKo">${e.message}</p>
	</c:if>

	</section>

</div>

<%-- FOOTER : pied de page --%>
<jsp:include page="footer.jsp" />

<script type="text/javascript" charset="utf-8">

	$('.datepick').datepicker({'format': 'yyyy-mm-dd'});

	$(document).ready(function() {
		
		$('.control-group > label').addClass('control-label');
		$('.control-group > div').addClass('controls');
		
	});
	
</script>