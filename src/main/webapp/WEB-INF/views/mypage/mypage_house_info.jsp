<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게스트하우스 수정(host용)</title>
<link href="resources/css/mypage_house_fix.css" media="all"
	rel="Stylesheet" type="text/css" />
</head>
<body>
	<%@ include file="../header.jsp"%>
	<form>
		<div id="mainbox">
			<table>
				<h2>사업 등록 현황</h2>
				<tr>
					<td>상호명</td>
					<td><input type="text" value="부산게스트 하우스"></td>
				</tr>
				<tr>
					<td>사업위치</td>
					<td><input type="text" value="부산"></td>
				</tr>
				<tr>
					<td>등록된 방 개수</td>
					<td><input type="text" value="5"></td>
				</tr>
				<tr>
					<td>기타 사항 및 소개글</td>
					<td><textarea cols="50" rows="10" name="detail"></textarea></td>
				</tr>
			</table>
			<table id = "room_fix">
				<h2>등록된 방 현황</h2>
				<tr>
					<th>방 번호</th>
					<th>수용 인원</th>
					<th>상세보기</th>
				</tr>
				<tr>
					<td>1</td>
					<td>2인실</td>
					<td><button>정보 수정</button></td>
				</tr>
				<tr>
					<td>2</td>
					<td>4인실</td>
					<td><button>정보 수정</button></td>
				</tr>
				<tr>
					<td>3</td>
					<td>8인실</td>
					<td><button>정보 수정</button></td>
				</tr>
				<tr>
					<td>4</td>
					<td>16인실</td>
					<td><button>정보 수정</button></td>
				</tr>
			</table>
				<div id="button">
					<button>수정완료</button>
					<button onclick="history.go(-1)">취소</button>
				</div>
		</div>
	</form>
	<%@ include file="../footer.jsp"%>
</body>
</html>