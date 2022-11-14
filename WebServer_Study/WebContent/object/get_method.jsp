<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GET 메소드 전송</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script src="../js/jquery.validate.min.js" type="text/javascript"></script>
<script src="../js/validity.js" type="text/javascript"></script>

</head>
<body>
	<section id="member">
		<div class="container p-3 my-3 border"> 
		<div class="row"> <div class="col-md-5"> <div class="card-body">
			<form action="./get_view.jsp" method="get" id="signupFrom">
				<fieldset>
					<div class="form-group row">
						<label for="name" class="ml-sm-4 col-form-label">이름</label>
							<div class="ml-sm-4">
								<input type="text" name="name" id="name" class="form-control form-control-sm">
							</div>
					</div>
		<div class="form-group row">
			<label for="age" class="ml-sm-4 col-form-label">나이</label>
			<div class="ml-sm-4">
			<input type="text" name="age" id="age" class="form-control form-control-sm">
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