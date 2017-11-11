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
			<h1><spring:message code="adm.part.title" text=""/></h1>
			<nav id="listCategory" />
			<hr>

			<article id="adminDataTable">

				<c:if test="${empty partners and fn:length(partners) == 0}">
					<p id="messageKo"><spring:message code="adm.part.null" text=""/></p>
				</c:if>

				<table id="dataTables" class="table-hover">
					<thead>
						<tr>
							<th><spring:message code="adm.name" text=""/></th>
							<th><spring:message code="adm.desc" text=""/></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${partners}" var="partner">

							<tr>
								<form method="POST" action="updatePartner.admin">
									<td><input id="name" 	name="name" value="${partner.name}" /></td>
									<td><input id="description" 	name="description" value="${partner.description}" /></td>
									<td>
										<input type="hidden" id="id" 			name="id" 	  			value="${partner.id}" /> 
										<input type="submit" id="partnerUpdate" 	name="partnerUpdate"  	value="<spring:message code="adm.modif" text=""/>" />
									</td>
								</form>
								<form method="POST" action="deletePartner.admin">
									<td><input type="hidden" name="id" id="id"
										value="${partner.id}" /> <input type="submit"
										name="partnerDelete" id="partnerDelete" value="<spring:message code="adm.del" text=""/>" /></td>
								</form>
							</tr>

						</c:forEach>
					</tbody>
				</table>

				<hr>
				<div class="form-actions">
					<form action="createPartner.admin" method="get">
						<input type="submit" id="createPartner" name="createPartner" value="<spring:message code="adm.create" text=""/>" />
					</form>
				</div>

				<c:if test="${messageOk != null}">
					<p id="messageOk"><spring:message code="adm.part.upd" text=""/></p>
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