<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저 리스트(admin 용)</title>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/css/administration_list.css" />
</head>
<body>
	<%@ include file="../header.jsp" %>
	<div id="container">
		<div id="input-form">
		<hr>
			<h2>유저 목록</h2>
			<hr>
			<p></p>
		유저 전화 번호 :<input type="text" id="keyword">
		</div>
		<table id="user-table">
			<thead>
				<tr>
					<th>이름</th>
					<th>지역</th>
					<th>전화 번호</th>
					<th>유저 구분</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>홍길동</td>
					<td>부산광역시</td>
					<td>010-1234-5678</td>
					<td>일반 유저</td>
				</tr>
				<tr>
					<td>김길동</td>
					<td>대구광역시</td>
					<td>010-0000-5678</td>
					<td>블랙 리스트</td>
				</tr>
				<tr>
					<td>홍길동</td>
					<td>부산광역시</td>
					<td>010-1234-5678</td>
					<td>일반 유저</td>
				</tr>
				<tr>
					<td>김길동</td>
					<td>대구광역시</td>
					<td>010-0000-5678</td>
					<td>블랙 리스트</td>
				</tr>
				<tr>
					<td>홍길동</td>
					<td>부산광역시</td>
					<td>010-1234-5678</td>
					<td>일반 유저</td>
				</tr>
				<tr>
					<td>김길동</td>
					<td>대구광역시</td>
					<td>010-0000-5678</td>
					<td>블랙 리스트</td>
				</tr>
			</tbody>
		</table>
		<script>
			$("#keyword").keyup(function() {
								var k = $(this).val();
								$("#user-table > tbody > tr").hide();
								var temp = $("#user-table > tbody > tr > td:nth-child(3):contains('"+ k + "')");
								$(temp).parent().show();
							})
		</script>
	</div>
		<%@ include file="../footer.jsp" %>
</body>
</html>