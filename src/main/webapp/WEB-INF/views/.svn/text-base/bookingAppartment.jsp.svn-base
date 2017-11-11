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
	    <li class="bookStatus-ip"><spring:message code="booking.flatChoice" text="unknow"/></li>
	    <li class="bookStatus-todo"><spring:message code="booking.equipment" text="unknow"/></li>
	    <li class="bookStatus-todo"><spring:message code="booking.pass" text="unknow"/></li>
	    <li class="bookStatus-todo"><spring:message code="booking.summary" text="unknow"/></li>
	    <li class="bookStatus-todo"><spring:message code="booking.payment" text="unknow"/></li>
	</ol>
	<hr>

	<div class="alert alert-info">
		<spring:message code="booking.checkDate" text="unknow"/>
	</div>

	<div class="row">
	
		<div class="span3">
			<aside id="bookingAppartmentForm">
				<form action="search.booking" method="post">
					<div id="beginDate">
						<label for="beginDate">
						<spring:message code="booking.startDate" text="unknow"/>
						</label> 
						<input type="text" name="beginDate" id="dpd1" value="${beginDate}"/>
					</div>
					<div id="finalDate">
						<label for="finalDate">
						<spring:message code="booking.endDate" text="unknow"/>
						</label> <input type="text" name="finalDate" id="dpd2" value="${finalDate}" />
					</div>
					<div id="nbPersons">
						<label for="nbPersons">
						<spring:message code="booking.numberOfPerson" text="unknow"/>
						</label> 
						<input type="number" name="nbPersons" class="required" value="${nbPersons}" />
					</div>		
					<div id="price">
						<label for="price">
						<spring:message code="booking.price" text="unknow"/>
						</label> 
						<div id="priceValue"></div> 
						<input id="priceInput" type="number" name="price"/>
					</div>					
								
					<input type="submit" value="<spring:message code="booking.search" text="unknow"/>" />
				</form>
			</aside>
		</div>
	
		<div class="span9">
			<article id="bookingAppartmentDataTable">
				<form action="chooseFlat.booking" method="post">
					<table class="dataTables">
						<thead>
							<tr>
								<th><spring:message code="booking.description" text="unknow"/></th>
								<th><spring:message code="booking.reviews" text="unknow"/></th>
								<th><spring:message code="booking.price" text="unknow"/></th>
								<th><spring:message code="booking.booking" text="unknow"/></th>
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
							<input type="submit" value="<spring:message code="booking.book" text="unknow"/>" />
						</div>
					</c:if>
				</form>
			</article>
		</div>

	</div>

	<div id="totalPriceBookingWrapper">
		<h4 id="totalPriceBooking">
			<spring:message code="booking.totalPrice" text="unknow"/> <span id="totalPrice"><c:out value="${basket.totalPrice}"/> €</span>
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