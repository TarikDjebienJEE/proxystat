<?xml version="1.0" encoding="UTF-8" ?>

<%-- IMPORT --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id="myRating" >
	<form action="postRating.rate" method="post">
		
		<textarea id="comments" name="comments" onkeyup="enableOrDisable()" placeholder="Your comment ..." class="span8" ></textarea>
				
		<div>
			<input name="notation" type="radio" class="star" value="1"/>
			<input name="notation" type="radio" class="star" value="2"/>
			<input name="notation" type="radio" class="star" checked="checked" value="3"/>
			<input name="notation" type="radio" class="star" value="4"/>
			<input name="notation" type="radio" class="star" value="5"/>		
		</div>
				
		<div>
			<input id="submitButtonRating" type="submit" value="Post" disabled="disabled" />
		</div>
			
	</form>
</div>

<%-- Javascript --%>
<script type="text/javascript" charset="utf-8">
	
	function enableOrDisable() {
		var textComments = $('#comments').val();
		if (textComments == '') {
			$('#submitButtonRating').prop('disabled', true);
		} else {
			$('#submitButtonRating').prop('disabled', false);
		}
	}
</script>