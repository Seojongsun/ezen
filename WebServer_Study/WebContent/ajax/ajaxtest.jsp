<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 접근 권한</title>
</head>
<body>

입력한 아이디는 ${param.id }

<c:choose>

<c:when test="${param.id eq 'admin' && param.pass eq '1234' }">
권한이 있다.

</c:when>
<c:otherwise>
권한이 없다

</c:otherwise>

</c:choose>

</body>
</html>