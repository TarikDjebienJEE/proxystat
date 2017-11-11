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
			<h1>Prices administration</h1>
			<nav id="listCategory" />
			<hr>

			<article id="adminDataTable">

				<c:if test="${empty prices and fn:length(prices) == 0}">
					<p id="messageKo">No prices available</p>
				</c:if>

				<table id="dataTables" class="table-hover">
					<thead>
						<tr>
							<th>Price</th>
							<th>Margin</th>
							<th>Discount Price</th>
							<th>Discounted</th>
							<th>Tax Rate</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${prices}" var="price">

							<tr>
								<form method="POST" action="updatePrice.admin">
									<td><input id="price" 	name="price" value="${price.price}" /></td>
									<td><input id="margin" 	name="margin" value="${price.margin}" /></td>
									<td><input id="discountPrice" 	name="discountPrice" value="${price.discountPrice}" /></td>
									<td>
										<c:choose>
											<c:when test="${price.discounted}">
												<input id="discounted" type="checkbox"	name="discounted" value="<%=AdministrationController.FRONT_CRUD_CHECKED%>" checked="checked" />
    										</c:when>
											<c:otherwise>
												<input id="discounted" type="checkbox"	name="discounted" value="<%=AdministrationController.FRONT_CRUD_UNCHECKED%>" />
    										</c:otherwise>
										</c:choose> 
									</td>
									<td><input id="taxRate" 	name="taxRate" value="${price.taxRate}" /></td>
									<td>
										<input type="hidden" id="id" 			name="id" 	  			value="${price.id}" /> 
										<input type="submit" id="priceUpdate" 	name="priceUpdate"  	value="Update" />
									</td>
								</form>
								<form method="POST" action="deletePrice.admin">
									<td><input type="hidden" name="id" id="id"
										value="${price.id}" /> <input type="submit"
										name="priceDelete" id="priceDelete" value="Delete" /></td>
								</form>
							</tr>

						</c:forEach>
					</tbody>
				</table>

				<hr>
				<div class="form-actions">
					<form action="createPrice.admin" method="get">
						<input type="submit" id="createPrice" name="createPrice" value="Create" />
					</form>
				</div>

				<c:if test="${messageOk != null}">
					<p id="messageOk">Price updated</p>
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