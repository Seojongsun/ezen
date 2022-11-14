<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    // 뷰 페이지에서 자바의 객체를 호출할 때는 반드시 강제형 변환을 해주어야 한다.
    Boolean bool = (Boolean)request.getAttribute("bool");
   // System.out.println("ddT내용");
    out.println("ddT내용");
    request.setCharacterEncoding("UTF-8");
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% if(bool == true) { %>
데이터베이스 연결 asdsgbdahsdgb
<% } else { %>
데이터베이스 밍녀경
<% } %>

</body>
</html>