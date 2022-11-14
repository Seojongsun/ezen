<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 
 String view_page = "view_page";
 String cookie = request.getHeader("Cookie");
 if(cookie != null){
	 
	 Cookie[] cookies = request.getCookies();
	 for(int i = 0; i < cookies.length; i++){
		 if(cookies[i].getName().equals("cookie_page")){
			 view_page = cookies[i].getValue();
		 }
	 }
 }
 
 
 %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>화면 설정</title>
</head>
<body>
	<% if(view_page.equals("view_page")) { %>
		<div> 뷰 페이지</div>
			
	<% } else {  %>
		<div>쿠키 페이지 </div>
	<% } %>
	<form action="./cookie_setting.jsp" method="post">
		<div>
		<input type="radio" name="cookie_page" value="view_page" checked> 뷰 페이지 보기
		<input type="radio" name="cookie_page" value="cookie_page" <% if(view_page.equals("cookie_page")){ %> checked <% } %>> 쿠키 페이지 보기 
		
		<input type="submit" value="설정">
		</div>
	
	</form>
</body>
</html>