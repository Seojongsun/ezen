<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${empty sessionScope.id}">
<script type="text/javascript">
location.href="./LoginView.me"
</script>
</c:if>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>어깨동무 게시판</title>
<link rel="shortcut icon" href="./img/favicon.ico" type="image/x-icon">
<link rel="stylesheet" type="text/css" href="./css/global.css">
<link rel="stylesheet" type="text/css" href="./css/all.min.css">
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min_4.5.0.css">
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="./js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script src="./js/popper.min.js" type="text/javascript"></script>
<script src="./js/ckeditor/ckeditor.js" type="text/javascript"></script>
<script src="./js/comment.js" type="text/javascript"></script>

</head>
<body>
  <nav class="navbar navbar-expand-md bg-dark navbar-dark text-white">
  <div class="container">
   <div class="col-md-6">
    <h1>
   <i class="fas fa-user-tag"></i>
     게시판
    </h1>
   </div>
   <div id="toggle" class="navbar-collapse collapse">
    <ul class="navbar-nav">
    </ul>
    <ul class="navbar-nav ml-auto">
     <li class="nav-item dropdown mr-3">
      <c:if test="${!empty sessionScope.id}">
       <p class="nav-link dropdown-toggle" data-toggle="dropdown">
        <i class="fas fa-user mr-sm-1"></i>
        ${sessionScope.name} 님
       </p>
      </c:if>
      <div class="dropdown-menu">
       <c:choose>
        <c:when test="${!empty sessionScope.id}">
         <a class="dropdown-item" href="./MemberSelectDetail.me?id=${sessionScope.id}">
          <i class="fas fa-user-shield"></i>
          회원 정보
         </a>
        </c:when>
       </c:choose>
      </div>
      <c:choose>
       <c:when test="${empty sessionScope.id}">
        <li class="nav-item">
         <a href="./LoginView.me" class="nav-link">
          <i class="fas fa-user-circle mr-sm-1"></i>
          로그인
         </a>
       </c:when>
       <c:otherwise>
        <li class="nav-item">
         <a href="./LoginView.me" class="nav-link">
          <i class="fas fa-user-times mr-sm-1"></i>
          로그아웃
         </a>
       </c:otherwise>
      </c:choose>
    </ul>
    <ul class="navbar-nav py-3 mb-3 pl-3 pr-3">
 <li>    <a href="./index.jsp" class="navbar-brand text-white">
    <i class="fa fa-home"></i>홈
   </a>
   </li>     
    </ul>
   </div>
  </div>
 </nav> 
 <header id="main-header" class="py-2 bg-secondary"> </header>
 <section class="py-3 mb-3 bg-light">
  <div class="container">
   <div class="row col-md-12"></div>
  </div>
 </section>
 <section id="board">
  <div class="container">
   <div class="row">
    <div class="col-md-12">
     <div class="card">
      <div class="card-header">
       <h3 class="text-muted">
        <i class="fas fa-sticky-note mr-sm-1"></i>글 내용
       </h3>
      </div>
      <div class="card-body">
       
       <div class="row pl-1 pr-1">
        <div class="col col-md-10">
          <input type="hidden" name="num" value="${boardDTO.num}">
         <div class="form-group row">
          <label for="name" class="col-2 col-form-label pr-0"><i class="fas fa-portrait mr-sm-1"></i>이름</label>
          <div class="col-2 pl-0 py-1">
           ${boardDTO.name}
          </div>
         </div>
          <div class="form-group row">
          <label for="subject" class="col-2 col-form-label pr-0"><i class="fas fa-pen-alt mr-sm-1"></i>제목</label>
          <div class="col-6 pl-0  py-1">
           	${boardDTO.subject}
          </div>
         </div>
         <div class="form-group row">
          <label for="content" class="col-2 col-form-label pr-0"><i class="fas fa-edit mr-sm-1"></i>내용</label>
          <div class="col-10 pl-0  py-1">
           <textarea name="content" id="content" class="form-control ckeditor">${boardDTO.content}</textarea>
          </div>
         </div>
         <div class="form-group row">
          <label for="attachedfile" class="col-2 col-form-label pr-0"><i class="fas fa-folder mr-sm-1"></i>파일 첨부</label>
          <div class="col-6 pl-0  py-1">
           <div class="form-group">
            <c:choose>
						<c:when test="${!empty boardDTO.attachedfile}">
							<p>
								
								${boardDTO.attachedfile}&nbsp;&nbsp;&nbsp; <a href="./boardUpload/${boardDTO.attachedfile}"> 파일 다운 </a> 
								<%-- hidden 값으로 기존 파일의 이름인 attached_file를 old_file로 설정한다.--%>
								<input type="hidden" name="oldfile" value="${boardDTO.attachedfile}">
							</p>
						</c:when>
						<c:otherwise>
							<p class="col-6 pl-0  py-0">								
								첨부 파일이 없습니다.
							</p>
						</c:otherwise>
					</c:choose>
           </div>
          </div>
        
       </div>
          </div>
      </div>
      
      
       <nav class="navbar justify-content-end">
        <button type="button" class="btn btn-outline-dark mr-sm-1" onclick="location.href='./BoardReplyInsert.do?num=${boardDTO.num}'">
         <i class="fas fa-file-signature mr-sm-1"></i>글 답변
        </button>
        <button type="button" class="btn btn-outline-secondary mr-sm-1" onclick="location.href='./BoardUpdateDetail.do?num=${boardDTO.num}'">
         <i class="fas fa-upload mr-sm-1"></i>글 수정
        </button>
        <button type="button" class="btn btn-outline-danger mr-sm-1" onclick="location.href='./BoardDeleteView.do?num=${boardDTO.num}'">
         <i class="fas fa-trash mr-sm-1"></i>글 삭제
        </button>
        <button type="button" class="btn btn-outline-success mr-sm-1" onclick="location.href='./BoardSelect.do'">
         <i class="fas fa-file-alt mr-sm-1"></i>글 목록
        </button>
       </nav>
      </div>
     </div>
    </div>
   </div>
  </div>
 </section>
 <footer id="main-footer" class="bg-secondary text-white mt-3 p-3">
  <div class="container">
   <div class="row">
    <div class="col">
     <p class="lead text-center">
      <img src="./img/log.png" class="mr-sm-1">
      어깨동무 게시판 &copy; 2000
     </p>
    </div>
   </div>
  </div>
 </footer>
</body>
</html>