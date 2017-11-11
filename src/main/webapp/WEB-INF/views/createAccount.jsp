<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" 	uri="http://www.springframework.org/security/tags"%>

<%-- HEAD --%>
<jsp:include page="header.jsp" />

<%-- BODY --%>

<hr>
	
<div class="container">
	<h1><spring:message code="usr.create" text=""/></h1>
	<%-- FORMULAIRE D'INSCRIPTION --%>
		<form action="create.customer" method="post" class="form-horizontal">
			<fieldset>
			  <div class="control-group">  
				<label for="j_name"><spring:message code="usr.name" text=""/></label>
				<input id="j_name" name="j_name" type="text" value="${j_name}" />
			  </div>
			  <div class="control-group"> 
				<label for="j_surname"><spring:message code="usr.surname" text=""/></label>
				<input id="j_surname" name="j_surname"type="text" value="${j_surname}"/>
			  </div>
			  <div class="control-group"> 
				<label for="j_email"><spring:message code="usr.email" text=""/></label>
				<input id="j_email" name="j_email"type="text" value="${j_email}"/>
			  </div>
			  <div class="control-group"> 
				<label for="j_adresse_rue"><spring:message code="usr.road" text=""/></label>
				<input id="j_adresse_rue" name="j_adresse_rue" type="text" class="input-xlarge" value="${j_adresse_rue}"/>
			  </div>
			  <div class="control-group"> 
				<label for="j_adresse_cp"><spring:message code="usr.cp" text=""/></label>
				<input id="j_adresse_cp" name="j_adresse_cp" type="text" class="input-small" value="${j_adresse_cp}"/>
			  </div>
			  <div class="control-group"> 
				<label for="j_adresse_ville"><spring:message code="usr.city" text=""/></label>
				<input id="j_adresse_ville" name="j_adresse_ville" type="text" value="${j_adresse_ville}"/>
			  </div>
			  <div class="control-group"> 
				<label for="j_adresse_rue"><spring:message code="usr.country" text=""/></label>
				<input id="j_adresse_pays" name="j_adresse_pays" type="text" value="${j_adresse_pays}"/>
			  </div>
			  <div class="control-group"> 
				<label for="j_password"><spring:message code="usr.pass" text=""/></label>
				<input id="j_password" name="j_password" type="password" />
			  </div>
			  <div class="control-group"> 
				<label for="j_passwordC"><spring:message code="usr.conf" text=""/></label>
				<input id="j_passwordC"	name="j_passwordC" type="password" />
			  </div>
			  <div id="loginFormButton" class="form-actions">
					<a href="create.customer">
						<input id="login_button" value="<spring:message code="home.signup" text=""/>" type="submit" />
					</a>
			  </div>
			</fieldset>
		</form>
		<br/><br>
		
		<c:if test="${messageOk != null}">
				<p id="messageOk">${messageOk}</p>
		</c:if>
		<c:if test="${messageKo != null}">
				<p id="messageKo">${messageKo}</p>
		</c:if>	
		
</div>

<%-- FOOTER : pied de page --%>
<jsp:include page="footer.jsp" />

<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		
		$('.control-group > label').addClass('control-label');
		$('.control-group > input').addClass('controls');
		
	});
</script>