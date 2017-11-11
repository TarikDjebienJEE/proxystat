<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%-- HTML5 --%>
<section id="sectionBookingSummary">

	<ol id="bookingStatus" class="bookStatus" data-progtrckr-steps="5">
	    <li class="bookStatus-done"><spring:message code="booking.flatChoice" text="unknow"/></li>
	    <li class="bookStatus-done"><spring:message code="booking.equipment" text="unknow"/></li>
	    <li class="bookStatus-done"><spring:message code="booking.pass" text="unknow"/></li>
	    <li class="bookStatus-ip"><spring:message code="booking.summary" text="unknow"/></li>
	    <li class="bookStatus-todo"><spring:message code="booking.payment" text="unknow"/></li>		
	</ol>
	<hr>
	<article id="summaryAllBooking">

		<div id="summary">
			<h4><spring:message code="booking.summary" text="unknow"/></h4>

			<div class="row">

				<div class="span7">
					<table class="table table-hover">
						<thead>
							<tr>
								<th><spring:message code="booking.summary" text="unknow"/></th>
								<th>Service</th>
								<th><spring:message code="booking.price" text="unknow"/></th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><spring:message code="booking.flat" text="unknow"/></td>
								<td>${basket.flat.flatType.service.name}</td>
								<td>${basket.flat.flatType.price.price} €</td>
							</tr>
							<c:forEach items="${basket.guests}" var="guest">
								
								<tr>
									<td>
										<i class="icon-user"></i> <c:out value="${guest.name}" />
									</td>
									
									<td>
										<!-- Equipements -->
										<div class="well">
											<h5><spring:message code="booking.equipments" text="unknow"/></h5><br/>
											<c:forEach items="${guest.guestEquipments}" var="equipments">
												<ul>
													<li>
														<c:out value="${equipments.equipment.service.name}" /> : 
														<c:out value="${equipments.equipment.price.price} €" /><br/>
													</li>
												</ul>
											</c:forEach>
										</div>

										<div class="well">
											<h5><spring:message code="booking.pass" text="unknow"/></h5>
											<c:out value="${guest.pass.service.name}" />:
											<c:out value="${guest.pass.price.price} €" />
										</div>

										<div class="well">
											<h5><spring:message code="booking.trainingCourse" text="unknow"/></h5><br/>
											<c:out value="${guest.trainingCourse.service.name}" /> : 
											<c:out value="${guest.trainingCourse.price.price} €" /><br/>
										</div>
									</td>
									
								</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>

				<div class="span5">
					<div id="totalPriceBooking">
						<h4>
							TOTAL
							<c:out value="${basket.totalPrice}" />
							€
						</h4>
					</div>
					<div id="acomptePriceValue">
						<h5>
							<spring:message code="booking.account" text="unknow"/> 20%:
							<c:out value="${basket.totalAccount}" />
							€
						</h5>
					</div>
				</div>

			</div>
		</div>
	</article>
	
	
	<hr>
	<article id="summaryConfirmation">
		<form action="chooseOptions.booking" method="post">
			<fieldset id="optionsSelection">
				<h4><spring:message code="booking.selectOptions" text="unknow"/></h4>

				<table class="table table-hover">
					<thead>
						<tr>
							<th>Option</th>
							<th><spring:message code="booking.description" text="unknow"/></th>
							<th>% <spring:message code="booking.price" text="unknow"/></th>
							<th><spring:message code="booking.fixPrice" text="unknow"/></th>
							<th><spring:message code="booking.perGuest" text="unknow"/></th>
							<th><spring:message code="booking.reviews" text="unknow"/></th>
							<th><spring:message code="booking.choice" text="unknow"/></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${options}" var="option">
							<tr>
								<td>${option.service.name}</td>
								<td>${option.service.description}</td>
								<td>${option.pricePercentage}</td>
								<td><c:choose>
										<c:when test="${option.price.discountPrice > 0}">
											<span class="priceTag"> <span class="price">${option.price.price}</span>
												<span class="discount"><i class="icon-tag"></i>${option.price.discountPrice}</span>
											</span>
										</c:when>
										<c:otherwise>
											<span class="priceTag"> <span>${option.price.price}</span>
											</span>
										</c:otherwise>
									</c:choose></td>
								<td>${option.perPerson}</td>
								<td><a href=showServiceRatings.rate?id=${option.service.id}
									target="_blank"> comments <i class="icon-comment"></i></a></td>
								<td><input id="${option.service.name}" type="checkbox"
									name="optionsSelected" value="${option.id}" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</fieldset>
			<div class="form-actions">
				<input type="submit" value="<spring:message code="booking.confirmBooking" text="unknow"/>" />
			</div>
		</form>
	</article>

</section>

<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
	
</script>