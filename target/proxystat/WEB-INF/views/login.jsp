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

<%-- HTML5 --%>
	<%-- FORMULAIRE D'AUTHENTIFICATION --%>
	<sec:authorize access="hasRole('ROLE_ANONYMOUS')">
		<form action="j_spring_security_check" method="post"
			class="navbar-form ">
			<input id="j_username" class="span2" name="j_username" size="20"
				maxlength="50" type="text" placeholder="Login" /> 
			<input id="j_password" class="span2" name="j_password" size="20" 
				maxlength="50" type="password" placeholder="Password" /> 
			<input id="login_button" value="Se connecter" type="submit" />
		</form>
	</sec:authorize>
	<c:if test="${not empty username}">
		<spring:url value="/j_spring_security_logout" var="logout"
			htmlEscape="true" />
		<p id="logout">
			<a href="${logout}">Se déconnecter</a>
		</p>
		<p id="loginValidMessage">
			<spring:message code="display.welcome" text="unknow" />
			<c:out value="${username}" />
		</p>
	</c:if>
	<c:if test="${not empty errorLogin}">
		<p id="loginInvalidMessage">
			<c:out value="${errorLogin}" />
		</p>
	</c:if>
