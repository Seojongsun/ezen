<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 확인</title>
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script src="../js/jquery.validate.min.js" type="text/javascript"></script>
<script src="../js/validity.js" type="text/javascript"></script>
</head>
<body>
	<%--파라미터값이 null	일 경우에 반환한다 .--%>

	<div class="container p-3 my-3 border">
		<p class="ml-sm-4">파라미터 없음 : ${empty param.name}</p>
	</div>
	<section id="member">
		<div class="container p-3 my-3 border">
			<div class="card-body">
				<%--파라미터값이 없을 때 조건을 실행한다.--%>
				<c:if test="${empty param.name}">
					<form action="#" method="get" id="signupForm">
						<fieldset>
							<div class="form-group row">
								<label for="name" class="ml-sm-4 col-form-label"> 이름 </label>
								<div class="ml-sm-4">
									<input type="text" name="name" id="name" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<button type="submit" class="btn btn-primary btn-sm">
									전송</button>
								<button type="reset" class="btn btn-primary btn-sm">취소
								</button>
							</div>
						</fieldset>
					</form>
				</c:if>
				<%--파라미터값이 있을 때 조건을 실행한다.--%>
				<c:if test="${!empty param.name}"> 반갑습니다. ${param.name} ! 님 </c:if>
			</div>
		</div>
	</section>
</body>
</html>