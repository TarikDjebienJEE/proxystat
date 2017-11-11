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
	    <li class="bookStatus-done">Flat choice</li>
	    <li class="bookStatus-done">Equipment</li>
	    <li class="bookStatus-done">Pass</li>
	    <li class="bookStatus-ip">Summary</li>
	    <li class="bookStatus-todo">Payment</li>
	</ol>
	<hr>
	
	<article id="summaryAllBooking">

		<div id="summary">
			<h4>Summary</h4>
			
			<div class="row">
			
				<div class="span7">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Service</th>
							<th>Price</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${basket.flat.flatType.service.name}</td>
							<td>${basket.flat.flatType.price.price} €</td>
						</tr>
						<tr>
							<td>${basket.guestEquipment.equipment.service.name}</td>
							<td>${basket.guestEquipment.equipment.price.price} €</td>
						</tr>
						<tr>
							<td>${basket.pass.service.name}</td>
							<td>${basket.pass.price.price}</td>
						</tr>
					</tbody>
				</table> 
				</div>
		
				<div class="span5">
					<div id="totalPriceBooking">
						<h4>TOTAL <c:out value="${basket.totalPrice}"/> €</h4>
					</div>
					<div id="acomptePriceValue">
						<h5>Acompte 20%: <c:out value="${basket.totalAccount}"/> €</h5>
					</div>
				</div>
		
			</div>
		</div>
	</article>
	
	<hr>
	<article id="summaryConfirmation">
		<form action="chooseOptions.booking" method="post">
			<fieldset id="optionsSelection">
				<h4>Please select your options</h4>
				
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Option</th>
							<th>Description</th>
							<th>% price</th>
							<th>Fix price</th>
							<th>Per guest</th>
							<th>Reviews</th>
							<th>Choose</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${options}" var="option">
								<tr>
									<td>${option.service.name}</td>
									<td>${option.service.description}</td>
									<td>${option.pricePercentage}</td>
									<td>
										
										<c:choose>
											<c:when  test="${option.price.discountPrice > 0}">
												<span class="priceTag">
													<span class="price">${option.price.price}</span> 
													<span class="discount"><i class="icon-tag"></i>${option.price.discountPrice}</span>
												</span>
											</c:when>
											<c:otherwise>
												<span class="priceTag">
													<span>${option.price.price}</span> 
												</span>
											</c:otherwise>
										</c:choose>	
										
									</td>
									<td>${option.perPerson}</td>
									<td><a href=showServiceRatings.rate?id=${option.service.id} target="_blank"> comments <i class="icon-comment"></i></a></td>
									<td>
										<input id="${option.service.name}" type="checkbox" name="optionsSelected" value="${option.id}" />
									</td>
								</tr>
						</c:forEach>
					</tbody>
				</table>
			</fieldset>
			<div class="form-actions">
				<input type="submit" value="Confirmer la réservation"/>
			</div>
		</form>
	</article>
	
</section>

<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
</script>