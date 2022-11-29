<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 제목 </title>
<link rel="stylesheet" type="text/css" href="../../css/bootstrap.min_4.5.0.css">
<script src="../../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script src="../../js/jquery.validate.min.js" type="text/javascript"></script>
<script src="../../js/validity.js" type="text/javascript"></script>
<script type="text/javascript">

</script>

</head>
<body>

<div>

<button type="button" onclick="location.href='../../index.jsp'" class="btn btn-primary">홈</button>

</div>

마이페이지 화면

<div>
${sessionScope.name} 님 환합니다
</div>



<button type="button" onclick="location.href='./mypage_order_shipping.jsp'" class="btn btn-outline-warning">주문 / 배송 현황 조회</button>


<button type="button" onclick="location.href='./mypage_myreview.jsp'" class="btn btn-outline-info">나의 상품 후기</button>




</body>
</html>