<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="bean" class="min.servlet.dto.NameDTO" scope="page" />
<jsp:setProperty name="bean" property="name" value=" 전우치 " />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 출력</title>
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<%--자바빈에서 파라미터를 수정하여 호출하고 출력한다.--%>
	<div class="container p-3 my-3 border">
		자바빈에서 수정하여 호출한 이름은
		<%=bean.getName()%>입니다.
	</div>
	<div class="container p-3 my-3 border">자바빈에서 수정하여 호출한 이름은
		${bean.name}  입니다.</div>
	<div class="container p-3 my-3 border">
		자바빈에서 수정하여 호출한 이름은
		<jsp:getProperty name="bean" property="name" />입니다.
	</div>
</body>
</html>
