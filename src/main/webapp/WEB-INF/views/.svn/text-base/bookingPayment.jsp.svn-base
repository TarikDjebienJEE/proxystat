<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%-- VARIABLES --%>
<%
	
%>

<%-- HTML5 --%>
<section id="sectionBookingPayment">

	<ol id="bookingStatus" class="bookStatus" data-progtrckr-steps="5">
	    <li class="bookStatus-done"><spring:message code="booking.flatChoice" text="unknow"/></li>
	    <li class="bookStatus-done"><spring:message code="booking.equipment" text="unknow"/></li>
	    <li class="bookStatus-done"><spring:message code="booking.pass" text="unknow"/></li>
	    <li class="bookStatus-done"><spring:message code="booking.summary" text="unknow"/></li>
	    <li class="bookStatus-ip"><spring:message code="booking.payment" text="unknow"/></li>	 		
	</ol>
	<hr>
	<aside id="bookingPaymentInvoice">
		<div id="summary">
			<h4><spring:message code="booking.invoice" text="unknow"/></h4>

			<table class="table table-condensed">
				<thead>
					<tr>
						<th>Service</th>
						<th><spring:message code="booking.price" text="unknow"/></th>
						<th><spring:message code="booking.taxRate" text="unknow"/></th>
					</tr>
				</thead>
				<tbody>

					<!-- Appartements -->
					<tr>
						<td>${basket.flat.flatType.service.name}</td>
						<td><c:choose>
								<c:when test="${basket.flat.flatType.price.discountPrice > 0}">
									<span class="priceTag"> <span class="price">${basket.flat.flatType.price.price}</span>
										<span class="discount"><i class="icon-tag"></i>${basket.flat.flatType.price.discountPrice}</span>
									</span>
								</c:when>
								<c:otherwise>
									<span class="priceTag"> <span>${basket.flat.flatType.price.price}</span>
									</span>
								</c:otherwise>
							</c:choose></td>
						<td>${basket.flat.flatType.price.taxRate}</td>
					</tr>


					<!-- Equipments -->
					<c:forEach items="${basket.guests}" var="guest">
						<c:forEach items="${guest.guestEquipments}" var="guestEquipment">
							<tr>
								<td>${guestEquipment.equipment.service.name}</td>
								<td>${guestEquipment.equipment.price.price} <c:choose>
										<c:when
											test="${guestEquipment.equipment.price.discountPrice > 0}">
											<span class="priceTag"> <span class="price">${guestEquipment.equipment.price.price}</span>
												<span class="discount"><i class="icon-tag"></i>${guestEquipment.equipment.price.discountPrice}</span>
											</span>
										</c:when>
										<c:otherwise>
											<span class="priceTag"> <span>${guestEquipment.equipment.price.price}</span>
											</span>
										</c:otherwise>
									</c:choose>
								</td>
								<td>${guestEquipment.equipment.price.taxRate}</td>
							</tr>
						</c:forEach>
					</c:forEach>


					<!-- Pass -->
					<c:forEach items="${basket.guests}" var="guest">
							<tr>
								<td>${guest.pass.service.name}</td>
								<td>${guest.pass.price.price} <c:choose>
										<c:when test="${guest.pass.price.discountPrice > 0}">
											<span class="priceTag"> <span class="price">${guest.pass.price.price}</span>
												<span class="discount"><i class="icon-tag"></i>${guest.pass.price.discountPrice}</span>
											</span>
										</c:when>
										<c:otherwise>
											<span class="priceTag"> <span>${guest.pass.price.price}</span>
											</span>
										</c:otherwise>
									</c:choose>
								</td>
								<td>${guest.pass.price.taxRate}</td>
							</tr>
					</c:forEach>



					<!-- Trainingcourse -->
					<c:forEach items="${basket.guests}" var="guest">
						<tr>
							<td>${guest.trainingCourse.service.name}</td>
							<td>${guest.trainingCourse.price.price} <c:choose>
									<c:when test="${guest.trainingCourse.price.discountPrice > 0}">
										<span class="priceTag"> <span class="price">${guest.trainingCourse.price.price}</span>
											<span class="discount"><i class="icon-tag"></i>${guest.trainingCourse.price.discountPrice}</span>
										</span>
									</c:when>
									<c:otherwise>
										<span class="priceTag"> <span>${guest.trainingCourse.price.price}</span>
										</span>
									</c:otherwise>
								</c:choose>
							</td>
							<td>${guest.trainingCourse.price.taxRate}</td>
						</tr>
					</c:forEach>


					<!-- Equipments -->
					<c:forEach items="${basket.guests}" var="guest">
						<c:forEach items="${guest.guestEquipments}" var="guestEquipment">
							<tr>
								<td>${guestEquipment.equipment.service.name}</td>
								<td>${guestEquipment.equipment.price.price} <c:choose>
										<c:when
											test="${guestEquipment.equipment.price.discountPrice > 0}">
											<span class="priceTag"> <span class="price">${guestEquipment.equipment.price.price}</span>
												<span class="discount"><i class="icon-tag"></i>${guestEquipment.equipment.price.discountPrice}</span>
											</span>
										</c:when>
										<c:otherwise>
											<span class="priceTag"> <span>${guestEquipment.equipment.price.price}</span>
											</span>
										</c:otherwise>
									</c:choose>
								</td>
								<td>${guestEquipment.equipment.price.taxRate}</td>
							</tr>
						</c:forEach>
					</c:forEach>

					<!-- Options -->

					<c:forEach items="${basket.optionsSelected}" var="option">
						<tr>
							<td>${option.service.name}</td>
							<td>${option.price.price} <c:choose>
									<c:when test="${option.price.discountPrice > 0}">
										<span class="priceTag"> <span class="price">${option.price.price}</span>
											<span class="discount"><i class="icon-tag"></i>${option.price.discountPrice}</span>
										</span>
									</c:when>
									<c:otherwise>
										<span class="priceTag"> <span>${option.price.price}</span>
										</span>
									</c:otherwise>
								</c:choose>
							</td>
							<td>${option.price.taxRate}</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</aside>

	<div class="row">

		<article id="bookingPaymentTotal">
			<div class="span4">
				<div id="totalPriceBooking">
					<h3>
						TOTAL
						<c:out value="${basket.totalPrice}" />
						€
					</h3>
				</div>
				<div id="acomptePriceValue">
					<spring:message code="booking.account" text="unknow"/> 20%:
					<c:out value="${basket.totalAccount}" />
					€
				</div>
			</div>
		</article>


		<article id="bookingPaymentForm">
			<form action="payment.booking" method="post">

				<div class="span4">
					<h3><spring:message code="booking.paymentMethod" text="unknow"/></h3>
					<div id="cardType">
						<label for="cardType"><spring:message code="booking.cardType" text="unknow"/></label> <select
							name="cardType">
							<c:forEach items="${paymentMethods}" var="paymentMethod">
								<option value="${paymentMethod.id}">${paymentMethod.type}</option>
							</c:forEach>
						</select>
					</div>
				</div>

				<div class="span4">
					<h3><spring:message code="booking.paymentInfo" text="unknow"/></h3>
					<div id="cardNumber">
						<label for="cardNumber"><spring:message code="booking.cardNumber" text="unknow"/></label> <input type="text"
							name="cardNumber" />
					</div>
					<div id="cardExpirationDate">
						<div id="cardExpirationDate">
							<label for="cardExpirationDate"><spring:message code="booking.expirationDate" text="unknow"/></label> <input
								type="text" name="cardExpirationDate" class="datepicker" />
						</div>
					</div>
					<input type="submit" value="<spring:message code="booking.pay" text="unknow"/>" />
				</div>

			</form>
		</article>
	</div>

</section>

<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
	$(".datepicker").datepicker();
</script>