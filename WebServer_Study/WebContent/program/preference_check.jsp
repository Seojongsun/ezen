<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
// 파라미터를 호출하고 문자열 변수에 할당한다.
String season = request.getParameter("season"); 
// 속성을 호출하고 문자열 변수에 할당한다.
String id = (String)session.getAttribute("id");
// 해당 세션의 세션 ID를 반환한다. 
String sessionid = session.getId( );
// 요청이 없을 시 서버가 해당 세션을 유지하도록 지정된 시간을 초 단위의 정수로 반환한다.
int intervalTime = session.getMaxInactiveInterval( ); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 선호도 확인 </title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script> 
</head>
<body>
<div class="container p-3 my-3 border">
<%=id %>님이 좋아하는 계절은 <%=season %>입니다.
</div>
<div class="container p-3 my-3 border">
세션 ID : <%=sessionid %><br>
세션 유지 시간 :<%=intervalTime %> 초
<input type="button" value="로그아웃" onclick="location.href='logout.jsp'" class="btn btn-primary btn-sm">
</div>
</body>
</html>