<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/jquery.validate.min.js" type="text/javascript"></script>
<script src="../js/validity.js" type="text/javascript"></script>
<script src="../js/jquery.cookie.js" type="text/javascript"></script>
<script src="../js/cookie_login.js" type="text/javascript"></script>
</head>
<body>
	<section id="login">
		<div> <h4> ID 로그인 </h4></div>
			<form action="../LoginCheck" method="post" id="signupForm">
				<fieldset>
					<div class="form-group">
						<label for="id"> 아이디 </label>
						<input type="text" name="id" id="id">
					</div>
					<div class="form group">
						<label for="password"> 비밀번호 </label>
						<input type="password"  name="password" id="password" >
					</div>
					<div>
						<input type="checkbox" name="save" id="save" class="form-check-input">					
						<label for="save" class="form-check-label"> 로그인 상태 유지 </label>
					</div>
					<button type="submit" id="register"> 로그인 </button>			
				
				</fieldset>
			</form>
	
	</section>

</body>
</html>