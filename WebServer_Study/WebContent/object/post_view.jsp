<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	request.setCharacterEncoding("UTF-8");

 	application.log(request.getParameter("hobby"));
 	application.log(request.getParameter("gender"));
 	


 %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST 메소드 확인</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<div class="container p-3 my-3 border">
		성별 :
		<% if(request.getParameter("gender").equals("m")) { %>
		남자
		<% } else { %>
		여자
		<% } %>
	</div>
	<div class="container p-3 my-3 border">
		취미 :
		<%
		String [] hobby = request.getParameterValues("hobby");
		for(int i = 0; i < hobby.length; i++) {
		%>
		<%=hobby[i]%>
		&nbsp;
		<% } %>
	</div>


</body>
</html>