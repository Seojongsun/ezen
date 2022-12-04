<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty sessionScope.id}">
 <script type="text/javascript">
		location.href = "./LoginView.me"
	</script>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 제목 </title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min_4.5.0.css">
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="./js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script src="./js/jquery.validate.min.js" type="text/javascript"></script>
<script src="./js/validity.js" type="text/javascript"></script>
<script type="text/javascript">

</script>

</head>
<body>
<button type="button" onclick="location.href='./index.jsp'" class="btn btn-primary">홈</button>

${reviewList}
 <strong>${listcount}</strong>개
 
 
 <section id="review">
 <div class="card">
 글목록
   <p align="right">
        <%--전체 글의 개수를 호출한다.--%>
        전체 글:
        <strong>${listcount}</strong>
        개
  </p>
  
  
   <table class="table table-hover">
  <thead class="thead-light">
   <tr class="text-center">
           <th>리뷰 번호</th>
           <th>리뷰 내용</th>
          </tr>
  </thead>
  <c:forEach var="review" items="${reviewList}">
   <tbody>
           <tr class="text-center">
           
           
            <td><a href="./ReviewSelectDetail.do?reviewNumber=${review.reviewNumber}">${review.reviewNumber} </a></td>
          <td><a href="./ReviewSelectDetail.do?reviewNumber=${review.reviewNumber}">${review.reviewContent} </a></td>
          
    	</tr>
          </tbody>
  </c:forEach>
  </table>
  
  
  
 </div>
 </section>
 
 
 
 


  
</body>
</html>