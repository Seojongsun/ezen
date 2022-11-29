<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인클루드 액션</title>
</head>
<body>

	<jsp:include page="./include_action_view.jsp" flush="false">
		<jsp:param value="홍길동" name="name"/>
		<jsp:param value='<%=URLEncoder.encode("홍길동", "UTF-8")%>' name="namekr"/>
		
</jsp:include>
</body>
</html>