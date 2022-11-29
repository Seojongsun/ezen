<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿼리 스트링 변환</title>
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function() {

		// register 아이디를 클릭하여 함수를 호출한다.
		$("#register").click(function() {

			// 폼 데이터를 쿼리 스트링으로 변환
			form_data = $("form").serialize();

			// 선택한 요소의 텍스트 내용을 반환
			$("#result").text(form_data);
			return false;

		});

	});
</script>
</head>
<body>
	<div class="container p-3 my-3 border">
		<form action="#" method="get" id="signupForm">
			<fieldset>
				<div class="form-group row">
					<label for="name" class="ml-sm-4 col-form-label"> 이름 </label>
					<div class="ml-sm-4">
						<input type="text" name="name" id="name" class="form-control">
					</div>
				</div>
				<div class="form-group row">
					<label for="age" class="ml-sm-4 col-form-label"> 나이 </label>
					<div class="ml-sm-4">
						<input type="text" name="age" id="age" class="form-control">
					</div>
				</div>
				<button type="submit" id="register" class="btn btn-primary btn-sm">
					전송</button>
			</fieldset>
		</form>
	</div>
	<div class="container p-3 my-3 border" id="result"></div>
</body>
</html>