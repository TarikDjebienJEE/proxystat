?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%-- VARIABLES --%>
<%
	
%>
<jsp:include page="header.jsp" />

<%-- BODY --%>
<body>

	<%-- HTML5 --%>
	<div id="mechanicPartnerAdmin" class="container">
		<hr><hr>
		
		<div class="hero-unit">
        <h1>Portail d'administration pour les partenaires mécaniques</h1>
        <hr>
        <p>Gérer votre activité de partenaire avec ProxyStation</p>
      </div>

      <div class="row">
        <div class="span4">
          <h2>Offre</h2>
          <p>Vous pouvez créer, modifier, rechercher les tarifs et forfaits que vous proposez aux clients de proxystation</p>
          <p><a id="linkTrack" class="btn" href="track.adminMechanicPartner">Manage track &raquo;</a></p>
          <p><a id="linkPass"  class="btn" href="pass.adminMechanicPartner">Manage pass&raquo;</a></p>
        </div>
        <div class="span4">
          <h2>Listing</h2>
          <p>Retrouvez la liste des forfaits à préparer pour les clients</p>
          <p><a id="linkListing"    class="btn" href="listing.adminMechanicPartner">Manage &raquo;</a></p>
       </div>
      </div>
	
	</div>

	<%-- FOOTER : pied de page --%>
	<jsp:include page="footer.jsp" />