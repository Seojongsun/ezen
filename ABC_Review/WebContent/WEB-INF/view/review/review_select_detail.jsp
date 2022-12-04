<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 제목 </title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min_4.5.0.css">
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="./js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script src="./js/jquery.validate.min.js" type="text/javascript"></script>
<script src="./js/validity.js" type="text/javascript"></script>
<script type="text/javascript">

</script>

</head>
<body>

<button type="button" onclick="location.href='./index.jsp'" class="btn btn-primary">홈</button>

리뷰 상세 조회



<div>
리뷰 번호
${reviewDTO.reviewNumber} 
</div>

<div>
리뷰 내용
${reviewDTO.reviewContent} 
</div>

<button type="button" onclick="location.href='./ReviewSelect.do'" class="btn btn-primary">리뷰 전체 조회</button>

<button type="button" onclick="location.href='./ReviewUpdateDetail.do?reviewNumber=${reviewDTO.reviewNumber}'" class="btn btn-warning">리뷰 수정</button>

<button type="button" onclick="location.href='./ReviewDelete.do?reviewNumber=${reviewDTO.reviewNumber}'" class="btn btn-light">리뷰 삭제</button>
 
 
   




</body>
</html>