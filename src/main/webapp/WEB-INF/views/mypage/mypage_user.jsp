<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="/resources/css/user_mypage.css" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<title>마이페이지(user용)</title>
</head>
<body>
	<%@ include file="../header.jsp"%>
	        <section>
            <div class="p-3 mb-2 bg-light text-dark">
              <div class="info">
                    <table class="mx-auto" style="min-width: 768px;">
                    <h5>개인정보</h5>
                    <hr>
                    <p>반갑습니다. 닉네임님</p>
                    <br>
                    <p>성명 : ㅁㅁㅁ</p>
                    <p>성별 : 없음</p>
                    <p>전화번호 : 000-0000-000</p>
                    <p>email : ads @adsd.com</p>
                    <p style="float:right">
                      <input type="button" value="수정 및 탈퇴" onclick="location.href='/user/mypage_user_info'"> &nbsp;&nbsp;&nbsp;
                    </p>
                    <br>
                  </table>
                  </div>
                  <div class="info">
                    <table class="mx-auto" style="min-width: 768px;">
                    <h5>예약정보</h5>
                    <hr>
                    <p>게스트하우스명</p>
                    <br>
                    <p>예약자 : ㅁㅇㅁ</p>
                    <p>사업자 : ㅁㅇㅁ</p>
                    <P>체크인 : </P>
                    <P>체크 아웃 :</P>
                    <p>위치 : 제주 서귀포시</p>
                    <p>사업자연락처: 000-0000-000</p>
                    <P style="text-align: right;"><small>예약취소시, 사업자에게 연락해주세요</small></P>
                    <br>
                    <p style="float: right;">
                      <input type="button" value="예약목록" onclick="location.href='user/mypage_user_booking'">
                    </p>
                  </table>
                  </div>
            </div>
        </section>
	<%@ include file="../footer.jsp"%>
</body>
</html>