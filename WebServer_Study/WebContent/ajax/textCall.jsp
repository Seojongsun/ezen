<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 제목 </title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script src="../js/jquery.validate.min.js" type="text/javascript"></script>
<script src="../js/validity.js" type="text/javascript"></script>
<script type="text/javascript">

$(function( ) {
	//register . 아이디를 클릭하여 함수를 호출한다
	$('#register').click(function( ) {
	// 비동기 Ajax txt . 요청을 수행하여 파일을 인서트한다
	$.ajax({
	url : "../data/data.txt",
	type : "GET",
	//응답 바디 응답 , , XHR . 코드 헤더를 확인할 수 있으며 응답 바디인 결과를 확인한다
	success : function(result) {
	//결과를 id . 속성값에 전달한다
	$('#message').html(result);
	}
	});
	return false;
	});
	});

</script>

</head>
<body>

<div class="container p-3 my-3 border">
<button class="btn btn-info" id="register"> 데이터 가져오기 </button>
<div class="container p-3 my-3 border">
<div id="message"></div>
</div>
</div>

</body>
</html>