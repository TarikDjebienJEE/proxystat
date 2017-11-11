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
	  
	  <a href="<%=request.getContextPath()%>/home.security?locale=en"><spring:message code="display.english" text="unknow"/></a>
	  <a href="<%=request.getContextPath()%>/home.security?locale=fr"><spring:message code="display.french" text="unknow"/></a>
	</footer>
</div>

<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		
		$('input[type=submit]').addClass('btn btn-primary');
		$('input[type=reset]').addClass('btn');
		
		$('p[id=messageOk]').addClass('alert alert-success');
		$('p[id=messageKo]').addClass('alert alert-error');
		$('p[id=messageKoFk]').addClass('alert alert-error');
		
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