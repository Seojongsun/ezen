<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 숫자 패턴 </title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
<div class="container p-3 my-3 border">
<%--통화 표시로 숫자를 출력한다.--%>
통화 표시 : <fmt:formatNumber value="50000" type="currency"/>
</div>
<div class="container p-3 my-3 border">
<%--퍼센트 표시로 숫자를 출력한다.--%>
퍼센트 표시 : <fmt:formatNumber value="0.15" type="percent"/>
</div>
<div class="container p-3 my-3 border">
<%--세 자릿수 표시로 숫자를 출력한다.--%>
세 자릿수 표시 : <fmt:formatNumber value="500567300" pattern="###,###,###"/>

</div>
</body>
</html>