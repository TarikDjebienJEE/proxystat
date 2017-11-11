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
			<h1><spring:message code="adm.flat.title" text=""/></h1>
			<nav id="listCategory" />
			<hr>

			<article id="adminDataTable">

				<c:if test="${empty flats and fn:length(flats) == 0}">
					<p id="messageKo"><spring:message code="adm.flat.null" text=""/></p>
				</c:if>

				<table id="dataTables" class="table-hover">
					<thead>
						<tr>
							<th><spring:message code="adm.flat.room" text=""/></th>
							<th><spring:message code="adm.flat.floor" text=""/></th>
							<th><spring:message code="adm.flat.access" text=""/></th>
							<th><spring:message code="adm.flat.stat" text=""/></th>
							<th><spring:message code="adm.flat.avl" text=""/></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${flats}" var="flat">

							<tr>
								<form method="POST" action="updateFlat.admin">
									<td><input id="roomNumber" 	name="roomNumber" value="${flat.roomNumber}" /></td>
									<td><input id="floor" 	name="floor" value="${flat.floor}" /></td>
									<td>
										<c:choose>
											<c:when test="${flat.handicapAccess}">
												<input id="handicapAccess" type="checkbox"	name="handicapAccess" value="<%=AdministrationController.FRONT_CRUD_CHECKED%>" checked="checked" />
    										</c:when>
											<c:otherwise>
												<input id="handicapAccess" type="checkbox"	name="handicapAccess" value="<%=AdministrationController.FRONT_CRUD_UNCHECKED%>" />
    										</c:otherwise>
										</c:choose> 
									</td>
									<td><input id="status" 	name="status" value="${flat.status}" /></td>
									<td>
										<c:choose>
											<c:when test="${flat.avalaible}">
												<input id="avalaible" type="checkbox"	name="avalaible" value="<%=AdministrationController.FRONT_CRUD_CHECKED%>" checked="checked" />
    										</c:when>
											<c:otherwise>
												<input id="avalaible" type="checkbox"	name="avalaible" value="<%=AdministrationController.FRONT_CRUD_UNCHECKED%>" />
    										</c:otherwise>
										</c:choose> 
									</td>
									<td>
										<input type="hidden" id="id" 			name="id" 	  			value="${flat.id}" /> 
										<input type="submit" id="flatUpdate" 	name="flatUpdate"  	value="<spring:message code="adm.modif" text=""/>" />
									</td>
								</form>
								<form method="POST" action="deleteFlat.admin">
									<td><input type="hidden" name="id" id="id"
										value="${flat.id}" /> <input type="submit"
										name="flatDelete" id="flatDelete" value="<spring:message code="adm.del" text=""/>" /></td>
								</form>
							</tr>

						</c:forEach>
					</tbody>
				</table>

				<hr>
				<div class="form-actions">
					<form action="createFlat.admin" method="get">
						<input type="submit" id="createFlat" name="createFlat" value="<spring:message code="adm.create" text=""/>" />
					</form>
				</div>

				<c:if test="${messageOk != null}">
					<p id="messageOk"><spring:message code="adm.flat.upd" text=""/></p>
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