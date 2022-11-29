<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>프로퍼티 호출</title>
<%--포워드로 전송할 경우 스타일시트와 자바스크립트를 지원하기 위해 경로를 현재 작업 디렉터리로 변경한다.--%>
<link rel="stylesheet" type="text/css"
	href="./css/bootstrap.min_4.5.0.css">
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="./js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<div class="container p-3 my-3 border">
		<%--객체의 프로퍼티로 직접 접근하여 프로퍼티를 호출하고 출력한다.--%>
		부서 번호 : ${deptno}
	</div>
	<div class="container p-3 my-3 border">
		<%--객체의 프로퍼티로 직접 접근하여 프로퍼티를 호출하고 출력한다.--%>
		부서 이름 : ${dname}
	</div>
	<div class="container p-3 my-3 border">
		<%--공백 때문에 null 이 호출되어 출력한다 .--%>
		 부서 지역 :
		<%=request.getAttribute("loc ")%>
	</div>
</body>
</html>