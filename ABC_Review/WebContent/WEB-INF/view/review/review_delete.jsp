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

<script type="text/javascript">

var confirm = confirm ("작성하신 리뷰를 삭제함?")
if (confirm == true) {
	alert ( "작성하신 리뷰를 삭제했습니다.")
	location.href= "./ReviewDeleteView.do?reviewNumber=${param.reviewNumber}&id=${sessionScope.id}"
			
} else if (confirm == false) {
	
	alert ( "리뷰 삭제를 취소하셨습니다.")
	location.href="./ReviewSelect.do?reviewNumber=${param.reviewNumber}&id=${sessionScope.id}"
}

</script>


</body>
</html>