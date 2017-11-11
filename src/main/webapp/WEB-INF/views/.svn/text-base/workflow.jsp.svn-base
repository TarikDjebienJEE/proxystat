<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<link type="text/css" href="<%=request.getContextPath()%>/resources/css/booking.css" rel="stylesheet" media="screen">

<%-- HEAD --%>
<jsp:include page="header.jsp" />

<%-- BODY --%>

	<div class="container">

		<hr><hr><hr>
		<h1><spring:message code="work.title" text=""/></h1>
	
		<%-- RESERVATION APPARTEMENT--%>
		<sec:authorize access="isAuthenticated()">
			<c:if test="${not empty statutWorkflow and statutWorkflow eq 1}">
				<jsp:include page="bookingAppartment.jsp" />
			</c:if>
		</sec:authorize>

		<%-- RESERVATION MATERIEL ET FORFAIT --%>
		<sec:authorize access="isAuthenticated()">
			<c:if test="${not empty statutWorkflow and statutWorkflow eq 2}">
				<jsp:include page="bookingEquipmentAndPass.jsp" />
			</c:if>
		</sec:authorize>

		<%-- RESERVATION RESUME --%>
		<sec:authorize access="isAuthenticated()">
			<c:if test="${not empty statutWorkflow and statutWorkflow eq 3}">
				<jsp:include page="bookingSummary.jsp" />
			</c:if>
		</sec:authorize>

		<%-- RESERVATION PAYMENT --%>
		<sec:authorize access="isAuthenticated()">
			<c:if test="${not empty statutWorkflow and statutWorkflow eq 4}">
				<jsp:include page="bookingPayment.jsp" />
			</c:if>
		</sec:authorize>

		<%-- RESERVATION Confirmation --%>
		<sec:authorize access="isAuthenticated()">
			<c:if test="${not empty statutWorkflow and statutWorkflow eq 5}">
				<jsp:include page="bookingCongratulation.jsp" />
			</c:if>
		</sec:authorize>
		
	</div>

<jsp:include page="footer.jsp" />