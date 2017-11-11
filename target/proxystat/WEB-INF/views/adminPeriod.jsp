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
			<h1>Periods administration</h1>
			<nav id="listCategory" />
			<hr>

			<article id="adminDataTable">

				<c:if test="${empty periods and fn:length(periods) == 0}">
					<p id="messageKo">No periods available</p>
				</c:if>

				<table id="dataTables" class="table-hover">
					<thead>
						<tr>
							<th>Name</th>
							<th>Start date</th>
							<th>End date</th>
							<th>Update</th>
							<th>Delete</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${periods}" var="period">

							<tr>
								<form method="POST" action="updatePeriod.admin">
									<td><input id="name" 		name="name" 		value="${period.name}" /></td>
									<td><input id="startDate" 	name="startDate" 	value="${period.startDate}" class="datepick" /></td>
									<td><input id="endDate" 	name="endDate" 		value="${period.endDate}"   class="datepick" /></td>
									<td>
										<input type="hidden" id="id" 			name="id" 	  			value="${period.id}" /> 
										<input type="submit" id="periodUpdate" 	name="periodUpdate"  	value="Update" />
									</td>
								</form>
								<form method="POST" action="deletePeriod.admin">
									<td><input type="hidden" name="id" id="id"
										value="${period.id}" /> <input type="submit"
										name="periodDelete" id="periodDelete" value="Delete" /></td>
								</form>
							</tr>

						</c:forEach>
					</tbody>
				</table>

				<hr>
				<div class="form-actions">
					<form action="createPeriod.admin" method="get">
						<input type="submit" id="createPeriod" name="createPeriod" value="Create" />
					</form>
				</div>

				<c:if test="${messageOk != null}">
					<p id="messageOk">Period updated</p>
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