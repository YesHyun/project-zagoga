<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 회원가입(user용)</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script type="text/javascript" src="/resources/js/user.js" charset="utf-8"></script>
</head>
<body>
<%@ include file="../header.jsp" %>
	<center>
		<form action="/register/user" method="post">
		<div class="container">
			<table class="table table-hover">
				<tr>
					<td>이름</td>
					<td><input type="text" name="u_name" required="required">
				</tr>
				<tr>
					<td>닉네임</td>
					<td><input type="text" name="u_nick" required="required">
				</tr>
				<tr>
					<td>주민번호</td>
					<td><input type="text" name="u_jumin" required="required"> <!-- 주민등록번호 중간에 - 추가 -->
				</tr>
                <tr>
                    <td>이메일 : </td>
                    <td><input type="text" name="u_mail" required="required">
                </tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="u_pwd" required="required">
				</tr>
				<tr>
					<td>비밀번호 확인</td>
					<td><input type="password" name="u_pwd2" required="required">
				</tr>
                <tr>
                    <td>주소 : </td>
                    <td>
                    	<input type="text" id="sample6_address" name="u_addr1" placeholder="주소" readonly>&nbsp;&nbsp;
                    	<input type="button" onclick="sample6_execDaumPostcode()" value="주소검색"><br>
						<input type="text" id="sample6_detailAddress" name="u_addr2" placeholder="상세주소">
                    </td>
                </tr>
				<tr>
					<td>휴대폰 번호</td>
					<td><input type="text" name="u_phone" onkeyup="inputPhoneNumber(this);" maxlength="13" required="required">
				</tr>
				<tr align="center">
					<td colspan="4">
						<input type="submit" value="등록">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="button" value="취소" onclick="location.href='/main'">
					</td>
				</tr>
			</table>
			</div>
		</form>
	</center>
	<%@ include file="../footer.jsp" %>
</body>
</html>