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

	<h1>Category creation</h1>
	<hr>

	<form method="post" action="createNewCategory.adminSportPartner" class="form-horizontal">
		<fieldset>
			<div class="control-group">
				<label for="name">Name</label>
				<div>
					<input id="name" name="name" type="text" value="proxystat" />
					* required field
				</div>
			</div>
			<div class="control-group">
				<label for="description">Description</label>
				<div>
					<input id="description" name="description" value="${description}" class="input-xlarge"/>
					* required field
				</div>
			</div>
			<div class="form-actions">
				<input id="createCategory" value="Save" type="submit" />
			</div>
		</fieldset>  
	</form>
	
	<c:if test="${messageKo != null}">
			<p id="messageKo">Missing required information</p>
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