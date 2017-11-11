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
<form action="goToNextPerson.booking" method="post">
	<section id="sectionBookingEquipmentAndPass">

		<ol id="bookingStatus" class="bookStatus" data-progtrckr-steps="5">
			<li class="bookStatus-done">Flat choice</li>
			<li class="bookStatus-ip">Equipment</li>
			<li class="bookStatus-ip">Pass</li>
			<li class="bookStatus-todo">Summary</li>
			<li class="bookStatus-todo">Payment</li>
		</ol>
		<hr>
		<h2>
			<span id="labelCurrentGuest">Guest <c:out
					value="${nbCurrentPerson}" /> / <c:out value="${nbPersons}" /></span>
		</h2>

		<div class="row">
			<h3>Réservation du matériel</h3>
			<div class="span3">
				<aside id="guestTypeForm">
					<form action="searchEquipment.booking" method="post">
						<div id="guestType" class="control-group">
							<fieldset>
								<legend>Type de personne :</legend>
								<c:forEach items="${allAgeCategory}" var="ageCategory">
									<input type="radio" name="guestTypeChoice"
										value="${ageCategory.name}" checked="checked" />
									<c:out value="${ageCategory.name}" />
									<br />
								</c:forEach>
							</fieldset>
						</div>
						<div id="guestHeight" class="control-group">
							<label for="guestHeightValue">Taille (en cm)</label> <input
								type="number" name="guestHeightValue" value="180" />
						</div>
						<div id="guestShoesSize" class="control-group">
							<label for="guestShoesSizeValue">Pointure</label> <input
								type="number" name="guestShoesSizeValue" value="42" />
						</div>
						<div id="buttonGetEquipments" class="form-actions">
							<input type="submit" value="Recherche" />
						</div>
					</form>
				</aside>
			</div>

			<div id="bookingEquipmentAndPassForm" class="span9">
				<article id="equipmentsDataTable">
					<table class="dataTables">
						<thead>
							<tr>
								<th>Description du matériel</th>
								<th>Reviews</th>
								<th>Reservation</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${equipmentsAvailable}" var="equipment">
								<tr>
									<td>${equipment.category.description}</td>
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
		
		
		
		<div class="row">
			<h3>Réservation des forfaits</h3>
			<article id="passList">
				<div id="forfaitSkiAlpin" class="span4">
					<fieldset>
						<legend>Forfait ski alpin</legend>
						<input type="radio" name="forfaitSkiAlpinChoice" /> Forfait
						ToutSchuss<br /> <input type="radio" name="forfaitSkiAlpinChoice" />
						Forfait ToutSchuss Diamant <br /> <label
							for="forfaitSkiAlpinNumberOfDays">Nombre de jours :</label> <select
							name="forfaitSkiAlpinNumberOfDays">
							<option value="demijournee">1/2 journée</option>
						</select><br /> <input type="checkbox"
							name="forfaitSkiAlpinAllSeasonOption" /> Forfait à la saison
					</fieldset>
				</div>
				<div id="forfaitSkiNordique" class="span4">
					<fieldset>
						<legend>Forfait ski alpin</legend>
						<label for="forfaitSkiNordiqueNumberOfDays">Nombre de
							jours :</label> <select name="forfaitSkiNordiqueNumberOfDays">
							<option value="demijournee">1/2 journée</option>
						</select><br /> <input type="checkbox"
							name="forfaitSkiNordiqueAllSeasonOption" /> Forfait à la saison
					</fieldset>
				</div>
				<div id="forfaitTeleSiege" class="span4">
					<fieldset>
						<legend>Forfait télésiège</legend>
						<input type="radio" name="forfaitTeleSiegeChoice" /> 1
						aller/retour<br /> <input type="radio"
							name="forfaitTeleSiegeChoice" /> 6 aller/retour
					</fieldset>
				</div>
			</article>

		</div>
		<hr>
		<div class="row">
			<h3>Réservation des trainings</h3>
			<article id="trainingList">
				<div id="bookingEquipmentAndPassForm">
					<article id="trainingDataTable">
						<table class="dataTables">
							<thead>
								<tr>
									<th>Name</th>
									<th>Course Level</th>
									<th>Total Hour Duration</th>
									<th>Number Of Half Day</th>

									<th>Training Partner</th>
									<th>Pass price</th>
									<th>Age category</th>

									<th>Reviews</th>
									<th>Choose</th>
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
				<h5 id="labelTotalBookingReservation">Prix total de la
					réservation : 980 Euros</h5>
				<span id="ButtonReserver"><input type="submit"
					value="Réserver" /></span>
			</article>
		</div>
	</section>
</form>

</div>

<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
	$('.dataTables').dataTable({
		"bJQueryUI" : true
	});
</script>