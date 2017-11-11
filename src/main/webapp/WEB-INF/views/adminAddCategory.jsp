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

	<hr>
	<div class="container">

<%-- HTML5 --%>
	<section id="sectionCreateCategory">

	<h1><spring:message code="adm.categ.create" text=""/></h1>
	<hr>

	<form method="post" action="createNewCategory.adminSportPartner" class="form-horizontal">
		<fieldset>
			<div class="control-group">
				<label for="name"><spring:message code="adm.name" text=""/></label>
				<div>
					<input id="name" name="name" type="text" value="${name}" />
					<spring:message code="adm.compulsory" text=""/>
				</div>
			</div>
			<div class="control-group">
				<label for="description"><spring:message code="adm.desc" text=""/></label>
				<div>
					<input id="description" name="description" value="${description}" class="input-xlarge"/>
					<spring:message code="adm.compulsory" text=""/>
				</div>
			</div>
			<div class="form-actions">
				<input id="createCategory" value="<spring:message code="adm.save" text=""/>" type="submit" />
			</div>
		</fieldset>  
	</form>
	
	<c:if test="${messageKo != null}">
			<p id="messageKo"><spring:message code="adm.miss" text=""/></p>
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