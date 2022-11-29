<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
escapeXml 속성 : <c:out value='<font color="blue">파랑 </font>' escapeXml="false"/>

</div>
<div>
<c:set var="name" value="홍길동" scope="session"/>

이름 : <c:out value="${name}"/>

</div>

</body>
</html>