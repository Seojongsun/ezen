<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 체크</title>
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script src="../js/jquery.validate.min.js" type="text/javascript"></script>
<script src="../js/validity.js" type="text/javascript"></script>
<script type="text/javascript">
	
</script>

</head>
<body>

	<script type="text/javascript">
		$(function() {
			$("#register").click(function() {
				var id = $("input[name='id']").val();
				$.ajax({
					url : "../IdCheck",
					tyrp : "get",
					data : {
						"id" : id

					}

				});

			});

		});
	</script>
	<div class="container p-3 my-3 border">
		<form id="signupForm">
			<fieldset>
				<div class="form-group row form-inline">
					<label for="password" class="ml-sm-3 col-form-label"> 아이디 </label>
					<div class="ml-sm-3">
						<input type="text" name="id" id="id" class="form-control mr-sm-2">
					</div>
					<button type="submit" id="register" class="btn btn-outline-success">
						체크</button>
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>