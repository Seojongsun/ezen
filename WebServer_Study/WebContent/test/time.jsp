<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Calendar" %>
    <%
    Calendar calendar = Calendar.getInstance();
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 시간 호출 </title>
	<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.4.5.0.css">
	<script src="../js/jquery.3.5.1.min.js" type="text/javascript"></script>
	<script src="../js/bootstrap.min_4.5.0.js" "text/javascript"></script>
</head>
<body>

<div class="container p-3 my-3 boder">

	현재 시각은 <% out.println(hour); %>시 <% out.print(minute); %>분
	<% out.println(second); %>초 입니다.

</div>










</body>
</html>