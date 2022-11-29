<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기타 연산</title>
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<%--요청 파라미터에 속성을 저장하고 속성을 공유한다.--%>
	<% pageContext.setAttribute("title", "empty 연산자 "  ); %>
	<div class="container p-3 my-3 border">
		<%--값이 null 이면 true를 출력한다  .--%>
		 ${empty title}, ${empty title2}
	</div>
	<div class="container p-3 my-3 border">
		<%--조건식이 거짓이므로 작다고 출력한다.--%>
		${10 > 20 ? '크다  ' : '작다 '} 
	</div>
</body>
</html>