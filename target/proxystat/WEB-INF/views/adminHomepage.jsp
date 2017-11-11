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
        <h1>Administrator portal</h1>
        <hr>
        <p>This area let you manage your offer, partners and monitor your activity</p>
      </div>

      <div class="row">
        <div class="span4">
          <h2>Offer</h2>
          <p>Configure seasons, periods, price, flat type, flats</p>
          <p><a id="linkSeason" 	class="btn" href="season.admin">Manage seasons &raquo;</a></p>
          <p><a id="linkPeriod" 	class="btn" href="period.admin">Manage periods &raquo;</a></p>
          <p><a id="linkPrice" 		class="btn" href="price.admin">Manage prices &raquo;</a></p>
          <p><a id="linkFlatType" 	class="btn" href="flatType.admin">Manage flat types &raquo;</a></p>
          <p><a id="linkFLat" 		class="btn" href="flat.admin">Manage flats &raquo;</a></p>
          <p><a id="linkOption" 	class="btn" href="option.admin">Manage options &raquo;</a></p>
        </div>
        <div class="span4">
          <h2>Partners</h2>
          <p>Manage partners companies and users</p>
          <p><a id="linkPartner" 	class="btn" href="partner.admin">Manage partners companies&raquo;</a></p>
          <p><a id="linkUser"    	class="btn" href="user.admin">Manage partners users&raquo;</a></p>
           <hr>
          <h2>Comments</h2>
          <p>Administer comments posted</p>
          <p><a id="linkReporting"	class="btn" href="adminRatings.rate">Administer comments &raquo;</a></p>
       </div>
        <div class="span4">
          <h2>Reporting</h2>
          <p>Monitor your activity : sales, margin</p>
          <p><a id="linkReporting"	class="btn" href="adminStatistics.reporting">Access reporting &raquo;</a></p>
           <hr>
          <h2>Research customers</h2>
          <p>Research yours customers with the bookings</p>
          <p><a id="linkCustomersBooking"	class="btn" href="research.customer">Access research customers/bookings &raquo;</a></p>
        </div>
      </div>
	
	</div>

	<%-- FOOTER : pied de page --%>
	<jsp:include page="footer.jsp" />