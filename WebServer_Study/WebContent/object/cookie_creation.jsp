<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 쿠키 생성 </title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script> 
</head>
<body>
<div class="container p-3 my-3 border">
<%-- 리다이렉트로 전송되었지만, 세션 영역에 공유한 속성값은 접근할 수 있다.--%>
쿠키명 : <%=request.getSession( ).getAttribute("name")%>
</div>
<div class="container p-3 my-3 border">
<%-- 리다이렉트로 전송되었지만, 세션 영역에 공유한 속성값은 접근할 수 있다.--%>
쿠키값 : <%=request.getSession( ).getAttribute("value")%>
</div>
</body>
</html>