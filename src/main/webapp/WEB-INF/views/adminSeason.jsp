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
			<h1><spring:message code="adm.season.title" text=""/></h1>
			<nav id="listCategory" />
			<hr>

			<article id="adminDataTable">

				<c:if test="${empty seasons and fn:length(seasons) == 0}">
					<p id="messageKo"><spring:message code="adm.season.null" text=""/></p>
				</c:if>

				<table id="dataTables" class="table-hover">
					<thead>
						<tr>
							<th><spring:message code="adm.season.name" text=""/></th>
							<th><spring:message code="adm.season.start" text=""/></th>
							<th><spring:message code="adm.season.end" text=""/></th>
							<th><spring:message code="adm.modif" text=""/></th>
							<th><spring:message code="adm.del" text=""/></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${seasons}" var="season">

							<tr>
								<form method="POST" action="updateSeason.admin">
									<td><input id="name" 		name="name" 		value="${season.name}" /></td>
									<td><input id="startDate" 	name="startDate" 	value="${season.startDate}" class="datepick" /></td>
									<td><input id="endDate" 	name="endDate" 		value="${season.endDate}"   class="datepick" /></td>
									<td>
										<input type="hidden" id="id" 			name="id" 	  			value="${season.id}" /> 
										<input type="submit" id="seasonUpdate" 	name="seasonUpdate"  	value="<spring:message code="adm.modif" text=""/>" />
									</td>
								</form>
								<form method="POST" action="deleteSeason.admin">
									<td><input type="hidden" name="id" id="id"
										value="${season.id}" /> <input type="submit"
										name="seasonDelete" id="seasonDelete" value="<spring:message code="adm.del" text=""/>" /></td>
								</form>
							</tr>

						</c:forEach>
					</tbody>
				</table>

				<hr>
				<div class="form-actions">
					<form action="createSeason.admin" method="get">
						<input type="submit" id="createSeason" name="createSeason" value="<spring:message code="adm.create" text=""/>" />
					</form>
				</div>

				<c:if test="${messageOk != null}">
					<p id="messageOk"><spring:message code="adm.season.upd" text=""/></p>
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
	
		$('.datepick').datepicker({'format': 'yyyy-mm-dd'});
		
		$(document).ready(function() {
			$('#dataTables').dataTable();
		});
		
	</script>