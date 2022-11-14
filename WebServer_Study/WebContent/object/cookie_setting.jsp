<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
   String cookie_page = request.getParameter("cookie_page");
   Cookie cookie = new Cookie("cookie_page", cookie_page);
   cookie.setMaxAge(60 * 60 * 24);
   response.addCookie(cookie);
   %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이지 선택</title>
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script type="text/javascript">

location = "./cookie_page.jsp";

</script>
</head>
<body>


</body>
</html>