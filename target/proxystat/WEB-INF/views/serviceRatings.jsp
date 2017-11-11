<?xml version="1.0" encoding="UTF-8" ?>

<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<%-- HEAD --%>
<jsp:include page="header.jsp" />

<%-- VARIABLES --%>

<%-- HTML5 --%>
<hr>
<div class="container">
	
			<h3>Service ${service.name}</h3>
			<h3>Our customers feedback</h3>
			
				<h4>Feedbacks</h4>
				
				<c:if test="${empty ratings and fn:length(ratings) == 0}">
					<p id="messageKo">No ratings available for this service</p>
				</c:if>
					
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
				
</div>

<jsp:include page="footer.jsp" />