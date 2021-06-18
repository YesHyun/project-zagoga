<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/mypage_booking.css" media="all" rel="Stylesheet" type="text/css" />
</head>
<body>
<%@ include file="header.jsp"%>
	<form>
	<div id = "mainbox">
		<table>
		<h2>예약 내역</h2>
			<tr>
				<th>이름</th>
				<th>전화번호</th>
				<th>예약날짜</th>
				<th>승인여부</th>
				<th>입금여부</th>
			</tr>
			<tr>
				<td>홍길동</td>
				<td>010-1234-5678</td>
				<td>2012/06/11~2012/06/12</td>
				<td>승인</td>
				<td>입금완료</td>
			</tr>
		</table>
	</div>
	</form>
<%@ include file="footer.jsp"%>
</body>
</html>