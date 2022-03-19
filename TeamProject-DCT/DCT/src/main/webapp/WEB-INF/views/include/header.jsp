<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    
    <title>Dream Come True</title>
    
   	<!-- font awesome -->
	<script src="https://kit.fontawesome.com/ec7c1dce8a.js" crossorigin="anonymous"></script>
    
   	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css">
    <link rel="stylesheet" href="<c:url value='/css/bootstrap.css' />">
    <link rel="stylesheet" href="<c:url value='/css/main.css' />">
    
   	<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
    <script src="<c:url value='/js/bootstrap.js' />"></script>
</head>

<body>
   
<header id="header">
	<nav class="navbar">
		<div class="container">
			<div class="logo">
				<a href="<c:url value='/' />" class="">
					<img class="logo" src="<c:url value='/img/logo.png' />" alt="header-logo">
				</a>
			</div>
			<div class="navbar-menu">
				<div class="navbar-left">
					<div class="">
						<a href="<c:url value='/lectureList' />" class=""><span>강의</span></a>
					</div>
					<div class="">
						<a href="<c:url value='/mentoringList' />" class=""><span>멘토링</span></a>
					</div>
					<div class="">
						<a href="<c:url value='/freeBoardList' />" class=""><span>커뮤니티</span></a>
					</div>
					<div class="">
						<a href="#" class=""><span class="">공지사항</span></a>
					</div>
				</div>
				<div class="navbar-right">
					<div class="btn-movement">
						<c:choose>
							<c:when test="${login == null}">
								<a role="button" href="#" class="btn-login" data-toggle="modal" data-target="#loginModal">로그인</a>
								<a role="button" href="<c:url value='/user/userJoin' />" class="btn-sign-in">회원가입</a>
							</c:when>
							<c:otherwise>
								<a role="button" href="<c:url value='/user/userMypage' />" class="btn-mypage">마이페이지</a>
								<a role="button" href="<c:url value='/' />" class="btn-logout">로그아웃</a>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
			</div>				
		</div>
	</nav>
</header>

<!-- Modal -->
<div id="loginModal" class="modal fade">
	<div class="modal-dialog">
		<form method="post">
			<!-- Modal Content -->
			<div class="modal-content">
				<div class="modal-header-logo">
					<img class="logo" src="<c:url value='/img/logo.png' />" alt="modal-header-logo">
				</div>
				<div class="modal-body">
					<input type="text" placeholder="아이디 또는 이메일을 입력해주세요.">
					<br>
					<input type="password" placeholder="비밀번호를 입력해주세요.">
				</div>
				<div class="modal-sign-more">
					<a href="<c:url value='/user/userIdSearch' />">아이디 찾기</a>
					<a href="<c:url value='/user/userPwSearch' />">비밀번호 찾기</a>
					<a href="<c:url value='/user/userJoin' />">회원가입</a>
				</div>
				<div class="btn-modal-footer">
					<button type="submit" class="btn btn-success" data-dismiss="modal">로그인</button>
				</div>
			</div>
		</form>
	</div>
</div>

</body>
</html>