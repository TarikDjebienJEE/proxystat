<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Map"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<%-- VARIABLES --%>
<%
	Integer numberOfBookingPredictionOfNextWeek = (Integer) request.getAttribute("numberOfBookingPredictionOfNextWeek");
	Integer amountOfBookingOrder = (Integer) request.getAttribute("amountOfBookingOrder");

	Map<Integer, String> weekData = (Map<Integer, String>) request.getAttribute("weekData");
	Map<Integer, Integer> countBookingData = (Map<Integer, Integer>) request.getAttribute("countBookingData");
	Map<Integer, Integer> turnOverData = (Map<Integer, Integer>) request.getAttribute("turnOverData");
	Map<Integer, Integer> marginData = (Map<Integer, Integer>) request.getAttribute("marginData");
	Map<Integer, Integer> occupancyRateData = (Map<Integer, Integer>) request.getAttribute("occupancyRateData");
	Map<Integer, Integer> flatTypeBookedData = (Map<Integer, Integer>) request.getAttribute("flatTypeBookedData");
	Map<Integer, Integer> equipmentTypeData = (Map<Integer, Integer>) request.getAttribute("equipmentTypeData");
	Map<Integer, Integer> passTypeData = (Map<Integer, Integer>) request.getAttribute("passTypeData");
	Map<Integer, Integer> ratingServiceData = (Map<Integer, Integer>) request.getAttribute("ratingServiceData");
	Map<Integer, Integer> numberOfCustomersData = (Map<Integer, Integer>) request.getAttribute("numberOfCustomersData");
	Map<Integer, Integer> guestAgeBreakDownData = (Map<Integer, Integer>) request.getAttribute("guestAgeBreakDownData");
	
%>

<%-- HEAD --%>
<jsp:include page="header.jsp" />

<%-- BODY --%>

