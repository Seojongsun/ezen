<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST 메소드 전송</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
	<section id="member">
		<div class="container p-3  my-3 border">
		<div class="row"> <div class="col-me-5"> <div class="card-body">
			<form action="./post_view.jsp" method="post" id="signupForm">
				<fieldset>
					<div class="form-group row">
						<label for="gender" class="ml-sm-4 form-check-label">성별</label>
						<div class="ml-sm-4 form-check form-check-inline">
						<input type="radio" name="gender" id="gender" value="m" class="form-check-input" checked>남자
						<input type="radio" name="gender" id="gender" value="f" class="ml-sm-3 form-check-input">여자
						</div>
					</div>
					<div class="form-group row">
						<label for="hobby" class="ml-sm-4 form-check-label">취미</label>
						<div class="ml-sm-4 form-check form-check-inline">
							<input type="checkbox" value="축구" name="hobby" id="hobby" class="form-check-input" checked>축구
							<input type="checkbox" value="야구" name="hobby" id="hobby" class="ml-sm-3 form-check-input">야구
							<input type="checkbox" value="농구" name="hobby" id="hobby" class="ml-sm-3 form-check-input">농구
						</div>
					</div>
					<div class="form-group">
						<button type="submit" id="register" class="btn btn-primary btn-sm">전송</button>
						<button type="reset" id="cancel" class="btn btn-primary btn-sm">취소</button>
					</div>
				</fieldset>
			</form>
		</div></div></div>
		</div>
	 </section>
</body>
</html>