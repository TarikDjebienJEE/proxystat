<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<jsp:include page="header.jsp" />
		
<hr>
<div class="container">
<h1><spring:message code="contact.title" text=""/></h1>

	<%-- FORMULAIRE DE PRISE DE CONTACT --%>
	
		<form method="post" action="sendMail.contact" class="form-horizontal">
		 <fieldset>
		   <div class="control-group">	
			<label for="contactsurname"><spring:message code="contact.surname" text=""/></label>
			<div>  
				 <input id="contactsurname" name="contactsurname" type="text" />
				 <spring:message code="contact.compulsory" text=""/>
			</div>
		   </div>
		   <div class="control-group">
			<label for="contactname"><spring:message code="contact.name" text=""/></label>
			<div>  
				<input id="contactname" name="contactname" />
				<spring:message code="contact.compulsory" text=""/>
			</div>
		   </div>
		   <div class="control-group">
			<label for="mail"><spring:message code="contact.email" text=""/></label>
			<div>  
				<input id="mail" name="mail" />
				<spring:message code="contact.compulsory" text=""/>
			</div>
		   </div>
		   <div class="control-group">
			<label for="category"><spring:message code="contact.cat" text=""/></label>
			<div>  
				 <select id="categoryChoice" name="categoryChoice" size="1">
					    <option><spring:message code="contact.info" text=""/></option>
					    <option><spring:message code="contact.estimate" text=""/></option>
					    <option><spring:message code="contact.other" text=""/></option>
				</select>
			</div>
		   </div>
		   <div class="control-group">
			<label for="message"><spring:message code="contact.msg" text=""/></label>
			<div>  
				<textarea name="message" id="message" rows=6 ></textarea>
				<spring:message code="contact.compulsory" text=""/>
			</div>
		   </div>
		   <div class="form-actions">
				<input id="contact_button" value="<spring:message code="contact.send" text=""/>" type="submit" /> 
				<input value="<spring:message code="contact.reset" text=""/>" type="reset" />
		   </div>
		 </fieldset>
		</form>
		
		<c:if test="${messageOk != null}">
			<p id="messageRetourOk">${messageOk}</p>
		</c:if>
		<c:if test="${messageKo != null}">
			<p id="messageRetourKo">${messageKo}</p>
		</c:if>
	
</div>		
	
<jsp:include page="footer.jsp" />

<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		
		$('.control-group > label').addClass('control-label');
		$('.control-group > div').addClass('controls');
		
	});
</script>