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
<h1>Contact ProxyStation manager</h1>

	<%-- FORMULAIRE DE PRISE DE CONTACT --%>
	
		<form method="post" action="sendMail.contact" class="form-horizontal">
		 <fieldset>
		   <div class="control-group">	
			<label for="contactsurname">Prenom</label>
			<div>  
				 <input id="contactsurname" name="contactsurname" type="text" />
				 * champ obligatoire
			</div>
		   </div>
		   <div class="control-group">
			<label for="contactname">Nom</label>
			<div>  
				<input id="contactname" name="contactname" />
				* champ obligatoire
			</div>
		   </div>
		   <div class="control-group">
			<label for="mail">Adresse email</label>
			<div>  
				<input id="mail" name="mail" />
				* champ obligatoire
			</div>
		   </div>
		   <div class="control-group">
			<label for="category">Catégorie</label>
			<div>  
				 <select id="categoryChoice" name="categoryChoice" size="1">
					    <option>Demande d'informations</option>
					    <option>Demande de devis</option>
					    <option>Autres</option>
				</select>
			</div>
		   </div>
		   <div class="control-group">
			<label for="message">Message</label>
			<div>  
				<textarea name="message" id="message" rows=6 ></textarea>
				* champ obligatoire
			</div>
		   </div>
		   <div class="form-actions">
				<input id="contact_button" value="Envoyer" type="submit" /> 
				<input value="Reset" type="reset" />
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