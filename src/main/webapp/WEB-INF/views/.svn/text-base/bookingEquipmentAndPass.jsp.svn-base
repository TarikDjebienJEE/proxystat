<%-- 
	Author : tarik Djebien
	Object : booking equipments and pass page
 --%>

<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%-- HTML5 --%>

<section id="sectionBookingEquipmentAndPass">

	<ol id="bookingStatus" class="bookStatus" data-progtrckr-steps="5">
	    <li class="bookStatus-done"><spring:message code="booking.flatChoice" text="unknow"/></li>
	    <li class="bookStatus-ip"><spring:message code="booking.equipment" text="unknow"/></li>
	    <li class="bookStatus-ip"><spring:message code="booking.pass" text="unknow"/></li>
	    <li class="bookStatus-todo"><spring:message code="booking.summary" text="unknow"/></li>
	    <li class="bookStatus-todo"><spring:message code="booking.payment" text="unknow"/></li>		
	</ol>
	<hr>
	<h2>
		<span id="labelCurrentGuest"><spring:message code="booking.guest" text="unknow"/> <c:out
				value="${nbCurrentPerson}" /> / <c:out value="${nbPersons}" /></span>
	</h2>

	<form action="searchEquipmentOrGoToNextPerson.booking" method="post">
	
		<!-- Equipements -->
		<div class="row">
			<h3><spring:message code="booking.bookingEquipment" text="unknow"/></h3>
			<div class="span3">
				<aside id="guestTypeForm">
					<div id="guestType" class="control-group">
						<fieldset>
							<legend><spring:message code="booking.personType" text="unknow"/></legend>
							<c:forEach items="${allAgeCategory}" var="ageCategory">
								<input type="radio" name="guestTypeChoice"
									value="${ageCategory.name}" checked="checked" />
								<c:out value="${ageCategory.name}" />
								<br />
							</c:forEach>
						</fieldset>
					</div>
					<div id="guestHeight" class="control-group">
						<label for="guestHeightValue"><spring:message code="booking.height" text="unknow"/></label> <input
							type="number" name="guestHeightValue" />
					</div>
					<div id="guestShoesSize" class="control-group">
						<label for="guestShoesSizeValue"><spring:message code="booking.shoesSize" text="unknow"/></label> <input
							type="number" name="guestShoesSizeValue" />
					</div>
					<div id="buttonGetEquipments" class="form-actions">
						<input type="submit" name="searchEquipment" value="Recherche" />
					</div>

				</aside>
			</div>

			<div id="bookingEquipmentAndPassForm" class="span9">
				<article id="equipmentsDataTable">
					<table class="dataTables">
						<thead>
							<tr>
								<th> <spring:message code="booking.categoryName" text="unknow"/></th>
								<th> <spring:message code="booking.categoryDescription" text="unknow"/></th>
								<th> <spring:message code="booking.quality" text="unknow"/></th>
								<th> <spring:message code="booking.height" text="unknow"/></th>
								<th> <spring:message code="booking.minHeight" text="unknow"/></th>
								<th> <spring:message code="booking.category" text="unknow"/></th>
								<th> <spring:message code="booking.price" text="unknow"/></th>
								<th> <spring:message code="booking.reviews" text="unknow"/></th>
								<th> <spring:message code="booking.booking" text="unknow"/></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${equipmentsAvailable}" var="equipment">
								<tr>
									<td>${equipment.category.name}</td>
									<td>${equipment.category.description}</td>
									<td>${equipment.quality}</td>
									<td>${equipment.size}</td>
									<td>${equipment.minimumHeight}</td>
									<td>${equipment.ageCategory.name}</td>
									<td>${equipment.price.price}</td>
									<td><a
										href=showServiceRatings.rate?id=${equipment.service.id}
										target="_blank"> comments <i class="icon-comment"></i></a></td>
									<td><input type="checkbox" name="equipmentChoice"
										value="${equipment.id}" /></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</article>
			</div>
		</div>
		<hr>
		
		
		<!-- Pass -->
		
		
		<!-- Pass -->
		<div class="row">
			<h3><spring:message code="booking.bookingPass" text="unknow"/></h3>
			<article id="passList">
				<div id="bookingEquipmentAndPassForm">
					<article id="passDataTable">
						<table class="dataTables">
							<thead>
								<tr>
									<th><spring:message code="booking.caution" text="unknow"/></th>
									<th><spring:message code="booking.trackName" text="unknow"/></th>
									<th><spring:message code="booking.trackType" text="unknow"/></th>
									<th><spring:message code="booking.trackDomain" text="unknow"/></th>
									<th><spring:message code="booking.duration" text="unknow"/></th>
									<th><spring:message code="booking.nbDay" text="unknow"/></th>
									<th><spring:message code="booking.fullSeason" text="unknow"/></th>
									<th><spring:message code="booking.ageCategory" text="unknow"/></th>
									<th><spring:message code="booking.partner" text="unknow"/></th>
									<th><spring:message code="booking.choice" text="unknow"/></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${passAvalaible}" var="pass">
									<tr>
										<td>${pass.cautionPrice}</td>
										<td>${pass.track.name}</td>
										<td>${pass.track.type}</td>
										<td>${pass.track.domain}</td>
										<td>${pass.duration.name}</td>
										<td>${pass.duration.numberOfDays}</td>
										<td>${pass.duration.fullSeason}</td>
										<td>${pass.ageCategory.name}</td>
										<td>${pass.mechanicPartner.name}</td>
										<td><input type="radio" name="passChoice" value="${pass.id}" /></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</article>
				</div>
			</article>
		</div>
		<hr>		
		
		<!-- Trainings -->
		<div class="row">
			<h3><spring:message code="booking.bookingTrainings" text="unknow"/></h3>
			<article id="trainingList">
				<div id="bookingEquipmentAndPassForm">
					<article id="trainingDataTable">
						<table class="dataTables">
							<thead>
								<tr>
									<th><spring:message code="booking.serviceName" text="unknow"/></th>
									<th><spring:message code="booking.courseLevel" text="unknow"/></th>
									<th><spring:message code="booking.totalDuration" text="unknow"/></th>
									<th><spring:message code="booking.halfDay" text="unknow"/></th>

									<th><spring:message code="booking.partner" text="unknow"/></th>
									<th><spring:message code="booking.cautionPassPrice" text="unknow"/></th>
									<th><spring:message code="booking.ageCategory" text="unknow"/></th>
									<th><spring:message code="booking.price" text="unknow"/></th>

									<th><spring:message code="booking.reviews" text="unknow"/></th>
									<th><spring:message code="booking.choice" text="unknow"/></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${trainingCourseAvailable}"
									var="trainingCourse">
									<tr>
										<td>${trainingCourse.service.name}</td>
										<td>${trainingCourse.courseLevel}</td>
										<td>${trainingCourse.totalHourDuration}</td>
										<td>${trainingCourse.numberOfHalfDay}</td>

										<td>${trainingCourse.trainingPartner.name}</td>
										<td>${trainingCourse.pass.cautionPrice}</td>
										<td>${trainingCourse.ageCategory.name}</td>
										<td>${trainingCourse.price.price}</td>

										<td><a
											href=showServiceRatings.rate?id=${trainingCourse.service.id}
											target="_blank"> comments <i class="icon-comment"></i></a></td>
										<td><input type="radio" name="trainingCourseChoice"
											value="${trainingCourse.id}" /></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</article>
				</div>
			</article>
		</div>


		<div class="form-actions">
			<article id="bookingEquipmentAndPassValidation">
				<h5 id="labelTotalBookingReservation">
					<spring:message code="booking.totalPrice" text="unknow"/>
					<c:out value="${basket.totalPrice}" />
					Euros
				</h5>
				<span id="ButtonReserver"> <input type="submit"
					name="reserver" value="<spring:message code="booking.book" text="unknow"/>" />
				</span>
			</article>
		</div>

	</form>
</section>


<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
	$('.dataTables').dataTable({
		"bJQueryUI" : true
	});
</script>