<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리터럴</title>
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<div class="container p-3 my-3 border">더블 쿼터 문자열 자료형 : ${"테스트"  }
	</div>
	<div class="container p-3 my-3 border">싱글 쿼터 문자열 자료형 : ${'테스트'  }
	</div>
	<div class="container p-3 my-3 border">정수 자료형 : ${20}</div>
	<div class="container p-3 my-3 border">부동소수점 자료형 : ${3.14}</div>
	<div class="container p-3 my-3 border">boolean 자료형 : ${  true}</div>
	<%--빈 문자열  ("")을 출력한다 .--%>
	
	<div class="container p-3 my-3 border">null 자료형 : ${  null}</div>
</body>
</html>