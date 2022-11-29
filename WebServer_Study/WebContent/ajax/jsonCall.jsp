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

$(function () {
	

$('#register').click(function() {
	$.ajax({
		url : "../data/data.json",
		type : "GET",
		success : function (result) {
			subject = result.school.subject;
			for (var i = 0; i < subject.length; i++) {
				title = subject[i].title;
				teacher = subject[i].teacher;
				div = $("<div><div>");
				p1 = $("<p></p>").html(title);
				p2 = $("<p></p>").html(teacher);
				div.append(p1).append(p2);
				$("#message").append(div);

				
			}
			
			
		}
		
		
	});
	
});
});

</script>

</head>
<body>
<div class="container p-3 my-3 border">
<button class="btn btn-info" id="register"> 데이터 가져오기 </button>
<div class="container p-3 my-3 border"> <div id="message"></div> </div>
</div>

</body>
</html>