<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이중 조건 확인</title>
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<div class="container p-3 my-3 border">
		<%--다중 조건을 처리한다.--%>
		<c:choose>
			<%--거짓인 조건을 설정한다.--%>
			<c:when test="${5+40 eq 50}"> 조건이 참이면 실행합니다. </c:when>
			<c:when test="${5+45 eq 50 }"> 조건이 두번째면 실행합니다.</c:when>
			<%--조건이 만족하지 않을 때 실행한다.--%>
			<c:otherwise> 조건이 거짓이면 실행합니다. </c:otherwise>
		</c:choose>
	</div>
</body>
</html>