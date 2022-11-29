<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 출력</title>
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<div class="container p-3 my-3 border">
		<%--EL .--%>
		 웹 브라우저 정보 : ${browser}
	</div>
	<div class="container p-3 my-3 border">
		
		<c:out  value="<b>상품 코드 : ${code}</b>" escapeXml="false" />
	</div>
	<div class="container p-3 my-3 border">
		상품명 : ${name}
	</div>
	<div class="container p-3 my-3 border">
		가격 : ${price} 원
	</div>
	<div class="container p-3 my-3 border">
		<c:out value="${str}" default="기본 데이터가 없습니다 ." />
	</div>
	<div class="container p-3 my-3 border">
		<c:out value="${name}" default="기본 데이터가 없습니다 ." />
	</div>
</body>
</html>