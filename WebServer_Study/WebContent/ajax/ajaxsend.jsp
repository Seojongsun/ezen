<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script scr="../js/jquery-3.5.1.min.js" type="text/javascript"></script>


</head>
<body>
<script type="text/javascript">

$(function name() {
	$('#reg').click(function() {
		var id = $("input[name='id']").val();
		
		$.ajax({
		url:"./ajaxtest.jsp",
		type: GET,
		data: {
			"id" : id
		},
		success : function (data) {
			
		}
			
			
			
		});
		
		
		
		
		
	});
	
});





</script>

<form>
아이디 <input type="text" name="id">
패스워드 : <input type="password" name="password">
<input type="submit" id="reg">
<input type="reset" id="se">

</form>

</body>
</html>