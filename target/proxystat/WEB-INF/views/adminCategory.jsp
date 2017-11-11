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
			<h1>Category administration</h1>
			<nav id="listCategory" />
			<hr>

			<article id="categoryDataTable">

				<c:if test="${empty categories and fn:length(categories) == 0}">
					<p id="messageKo">No categories available</p>
				</c:if>

				<table id="dataTables" class="display">
					<thead>
						<tr>
							<th>Name</th>
							<th>Description</th>
							<th>Update</th>
							<th>Delete</th>
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
										name="categoryUpdate" id="categoryUpdate" value="Update" /></td>
								</form>
								<form method="POST" action="deleteCategory.adminSportPartner">
									<td><input type="hidden" name="id" id="id"
										value="${category.id}" /> <input type="submit"
										name="categoryDelete" id="categoryDelete" value="Delete" /></td>
								</form>
							</tr>

						</c:forEach>
					</tbody>
				</table>

				<hr>
				<div class="form-actions">
					<form action="createCategory.adminSportPartner" method="post">
						<input type="submit" id="createCategory" name="createCategory" value="Create" />
					</form>
				</div>

				<c:if test="${messageOk != null}">
					<p id="messageOk">Category updated</p>
				</c:if>
				<c:if test="${messageKo != null}">
					<p id="messageKo">Missing required information</p>
				</c:if>
				<c:if test="${messageKoFk != null}">
					<p id="messageKo">Cannot delete, object still referenced</p>
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