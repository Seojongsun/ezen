<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 인사말 </title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<div class="container p-3 my-3 border">
	
	<%!
	
	private String str = "홍길동";
	
	
	
	%>
	<%!
	
	private String getStr() {
		
		str = str + "님 반갑습니다.";
		return str;
	}
	
	
	
	
	%>
	
	<% out.println(getStr()); %>
	
	</div>

</body>
</html>