<hr>
<div class="container">

	<%-- HTML5 --%>
	<section id="statisticsAdmin">


		<div class="hero-unit">
			<h2>Proxystat reporting</h2>
			<hr>
			<p>
				<spring:message code="reporting.numberBookingPredicted" text="unknow"/>
				<c:out value="<%=numberOfBookingPredictionOfNextWeek%>"></c:out>
				bookings
			</p>
			<p>
				<spring:message code="reporting.averageAmountBookingOrder" text="unknow"/>
				<c:out value="<%=amountOfBookingOrder%>"></c:out>
				€
			</p>
		</div>



		<!-- Statistiques pour le nombre de booking par semaine-->
		<div>
			<a href="#statisticsBookingGraphicsArticle" data-toggle="collapse">
				<h3>
					<spring:message code="reporting.numberOfBookings" text="unknow"/>
				</h3>
				<hr>
			</a>
		</div>
		<article id="statisticsBookingGraphicsArticle" class="collapse">
			<p id="statisticsBookingGraphics"></p>
		</article>



		<!-- Statistiques pour le chiffre d'affaire (prix total des bookings)-->
		<div>
			<a href="#statisticsTurnOverGraphicsArticle" data-toggle="collapse">
				<h3>
					<spring:message code="reporting.turnover" text="unknow"/>
				</h3>
				<hr>
			</a>
		</div>
		<article id="statisticsTurnOverGraphicsArticle" class="collapse">
			<p id="statisticsTurnOverGraphics"></p>
		</article>



		<!-- Statistiques pour le chiffre d'affaire (marge total des bookings)-->
		<div>
			<a href="#statisticsMarginGraphicsArticle" data-toggle="collapse">
				<h3>
					<spring:message code="reporting.margin" text="unknow"/>
				</h3>
				<hr>
			</a>
		</div>
		<article id="statisticsMarginGraphicsArticle" class="collapse">
			<p id="statisticsMarginGraphics"></p>
		</article>



		<!-- Statistiques pour le taux d'occupation d'un appartement-->
		<div>
			<a href="#statisticsRateOccupancyGraphicsArticle"
				data-toggle="collapse">
				<h3>
					<spring:message code="reporting.occupancy" text="unknow"/>
				</h3>
				<hr>
			</a>
		</div>
		<article id="statisticsRateOccupancyGraphicsArticle" class="collapse">
			<p id="statisticsRateOccupancyGraphics"></p>
		</article>




		<!-- Statistiques pour le type d'appartement reserve (pie chart)-->
		<div>
			<a href="#statisticsFlatTypeBookedGraphicsArticle"
				data-toggle="collapse">
				<h3>
					<spring:message code="reporting.flatType" text="unknow"/>
				</h3>
				<hr>
			</a>
		</div>
		<article id="statisticsFlatTypeBookedGraphicsArticle" class="collapse">
			<p id="statisticsFlatTypeBookedGraphics"></p>
		</article>




		<!-- Statistiques pour le type d'equipement les plus demandes(pie chart)-->
		<div>
			<a href="#statisticsEquipmentTypeGraphicsArticle"
				data-toggle="collapse">
				<h3>
					<spring:message code="reporting.equipmentType" text="unknow"/>
				</h3>
				<hr>
			</a>
		</div>
		<article id="statisticsEquipmentTypeGraphicsArticle" class="collapse">
			<p id="statisticsEquipmentTypeGraphics"></p>
		</article>





		<!-- Statistiques pour le type de forfait-->
		<div>
			<a href="#statisticsPassGraphicsArticle" data-toggle="collapse">
				<h3>
					<spring:message code="reporting.pass" text="unknow"/>
				</h3>
				<hr>
			</a>
		</div>
		<article id="statisticsPassGraphicsArticle" class="collapse">
			<p id="statisticsPassGraphics"></p>
		</article>




		<!-- Statistiques pour les notations de chaque service (bar chart)-->
		<div>
			<a href="#statisticRatingServiceGraphicsArticle"
				data-toggle="collapse">
				<h3>
					<spring:message code="reporting.ratingAverage" text="unknow"/>
				</h3>
				<hr>
			</a>
		</div>
		<article id="statisticRatingServiceGraphicsArticle" class="collapse">
			<p id="statisticRatingServiceGraphics"></p>
		</article>




		<!-- Statistiques pour le nombre de nouveaux client-->
		<div>
			<a href="#statisticNumberOfCustomersGraphicsArticle"
				data-toggle="collapse">
				<h3>
					<spring:message code="reporting.nbNewCustomer" text="unknow"/>
				</h3>
				<hr>
			</a>
		</div>
		<article id="statisticNumberOfCustomersGraphicsArticle"
			class="collapse">
			<p id="statisticNumberOfCustomersGraphics"></p>
		</article>



		<!-- Statistiques pour le repartition des clients par age (pie chart)-->
		<div>
			<a href="#statisticBreakDownGraphicsArticle" data-toggle="collapse">
				<h3>
					<spring:message code="reporting.breakDownAge" text="unknow"/>
				</h3>
			</a>
		</div>
		<article id="statisticBreakDownGraphicsArticle" class="collapse">
			<p id="statisticBreakDownGraphics"></p>
		</article>


	</section>

	<%-- FOOTER : pied de page --%>
	<jsp:include page="footer.jsp" />
</div>


