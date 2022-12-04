<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 제목 </title>



<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min_4.5.0.css">
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="./js/bootstrap.min_4.5.0.js" type="text/javascript"></script>

<script src="./js/jquery.validate.min.js" type="text/javascript"></script>
<script src="./js/validity.js" type="text/javascript"></script>
<script type="text/javascript">

</script>

</head>
<body>



메인페이지

<div>

세션에 저장된 아이디 :  ${sessionScope.name} 님
</div>

<div>
<p>
<c:choose>
 <c:when test="${!empty sessionScope.id}">
   <button type="button" onclick="location.href='./Logout.me'" class="btn btn-primary">로그아웃</button>
 </c:when>
 <c:otherwise>
  <button type="button" onclick="location.href='./LoginView.me'" class="btn btn-primary">로그인</button>
 </c:otherwise>
</c:choose>
</p>
</div>

<div>
<p>

<c:if test="${empty sessionScope.id}">

<button type="button" onclick="location.href='./MemberInsert.me'" class="btn btn-secondary">회원가입</button>

</c:if>

</p>
</div>



<div>
<button type="button" onclick="location.href='./Mypage.do'" class="btn btn-secondary">마이페이지</button>
<button type="button" onclick="location.href='./Cart.me'" class="btn btn-success">장바구니</button>
<button type="button" onclick="location.href='./Event.me'" class="btn btn-danger">기획전</button>
<button type="button" onclick="location.href='./ServiceCenter.me'" class="btn btn-outline-dark">고객센터</button>
</div>







<!-- 임시로 빼놓음  -->
<div><br><br><br><br><br><br>
<button type="button" onclick="location.href='./ReviewSelect.do'" class="btn btn-primary">리뷰 전체 조회</button>
<!-- <button type="button" onclick="location.href='./ReviewSelectDetail.do'" class="btn btn-secondary">리뷰 상세 조회</button> -->
</div>
<div><br>
<button type="button" onclick="location.href='./ReviewInsert.do'" class="btn btn-success">리뷰 작성</button>
<!-- <button type="button" onclick="location.href='./ReviewInsertView.do'" class="btn btn-outline-danger">리뷰 작성 결과</button> -->
</div>
<div><br>
<button type="button" onclick="location.href='./ReviewUpdate.do'" class="btn btn-warning">리뷰 수정</button>
<!-- <button type="button" onclick="location.href='./ReviewUpdateView.do'" class="btn btn-info">리뷰 수정 결과</button> -->
</div>
<div><br>
<button type="button" onclick="location.href='./ReviewDelete.do'" class="btn btn-light">리뷰 삭제</button>
<!-- <button type="button" onclick="location.href='./ReviewDeleteView.do'" class="btn btn-outline-dark">리뷰 삭제 결과</button> -->
</div>



</body>
</html>