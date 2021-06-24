<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/bookingList.css">
</head>
<body>
	<%@ include file="../header.jsp"%>
	<div class="total">
		<center>
			<div class="main">
				<c:forEach items="${list}" var="li">

				<DIV>
				<ul class="product_list">
					<li>
						<dl>
							<dt>
								<a href="#">${li.gh_name}</a>
							</dt>
							<dd class="img">
								<a href="#"><img src="#" alt=""></a>
							</dd>
							<c:forEach items="${lowfee}" var="lf">
							<dd class="price">${lf.lowFee}</dd>
							</c:forEach>
						</dl>
					</li>
				</ul>
				</DIV>


				</c:forEach>




			</div>
		</center>
		</div>
		<%@ include file="../footer.jsp"%>
</body>
</html>