<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>산술 연산</title>
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<%--￦를 첨부하면 해당 문자가 그대로 화면에 출력된다.--%>
	<div class="container p-3 my-3 border">\${5+7} = ${5+7}</div>
	<div class="container p-3 my-3 border">\${8-3} = ${8-3}</div>
	<div class="container p-3 my-3 border">\${6*3} = ${6*3}</div>
	<div class="container p-3 my-3 border">\${9/3} = ${9/3}</div>
	<div class="container p-3 my-3 border">\${10%3} = ${10%3}</div>
</body>
</html>
