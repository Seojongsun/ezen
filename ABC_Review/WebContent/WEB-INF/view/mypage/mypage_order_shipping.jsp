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

주문 / 배송 현황 조회


<div>
<p>
구매 내역 있다 치고~~~~~ <button type="button" onclick="location.href=' 고쳐보자 '" class="btn btn-outline-dark"> 후기 작성</button>

</p>
</div>


<div>

<p>
구매 내역 있고 그 상품에 대한 후기를 작성 했다 치고~~~ <button type="button" onclick="location.href='./Myreview.do'" class="btn btn-dark"> 작성 후기보기</button>

</p>
</div>

</body>
</html>