<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조건 확인</title>
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<div class="container p-3 my-3 border">
		<%--참인 조건을 설정한다.--%>
		<c:if test="${5<10}"> 5 10 는 보다 작다는 조건이 참이므로 출력한다.  </c:if>
	</div>
	<div class="container p-3 my-3 border">
		<%--거짓인 조건을 설정한다.--%>
		<c:if test="${5>10}"> 5 10 는 보다 크다는 조건이 거짓이므로 출력하지 않는다.  </c:if>
	</div>
</body>
</html>