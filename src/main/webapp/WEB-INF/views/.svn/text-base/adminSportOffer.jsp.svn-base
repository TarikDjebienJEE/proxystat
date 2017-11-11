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
		<section id="sectionAdministrationEquipment">
			<h1><spring:message code="adm.sport.offer.title" text=""/></h1>
			<nav id="listEquipment" />

			<article id="equipmentDataTable">

				<c:if test="${empty equipments and fn:length(equipments) == 0}">
					<p id="messageKo"><spring:message code="adm.sport.offer.null" text=""/></p>
				</c:if>

				<div class="bigTable">
				<table id="dataTables" class="display">
					<thead>
						<tr>
							<th><spring:message code="adm.sport.offer.name" text=""/></th>
							<th><spring:message code="adm.sport.offer.desc" text=""/></th>
							<th><spring:message code="adm.sport.offer.min" text=""/></th>
							<th><spring:message code="adm.sport.offer.qual" text=""/></th>
							<th><spring:message code="adm.sport.offer.size" text=""/></th>
							<th><spring:message code="adm.sport.offer.stock" text=""/></th>

							<th><spring:message code="adm.sport.offer.categ" text=""/></th>

							<th><spring:message code="adm.sport.offer.age" text=""/></th>

							<th><spring:message code="adm.sport.offer.period" text=""/></th>

							<th><spring:message code="adm.sport.offer.price" text=""/></th>

							<th><spring:message code="adm.modif" text=""/></th>
							<th><spring:message code="adm.del" text=""/></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${equipments}" var="equipment">
							<tr>

								<form method="POST" action="updateOffer.adminSportPartner">
									<td><input id="name" name="name" size="25"
										value="${equipment.service.name}"></td>
									<td><input id="desc" name="desc" size="50"
										value="${equipment.service.description}" maxlength="200"></td>
									<td><input id="minHeight" name="minHeight" size="4"
										value="${equipment.minimumHeight}"></td>
									<td><input id="quality" name="quality" size="8"
										value="${equipment.quality}"></td>
									<td><input id="size" name="size" size="4" value="${equipment.size}"></td>
									<td><input id="stock" name="stock" size="4"
										value="${equipment.stockQuantity}"></td>

									<td><select name="category">
											<option value="${equipment.category.id}">${equipment.category}</Option>
											<c:forEach items="${categories}" var="categoryIterator">
												<option value="${categoryIterator.id}">${categoryIterator}</option>
											</c:forEach>
									</select></td>

									<td><select name="ageCategory">
											<option value="${equipment.ageCategory.id}">${equipment.ageCategory}</Option>
											<c:forEach items="${ageCategories}" var="ageCategoryIterator">
												<option value="${ageCategoryIterator.id}">${ageCategoryIterator}</option>
											</c:forEach>
									</select></td>

									<td><select name="period">
											<option value="${equipment.period.id}">${equipment.period}</Option>
											<c:forEach items="${periods}" var="periodIterator">
												<option value="${periodIterator.id}">${periodIterator}</option>
											</c:forEach>
									</select></td>

									<td><select name="price">
											<option value="${equipment.price.id}">${equipment.price}</option>
											<c:forEach items="${prices}" var="priceIterator">
												<option value="${priceIterator.id}">${priceIterator}</option>
											</c:forEach>
									</select></td>

									<td><input type="hidden" name="id" id="id"
										value="${equipment.id}" /> <input type="submit"
										name="offerUpdate" id="offerUpdate" value="<spring:message code="adm.modif" text=""/>" /></td>
								</form>

								<form method="POST" action="deleteOffer.adminSportPartner">
									<td><input type="hidden" name="serviceId" id="serviceId"
										value="${equipment.service.id}" /> <input type="hidden"
										name="id" id="id" value="${equipment.id}" /> <input
										type="submit" name="offerDelete" id="offerDelete"
										value="<spring:message code="adm.del" text=""/>" /></td>
								</form>

							</tr>

						</c:forEach>
					</tbody>
				</table>
				</div>

				<br><br>
				<form action="createOffer.adminSportPartner" method="post">
					<input type="submit" id="createEquipment" name="createEquipment"
						value="<spring:message code="adm.create" text=""/>" />
				</form>
				<a href="javascript:void(0);" onclick="fnShowHide();" class="btn"><spring:message code="adm.show" text=""/><br></a>

			</article>

			<c:if test="${messageOk != null}">
				<p id="messageOk"><spring:message code="adm.sport.offer.upd" text=""/></p>
			</c:if>
			<c:if test="${messageKo != null}">
				<p id="messageKo"><spring:message code="adm.sport.offer.miss" text=""/></p>
			</c:if>
			<c:if test="${messageKoFk != null}">
				<p id="messageKo"><spring:message code="adm.sport.offer.del" text=""/></p>
			</c:if>

		</section>

	</div>

	<%-- FOOTER : pied de page --%>
	<jsp:include page="footer.jsp" />
	

	<%-- Javascript --%>
	<script type="text/javascript" charset="utf-8">
		$(document).ready(function() {
			$('#dataTables').dataTable();
			
			$('.bigTable').css('overflow', 'auto');
		});
		
		function fnShowHide()
		{
			/* Get the DataTables object again - this is not a recreation, just a get of the object */
			var oTable = $('#dataTables').dataTable();
			
			/* Hide long columns */
			for (var iCol=2; iCol<10; iCol++) {
				var bVis = oTable.fnSettings().aoColumns[iCol].bVisible;
				oTable.fnSetColumnVis( iCol, bVis ? false : true );
			}
			
		}

	</script>