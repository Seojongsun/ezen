<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바 스크립트 Ajax 구현</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script type="text/javascript">
	window.onload = function () {
		
		//생성자 함수로 XHLHttpRequest 객체를 생성하고 할당요
		var xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function () {
			if (xhr.readyState == 4 ) {
				if (xhr.status >= 100 && xhr.status < 600) {
					document.getElementById('call').innerHTML = xhr.responseText;
					
					
				}
				
			}
		}
		xhr.open('GET', './resource.jsp');
		xhr.send();
	}





</script>





</head>
<body>

	<div id="call"></div>

</body>
</html>