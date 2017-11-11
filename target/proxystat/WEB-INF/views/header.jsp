<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%-- Import --%>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c"       uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"     uri="http://www.springframework.org/security/tags"%>

<jsp:include page="head.jsp" />

<%-- HTML5 --%>
<div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
        
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
          </button>
        
          <a class="brand" href="#">ProxyStation</a>
        
          <div class="nav-collapse collapse">
           
            <ul class="nav">
           	
              <li class="active"><a href="."><i class="icon-home icon-white"></i> Home</a></li>
              
              <sec:authorize access="hasRole('ROLE_USER')">
              	<li><a href="loginValid.security"><i class="icon-shopping-cart icon-white"></i> Book</a></li>
              </sec:authorize>
              
              <sec:authorize access="isAnonymous()">
              	<li><a id="createAccount_button" href="creation.customer"><i class="icon-user icon-white"></i> Sign up</a></li>
              </sec:authorize>
             
             <li><a id="linkContact" href="returnViewContact.contact" ><i class="icon-envelope icon-white"></i> Contact</a></li>
              
              <sec:authorize access="hasRole('ROLE_USER')">
              	<li class="dropdown">
	              <a id="customerLink" href="#" class="dropdown-toggle" data-toggle="dropdown">
	              	<i class="icon-user icon-white"></i> Account <b class="caret"></b>
	              </a>
	              <ul class="dropdown-menu">
	                <li class="divider"></li>
	                <li><a id="linkCustomer" href="#"><i class="icon-user"></i> Personal information</a></li>
	                <li><a id="linkCustomer" href="history.customer"><i class="icon-list"></i> Booking history</a></li>
	              </ul>
	            </li>
              </sec:authorize>
              
              <sec:authorize access="hasRole('ROLE_ADMIN')">
	              <li class="dropdown">
	                <a id="adminLink" href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-lock icon-white"></i> Administration <b class="caret"></b></a>
	                <ul class="dropdown-menu">
	                  <li><a href="home.admin"><i class="icon-home"></i> Homepage</a></li>
	                  <li class="divider"></li>
	                  <li class="nav-header">Offer</li>
	                  <li><a id="linkAdmin" href="season.admin"><i class="icon-adjust"></i> Season</a></li>
	                  <li><a id="linkAdmin" href="period.admin"><i class="icon-calendar"></i> Period</a></li>
	                  <li><a id="linkAdmin" href="price.admin"><i class="icon-barcode"></i> Price</a></li>
	                  <li><a id="linkAdmin" href="flatType.admin"><i class="icon-th-large"></i> Flat type</a></li>
	                  <li><a id="linkAdmin" href="flat.admin"><i class="icon-th"></i> Flat</a></li>
	                  <li><a id="linkAdmin" href="option.admin"><i class="icon-tags"></i> Option</a></li>
	                  <li class="divider"></li>
	                  <li class="nav-header">Partners</li>
	                  <li><a id="linkAdmin" href="partner.admin"><i class="icon-briefcase"></i> Companies</a></li>
	                  <li><a id="linkAdmin" href="user.admin"><i class="icon-user"></i> Users</a></li>
	                  <li class="divider"></li>
	                  <li class="nav-header">Comments</li>
	                  <li><a id="linkAdmin" href="adminRatings.rate"><i class="icon-comment"></i> Comments</a></li>
	                  <li class="divider"></li>
	                  <li class="nav-header">Reporting</li>
	                  <li><a id="linkAdmin" href="adminStatistics.reporting"><i class="icon-signal"></i> Reporting</a></li>
	                  <li class="nav-header">Customers research</li>
	                   <li><a id="linkAdmin" href="research.customer"><i class="icon-user"></i> Research customers</a></li>
	                </ul>
	              </li>
              </sec:authorize>
              <sec:authorize access="hasRole('ROLE_PARTNER_SPORT')">
	              <li class="dropdown">
	                <a id="adminLink"href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-lock icon-white"></i> Administration <b class="caret"></b></a>
	                <ul class="dropdown-menu">
	                  <li class="divider"></li>
	                  <li class="nav-header">Sport partner</li>
	                  <li><a id="linkAdminSportPartner" href="home.adminSportPartner"><i class="icon-home"></i> Homepage</a></li>
	                  <li><a id="linkAdminSportPartner" href="category.adminSportPartner"><i class="icon-th-large"></i> Categories</a></li>
	                  <li><a id="linkAdminSportPartner" href="offer.adminSportPartner"><i class="icon-tags"></i> Offer</a></li>
	                  <li><a id="linkAdminSportPartner" href="listing.adminSportPartner"><i class="icon-list"></i> Listing</a></li>
	                  <li><a id="linkAdminSportPartner" href="returnList.adminSportPartner"><i class="icon-arrow-right"></i> Return</a></li>
	                </ul>
	              </li>
              </sec:authorize>
              <sec:authorize access="hasRole('ROLE_PARTNER_PASS')">
	              <li class="dropdown">
	                <a id="adminLinkMechanic" href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-lock icon-white"></i> Administration <b class="caret"></b></a>
	                <ul class="dropdown-menu">
	                  <li class="divider"></li>
	                  <li class="nav-header">Mechanic partner</li>
	                  <li><a id="linkAdminMechanicPartner" href="home.adminMechanicPartner"><i class="icon-home"></i> Homepage</a></li>
	                  <li><a id="linkAdminMechanicPartner" href="track.adminMechanicPartner"><i class="icon-th-large"></i> Track</a></li>
	                  <li><a id="linkAdminMechanicPartner" href="pass.adminMechanicPartner"><i class="icon-tags"></i> Pass</a></li>
	                  <li><a id="linkAdminMechanicPartner" href="listing.adminMechanicPartner"><i class="icon-list"></i> Listing</a></li>
	                </ul>
	              </li>
              </sec:authorize>
              
              <li><a id="linkRating" href="showFirstsRatings.rate" ><i class="icon-comment icon-white"></i> Feedback</a></li>
              
              <c:if test="${not empty username}">
				<li>
					<form action="j_spring_security_logout" method="post" class="navbar-form" >
						<input id="logout" value="Log out" type="submit"/>
					</form>
				</li>
				<li id="loginValidMessage">
					<spring:message code="display.welcome" text="unknow" /><c:out value="${username}" />
				</li>
			  </c:if>
			  <c:if test="${not empty errorLogin}">
				<li id="loginInvalidMessage">
					<c:out value="${errorLogin}" />
				</li>
			  </c:if>
              
            </ul>
            
           <sec:authorize access="hasRole('ROLE_ANONYMOUS')">
				<form action="j_spring_security_check" method="post" class="navbar-form" >
					<input id="j_username" class="span2" name="j_username" size="20"
						maxlength="50" type="text" placeholder="Login" /> 
					<input id="j_password" class="span2" name="j_password" size="20" 
						maxlength="50" type="password" placeholder="Password" /> 
					<input id="login_button" value="Sign in" type="submit" class="btn btn-primary">
				</form>
			</sec:authorize>
            
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>
    
<body>