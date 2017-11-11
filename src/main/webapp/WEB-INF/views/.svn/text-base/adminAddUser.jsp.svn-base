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

	<h1><spring:message code="adm.user.create" text=""/></h1>
	<hr>

	<form method="post" action="createNewUser.admin" class="form-horizontal">
		<fieldset>
			<div class="control-group">
				<label for="name"><spring:message code="adm.user.name" text=""/></label>
				<div>
					<input id="name" name="name" value="${name}" />
					<spring:message code="adm.compulsory" text=""/>
				</div>
			</div>
			<div class="control-group">
				<label for="surname"><spring:message code="adm.user.surname" text=""/></label>
				<div>
					<input id="surname" name="surname" value="${surname}" />
					<spring:message code="adm.compulsory" text=""/>
				</div>
			</div>
			<div class="control-group">
				<label for="jobtitle"><spring:message code="adm.user.job" text=""/></label>
				<div>
					<input id="jobtitle" name="jobtitle" value="${jobtitle}" />
					<spring:message code="adm.compulsory" text=""/>
				</div>
			</div>
			<div class="control-group">
				<label for="login"><spring:message code="adm.user.log" text=""/></label>
				<div>
					<input id="login" name="login" value="${login}" />
					<spring:message code="adm.compulsory" text=""/>
				</div>
			</div>
			<div class="control-group">
				<label for="password"><spring:message code="adm.user.pass" text=""/></label>
				<div>
					<input id="password" name="password" value="${password}" />
					<spring:message code="adm.compulsory" text=""/>
				</div>
			</div>
			<div class="control-group">
				<label for="enabled"><spring:message code="adm.user.enb" text=""/></label>
				<div>
						<c:choose>
							<c:when test="${enabled}">
								<input id="enabled" type="checkbox" name="enabled" checked="checked"/>
							</c:when>
							<c:otherwise>
								<input id="enabled" type="checkbox" name="enabled" />
							</c:otherwise>
						</c:choose>
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

	$(document).ready(function() {
		
		$('.control-group > label').addClass('control-label');
		$('.control-group > div').addClass('controls');
		
	});
	
</script>