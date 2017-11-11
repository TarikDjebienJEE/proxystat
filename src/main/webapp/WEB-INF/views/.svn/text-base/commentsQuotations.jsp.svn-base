<?xml version="1.0" encoding="UTF-8" ?>

<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<%-- HEAD --%>
<jsp:include page="header.jsp" />

<%-- VARIABLES --%>
<%
	String stringValueAreAllShown = (String) request.getAttribute("areAllShown") ; 
	Boolean areAllShown = Boolean.valueOf(stringValueAreAllShown);
%>

<%-- HTML5 --%>
<hr>
<div class="container">
	<section id="sectionCommentsQuotation">
	
		<article id="commentsQuotationDataTable">
	
			<h3><spring:message code="comm.quot" text=""/></h3>
			
				<h4><spring:message code="comm.quot.fedd" text=""/></h4>
					
				<c:forEach items="${ratings}" var="rating">
					<div class="row">
							<blockquote>
								<p>
									<strong>#${rating.customer.surname}:</strong>
									${rating.comment}
								</p>
								<small>
									on ${rating.date}  
									<c:set var="notation" value="${rating.notation}"/>
									<%
									  String stringValueNotation = (String) pageContext.getAttribute("notation").toString();
									  Integer notation =  Integer.valueOf(stringValueNotation);
									%>
									<%for (int i=0 ; i < notation  ;  i++) { %>
										<i class=" icon-star" ></i>
									<%}%>
								</small>
							</blockquote>
					</div>
				</c:forEach>
				
				<hr>
				
				<div class="row">	
					
						<div class="span3">		
						<% if (areAllShown){ %>
						<form action="showFirstsRatings.rate" method="get" >
							<input id="hideOthers" type="submit" value="<spring:message code="comm.quot.show" text=""/>" />
						</form>
						<hr>
						<%}else{%>
							<form action="showAllRatings.rate" method="get">
								<input id="showFirstsComments" type="submit" value="<spring:message code="comm.quot.all" text=""/>" />
							</form>
						<%}%>
						</div>
					
					<div class="span7">
						<h4><spring:message code="comm.leave" text=""/></h4>
						<jsp:include page="commentsInput.jsp" />		
					</div>
					
				</div>
			
			<hr>
			
		</article>
	
	</section>
</div>

<jsp:include page="footer.jsp" />