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

	<h1><spring:message code="adm.opt.create" text=""/></h1>
	<hr>

	<form method="post" action="createNewOption.admin" class="form-horizontal">
		<fieldset>
			<div class="control-group">
				<label for="perPerson"><spring:message code="adm.opt.pers" text=""/></label>
				<div>
						<c:choose>
							<c:when test="${perPerson}">
								<input id="perPerson" type="checkbox" name="perPerson" checked="checked"/>
							</c:when>
							<c:otherwise>
								<input id="perPerson" type="checkbox" name="perPerson" />
							</c:otherwise>
						</c:choose>
					<spring:message code="adm.compulsory" text=""/>
				</div>
			</div>
			<div class="control-group">
				<label for="pricePercentage"><spring:message code="adm.opt.perc" text=""/></label>
				<div>
					<input id="pricePercentage" name="pricePercentage" value="${pricePercentage}" />
					<spring:message code="adm.opt.compulsory" text=""/>
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

	$(document).ready(function() {
		
		$('.control-group > label').addClass('control-label');
		$('.control-group > div').addClass('controls');
		
	});
	
</script>