<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
		  $(".collapse").collapse("hide");
		  
		  
		  $(document).ready(function(){
			  
			//*****************************************************************************//
			// ***** Consolidation statistiques pour le nombre de booking par semaine *****//
			//*****************************************************************************//
				//Consolidation des donnees
			    var xDataValue = [];
			
			
			    var yDataValueCountBooking = [[]];
				<c:forEach items='${weekData}' var='entry'>  
					var indexWeekValue = ${entry.key};
					var dateString = "${entry.value}";
					xDataValue.push( [indexWeekValue, dateString] );
				</c:forEach>  

				<c:forEach items='${countBookingData}' var='entry'>  
					var indexCountValue = ${entry.key} ; 
					var countValue = ${entry.value};				
					yDataValueCountBooking[0].push( [indexCountValue, countValue] );
				</c:forEach> 				
				
				//Construction de la courbe
			    var options = {
				    axes : {
				    	xaxis : {ticks: xDataValue}
				    }
				}
			    courbe = $.jqplot('statisticsBookingGraphics', yDataValueCountBooking, options);	
				
				
				
				//*******************************************************************************************//
				// ***** Consolidation statistiques pour le chiffre d'affaire (prix total des bookings) *****//
				//*******************************************************************************************//
					//Consolidation des donnees
				    var yDataValueTurnOverData = [[]];
				    
					<c:forEach items='${turnOverData}' var='entry'>  
						var indexTurnOverData = ${entry.key} ; 
						var turnOverData = ${entry.value};				
						yDataValueTurnOverData[0].push( [indexTurnOverData, turnOverData] );
					</c:forEach> 				
					
					//Construction de la courbe
				    var options = {
					    axes : {
					    	xaxis : {ticks: xDataValue}
					    }
					}
				    courbe = $.jqplot('statisticsTurnOverGraphics', yDataValueTurnOverData, options);					
				
					
					
					//********************************************************************************//
					// ***** Consolidation statistiques pour la marge (marge total des bookings) *****//
					//********************************************************************************//
						//Consolidation des donnees
					    var yDataValueMarginData = [[]];
					    
						<c:forEach items='${marginData}' var='entry'>  
							var indexMarginData = ${entry.key} ; 
							var marginData = ${entry.value};				
							yDataValueMarginData[0].push( [indexMarginData, marginData] );
						</c:forEach> 				
						
						//Construction de la courbe
					    var options = {
						    axes : {
						    	xaxis : {ticks: xDataValue}
						    }
						}
					    courbe = $.jqplot('statisticsMarginGraphics', yDataValueMarginData, options);						
				
						
						
						//********************************************************************************//
						// ***** Consolidation statistiques pour le taux d'occupation d'appartement  *****//
						//********************************************************************************//
							//Consolidation des donnees
						    var yDataOccupancyRateData = [[]];
						    
							<c:forEach items='${occupancyRateData}' var='entry'>  
								var indexOccupancyRateData = ${entry.key} ; 
								var occupancyRateData = ${entry.value};				
								yDataOccupancyRateData[0].push( [indexOccupancyRateData, occupancyRateData] );
							</c:forEach> 				
							
							//Construction de la courbe
						    var options = {
							    axes : {
							    	xaxis : {ticks: xDataValue}
							    }
							}
						    courbe = $.jqplot('statisticsRateOccupancyGraphics', yDataOccupancyRateData, options);				
							
							
							
							
							
							//********************************************************************************//
							// ***** Consolidation statistiques pour les type d'appartements (pie chart) *****//
							//********************************************************************************//	
							//Consolidation des donnees
						    var dataFlatTypeBooked = [[]];
							<c:forEach items='${flatTypeBookedData}' var='entry'>  
								var flatTypeName = "${entry.key}"; 
								var flatTypeNumberInBooking = ${entry.value};				
								dataFlatTypeBooked[0].push( [flatTypeName, flatTypeNumberInBooking] );
							</c:forEach> 	
							
							//Construction de la courbe
							var options = { 
								seriesDefaults: {
									renderer: jQuery.jqplot.PieRenderer, 
									rendererOptions: {
										showDataLabels: true
									}
								}, 
								legend: { show:true, location: 'e' }
							}									
							var plot = jQuery.jqplot ('statisticsFlatTypeBookedGraphics', dataFlatTypeBooked, options);		
												
						
							
							
							//********************************************************************************//
							// ***** Consolidation statistiques pour les type d'equipements  (pie chart) *****//
							//********************************************************************************//	
							//Consolidation des donnees
						    var dataFlatTypeBooked = [[]];
							<c:forEach items='${equipmentTypeData}' var='entry'>  
								var equipmentTypeName = "${entry.key}"; 
								var equipmentTypeInBooking = ${entry.value};				
								dataFlatTypeBooked[0].push( [equipmentTypeName, equipmentTypeInBooking] );
							</c:forEach> 	
							
							//Construction de la courbe
							var options = { 
								seriesDefaults: {
									renderer: jQuery.jqplot.PieRenderer, 
									rendererOptions: {
										showDataLabels: true
									}
								}, 
								legend: { show:true, location: 'e' }
							}									
							var plot = jQuery.jqplot ('statisticsEquipmentTypeGraphics', dataFlatTypeBooked, options);									
    
			
							
							
														
							//********************************************************************************//
							// ***** Consolidation statistiques pour les types de forfaits   (pie chart) *****//
							//********************************************************************************//	
							//Consolidation des donnees
							var dataPass = [[]];
							<c:forEach items='${passTypeData}' var='entry'>  
								var passTypeName = "${entry.key}"; 
								var passTypeInBooking = ${entry.value};				
								dataPass[0].push( [passTypeName, passTypeInBooking] );
							</c:forEach> 	
							
							//Construction de la courbe
							var options = { 
								seriesDefaults: {
									renderer: jQuery.jqplot.PieRenderer, 
									rendererOptions: {
										showDataLabels: true
									}
								}, 
								legend: { show:true, location: 'e' }
							}									
							var plot = jQuery.jqplot ('statisticsPassGraphics', dataPass, options);									
    
							
							

							//********************************************************************************//
							// ** Consolidation statistiques pour les notes moyens par service (bar chart) ***//
							//********************************************************************************//								
							
							//Consolidation des donnees
							var ratingServiceData = [];
							
							var index = 1 ; 
							<c:forEach items='${ratingServiceData}' var='entry'>  
								var serviceName = "${entry.key}" ; 
								var avgRatingValue = ${entry.value};	
								ratingServiceData.push( [serviceName , avgRatingValue] );
								index = index + 1  ;
							</c:forEach> 				
							
							//Construction de la courbe
							var options = {
								    seriesDefaults:{
								        renderer:$.jqplot.BarRenderer,
								    },
								    axes:{
								        xaxis:{
								            renderer: $.jqplot.CategoryAxisRenderer
								        }
								    }
							}
							$('#statisticRatingServiceGraphics').jqplot([ratingServiceData],options );
					     
							
							
							
							
							
							
							
							//*****************************************************************************//
							// *****  Consolidation statistiques pour le nombre de nouveaux clients   *****//
							//*****************************************************************************//							
						    var yDataValueNumberOfCustomers = [[]];
							<c:forEach items='${numberOfCustomersData}' var='entry'>  
								var indexCountValue = ${entry.key};
								var countValue = ${entry.value};			
								yDataValueNumberOfCustomers[0].push( [indexCountValue, countValue] );
							</c:forEach> 				
							
							//Construction de la courbe
						    var options = {
							    axes : {
							    	xaxis : {ticks: xDataValue}
							    }
							}
						    courbe = $.jqplot('statisticNumberOfCustomersGraphics', yDataValueNumberOfCustomers, options);								

				
							
							
							
							
							
							//********************************************************************************//
							// ***** Consolidation statistiques pour les categories d'ages des guests    *****//
							//********************************************************************************//	
							//Consolidation des donnees
						    var dataGuestAgeBooked = [[]];
							<c:forEach items='${guestAgeBreakDownData}' var='entry'>  
								var guestAgeName = "${entry.key}"; 
								var guestAgeRepartitionValue = ${entry.value};				
								dataGuestAgeBooked[0].push( [guestAgeName, guestAgeRepartitionValue] );
							</c:forEach> 	
							
							//Construction de la courbe
							var options = { 
								seriesDefaults: {
									renderer: jQuery.jqplot.PieRenderer, 
									rendererOptions: {
										showDataLabels: true
									}
								}, 
								legend: { show:true, location: 'e' }
							}									
							var plot = jQuery.jqplot ('statisticBreakDownGraphics', dataGuestAgeBooked, options);									
							
							
							
		  })
	</script>