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
        <h1><spring:message code="adm.home.title" text=""/></h1>
        <hr>
        <p><spring:message code="adm.home.desc" text=""/></p>
      </div>

      <div class="row">
        <div class="span4">
          <h2><spring:message code="adm.home.offer.title" text=""/></h2>
          <p><spring:message code="adm.home.offer.content" text=""/></p>
          <p><a id="linkSeason" 	class="btn" href="season.admin"><spring:message code="adm.home.offer.season" text=""/> &raquo;</a></p>
          <p><a id="linkPeriod" 	class="btn" href="period.admin"><spring:message code="adm.home.offer.period" text=""/> &raquo;</a></p>
          <p><a id="linkPrice" 		class="btn" href="price.admin"><spring:message code="adm.home.offer.price" text=""/> &raquo;</a></p>
          <p><a id="linkFlatType" 	class="btn" href="flatType.admin"><spring:message code="adm.home.offer.type" text=""/> &raquo;</a></p>
          <p><a id="linkFLat" 		class="btn" href="flat.admin"><spring:message code="adm.home.offer.flat" text=""/> &raquo;</a></p>
          <p><a id="linkOption" 	class="btn" href="option.admin"><spring:message code="adm.home.offer.opt" text=""/> &raquo;</a></p>
        </div>
        <div class="span4">
          <h2><spring:message code="adm.home.part.title" text=""/></h2>
          <p><spring:message code="adm.home.part.content" text=""/></p>
          <p><a id="linkPartner" 	class="btn" href="partner.admin"><spring:message code="adm.home.part.comp" text=""/> &raquo;</a></p>
          <p><a id="linkUser"    	class="btn" href="user.admin"><spring:message code="adm.home.part.usr" text=""/> &raquo;</a></p>
           <hr>
          <h2><spring:message code="adm.home.comm.title" text=""/></h2>
          <p><spring:message code="adm.home.comm.content" text=""/></p>
          <p><a id="linkReporting"	class="btn" href="adminRatings.rate"><spring:message code="adm.home.comm.admin" text=""/> &raquo;</a></p>
       </div>
        <div class="span4">
          <h2><spring:message code="adm.home.report.title" text=""/></h2>
          <p><spring:message code="adm.home.report.content" text=""/></p>
          <p><a id="linkReporting"	class="btn" href="adminStatistics.reporting"><spring:message code="adm.home.report.access" text=""/> &raquo;</a></p>
           <hr>
          <h2><spring:message code="adm.home.search.title" text=""/></h2>
          <p><spring:message code="adm.home.search.content" text=""/></p>
          <p><a id="linkCustomersBooking"	class="btn" href="research.customer"><spring:message code="adm.home.search.access" text=""/> &raquo;</a></p>
        </div>
      </div>
	
	</div>

	<%-- FOOTER : pied de page --%>
	<jsp:include page="footer.jsp" />