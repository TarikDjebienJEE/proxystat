<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%-- HTML5 --%>
<%-- HEAD --%>
<jsp:include page="header.jsp" />

<hr>
<div class="container">
	<section id="sectionListCourse">
	<h1 id="trainingAdmin"><spring:message code="adm.train.course" text=""/></h1>

	<nav id="listCourse">
		<b><spring:message code="adm.train.list" text=""/></b>
	</nav>
	
	
	<article id="courseDataTable">
			<table id="dataTables" class="display">
				<thead>
					<tr>
						<th><spring:message code="adm.train.name" text=""/></th>
						<th><spring:message code="adm.train.level" text=""/></th>
						<th><spring:message code="adm.train.day" text=""/></th>
						<th><spring:message code="adm.train.hour" text=""/></th>
						<th><spring:message code="adm.train.pass" text=""/></th>
						<th><spring:message code="adm.train.price" text=""/>/<spring:message code="adm.train.period" text=""/></th>
						<th><spring:message code="adm.train.age" text=""/></th>
						<th><spring:message code="adm.modif" text=""/></th>
						<th><spring:message code="adm.del" text=""/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${courseAvailable}" var="course">
						<tr>
							<td>${course.service.name}</td>
							<td>${course.courseLevel}</td>
							<td>${course.numberOfHalfDay}</td>
							<td>${course.totalHourDuration}</td>
							<td>${course.pass.service.name}</td>
							<td>${course.price.price} / ${course.period.name}</td>
							<td>${course.ageCategory.name}</td>
							
							<form action="modifyOrDeleteCourse.adminTrainingPartner" method="post">
								<input type="hidden" name="idCourse" id=${course.id} value=${course.id}>
								<td><input type="submit" name="courseChoiceToModify" id="courseChoiceToModify" value="<spring:message code="adm.modif" text=""/>" /></td>
							</form>
							<form action="modifyOrDeleteCourse.adminTrainingPartner" method="post">
								<input type="hidden" name="idCourse" id=${course.id} value=${course.id}>
								<td><input type="submit" name="courseChoiceToDelete" id="courseChoiceToDelete" value="<spring:message code="adm.del" text=""/>" /></td>
							</form>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			</br>
				
			<form action="returnViewAdminTrainingPartnerToAddCourse.adminTrainingPartner">
				<input type="submit" id="linkAdminTrainingPartnerToAddCourse" value="<spring:message code="adm.course.create" text=""/>"  />
			</form>
			
			<c:if test="${empty courseAvailable and fn:length(courseAvailable) == 0}">
				<p id="messageKo"><spring:message code="adm.course.null" text=""/></p>
			</c:if>
			<c:if test="${messageKoDeleteCourse != null}">
				<p id="messageKo">${messageKoDeleteCourse}</p>
			</c:if>	
	</article>
	
</section>
</div>

<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		$('#dataTables').dataTable();
	});
</script>

<jsp:include page="footer.jsp" />