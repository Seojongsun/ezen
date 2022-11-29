<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.net.URLDecoder" %>
    <% String namekr = request.getParameter("namekr"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 출력</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>

</head>
<body>

	<div> 이름 : ${param.name }</div>
	
	
	<div>	인코딩 이름 : ${param.namekr }</div>

		<div> 인코딩 이름 : <%=URLDecoder.decode(namekr, "UTF-8") %></div>

</body>
</html>