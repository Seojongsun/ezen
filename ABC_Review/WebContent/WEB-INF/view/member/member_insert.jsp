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

<form action="./MemberInsert_view.me" method="post" enctype="application/x-www-form-urlencoded">

회원 가입 화면
<div>
아이디<input type="text" name="id">		
</div>

<div>
이름<input type="text" name="name">	
</div>

<div>
패스워드 <input type="password" name="password">	
</div>

<div>성별
남자 <input type="radio" name="gender" value="남자">
여자 <input type="radio" name="gender" value="여자">
</div>

<div>
나이<input type="number" name="age">
</div>

<div>
생년원일 <input type="date" name="birthday">
</div>

<div>
이메일 주소 <input type="text" name="email">
</div>

<div>
<input type="hidden" name="num">
</div>


<input type="submit" value="회원가입">
<input type="reset" onClick="location.href='./index.jsp'" value="취소">  
</form>
</body>
</html>