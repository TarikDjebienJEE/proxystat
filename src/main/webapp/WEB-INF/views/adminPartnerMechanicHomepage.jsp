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
        <h1><spring:message code="adm.meca.home" text=""/></h1>
        <hr>
        <p><spring:message code="adm.meca.desc" text=""/></p>
      </div>

      <div class="row">
        <div class="span4">
          <h2><spring:message code="adm.meca.offer.title" text=""/></h2>
          <p><spring:message code="adm.meca.offer.content" text=""/></p>
          <p><a id="linkTrack" class="btn" href="track.adminMechanicPartner"><spring:message code="adm.meca.offer.track" text=""/> &raquo;</a></p>
          <p><a id="linkPass"  class="btn" href="pass.adminMechanicPartner"><spring:message code="adm.meca.offer.pass" text=""/> &raquo;</a></p>
        </div>
        <div class="span4">
          <h2><spring:message code="adm.meca.list.title" text=""/></h2>
          <p><spring:message code="adm.meca.list.content" text=""/></p>
          <p><a id="linkListing"    class="btn" href="listing.adminMechanicPartner"><spring:message code="adm.meca.list.man" text=""/> &raquo;</a></p>
       </div>
      </div>
	
	</div>

	<%-- FOOTER : pied de page --%>
	<jsp:include page="footer.jsp" />