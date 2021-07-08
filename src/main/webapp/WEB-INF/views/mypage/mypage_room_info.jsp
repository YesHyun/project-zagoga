<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방 정보 수정(host용)</title>
<link href="/resources/css/mypage_room_info.css" media="all"
	rel="Stylesheet" type="text/css" />
	<script src="/resources/js/mypage_room_info.js"></script>
</head>
<body>
	<%@ include file="../header.jsp"%>
	<form name="form" action="/room/update" method="post">
		<div id="mainbox">
			<table>
				<h2>방 등록 현황</h2>

				<tr>
					<td>방 번호</td>
					<td><input type="text" value="${room.get(0).r_no}" name="r_no" readonly></td>
				</tr>
				<tr>
					<td>방 이름</td>
					<td><input type="text" value="${room.get(0).r_name}" name="r_name"></td>
				</tr>
				<tr>
					<td>숙박비</td>
					<td><input type="text" value="${room.get(0).r_fee}" name="r_fee"></td>
				</tr>
				<tr>
					<td>최저 인원수</td>
					<td><input type="text" value="${room.get(0).r_pmin}" name="r_pmin"></td>
				</tr>
				<tr>
					<td>최대 인원수</td>
					<td><input type="text" value="${room.get(0).r_pmax}" name="r_pmax"></td>
				</tr>
				<tr>
					<td>기타 사항 및 소개글</td>
<%--					<td><input type="text" value="${room.get(0).r_detail}" name="r_detail" width="300px" height="600px"></td>--%>
					<td><textarea name="r_detail" cols="50" rows="10">${room.get(0).r_detail}</textarea></td>
				</tr>

					<td>등록된 이미지 파일<br>
					<c:forEach items="${room}" var="room" varStatus="status">
					<img src="${pageContext.request.contextPath}/resources/rooms_image/${room.i_name}">
					</c:forEach>
					</td>
			</table>
			<input type="hidden" value="${room.get(0).r_ghno}" name="r_ghno" readonly>
				<div id="button">
					<button type ="submit">수정완료</button>
					<button type="button" onclick="location.href='/room/delete/${room.get(0).r_ghno},${room.get(0).r_no}'" >삭제하기</button>
					<button onclick="history.go(-1)">취소</button>
				</div>
		</div>
	</form>
	<%@ include file="../footer.jsp"%>
</body>
</html>