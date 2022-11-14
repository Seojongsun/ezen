<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 정보</title>


</head>
<body>
<div>
쿠키명 : <%=request.getAttribute("name") %>

</div>
<div>
쿠키값 : <%=request.getAttribute("value") %>
</div>
</body>
</html>