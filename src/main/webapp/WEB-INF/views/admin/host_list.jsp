<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사업자 리스트(admin 용)</title>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/css/administration_list.css" />
</head>
<body>
	<%@ include file="../header.jsp" %>
	<div id="container">
		<div id="input-form">
		<hr>
			<h2>사업 등록 현황</h2>
			<hr>
			<p></p>
		사업자번호 :<input type="text" id="keyword">
		<select id = "keyword2">
		<option>승인</option>
		<option>비승인</option>
		<option>거절</option>
		</select>
		</div>
		<table id="user-table">
			<thead>
				<tr>
					<th>사업자 번호</th>
					<th>이름</th>
					<th>등록 일자</th>
					<th>승인 여부</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>123-456-78910</td>
					<td>홍길동</td>
					<td>2021-06-02</td>
					<td>승인</td>
					<td><button onclick="location.href='/admin/host_reading'">상세 내용 확인</button></td>
				</tr>
				<tr>
					<td>223-456-78910</td>
					<td>김길동</td>
					<td>2021-06-02</td>
					<td>승인</td>
					<td><button>상세 내용 확인</button></td>
				</tr>
				<tr>
					<td>323-456-78910</td>
					<td>이길동</td>
					<td>2021-06-02</td>
					<td>승인</td>
					<td><button>상세 내용 확인</button></td>
				</tr>
				<tr>
					<td>423-456-78910</td>
					<td>사길동</td>
					<td>2021-06-02</td>
					<td>승인</td>
					<td><button>상세 내용 확인</button></td>
				</tr>
				<tr>
					<td>523-456-78910</td>
					<td>오길동</td>
					<td>2021-06-02</td>
					<td>승인</td>
					<td><button>상세 내용 확인</button></td>
				</tr>
				<tr>
					<td>623-456-78910</td>
					<td>홍길동</td>
					<td>2021-06-02</td>
					<td>거절</td>
					<td><button>상세 내용 확인</button></td>
				</tr>
				<tr>
					<td>723-456-78910</td>
					<td>홍길동</td>
					<td>2021-06-02</td>
					<td>승인</td>
					<td><button>상세 내용 확인</button></td>
				</tr>
			</tbody>
		</table>
		<script>
			$("#keyword").keyup(function() {
								var k = $(this).val();
								$("#user-table > tbody > tr").hide();
								var temp = $("#user-table > tbody > tr > td:nth-child(1):contains('"+ k + "')");
								$(temp).parent().show();
							})
		</script>
	</div>
		<%@ include file="../footer.jsp" %>
</body>
</html>