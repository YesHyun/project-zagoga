<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="resources/css/user_mypage.css" />
	<script type="text/javascript" src="resources/js/user.js" charset="utf-8"></script>
<title>마이페이지(host용)</title>
</head>
<body>
	<%@ include file="../header.jsp"%>
	        <section>
            <div class="p-3 mb-2 bg-light text-dark">
              <div class="info">
                    <h5>개인정보</h5>
                    <hr>
                    <p>반갑습니다. 닉네임님</p>
                    <br>
                    <p>성명 : ㅁㅁㅁ</p>
                    <p>성별 : 없음</p>
                    <p>전화번호 : 000-0000-000</p>
                    <p>email : ads @adsd.com</p>
                    <p>사업자 번호 : 000-000-0000</p>
                    <p style="float:right">
                      <input type="button" value="정보수정" onclick="location.href='mypage_host_info'"> &nbsp;&nbsp;&nbsp;
                      <input type="button" value="회원탈퇴" onclick="">
                    </p>
                  </div>
                  <div class="info">
                    <h5>사업장 정보</h5>
                    <hr>
                    <p>게스트하우스명</p>
                    <br>
                    <p>규모 : ㅁㅇㅁ</p>
                    <p>위치 : 제주 서귀포시</p>
                    <p>등록 연락처: 000-0000-000</p>
                    <br>
                    <p style="float: right;">
                      <input type="button" value="수정하기" onclick="location.href='mypage_house_info'">
                    </p>
                  </div>
            </div>
        </section>
	<%@ include file="../footer.jsp"%>
</body>
</html>