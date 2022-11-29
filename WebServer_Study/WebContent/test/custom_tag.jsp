<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

파라미터 없음 : ${empty param.name}
<c:if test="${empty param.name }">

<form action="#">

<input type="text" name="name">
<input type="submit">




</form>

</c:if>
</body>
</html>