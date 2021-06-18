<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/administration_reading.css" />
</head>
<body>
	<%@ include file="header.jsp"%>
	<div class="mainbox">
		<div class="imgbox">
			<img src="resources/img/busan.jpg">
		</div>
		<div class = "table">
		<h2>사업자 정보</h2>
			<table>
				<tr>
					<td>사업자 이름: </td>
					<td></td>
					<hr>
				</tr>
				<tr>
					<td>사업자 등록번호 : </td>
					<td></td>
				</tr>
				<tr>
					<td>사업자 전화번호 : </td>
					<td></td>
				</tr>
				<tr>
					<td>사업 위치 : </td>
					<td></td>
				</tr>
				<tr>
					<td>기타 특이 사항 : </td>
					<td></td>
				</tr>
				<tr>
					<td><button>승인</button></td>
					<td><button>승인해제</button></td>
				</tr>
			</table>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>