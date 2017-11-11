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
		<section id="sectionAdministrationCategory">
			<h1><spring:message code="adm.categ.title" text=""/></h1>
			<nav id="listCategory" />
			<hr>

			<article id="categoryDataTable">

				<c:if test="${empty categories and fn:length(categories) == 0}">
					<p id="messageKo"><spring:message code="adm.categ.null" text=""/></p>
				</c:if>

				<table id="dataTables" class="display">
					<thead>
						<tr>
							<th><spring:message code="adm.name" text=""/></th>
							<th><spring:message code="adm.desc" text=""/></th>
							<th><spring:message code="adm.modif" text=""/></th>
							<th><spring:message code="adm.del" text=""/></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${categories}" var="category">

							<tr>
								<form method="POST" action="updateCategory.adminSportPartner">
									<td><input id="name" name="name" value="${category.name}" ></td>
									<td><input id="desc" name="desc" value="${category.description}"></td>
									<td><input type="hidden" name="id" id="id"
										value="${category.id}" /> <input type="submit"
										name="categoryUpdate" id="categoryUpdate" value="<spring:message code="adm.modif" text=""/>" /></td>
								</form>
								<form method="POST" action="deleteCategory.adminSportPartner">
									<td><input type="hidden" name="id" id="id"
										value="${category.id}" /> <input type="submit"
										name="categoryDelete" id="categoryDelete" value="<spring:message code="adm.del" text=""/>" /></td>
								</form>
							</tr>

						</c:forEach>
					</tbody>
				</table>

				<hr>
				<div class="form-actions">
					<form action="createCategory.adminSportPartner" method="post">
						<input type="submit" id="createCategory" name="createCategory" value="<spring:message code="adm.create" text=""/>" />
					</form>
				</div>

				<c:if test="${messageOk != null}">
					<p id="messageOk"><spring:message code="adm.categ.upd" text=""/></p>
				</c:if>
				<c:if test="${messageKo != null}">
					<p id="messageKo"><spring:message code="adm.miss" text=""/></p>
				</c:if>
				<c:if test="${messageKoFk != null}">
					<p id="messageKo"><spring:message code="adm.cannot.del" text=""/></p>
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