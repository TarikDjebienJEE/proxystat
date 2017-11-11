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
			<h1>Users administration</h1>
			<nav id="listCategory" />
			<hr>

			<article id="adminDataTable">

				<c:if test="${empty users and fn:length(users) == 0}">
					<p id="messageKo">No users available</p>
				</c:if>

				<table id="dataTables" class="table-hover">
					<thead>
						<tr>
							<th>name</th>
							<th>surname</th>
							<th>jobtitle</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${users}" var="user">

							<tr>
								<form method="POST" action="updateUser.admin">
									<td><input id="name" 	name="name" value="tarik" /></td>
									<td><input id="surname" 	name="surname" value="${user.surname}" /></td>
									<td><input id="jobtitle" 	name="jobtitle" value="${user.jobtitle}" /></td>
									<td>
										<input type="hidden" id="id" 			name="id" 	  			value="${user.id}" /> 
										<input type="submit" id="userUpdate" 	name="userUpdate"  	value="Update" />
									</td>
								</form>
								<form method="POST" action="deleteUser.admin">
									<td><input type="hidden" name="id" id="id"
										value="${user.id}" /> <input type="submit"
										name="userDelete" id="userDelete" value="Delete" /></td>
								</form>
							</tr>

						</c:forEach>
					</tbody>
				</table>

				<hr>
				<div class="form-actions">
					<form action="createUser.admin" method="get">
						<input type="submit" id="createUser" name="createUser" value="Create" />
					</form>
				</div>

				<c:if test="${messageOk != null}">
					<p id="messageOk">User updated</p>
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