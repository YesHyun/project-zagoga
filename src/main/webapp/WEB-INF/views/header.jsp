<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
String path= request.getContextPath();
%>
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/header.css" />
</head>
<body>
<header>
	<h2><a href="/main">Zagoga</a></h2>
	<div class = "imgbox">
	</div>
      <div class="navbox">
        <div class="dropdown">
          <button class="dropbtn" onclick = "location.href='/main'">HOME</button>
        </div>
        <div class="dropdown">
          <button class="dropbtn">예약 하기</button>
          <div class="dropdown-content">
            <a href="#">서울 특별시</a>
            <a href="#">부산 광역시</a>
            <a href="#">인천 광역시</a>
            <a href="#">대전 광역시</a>
            <a href="#">대구 광역시</a>
            <a href="#">광주 광역시</a>
            <a href="#">경기도</a>
            <a href="#">경상도</a>
            <a href="#">강원도</a>
            <a href="#">충청도</a>
            <a href="#">전라도</a>
          </div>
        </div>
        <!-- 세션에 따라 버튼 변경 추가 필요 -->
        <div class="dropdown">
          <button class="dropbtn" onclick="location.href='/user/mypage_user'">마이 페이지</button>
<!--  
			호스트용 마이페이지 세션 활성후 추가 예정
         <button class="dropbtn" onclick="location.href='/host/mypage_host'">마이 페이지</button>
          -->
          <div class="dropdown-content">
            <a href="/user/mypage_user_info">회원정보 변경</a>
            <a href="/user/mypage_user_booking">예약 조회</a>
          </div>
      <!--     세션 생성후 추가 예정
      <div class="dropdown-content">
            <a href="mypage_host_customerList">예약자 조회</a>
            <a href="mypage_host_info">회원 정보 변경</a>
            <a href="mypage_house_info">게스트하우스 정보 변경</a>
          </div> 
          -->
        </div>
        <!-- 세션에 따라 버튼 변경 추가 필요 -->
        <div class="dropdown">
          <button class="dropbtn" onclick="location.href='/login'">login</button>
        </div>
      </div>
</header>
    <!-- 공간 비우기용-->
    <div class = "space"></div>
</body>
</html>