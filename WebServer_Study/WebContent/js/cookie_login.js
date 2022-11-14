$(function () {
	id = $.cookie("id");
	password = $.cookie("password");
	if (id && password) {
		$("#id").val(id);
		$("#password").val(password);
		$("#save").prop("checked", true);
		
	}
	$("#save").change(function (){
		if($(this).is(":checked")){
			if (confirm ("정보 노출 위험 , 정보 저장 할거?")) {

				$.cookie("id", $("#id").val(), {
					expires: 365,
					path: "/"
				});
				$.cookie("password", $("#password").val(),  {
					expires: 365,
					path: "/"
					
				});
			}
	} else {
	$.removeCookie("id", {
	path: "/"
	});
	$.removeCookie("password", {
	path: "/"
	});
	$("#save").prop("checked", false);
	}
	});
	});
