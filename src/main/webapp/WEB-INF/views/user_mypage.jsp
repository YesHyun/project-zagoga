<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String order_id = "", customer_name = "", tel = "", etc = "";
int customer_number = 0, total_stay = 0, rate = 0;

Timestamp check_in = null, check_out = null;
%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="resources/css/header.css" />
<title>Document</title>

</head>
<body>
	<%@ include file="header.jsp"%>
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
                      <input type="button" value="정보수정" onclick="location.href='user_fix'"> &nbsp;&nbsp;&nbsp;
                      <input type="button" value="회원탈퇴" onclick="">
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
                      <input type="button" value="후기 작성" onclick="showPopup();">
                    </p>
                  </table>
                  </div>
            </div>
        </section>
	<%@ include file="footer.jsp"%>
</body>
</html>