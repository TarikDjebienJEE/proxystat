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
			<h1><spring:message code="adm.opt.title" text=""/></h1>
			<nav id="listCategory" />
			<hr>

			<article id="adminDataTable">

				<c:if test="${empty options and fn:length(options) == 0}">
					<p id="messageKo"><spring:message code="adm.opt.null" text=""/></p>
				</c:if>

				<table id="dataTables" class="table-hover">
					<thead>
						<tr>
							<th><spring:message code="adm.opt.pers" text=""/></th>
							<th><spring:message code="adm.opt.perc" text=""/></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${options}" var="option">

							<tr>
								<form method="POST" action="updateOption.admin">
									<td>
										<c:choose>
											<c:when test="${option.perPerson}">
												<input id="perPerson" type="checkbox"	name="perPerson" value="<%=AdministrationController.FRONT_CRUD_CHECKED%>" checked="checked" />
    										</c:when>
											<c:otherwise>
												<input id="perPerson" type="checkbox"	name="perPerson" value="<%=AdministrationController.FRONT_CRUD_UNCHECKED%>" />
    										</c:otherwise>
										</c:choose> 
									</td>
									<td><input id="pricePercentage" 	name="pricePercentage" value="${option.pricePercentage}" /></td>
									<td>
										<input type="hidden" id="id" 			name="id" 	  			value="${option.id}" /> 
										<input type="submit" id="optionUpdate" 	name="optionUpdate"  	value="<spring:message code="adm.modif" text=""/>" />
									</td>
								</form>
								<form method="POST" action="deleteOption.admin">
									<td><input type="hidden" name="id" id="id"
										value="${option.id}" /> <input type="submit"
										name="optionDelete" id="optionDelete" value="<spring:message code="adm.del" text=""/>" /></td>
								</form>
							</tr>

						</c:forEach>
					</tbody>
				</table>

				<hr>
				<div class="form-actions">
					<form action="createOption.admin" method="get">
						<input type="submit" id="createOption" name="createOption" value="<spring:message code="adm.create" text=""/>" />
					</form>
				</div>

				<c:if test="${messageOk != null}">
					<p id="messageOk"><spring:message code="adm.opt.upd" text=""/></p>
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