<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bean" class="min.servlet.dto.NameDTO" scope="page"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 출력</title>


</head>
<body>

	<div>자바빈에서 호출한 이름은 <%=bean.getName() %> 입니다.</div>
	<div> 자바빈에서 호출한 이름은 ${bean.name }입니다.</div>

</body>
</html>