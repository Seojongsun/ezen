<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.text.SimpleDateFormat" %>
    <%@ page import="java.util.Date" %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현재 날짜와 시간</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>




</head>
<body>
	<div class="container p-3 my-3 border">
	
	현재 날짜와 시간은 <%=new SimpleDateFormat().format(new Date()) %>
	

	
	</div>

</body>
</html>