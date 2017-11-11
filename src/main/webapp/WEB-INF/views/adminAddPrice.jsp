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

	<h1>Price creation</h1>
	<hr>

	<form method="post" action="createNewPrice.admin" class="form-horizontal">
		<fieldset>
			<div class="control-group">
				<label for="price">Price</label>
				<div>
					<input id="price" name="price" value="${price}" />
					* required field
				</div>
			</div>
			<div class="control-group">
				<label for="margin">Margin</label>
				<div>
					<input id="margin" name="margin" value="${margin}" />
					* required field
				</div>
			</div>
			<div class="control-group">
				<label for="discountPrice">Discount Price</label>
				<div>
					<input id="discountPrice" name="discountPrice" value="${discountPrice}" />
					* required field
				</div>
			</div>
			<div class="control-group">
				<label for="discounted">discounted</label>
				<div>
						<c:choose>
							<c:when test="${discounted}">
								<input id="discounted" type="checkbox" name="discounted" checked="checked"/>
							</c:when>
							<c:otherwise>
								<input id="discounted" type="checkbox" name="discounted" />
							</c:otherwise>
						</c:choose>
					* required choice
				</div>
			</div>
			<div class="control-group">
				<label for="taxRate">Tax Rate</label>
				<div>
					<input id="taxRate" name="taxRate" value="${taxRate}"/>
					* required choice
				</div>
			</div>
			<div class="form-actions">
				<input id="create" value="Save" type="submit" />
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