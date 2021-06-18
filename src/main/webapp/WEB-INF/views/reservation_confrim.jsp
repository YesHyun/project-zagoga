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
<meta charset="euc-kr">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="resources/css/reservation_confrim.css" />
<title>Document</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<form>
		<div id = "mainbox">
		<table>
			<tr>
				<td width="130">주문번호:</td>
				<td><%=order_id%></td>
			</tr>
			<tr>
				<td width="130">작성자:</td>
				<td><%=customer_name%></td>
				<td width="130">연락처:</td>
				<td><%=tel%></td>
			</tr>
			<tr>
				<td width="130">인원:</td>
				<td><%=customer_number%></td>
				<td width="130">체크인:</td>
				<td><%=check_in%></td>
			</tr>
			<tr>
				<td width="130">체크 아웃:</td>
				<td><%=check_out%></td>
				<td width="130">총 숙박일:</td>
				<td>박 / 일</td>
			</tr>
			<tr>
				<td width="130">가격:</td>
				<td><%=rate%></td>
			</tr>
			<tr>
				<td width="130">기타 사항:</td>
				<td><%=etc%></td>
			</tr>
			<tr>
				<td><input type="submit" value="진행하기"> <input
					type="button" value="취소" onclick="location.href=''"></td>
			</tr>
		</table>
		</div>
	</form>
	<%@ include file="footer.jsp"%>
</body>
</html>