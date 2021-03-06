<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<%-- VARIABLES --%>
<%
	
%>

<jsp:include page="header.jsp" />

<%-- HTML5 --%>
<hr>
<div class="container">
<section id="sectionCreateCourse">

<h1><spring:message code="adm.train.title" text=""/></h1>

	<%-- FORMULAIRE DE CREATION D'UN COURS --%>
		<hr>	
		<form method="post" action="createCourse.adminTrainingPartner" class="form-horizontal">	
			<fieldset>
				<div class="control-group">
					<label for="coursename"><spring:message code="adm.train.name" text=""/></label>
					<div>
						<input id="coursename" name="coursename" type="text" value=${courseidChoice.service.name}/> 
						<spring:message code="adm.compulsory" text=""/>
					</div>
				</div>
				<div class="control-group">		
					<label for="courseLevel"><spring:message code="adm.train.level" text=""/></label> 
					<div>
						<select id="levelChoice" name="levelChoice">
							<option value=1>1</option>							
							<option value=2>2</option>
							<option value=3>3</option>
							<option value=4>4</option>							
						</select> 
						<spring:message code="adm.compulsory" text=""/> 
					</div>
				</div>
				<div class="control-group">		
					<label for="durationChoice"><spring:message code="adm.train.hour" text=""/></label>
					<div>
						<select id="durationChoice" name="durationChoice">
							<option value=2>2</option>
							<option value=4>4</option>
							<option value=6>6</option>
							<option value=8>8</option>
							<option value=10>10</option>
						</select> 
						<spring:message code="adm.compulsory" text=""/> 
					</div>	
				</div>
				<div class="control-group">		
					<label for="halfDayChoice"><spring:message code="adm.train.day" text=""/></label>
					<div>
						<select id="halfDayChoice" name="halfDayChoice">
							<option value=1>1</option>							
							<option value=2>2</option>
							<option value=3>3</option>
							<option value=4>4</option>
						</select> 
						<spring:message code="adm.compulsory" text=""/> 
					</div>	
				</div>
				<div class="control-group" >
					<label for="coursePass"><spring:message code="adm.train.pass" text=""/></label>
					<div>
						<select id="passidChoice" name="passidChoice">
							<c:forEach items="${passAvailable}" var="pass">
								<c:if test="${courseToModify.pass.service.id==pass.service.id}">
									<option value=${courseToModify.pass.service.id } selected="selected">${courseToModify.pass.service.name}</option>
								</c:if>
								<c:if test="${courseToModify.pass.service.id!=pass.service.id}">
									<option value=${pass.service.id}>${pass.service.name}</option>
								</c:if>
							</c:forEach>
						</select> 
						<spring:message code="adm.compulsory" text=""/> 
					</div>
				</div>
				<div class="control-group">
					<label for="coursePrice"><spring:message code="adm.train.price" text=""/></label>
					<div>
						<select id="priceChoice" name="priceChoice">
							<c:forEach items="${pricesAvailable}" var="price">
									<option value=${price.id}>${price.price}</option>
							</c:forEach>	
					    </select>
						<spring:message code="adm.compulsory" text=""/>
					</div>
				</div>
				<div class="control-group">
					<label for="coursePeriode"><spring:message code="adm.train.period" text=""/></label>
					<div>
						<select id="periodChoice" name="periodChoice">
							<c:forEach items="${periodAvailable}" var="period">
									<option value=${period.id}>${period.name}</option>
							</c:forEach>	
					    </select>
						<spring:message code="adm.compulsory" text=""/>
					</div>
				</div>
			
				<div class="control-group">	
					<label for="passAgeCategory"><spring:message code="adm.train.age" text=""/></label> 
					<div>
						<select id="ageCategoryChoice" name="ageCategoryChoice">
							<c:forEach items="${ageCategoryAvailable}" var="ageCategory">
									<option value=${ageCategory.id}>${ageCategory.name}</option> 
							</c:forEach>	
					    </select>
						<spring:message code="adm.compulsory" text=""/>
					</div>
				</div>
				<div class="form-actions">	
					<input id="createCourse_button" value="<spring:message code="adm.save" text=""/>" type="submit"  /> 
				</div>
			</fieldset>
		</form>
		
		<a id="linkAdminTrainingPartnerToAddCourse" href="course.adminTrainingPartner" title=""><spring:message code="adm.return" text=""/></a>
		<c:if test="${messageOk != null}">
				<p id="messageOk">${messageOk}</p>
		</c:if>
		<c:if test="${messageKo != null}">
				<p id="messageKo">${messageKo}</p>
		</c:if>	
				
</section>
</div>

<jsp:include page="footer.jsp" />

<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		
		$('.control-group > label').addClass('control-label');
		$('.control-group > div').addClass('controls');
		
	});
</script>