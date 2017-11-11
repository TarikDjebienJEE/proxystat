<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<%-- HTML5 --%>
<section id="sectionBookingAppartment">

	<ol id="bookingStatus" class="bookStatus" data-progtrckr-steps="5">
	    <li class="bookStatus-ip">Flat choice</li>
	    <li class="bookStatus-todo">Equipment</li>
	    <li class="bookStatus-todo">Pass</li>
	    <li class="bookStatus-todo">Summary</li>
	    <li class="bookStatus-todo">Payment</li>
	</ol>
	<hr>

	<div class="alert alert-info">
		Please your check in and check out dates
	</div>

	<div class="row">
	
		<div class="span3">
			<aside id="bookingAppartmentForm">
				<form action="search.booking" method="post">
					<div id="beginDate">
						<label for="beginDate">Start date</label> <input type="text" name="beginDate" id="dpd1" value="${beginDate}"/>
					</div>
					<div id="finalDate">
						<label for="finalDate">End date</label> <input type="text" name="finalDate" id="dpd2" value="${finalDate}" />
					</div>
					<div id="nbPersons">
						<label for="nbPersons">Number of persons</label> 
						<input type="number" name="nbPersons" class="required" value="${nbPersons}" />
					</div>		
					<div id="price">
						<label for="price">Prix</label> 
						<div id="priceValue"></div> 
						<input id="priceInput" type="text" name="price" readonly="readonly" />
					</div>					
								
					<input type="submit" value="Recherche" />
				</form>
			</aside>
		</div>
	
		<div class="span9">
			<article id="bookingAppartmentDataTable">
				<form action="chooseFlat.booking" method="post">
					<table class="dataTables">
						<thead>
							<tr>
								<th>Description</th>
								<th>Reviews</th>
								<th>Price (€)</th>
								<th>Booking</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${flatsAvailable}" var="flat">
								<tr>
									<td>#${flat.roomNumber} ${flat.flatType.service.description} - floor ${flat.floor} - ${flat.flatType.size} m²</td>
									<td><a href=showServiceRatings.rate?id=${flat.flatType.service.id} target="_blank"> comments <i class="icon-comment"></i></a></td>
									<td>
										<c:choose>
											<c:when  test="${flat.flatType.price.discountPrice > 0}">
												<span id="flatPrice${flat.id}" class="priceTag">
													<span class="price">${flat.flatType.price.price}</span> 
													<span class="discount"><i class="icon-tag"></i>${flat.flatType.price.discountPrice}</span>
												</span>
											</c:when>
											<c:otherwise>
												<span id="flatPrice${flat.id}" class="priceTag">
													<span>${flat.flatType.price.price}</span> 
												</span>
											</c:otherwise>
										</c:choose>
									</td>
									<td><input id="flatChoice${flat.id}" type="radio" name="flatChoice" value="${flat.id}" /></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<c:if test="${not empty flatsAvailable and fn:length(flatsAvailable) >= 1}">
						<div class="form-actions">
							<input type="submit" value="Reserver" />
						</div>
					</c:if>
				</form>
			</article>
		</div>

	</div>

	<div id="totalPriceBookingWrapper">
		<h4 id="totalPriceBooking">
			Prix total : <span id="totalPrice"><c:out value="${basket.totalPrice}"/> €</span>
		</h4>
	</div>

</section>

<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
	var nowTemp = new Date();
	var now = new Date(nowTemp.getFullYear(), nowTemp.getMonth(), nowTemp.getDate(), 0, 0, 0, 0);
	 
	var checkin = $('#dpd1').datepicker({
	  onRender: function(date) {
	    return date.valueOf() < now.valueOf() ? 'disabled' : '';
	  }
	}).on('changeDate', function(ev) {
	  if (ev.date.valueOf() > checkout.date.valueOf()) {
	    var newDate = new Date(ev.date)
	    newDate.setDate(newDate.getDate() + 1);
	    checkout.setValue(newDate);
	  }
	  checkin.hide();
	  $('#dpd2')[0].focus();
	}).data('datepicker');
	
	var checkout = $('#dpd2').datepicker({
	  onRender: function(date) {
	    return date.valueOf() <= checkin.date.valueOf() ? 'disabled' : '';
	  }
	}).on('changeDate', function(ev) {
	  checkout.hide();
	}).data('datepicker');
	
	
	$('.dataTables').dataTable({
		"bJQueryUI" : true
	});
	
	$("#priceValue").slider({
	    range: "min",
	    value: 1,
	    step: 1,
	    min: 0,
	    max: 1000,
	    slide: function(event, ui) {
	        $("#priceInput").val(ui.value);
	    }
	});	
	
	/**
	 * Refresh le prix de l'appartement en direct
	 * @author Tarik Eric
	 */
	$('input[id^="flatChoice"]').click(function(){
		var id = $(this).val();
		var elt = 'span[id="flatPrice'+id+'"]';
		var price = $(elt).html();
		$('#totalPrice').html(price);
	});
	
</script>