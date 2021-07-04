<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/resources/css/room_completion.css" />
<title>Insert title here</title>
</head>
<body>
<%@ include file="../header.jsp"%>
<div class="main_aaa">
    <h1>고객님의 예약이 신청되었습니다.</h1>
    <h3>확정까지 평균 소요 시간 <span class="red">10분 이내</span></h3>
<%--    <img src="/resources/img/work2.jpg">--%>

    <h2>업체에서 <span class="blue">예약을 확정하는 대로<br> ZAGOGA 마이페이지</span> 에서 알려드리겠습니다.</h2>

    <button onclick="location.href='/main'">확인</button>
</div>
<%@ include file="../footer.jsp"%>
</body>
</html>