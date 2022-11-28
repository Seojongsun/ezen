<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 제목 </title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script src="../js/jquery.validate.min.js" type="text/javascript"></script>
<script src="../js/validity.js" type="text/javascript"></script>
<script type="text/javascript">

</script>

</head>
<body>

로그인 화면

 <form action="./Login.me" method="post" id="signupForm" enctype="application/x-www-form-urlencoded">
 <fieldset>
         <div class="form-group">
         
          <label for="id"><i class="fas fa-user-check mr-sm-1"></i>아이디</label>
          <input type="text" name="id" id="id" class="form-control" placeholder="아이디">
         </div>
         <div class="form-group">
          <label for="password"><i class="fas fa-user-lock mr-sm-1"></i>비밀번호</label>
          <input type="password" name="password" id="password" class="form-control" placeholder="비밀번호">
         </div>
          <div class="form-group">
   <div class="custom-control custom-checkbox">
     <input type="checkbox" name="save" class="custom-control-input" id="save">
     <label class="custom-control-label" for="save">로그인 상태 유지</label>
   </div>
  </div>         
         <button type="submit" id="register" class="btn btn-info btn-block">
          로그인
         </button>
        </fieldset>

</form>
</body>
</html>