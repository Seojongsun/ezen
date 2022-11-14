<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 세션에서 지정된 이름으로 바인딩 된 객체를 반환하거나 이름 아래에 바인딩 된 객체가 없으면 null을 반환한다.
	String id = (String) session.getAttribute("id");
	// 클라이언트가 요청 파라미터와 함께 보낸 모든 쿠키 객체를 포함하는 배열을 반환하고 쿠키 배열 객체에 할당한다.
	Cookie[ ] cookies = request.getCookies( );
	if(cookies != null) {
		for(Cookie cookie : cookies) {
			if(cookie.getName( ).equals("id")) {
				id = cookie.getValue( );
				// 지정된 이름을 사용하여 세션에 객체를 바인딩한다.
				session.setAttribute("id", id);
			}
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선호도 조사</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
 <form action="./preference_check.jsp" method="post" id="join">
  <fieldset>
   <div class="container p-3 my-3 border">
    <%=id%>님 환영합니다.
   </div>
   <div class="container p-3 my-3 border">
    <div class="form-group row">
     <label for="gender" class="ml-sm-3 form-check-label"> 가장 좋아하는 계절은? </label>
     <div class="ml-sm-4 form-check form-check-inline">
      <input type="radio" name="season" id="season" value="봄" class=" form-check-input" checked>
      봄
      <input type="radio" name="season" id="season" value="여름" class="ml-sm-3 form-check-input">
      여름
      <input type="radio" name="season" id="season" value="가을" class="ml-sm-3 form-check-input">
      가을
      <input type="radio" name="season" id="season" value="겨울" class="ml-sm-3 form-check-input">
      겨울
     </div>
    </div>
    <div class="form-group">
     <button type="submit" id="register" class="btn btn-primary btn-sm">전송</button>     
    </div>
   </div>
  </fieldset>
 </form>
</body>
</html>