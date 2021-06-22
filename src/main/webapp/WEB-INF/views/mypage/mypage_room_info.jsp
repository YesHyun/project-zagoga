<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방 정보 수정(host용)</title>
<link href="resources/css/mypage_room_fix.css" media="all"
	rel="Stylesheet" type="text/css" />
</head>
<body>
	<%@ include file="../header.jsp"%>
	<form>
		<div id="mainbox">
			<table>
				<h2>방 등록 현황</h2>
				<tr>
					<td>방 번호</td>
					<td><input type="text" value="1"></td>
				</tr>
				<tr>
					<td>인원수</td>
					<td><input type="text" value="16인실"></td>
				</tr>
				<tr>
					<td>기타 사항 및 소개글</td>
					<td><textarea cols="50" rows="10" name="detail"></textarea></td>
				</tr>
				<tr>
					<td>등록된 이미지 파일</td>
					<td></td>
				</tr>
			</table>
				<div id="button">
					<button>수정완료</button>
					<button>회원탈퇴</button>
					<button onclick="history.go(-1)">취소</button>
				</div>
		</div>
	</form>
	<%@ include file="../footer.jsp"%>
</body>
</html>