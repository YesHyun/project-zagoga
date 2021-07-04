<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.javalec.project_zagoga.dto.GhouseRoom" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게스트하우스 수정(host용)</title>
<link href="/resources/css/mypage_house_fix.css" media="all"
	rel="Stylesheet" type="text/css" />
</head>
<body>
	<%@ include file="../header.jsp"%>
	<form method="post" action="/ghouse/update">
		<div id="mainbox">
			<table>
				<h2>사업 등록 현황</h2>
				<tr>
					<td>상호명</td>
					<td><input type="text" value="${grList.get(0).gh_name}"></td>
				</tr>
				<tr>
					<td>사업위치</td>
					<td><input type="text" value="${grList.get(0).gh_addr1}"></td>
				</tr>
				<tr>
					<td>등록된 방 개수</td>
					<td><input type="text" value="${grList.size()}"></td>
				</tr>
				<tr>
					<td>기타 사항 및 소개글</td>
					<td><textarea cols="50" rows="10" name="${grList.get(0).gh_detail}>"></textarea></td>
				</tr>
			</table>
			<table id = "room_fix">
				<h2>등록된 방 현황</h2>
				<tr>
					<th>방 번호</th>
					<th>수용 인원</th>
					<th>상세보기</th>
				</tr>
				<c:forEach items="${grList}" var="gr" varStatus="status">
				<tr>
					<td><input name="r_no" value="${gr.r_no}" readonly></td>
					<td><input type="number" name="r_pmax" placeholder="${gr.r_pmax} 인실"></td>
					<td><button onclick="/room/getDetail/${gr.r_no}">상세 보기</button></td>
				</tr>
				</c:forEach>
			</table>
				<div id="button">
					<button type="submit">수정완료</button>
					<button onclick="history.go(-1)">취소</button>
				</div>
		</div>
	</form>
	<%@ include file="../footer.jsp"%>
</body>
</html>