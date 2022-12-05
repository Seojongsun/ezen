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

<div>
<button type="button" onclick="location.href='./index.jsp'" class="btn btn-primary">홈</button>
</div>
 <strong>${listcount}</strong>개

<div>
 세션에 저장된 아이디 :  ${sessionScope.name} 님
 </div>
 
  <header id="main-header" class="py-2 bg-secondary"> </header>
 <section id="search" class="py-3 mb-3 bg-light">
  <div class="container">
   <div class="row col-md-12">
    <div class="col-md-6 ml-auto">
     <form action="./ReviewSearchSelect.do" method="post" name="search" id="signupForm" enctype="application/x-www-form-urlencoded">
      <fieldset>
       <div class="input-group">
        <label for="keyword"></label>
        <select name="keyfield" class="form-control mr-sm-1">
         <%--해당 항목을 기본 선택으로 지정하여 검색한다.--%>
         <option value="all" selected="selected">전체 검색</option>
         <option value="reviewNumber" <c:if test="${'reviewNumber' == keyfield}">selected="selected"</c:if>>리뷰 번호</option>
         <option value="reviewContent" <c:if test="${'reviewContent' == keyfield}">selected="selected"</c:if>>리뷰 내용</option>
        </select>
        <input type="search" id="keyword" name="keyword" class="form-control mr-sm-1" placeholder="검색어 입력">
        <button class="btn btn-outline-success" type="submit">
         <i class="fas fa-search mr-sm-1"></i>
         검색
        </button>
       </div>
      </fieldset>
     </form>
    </div>
   </div>
  </div>
 </section>
 
 
 
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
<%--   <c:forEach var="review" items="${searchReviewlist}"> --%>
  <c:forEach var="review" items="${reviewList}">
<%--   <c:forEach var="review" items="${reviewList}"> --%>
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
 
 
 <header id="main-header" class="py-2 bg-secondary"> </header>
 <section id="search" class="py-3 mb-3 bg-light">
  <div class="container">
   <div class="row col-md-12">
    <div class="col-md-6 ml-auto">
     <form action="./BoardSearchSelect.do" method="post" name="search" id="signupForm" enctype="application/x-www-form-urlencoded">
      <fieldset>
       <div class="input-group">
        <label for="keyword"></label>
        <select name="keyfield" class="form-control mr-sm-1">
         <%--해당 항목을 기본 선택으로 지정하여 검색한다.--%>
         <option value="all" selected="selected">전체 검색</option>
         <option value="reviewNumber" <c:if test="${'reviewNumber' == keyfield}">selected="selected"</c:if>>리뷰 번호</option>
         <option value="reviewContent" <c:if test="${'reviewContent' == keyfield}">selected="selected"</c:if>>리뷰 내용</option>
        </select>
        <input type="search" id="keyword" name="keyword" class="form-control mr-sm-1" placeholder="검색어 입력">
        <button class="btn btn-outline-success" type="submit">
         <i class="fas fa-search mr-sm-1"></i>
         검색
        </button>
       </div>
      </fieldset>
     </form>
    </div>
   </div>
  </div>
 </section>
 <section id="review">
  <div class="container">
   <div class="row">
    <div class="col-md-12">
     <div class="card">
      <div class="card-header">
       <h3 class="text-muted">
        <i class="fas fa-file-alt mr-sm-1"></i>
        글 목록
       </h3>
       <p align="right">
        <%--전체 글의 개수를 호출한다.--%>
        전체 글:
        <strong>${listcount}</strong>
        개
       </p>
      </div>
      <table class="table table-hover">
       <c:choose>
        <c:when test="${listcount>0}">
         <thead class="thead-light">
          <tr class="text-center">
           <th>리뷰 번호</th>
           <th>리뷰 내용</th>
          </tr>
         </thead>
         <c:forEach var="review" items="${reviewList}">
          <tbody>
           <tr class="text-center">
            <td>${review.reviewNumber}</td>
            <td>
             <%-- 글 제목을 클릭했을 때 글 내용 보기 요청한다.--%>
             <a href="./ReviewSelectDetail.do?reviewNumber=${review.reviewNumber}">${review.reviewContent} </a>
            </td>
           </tr>
          </tbody>
         </c:forEach>
        </c:when>
       </c:choose>
      </table>
      <table class="table table-hover">
       <tbody>
       </tbody>
       <%-- 등록된 글이 없을 때 출력한다.--%>
       <c:if test="${searchlistcount==0}">
        <tr>
         <td colspan="4"></td>
         <td>등록된 글이 없습니다.</td>
        </tr>
       </c:if>
       <tr>
      </table>
      <nav class="ml-4">
       <ul class="pagination justify-content-center">
        <c:choose>
         <c:when test="${page <= 1}">
          <li class="page-item disabled">
           <a class="page-link"> 이전 </a>
          </li>
         </c:when>
         <c:otherwise>
          <li class="page-item">
           <a href="./ReviewSelect.do?page=${page-1}" class="page-link"> 이전 </a>
          </li>
         </c:otherwise>
        </c:choose>
        <c:forEach var="start" begin="${startpage}" end="${endpage}" step="1">
         <c:choose>
          <c:when test="${start==page}">
           <li class="page-item active">
            <a class="page-link">${start}</a>
           </li>
          </c:when>
          <c:otherwise>
           <li class="page-item">
            <a href="./ReviewSelect.do?page=${start}" class="page-link">${start} </a>
           </li>
          </c:otherwise>
         </c:choose>
      
      
        </c:forEach>
        
        
        	
        <c:choose>
         <c:when test="${page >= maxpage}">
          <li class="page-item">
           <a class="page-link"> 다음 </a>
          </li>
         </c:when>
         
         
     
         <c:otherwise>
     
           
         
           <li class="page-item">
            <a href="./ReviewSelect.do?page=${page+1}" class="page-link"> 다음 </a>
            </li>
         
          
         </c:otherwise>
        
        </c:choose>
        
       </ul>
           
      </nav>
 
      <nav class="navbar justify-content-end">
       <div class="btn-group">
        <button type="button" class="btn btn-outline-info" onclick="location.href='./ReviewInsert.do'">
         <i class="fas fa-edit mr-sm-1 mr-sm-1"></i>
         글 등록
        </button>
       </div>
      </nav>
     </div>
    </div>
   </div>
  </div>
 </section>
 

  
</body>
</html>