<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

application.log(request.getParameter("name"));
application.log(request.getParameter("age"));

%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GET 메소드 확인</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<div class="container p-3 my-3 border">
		이름 :  <%=request.getParameter("name") %>
	</div>
	<div class="container p-3 my border">
		나이 : <%=request.getParameter("age") %>
	</div>

</body>
</html>