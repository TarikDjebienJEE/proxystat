<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@page import="com.dreamit.proxystat.model.controllers.AdministrationController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%-- VARIABLES --%>
<%
	
%>

<%-- HEAD --%>
<jsp:include page="header.jsp" />

<%-- BODY --%>

	<hr>
	<div class="container">
		

		<%-- HTML5 --%>
		<section id="sectionAdmin">
			<h1><spring:message code="adm.user.title" text=""/></h1>
			<nav id="listCategory" />
			<hr>

			<article id="adminDataTable">

				<c:if test="${empty users and fn:length(users) == 0}">
					<p id="messageKo"><spring:message code="adm.user.null" text=""/></p>
				</c:if>

				<table id="dataTables" class="table-hover">
					<thead>
						<tr>
							<th><spring:message code="adm.user.name" text=""/></th>
							<th><spring:message code="adm.user.surname" text=""/></th>
							<th><spring:message code="adm.user.job" text=""/></th>
							<th><spring:message code="adm.user.log" text=""/></th>
							<th><spring:message code="adm.user.pass" text=""/></th>
							<th><spring:message code="adm.user.enb" text=""/></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${users}" var="user">

							<tr>
								<form method="POST" action="updateUser.admin">
									<td><input id="name" 	name="name" value="${user.name}" /></td>
									<td><input id="surname" 	name="surname" value="${user.surname}" /></td>
									<td><input id="jobtitle" 	name="jobtitle" value="${user.jobtitle}" /></td>
									<td><input id="login" 	name="login" value="${user.user.login}" /></td>
									<td><input id="password" 	name="password" value="${user.user.password}" /></td>
									<td>
										<c:choose>
											<c:when test="${user.user.enabled}">
												<input id="enabled" type="checkbox"	name="enabled" value="<%=AdministrationController.FRONT_CRUD_CHECKED%>" checked="checked" />
    										</c:when>
											<c:otherwise>
												<input id="enabled" type="checkbox"	name="enabled" value="<%=AdministrationController.FRONT_CRUD_UNCHECKED%>" />
    										</c:otherwise>
										</c:choose> 
									</td>
									<td>
										<input type="hidden" id="idUser" 			name="idUser" 	  			value="${user.user.id}" /> 
										<input type="hidden" id="id" 			name="id" 	  			value="${user.id}" /> 
										<input type="submit" id="userUpdate" 	name="userUpdate"  	value="<spring:message code="adm.modif" text=""/>" />
									</td>
								</form>
								<form method="POST" action="deleteUser.admin">
									<td><input type="hidden" name="id" id="id"
										value="${user.id}" /> <input type="submit"
										name="userDelete" id="userDelete" value="<spring:message code="adm.del" text=""/>" /></td>
								</form>
							</tr>

						</c:forEach>
					</tbody>
				</table>

				<hr>
				<div class="form-actions">
					<form action="createUser.admin" method="get">
						<input type="submit" id="createUser" name="createUser" value="<spring:message code="adm.create" text=""/>" />
					</form>
				</div>

				<c:if test="${messageOk != null}">
					<p id="messageOk"><spring:message code="adm.user.upd" text=""/></p>
				</c:if>
				<c:if test="${messageKo != null}">
					<p id="messageKo">${e.message}</p>
				</c:if>

			</article>

		</section>

		<%-- FOOTER : pied de page --%>
		<jsp:include page="footer.jsp" />
	</div>

	<%-- Javascript --%>
	<script type="text/javascript" charset="utf-8">
	
		$(document).ready(function() {
			$('#dataTables').dataTable();
		});
		
	</script>