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

<div>

<button type="button" onclick="location.href='./index.jsp'" class="btn btn-primary">홈</button>

</div>
<div>
${sessionScope.name} 님 환합니다
</div>

나의 상품 후기

<p>
밑으로 상품 후기 좌르르르르르르륵~
</p>


<!-- 임시로 빼놓음  -->
<div><br><br><br><br><br><br>
<button type="button" onclick="location.href='./ReviewSelect.do'" class="btn btn-primary">리뷰 전체 조회</button>
<button type="button" onclick="location.href='./ReviewSelectDetail.do'" class="btn btn-secondary">리뷰 상세 조회</button>
</div>
<div><br>
<button type="button" onclick="location.href='./ReviewInsert.do'" class="btn btn-success">리뷰 작성</button>
<button type="button" onclick="location.href='./ReviewInsertView.do'" class="btn btn-outline-danger">리뷰 작성 결과</button>
</div>
<div><br>
<button type="button" onclick="location.href='./ReviewUpdate.do'" class="btn btn-warning">리뷰 수정</button>
<button type="button" onclick="location.href='./ReviewUpdateView.do'" class="btn btn-info">리뷰 수정 결과</button>
</div>
<div><br>
<button type="button" onclick="location.href='./ReviewDelete.do'" class="btn btn-light">리뷰 삭제</button>
<button type="button" onclick="location.href='./ReviewDeleteView.do'" class="btn btn-outline-dark">리뷰 삭제 결과</button>
</div>


</body>
</html>