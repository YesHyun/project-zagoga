
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="/resources/css/bookingList.css">
</head>
<body>
<%@ include file="../header.jsp"%>
<div class="total">
	<center>
		<div class="main">
			<%
				for(int i = 1; i<=9 ; i++){
			%>
			<%
				if(i % 3 ==0){
			%>
			<DIV>
				<ul class="product_list">
					<li>
						<dl>
							<dt>
								<a href="#">제주하늘펜션</a>
							</dt>
							<dd class="img">
								<a href="#"><img src="#" alt=""></a>
							</dd>
							<dd class="price">13,000</dd>
						</dl>
					</li>
				</ul>
			</DIV>
			<%
			}else{
			%>
			<DIV>
				<ul class="product_list">
					<li>
						<dl>
							<dt>
								<a href="#">제주하늘펜션</a>
							</dt>
							<dd class="img">
								<a href="#"><img src="#" alt=""></a>
							</dd>
							<dd class="price">13,000</dd>
						</dl>
					</li>
				</ul>
			</DIV>
			<%
					}
				}
			%>
		</div>
	</center>
</div>
<%--<%@ include file="../footer.jsp"%>--%>
</body>
</html>