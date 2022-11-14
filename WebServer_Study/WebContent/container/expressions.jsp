<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%!
   
   public int sum() {
	   
	   int total= 0;
	   
	   for(int i = 1; i<=10; i++) {
		   total = total + i;
	   }
	   return total;
	   
	   
   }
   
   %>
    
    
    <% String str = "1부터 10까지의 합"; %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1부터 10까지의 합</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>

</head>
<body>
<div class="container p-3 my-3 border">
<%=str%>은 <%=sum() %>입니다.
</div>

</body>
</html>