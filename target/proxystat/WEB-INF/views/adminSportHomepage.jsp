<?xml version="1.0" encoding="UTF-8" ?>

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
	<div id="sportAdmin" class="container">
		<hr><hr>
		
		<div class="hero-unit">
        <h1>Sport partner administration portal</h1>
        <hr>
        <p>This area let you manage your partner activity with ProxyStation</p>
      </div>

      <div class="row">
        <div class="span4">
          <h2>Offer</h2>
          <p>You can create, update, search and delete the equipment you offer to ProxyStation customers</p>
          <p><a id="linkCategories" class="btn" href="category.adminSportPartner">Manage categories &raquo;</a></p>
          <p><a id="linkOffer"	    class="btn" href="offer.adminSportPartner">Manage offer&raquo;</a></p>
        </div>
        <div class="span4">
          <h2>Listing</h2>
          <p>Retrieve the listing of equipment to prepare for incoming customers</p>
          <p><a id="linkListing"    class="btn" href="listing.adminSportPartner">Manage &raquo;</a></p>
       </div>
        <div class="span4">
          <h2>Return</h2>
          <p>Keep track of customer item return</p>
          <p><a id="linkReturn"		class="btn" href="returnList.adminSportPartner">Manage &raquo;</a></p>
        </div>
      </div>
	
	</div>

	<%-- FOOTER : pied de page --%>
	<jsp:include page="footer.jsp" />