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
		<section id="commentsAdmin">
			<h1><spring:message code="adm.rat.title" text=""/></h1>
			<nav id="listCategory" />
			<hr>

			<article id="categoryDataTable">

				<c:if test="${empty ratings and fn:length(ratings) == 0}">
					<p id="messageKo"><spring:message code="adm.rat.null" text=""/></p>
				</c:if>

				<table id="dataTables" class="table-hover table-condensed">
					<thead>
						<tr>
							<th><spring:message code="adm.rat.id" text=""/></th>
							<th><spring:message code="adm.rat.rat" text=""/></th>
							<th><spring:message code="adm.rat.from" text=""/></th>
							<th><spring:message code="adm.rat.date" text=""/></th>
							<th><spring:message code="adm.rat.comm" text=""/></th>
							<th><spring:message code="adm.rat.serv" text=""/></th>
							<th><spring:message code="adm.del" text=""/></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ratings}" var="rating">

							<tr>
								<td><small>${rating.id}</small></td>
								<td><small>${rating.notation}</td>
								<td><small>${rating.customer.name} ${rating.customer.surname}</small></td>
								<td><small>${rating.date}</small></td>
								<td><small>${rating.comment}</small></td>
								<td><small>${rating.service.name}</small></td>
								<form method="POST" action="deleteRating.rate">
									<td>
										<input type="hidden" name="id" id="id"                     value="${rating.id}" /> 
										<input type="submit" name="ratingDelete" id="ratingDelete" value="<spring:message code="adm.del" text=""/>" />
									</td>
								</form>
							</tr>

						</c:forEach>
					</tbody>
				</table>

				<hr>
				<c:if test="${messageOk != null}">
					<p id="messageOk"><spring:message code="adm.rat.comm.del" text=""/></p>
				</c:if>
				<c:if test="${messageKo != null}">
					<p id="messageKo"><spring:message code="adm.error" text=""/></p>
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