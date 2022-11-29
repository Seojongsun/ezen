<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 제거</title>
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<div class="container p-3 my-3 border">
		<c:set var="name" value="홍길동 "  />
		<%--파라미터를 제거한다.--%>
		파라미터 제거 :
		<c:remove var="name" />
		<c:out value="${name}" default=" value 값이  null일 때 이 문구가 출력 됩니다." />
	</div>
</body>
</html>
