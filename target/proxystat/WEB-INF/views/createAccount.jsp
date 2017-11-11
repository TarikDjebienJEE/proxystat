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
	<h1>Account creation</h1>
	<%-- FORMULAIRE D'INSCRIPTION --%>
		<form action="create.customer" method="post" class="form-horizontal">
			<fieldset>
			  <div class="control-group">  
				<label for="j_name">Name</label>
				<input id="j_name" name="j_name" type="text" />
			  </div>
			  <div class="control-group"> 
				<label for="j_surname">Surname</label>
				<input id="j_surname" name="j_surname"type="text" />
			  </div>
			  <div class="control-group"> 
				<label for="j_email">Email adress</label>
				<input id="j_email" name="j_email"type="text" />
			  </div>
			  <div class="control-group"> 
				<label for="j_adresse_rue">Numéro et rue</label>
				<input id="j_adresse_rue" name="j_adresse_rue" type="text" class="input-xlarge" />
			  </div>
			  <div class="control-group"> 
				<label for="j_adresse_cp">Code postal</label>
				<input id="j_adresse_cp" name="j_adresse_cp" type="text" class="input-small" />
			  </div>
			  <div class="control-group"> 
				<label for="j_adresse_ville">Ville</label>
				<input id="j_adresse_ville" name="j_adresse_ville" type="text" />
			  </div>
			  <div class="control-group"> 
				<label for="j_adresse_rue">Pays</label>
				<input id="j_adresse_pays" name="j_adresse_pays" type="text" />
			  </div>
			  <div class="control-group"> 
				<label for="j_password">Password</label>
				<input id="j_password" name="j_password" type="password" />
			  </div>
			  <div class="control-group"> 
				<label for="j_passwordC">Password confirmation</label>
				<input id="j_passwordC"	name="j_passwordC" type="password" />
			  </div>
			  <div id="loginFormButton" class="form-actions">
					<a href="create.customer">
						<input id="login_button" value="Sign up" type="submit" />
					</a>
			  </div>
			</fieldset>
		</form>
		<br/><br>
		<c:if test="${champIncomplet != null}">
			<p id="champIncomplet">Les champs ne sont pas tous renseignés</p>
		</c:if>
		<c:if test="${emailNotValide != null}">
			<p id="emailNotValide">Le champ email est incorrect</p>
		</c:if>
		<c:if test="${passwordNotValide != null}">
			<p id="passwordNotValide">Les mots de passe de sont pas identiques</p>
		</c:if>
		
		<c:if test="${customerOK != null}">
			<p id="customerOK">Votre compte vient d'être créé</p>
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