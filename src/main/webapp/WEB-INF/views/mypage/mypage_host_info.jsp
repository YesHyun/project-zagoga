<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 변경 (host용)</title>
<link href="/resources/css/mypage_host_info.css" media="all"
	rel="Stylesheet" type="text/css" />
	  <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script src="/resources/js/mypage_host_info.js"></script>
</head>
<body>
	<%@ include file="../header.jsp"%>
	<form>
	<div id="mainbox">
	<h2>회원 정보 변경 (사업자)</h2>
		<table>
			<tr>
				<td>사업자 번호</td>
				<td><input type="text" id = "businessNumber" value="123-456-78910" disabled></td>
			</tr>
			<tr>
				<td>사업자 이름</td>
				<td><input type="text" id ="name" value="홍길동"></td>
			</tr>
			<tr>
				<td>전화 번호</td>
				<td><input type="text" id = "phoneNumber" value="010-1234-5678"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" id = "id" value="test" disabled></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input id = "pw" type="password"></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td><input id = "pw2" type="password"></td>
				<td><button onclick = "">확인하기</button></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" id = "email" value="test@google.com" disabled></td>
			</tr>
		</table>
		<div id = "button">
			<button>수정완료</button>
			<button onclick="history.go(-1)">취소</button>
		</div>
	</div>
	</form>
	<%@ include file="../footer.jsp"%>
</body>
</html>