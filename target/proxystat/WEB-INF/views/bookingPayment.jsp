<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<%-- VARIABLES --%>
<%
	
%>

<%-- HTML5 --%>
<section id="sectionBookingPayment">

	<ol id="bookingStatus" class="bookStatus" data-progtrckr-steps="5">
	    <li class="bookStatus-done">Flat choice</li>
	    <li class="bookStatus-done">Equipment</li>
	    <li class="bookStatus-done">Pass</li>
	    <li class="bookStatus-done">Summary</li>
	    <li class="bookStatus-ip">Payment</li>
	</ol>
	<hr>

	<aside id="bookingPaymentInvoice">
		<div id="summary">
			<h4>Invoice</h4>
			
				<table class="table table-condensed">
					<thead>
						<tr>
							<th>Service</th>
							<th>Price</th>
							<th>Tax rate</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${basket.flat.flatType.service.name}</td>
							<td>
								<c:choose>
									<c:when  test="${basket.flat.flatType.price.discountPrice > 0}">
										<span class="priceTag">
											<span class="price">${basket.flat.flatType.price.price}</span> 
											<span class="discount"><i class="icon-tag"></i>${basket.flat.flatType.price.discountPrice}</span>
										</span>
									</c:when>
									<c:otherwise>
										<span class="priceTag">
											<span>${basket.flat.flatType.price.price}</span> 
										</span>
									</c:otherwise>
								</c:choose>								
							</td>
							<td>${basket.flat.flatType.price.taxRate}</td>
						</tr>
						<tr>
							<td>${basket.guestEquipment.equipment.service.name}</td>
							<td>
								<c:choose>
									<c:when  test="${basket.guestEquipment.equipment.price.discountPrice > 0}">
										<span class="priceTag">
											<span class="price">${basket.guestEquipment.equipment.price.price}</span> 
											<span class="discount"><i class="icon-tag"></i>${basket.guestEquipment.equipment.price.discountPrice}</span>
										</span>
									</c:when>
									<c:otherwise>
										<span class="priceTag">
											<span>${basket.guestEquipment.equipment.price.price}</span> 
										</span>
									</c:otherwise>
								</c:choose>	
							</td>
							<td>${basket.guestEquipment.equipment.price.taxRate}</td>
						</tr>
						<tr>
							<td>${basket.pass.service.name}</td>
							<td>
								${basket.pass.price.price}
								<c:choose>
									<c:when  test="${basket.pass.price.discountPrice > 0}">
										<span class="priceTag">
											<span class="price">${basket.pass.price.price}</span> 
											<span class="discount"><i class="icon-tag"></i>${basket.pass.price.discountPrice}</span>
										</span>
									</c:when>
									<c:otherwise>
										<span class="priceTag">
											<span>${basket.pass.price.price}</span> 
										</span>
									</c:otherwise>
								</c:choose>	
							</td>
							<td>${basket.pass.price.taxRate}</td>
						</tr>
					</tbody>
				</table> 
		</div>
	</aside>

	<div class="row">
		
		<article id="bookingPaymentTotal">
			<div class="span4">
				<div id="totalPriceBooking">
					<h3>TOTAL <c:out value="${basket.totalPrice}"/> €</h3>
				</div>
				<div id="acomptePriceValue">
					Acompte 20%: <c:out value="${basket.totalAccount}"/> €
				</div>
			</div>
		</article>
		
		
		<article id="bookingPaymentForm">
			<form action="payment.booking" method="post">
					
				<div class="span4">
					<h3>Payment method</h3>
					<div id="cardType">
						<label for="cardType">Type de carte</label> 
						<select name="cardType">
							<c:forEach items="${paymentMethods}" var="paymentMethod">
								<option value="${paymentMethod.id}">${paymentMethod.type}</option>
							</c:forEach>
						</select>
					</div>
				</div>
					
				<div class="span4">
					<h3>Payment info</h3>
					<div id="cardNumber">
						<label for="cardNumber">Numéro de carte</label> <input type="text" name="cardNumber" />
					</div>
					<div id="cardExpirationDate">
						<div id="cardExpirationDate">
							<label for="cardExpirationDate">Date d'expiration</label> 
							<input type="text" name="cardExpirationDate" class="datepicker" />
						</div>				
					</div>
					<input type="submit" value="Payer" />
				</div>
				
			</form>
		</article>
	</div>
		
</section>

<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
	$(".datepicker").datepicker();
</script>