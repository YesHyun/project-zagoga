<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
%>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/resources/css/header.css" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<header>
		<h2>
			<a href="/main">Zagoga</a>
		</h2>
		<div class="imgbox"></div>
		<div class="navbox">
			<div class="dropdown">
				<button class="dropbtn" onclick="location.href='/main'">HOME</button>
			</div>
			<div class="dropdown">
				<button class="dropbtn">예약 하기</button>
				<div class="dropdown-content">
					<a href="#">전체 보기</a> <a href="#">서울 특별시</a> <a href="#">부산 광역시</a>
					<a href="#">인천 광역시</a> <a href="#">대전 광역시</a> <a href="#">대구광역시</a> 
					<a href="#">광주 광역시</a> <a href="#">경기도</a> <a href="#">경상도</a>
					<a href="#">강원도</a> <a href="#">충청도</a> <a href="#">전라도</a>
				</div>
			</div>
			<c:set var="member_type" value="${user.u_role}" />
			<c:choose>
			<c:when test = "${member_type eq 'HOST'}">
			<div class="dropdown">
				<button class="dropbtn" onclick="location.href='/user/mypage_user'">마이 페이지</button>
				<div class="dropdown-content">
           		 <a href="mypage_host_customerList">예약자 조회</a>
           		 <a href="mypage_host_info">회원 정보 변경</a>
           		 <a href="mypage_house_info">게스트하우스 정보 변경</a>
         		 </div>`
         		 </div>
			</c:when>
			<c:when test="${member_type eq 'USER' }">
			<div class="dropdown">
				<button class="dropbtn" onclick="location.href='/host/mypage_host'">마이 페이지</button>
				<div class="dropdown-content">
					<a href="/user/mypage_user_info">회원정보 변경</a> 
					<a href="/user/mypage_user_booking">예약 조회</a>
				</div>
			</div>
			</c:when>			
			</c:choose>
			<c:set var="session" value="${user }" />
			<c:choose>
				<c:when test="${empty session }">
					<div class="dropdown">
						<button class="dropbtn" onclick="location.href='/login'">login</button>
					</div>
				</c:when>
				<c:when test="${!empty session }">
					<div class="dropdown">
						<button class="dropbtn" onclick="location.href='/logout'">logout</button>
					</div>
				</c:when>
			</c:choose>
		</div>
		<script>
			function check(id) {
				var win = window.open('mypage_check?id=' + id, '','width=400px,height=200px')
			}
		</script>
	</header>
	<!-- 공간 비우기용-->
	<div class="space"></div>
</body>
</html>