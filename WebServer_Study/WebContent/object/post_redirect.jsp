<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 전송</title>
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/jquery.validate.min.js" type="text/javascript"></script>
<script src="../js/validity.js" type="text/javascript"></script>

</head>
<body>

	<section id="member">
		<form action="../PostRedirect" method="post" id="signupForm">
			<fieldset>
				<div class="form-group">
				<label for="name">이름</label>
					<input type="text" name="name" id="name">			
				</div>
				<div class="form-group">
				<label for="age"> 나이 </label>
					<input type="text" name="age" id="age">
				</div>
				<div class="fomr-group">
					<button type="submit" id="register">전송</button>
					<button type="reset" id="cancel">취소</button>
				
				</div>
			</fieldset>
		
		</form>
	
	
	</section>

</body>
</html>