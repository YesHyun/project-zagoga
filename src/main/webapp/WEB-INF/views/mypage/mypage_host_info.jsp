<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 변경 (host용)</title>
<link href="/resources/css/mypage_regist_business.css" media="all"
	rel="Stylesheet" type="text/css" />
	//JS처리하기
</head>
<body>
	<%@ include file="../header.jsp"%>
	<div id="mainbox">
	<h2>회원 정보 변경 (사업자)</h2>
		<table>
			<tr>
				<td>사업자 번호</td>
				<td><input type="text" value="123-456-78910" disabled></td>
			</tr>
			<tr>
				<td>사업자 이름</td>
				<td><input type="text" value="홍길동"></td>
			</tr>
			<tr>
				<td>전화 번호</td>
				<td><input type="text" value="010-1234-5678"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" value="test" disabled></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password"></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td><input type="password"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" value="test@google.com"></td>
			</tr>
		</table>
		<div id = "button">
			<button>수정완료</button>
			<button onclick="history.go(-1)">취소</button>
		</div>
	</div>
	<%@ include file="../footer.jsp"%>
</body>
</html>