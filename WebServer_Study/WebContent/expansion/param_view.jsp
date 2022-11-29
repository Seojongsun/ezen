<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>프로퍼티 출력</title>
<%--포워드로 전송할 경우 스타일시트와 자바스크립트를 지원하기 위해 경로를 현재 작업 디렉터리로 변경한다.--%>
<link rel="stylesheet" type="text/css"
	href="./css/bootstrap.min_4.5.0.css">
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="./js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<div class="container p-3 my-3 border">
		<%--세션 객체를 호출하고 출력한다.--%>
		세션 객체 : ${sessionScope.min}
	</div>
	<div class="container p-3 my-3 border">
		<%--파라미터를 호출하고 출력한다.--%>
		파라미터 호출 : ${param.name}
	</div>
	<div class="container p-3 my-3 border">
		<%--세션 객체를 호출하고 출력한다.--%>
		세션 객체 :
		<%=session.getAttribute("min")%>
	</div>
	<div class="container p-3 my-3 border">
		<%--파라미터를 호출하고 출력한다.--%>
		파라미터 호출 :
		<%=request.getParameter("name")%>
	</div>
</body>
</html>