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

삭제 화면


<c:choose>
 <c:when test="${sessionScope.id == 'admin'}">
  <script type="text/javascript">
  confirm("게시글을 삭제하시겠습니까?.")
    location.href="./ReviewDeleteView.do?reviewNumber=${param.reviewNumber}&id=admin"
  </script>
 </c:when>
 <c:otherwise>
  <script type="text/javascript">
  confirm("게시글을 삭제하시겠습니까?.")
   location.href="./ReviewDeleteView.do?reviewNumber=${param.reviewNumber}&id=${sessionScope.id}"
  </script>
 </c:otherwise>
</c:choose>



</body>
</html>