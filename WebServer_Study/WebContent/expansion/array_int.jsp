<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1차원 배열값</title>
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<%--요청 프로퍼티에 속성을 저장하고 속성을 공유한다.--%>
	<%
		pageContext.setAttribute("scores", new int[] { 90, 80, 70, 100 });
	%>
	<%--배열의 인덱스 값을 출력한다.--%>
	<div class="container p-3 my-3 border">배열의 인덱스 값 : ${scores[2]}</div>
</body>
</html>