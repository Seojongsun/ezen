<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 파라미터 확인 </title>
<script src="../js/jquery.validate.min.js" type="text/javascript"></script>
</head>
<body>
	<section id="member">
		<div>
			<c:choose>
		
			<c:when test="${empty param.id }">
				<form action="#" method="get" id"signupForm>
					<fieldset>
					<div>
						<label>아이디 </label>
						<div > <input type="text" name="id" id="id"></div>
					</div>
					<div>
						<button type="submit"> 전송 </button>
						<button type="reset"> 취소 </button>
					</div>
					</fieldset>
				</form>
				</c:when>
				<c:when test="${param.id eq 'admin' }"> 관리자로 로그인했습니다. </c:when>
				<c:otherwise> ${param.id}로 로그인했습니다.</c:otherwise>
			</c:choose>
		</div>
	</section>

</body>
</html>