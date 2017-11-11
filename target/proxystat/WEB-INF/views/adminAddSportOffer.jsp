<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%-- VARIABLES --%>
<%
	
%>

<%-- HEAD --%>
<jsp:include page="header.jsp" />

<%-- BODY --%>
	
	<hr>
	<div class="container">

		<%-- HTML5 --%>
		<section id="sectionCreateEquipment">

			<h1>Equipment creation</h1>

			<form method="post" action="createNewOffer.adminSportPartner" class="form-horizontal">
				<fieldset>
					<div class="control-group">
						<label for="name">Name</label>
						<div>
							<input id="name" name="name" type="text" value="proxystat" />
							* required field
						</div>
					</div>
					<div class="control-group">
						<label for="desc">Description</label>
						<div>
							<input id="desc" name="desc" type="text" value="${desc}" />
							* required field
						</div>
					</div>
					<div class="control-group">
						<label for="minHeight">Minimum height</label>
						<div>
							<input id="minHeight" name="minHeight" type="text" value="${minHeight}" />
						</div>
					</div>
					<div class="control-group">
						<label for="quality">Quality</label>
						<div>
							<input id="quality" name="quality" type="text" value="${quality}" />
						</div>
					</div>
					<div class="control-group">
						<label for="size">Size</label>
						<div>
							<input id="size" name="size" type="text" value="${size}" />
						</div>
					</div>
					<div class="control-group">
						<label for="stock">Stock quantity</label>
						<div>
							<input id="stock" name="stock" type="text" value="${stock}" />
						</div>
					</div>
					<div class="control-group">
						<label for="category">Category</label>
						<div>
							<select name="category">
								<c:forEach items="${categories}" var="categoryIterator">
									<option value="${categoryIterator.id}">${categoryIterator}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="control-group">
						<label for="ageCategory">Age category</label>
						<div>
							<select name="ageCategory">
								<c:forEach items="${ageCategories}" var="ageCategoryIterator">
									<option value="${ageCategoryIterator.id}">${ageCategoryIterator}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="control-group">
						<label for="period">Period</label>
						<div>
							<select name="period">
								<c:forEach items="${periods}" var="periodIterator">
									<option value="${periodIterator.id}">${periodIterator}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="control-group">
						<label for="price">Price</label>
						<div>
							<select name="price">
								<c:forEach items="${prices}" var="priceIterator">
									<option value="${priceIterator.id}">${priceIterator}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-actions">
						<input id="createEquipment" value="Save" type="submit" />
						<input value="Reset" type="reset" />
					</div>
				</fieldset>
			</form>

			<c:if test="${messageKo != null}">
				<p id="messageKo">Missing required information</p>
			</c:if>

		</section>

	</div>
	
	<%-- FOOTER : pied de page --%>
	<jsp:include page="footer.jsp" />
	
<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		
		$('.control-group > label').addClass('control-label');
		$('.control-group > div').addClass('controls');
		
	});
</script>	