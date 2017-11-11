<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
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
			<h1><spring:message code="adm.flat.type" text=""/></h1>
			<nav id="listCategory" />
			<hr>

			<article id="adminDataTable">

				<c:if test="${empty flatTypes and fn:length(flatTypes) == 0}">
					<p id="messageKo"><spring:message code="adm.flat.type.null" text=""/></p>
				</c:if>

				<table id="dataTables" class="table-hover">
					<thead>
						<tr>
							<th><spring:message code="adm.name" text=""/></th>
							<th><spring:message code="adm.desc" text=""/></th>
							<th><spring:message code="adm.flat.type.bed" text=""/></th>
							<th><spring:message code="adm.flat.type.size" text=""/></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${flatTypes}" var="flatType">

							<tr>
								<form method="POST" action="updateFlatType.admin">
									<td><input id="name" 	name="name" value="${flatType.name}" /></td>
									<td><input id="description" 	name="description" value="${flatType.description}" /></td>
									<td><input id="numberOfBeds" 	name="numberOfBeds" value="${flatType.numberOfBeds}" /></td>
									<td><input id="size" 	name="size" value="${flatType.size}" /></td>
									<td>
										<input type="hidden" id="id" 			name="id" 	  			value="${flatType.id}" /> 
										<input type="submit" id="flatTypeUpdate" 	name="flatTypeUpdate"  	value="<spring:message code="adm.modif" text=""/>" />
									</td>
								</form>
								<form method="POST" action="deleteFlatType.admin">
									<td><input type="hidden" name="id" id="id"
										value="${flatType.id}" /> <input type="submit"
										name="flatTypeDelete" id="flatTypeDelete" value="<spring:message code="adm.del" text=""/>" /></td>
								</form>
							</tr>

						</c:forEach>
					</tbody>
				</table>

				<hr>
				<div class="form-actions">
					<form action="createFlatType.admin" method="get">
						<input type="submit" id="createFlatType" name="createFlatType" value="<spring:message code="adm.create" text=""/>" />
					</form>
				</div>

				<c:if test="${messageOk != null}">
					<p id="messageOk"><spring:message code="adm.flat.type.upd" text=""/></p>
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