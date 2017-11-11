<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- Import --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%-- Variables --%>

<%-- HTML5 --%>
<hr>
<div class="container">
	<footer class="muted credit">
	  <p id="copyright">© Copyright 2013</p>
	  
	  <a id="englishLanguage" href="<%=request.getContextPath()%>/home.security?locale=en">
	  	<img src="<%=request.getContextPath()%>/resources/img/en_flag.png" alt=""/>
	  	<spring:message code="display.english" text="unknow"/>
	  </a>
	  <a id="frenchLanguage" href="<%=request.getContextPath()%>/home.security?locale=fr">
	  	<img src="<%=request.getContextPath()%>/resources/img/fr_flag.png" alt=""/>
	  	<spring:message code="display.french" text="unknow"/>
	  </a>
	</footer>
</div>

<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		
		$('input[type=submit]').addClass('btn btn-primary');
		$('input[type=reset]').addClass('btn');
		
		$('p[id=messageOk]').addClass('alert alert-success');
		$('p[id=messageKo]').addClass('alert alert-error');
		$('p[id=messageKoFk]').addClass('alert alert-error');
		
		var urlFr = location.protocol + '//' + location.host + location.pathname +'?locale=fr';
		var urlEn = location.protocol + '//' + location.host + location.pathname +'?locale=en';
		$('#englishLanguage').attr('href', urlEn);
		$('#frenchLanguage').attr('href', urlFr);
	});
</script>

<script type="text/javascript">

  /*
   * google analytics 
   */
  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-39646298-1']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>

</body>
</html>