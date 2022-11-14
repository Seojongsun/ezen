<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
//request.setCharacterEncoding("UTF-8"); 
// 로그로 파라미터값을 확인하며 프로그램 실행 시에 전혀 영향을 주지 않는다.
application.log(request.getParameter("name"));
application.log(request.getParameter("age"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 파라미터 출력 </title>
<%-- 포워드로 전송할 경우 스타일시트와 자바스크립트를 지원하기 위해 경로를 현재 작업 디렉터리로 변경한다.--%>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min_4.5.0.css">
<script src="./js/jquery-3.5.1.min.js"></script>
<script src="./js/bootstrap.min_4.5.0.js"></script>
</head>
<body>
<div class="container p-3 my-3 border">
<%-- 포워드로 전송되었으므로 request 객체 자체로 호출할 수 있다.--%>
이름 : <%=request.getParameter("name")%>
</div>
<div class="container p-3 my-3 border">
<%-- 포워드로 전송되었으므로 request 객체 자체로 호출할 수 있다.--%>
나이 : <%=request.getParameter("age")%>
</div>
</body>
</html>