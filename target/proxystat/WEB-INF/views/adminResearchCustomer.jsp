<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<%-- VARIABLES --%>
<%
	
%>

<jsp:include page="header.jsp" />

<%-- HTML5 --%>
<hr>
<div class="container">
<section id="sectionResearchCustomer">

<h1>Rechercher un client</h1>

	<%-- FORMULAIRE DE RECHERCHE D'UN CLIENT --%>
		<hr>
		<form method="post" action="researchCustomer.customer" class="form-horizontal">	
			<fieldset>
				<div class="control-group">
					<label for="customername">Nom</label>
					<div>	
						<input id="customername" name="customername" />
					</div>	
				</div>
				<div class="control-group">
					<label for="customersurname">Prenom</label> 
					<div>	
						<input id="customersurname" name="customersurname" />
					</div>
				</div>
				<div class="form-actions">
					<input id="researchCustomer_button" value="Rechercher" type="submit" /> 
					<input value="Reinitialiser" type="reset" />
				</div>
			</fieldset>
		</form>
		
		
		<c:if test="${messageKo != null}">
				<p id="messageKo">${messageKo}</p>
		</c:if>	
		
			<!-- liste des clients retourné par la recherche, juste id, nom et prenom plus lien pour retourner la fiche client -->
			<article id="customerDataTable">
				<table id="dataTables" class="display">
					<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Surname</th>
							<th>Link customer infos</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${customersReturn}" var="customer">
							<tr>
								<td>#${customer.id}</td>
								<td>${customer.name}</td>
								<td>${customer.surname}</td>
								<td>
									<form method="post" action="researchInfosCustomer.customer" class="form-horizontal">	
										<div class="form-actions">
											<input type="hidden" name="idCustomer" id=${customer.id} value=${customer.id}>
											<input id="researchInfosThisCustomer_button" value="Informations client" type="submit" /> 
										</div>
									</form>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</article>	
	
	<c:if test="${customerReturn != null}">	
			<h2>Informations sur le client</h2>
			
			<div class="control-group">
					<label for="customername">Nom</label>
					<div>	
						<input disabled id="customername" name="customername" value=${customerReturn.name} />
					</div>	
			</div>	
			<div class="control-group">
					<label for="customersurname">Prenom</label> 
					<div>	
						<input disabled id="customersurname" name="customersurname" value=${customerReturn.surname} />
					</div>
			</div>
			<div class="control-group">
					<label for="customerdateOfBirth">Date de naissance</label> 
					<div>	
						<input disabled id="customerdateOfBirth" name="customerdateOfBirth" value=${customerReturn.dateOfBirth} />
					</div>
			</div>
			<div class="control-group">
					<label for="customerprofile">Profile</label> 
					<div>	
						<input disabled id="customerprofile" name="customerprofile" value=${customerReturn.profile} />
					</div>
			</div>
			<div class="control-group">
					<label for="customeradress">Rue</label> 
					<div>	
						<input disabled id="customeradress" name="customeradress" value=${customerReturn.adress.adress} />
					</div>
			</div>
			<div class="control-group">
					<label for="customertown">Ville</label> 
					<div>	
						<input disabled id="customertown" name="customertown" value=${customerReturn.adress.town} />
					</div>
			</div>
			<div class="control-group">
					<label for="customercountry">Pays</label> 
					<div>	
						<input disabled id="customercountry" name="customercountry" value=${customerReturn.adress.country} />
					</div>
			</div>
			<form method="post" action="researchBookingByCustomer.customer" class="form-horizontal">	
				<div class="form-actions">
					<input type="hidden" name="idCustomer" id=${customerReturn.id} value=${customerReturn.id}>
					<input id="researchBookingThisCustomer_button" value="Visualiser les bookings de ce client" type="submit" /> 
				</div>
			</fieldset>
		</form>
			</c:if>		
		
</section>
</div>

<jsp:include page="footer.jsp" />

<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		
		$('.control-group > label').addClass('control-label');
		$('.control-group > div').addClass('controls');
		
	});
</script>