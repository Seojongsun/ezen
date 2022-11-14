<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.net.URLEncoder, java.net.URLDecoder" %>
    
    <%
    
     String string = "홍 길동(hong)";
    
    String encode = URLEncoder.encode(string, "UTF-8");
    
    String decode = URLDecoder.decode(encode, "UTF-8");
    
    %>
  
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	


<title>문자열의 문자셋</title>
 <link rel="stulesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
	<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>

</head>
<body>
	<div class="container p-3 my-3 border">
	
	문자열 인코딩 : <% out.println(encode); %>
	
	
	</div>
	<div class="container p-3 my-3 border">
	
	문자열 디코딩 : <% out.println(decode); %>
	
	</div>

</body>
</html>