
<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게스트하우스 정보 + 방 정보(user용)</title>
<%
	String GH_name = "111111", GH_image = "", GH_addr1 = "위치테스트", GH_addr2 = "";
String R_name = "", R_detail = "", R_image = "";
int R_pmin = 0, R_pmax = 0, R_fee = 0;
Timestamp B_in = null, B_out = null;
%>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css"
	type="text/css" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/css/room.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
	<script type="text/javascript" src="resources/js/guesthouse.js" charset="utf-8"></script>
</head>
<body>
	<%@ include file="../header.jsp"%>
	<section>
		<div class="p-3 mb-2 bg-light text-dark">
			<div class="mx-auto" style="width: 650px;">
				<!-- <img src="<%=GH_image%>" width="650px" height="500px" alt="대표사진"> -->
				<img src="../resources/img/busan.jpg" width="650px" height="500px" alt="대표사진">
				<p>대표사진</p>
				<p>
				<h3><%=GH_name%></h3>
				</p>
				<p class="star_rating">
					<a href="#" class="on">★</a>
					<a href="#" class="on">★</a>
					<a href="#" class="on">★</a> 
					<a href="#">★</a>
					<a href="#">★</a>
				</p>
				<p>
					위치
					<%=GH_addr1%></p>
				<div class="room_date">
					<form>
						<center>
							<span>체크인</span><input type="text" id="startDate" name="B_in">
							<span>체크아웃</span><input type="text" id="endDate" name="B_out">
						</center>
					</form>
				</div>
				<br>
				<div style="width: 650px;">
					<table style="width: 650px;">
						<%
							for (int i = 0; i < 5; i++) {
							//리스트 추가
						%>
						<tr>
							<td><a href="room_detail"
								style="text-decoration-line: none; color: black;">
								 <img src="../resources/img/jeju.jpg" width="300px" style="float: left;">
								 <!-- <img src="<%=R_image%>" width="300px" style="float: left;"> -->
									<p>
									<h6><%=R_name%></h6>
									</p> <br>
									<p>
										기준
										<%=R_pmin%>명 / 최대
										<%=R_pmax%>명
									</p>
									<p>
										침대
										<%=R_pmax%></p> <br> <br> <br>
									<p style="text-align: right;">
										1박
										<%=R_fee%>원
									</p>
									<p>
										기타사항
										<%=R_detail%></p>
							</a></td>
						</tr>
						<%
							}
						%>
					</table>
					<hr>
					<div>
						<table class="table table-stripped">
							<tr>
								<th>평점</th>
								<!-- 평점 -->
								<th>별명</th>
								<th>내용</th>
							</tr>
							<tr>
								<td>★</td>
								<td>익명</td>
								<td>내용123</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
		</div>
	</section>
	<%@ include file="../footer.jsp"%>
</body>
</html>

<!--
https://cloudstudying.kr/lectures/236 
스프링으로 만든 별평점
 참고하기
-->