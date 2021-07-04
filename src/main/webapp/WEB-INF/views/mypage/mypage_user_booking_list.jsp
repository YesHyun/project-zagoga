<%--
  Created by IntelliJ IDEA.
  User: 박지은
  Date: 2021-07-02
  Time: 오전 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="/resources/css/mypage_user_booking_list.css">
    <title>Title</title>
</head>
<body>
<%@ include file="../header.jsp"%>
  <h1 class="main_title">홍길동 님의 예약내역리스트</h1>
<div>
    <%
      for(int i = 1; i<=8 ; i++){
    %>
<ul class="used_list" >
  <div>
  <li class="card_item">
    <div class="card_header">
      <!-- <div class="service">
          <img class="ico_images" src="images/bed.png" width="100">
      </div> -->
      <a href="/mypage/mypage_user_booking_detail" class="service_link">
        <div class="title">안녕제주도</div>
        <div class="info_box">
          <span class="info">21. 6. 5 ~ 21. 6. 6 </span>
          <span class="info"> <span class="aa">||</span> 1박 2일</span>
        </div>
      </a>
    </div>
    <div class="card_body">
      <a href="/mypage/mypage_user_booking_detail" class="upper_box">
        <div class="review_area">
          <div class="review_header">
            <div class="text">예약완료</div>
            <div class="text"></div>
          </div>
        </div>
      </a>
      <a class="lower_box" href="/mypage/mypage_user_booking_detail">
        <div class="info">
          <div class="title_">도미토리</div>
          <div class="desc">상세보기</div>
        </div>
        <div class="price">
          "결제 55,000 원"
        </div>
      </a>
    </div>
  </li>
  </div>
</ul>
    <%
      }
    %>
</div>
<%--<%@ include file="../footer.jsp"%>--%>
</body>
</html>
