<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Calendar" %>
    
    <%
    
    Calendar calendar = Calendar.getInstance();
	 int hour = calendar.get(Calendar.HOUR_OF_DAY);    
    
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오전과 오후 확인</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<div class="container p-3 my-3 border">
	<% out.println(hour+"시는"); %>
	<% if(hour >- 12) { %>
	
	오후입니다.
	<% } else { %>
	오전입니다
	<% } %>
	</div>


</body>
</html>