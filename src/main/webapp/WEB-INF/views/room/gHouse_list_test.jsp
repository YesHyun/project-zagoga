<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
<%--				for 문 사용해서 가져오기 넵//.....퓨ㅠㅠ					--%>
				<c:forEach items="${list}" var="li" varStatus="status">
				<c:choose >
					<c:when test="${status.count % 3 == 0}">
						<DIV>
							<ul class="product_list">
								<li>
									<dl>
										<dt>
											<a href="/ghouse/detail">${li.gh_name}</a>
										</dt>
										<dd class="img">
											<a href="/ghouse/detail"><img src="${pageContext.request.contextPath}/resources/gh_image${li.gh_image}" width="700px" height="570px" ></a>
<%--											<a href="#"><img src="${pageContext.request.contextPath}/resources/gh_image/test.png" width="300px" height="270px" ></a>--%>
<%--											<a href="#"><img src="/resources/gh_image/test.png" width="300px" height="270px" ></a>--%>
										</dd>
										<dd class="price">14,000</dd>
									</dl>
								</li>
							</ul>
						</DIV>
					</c:when>
					<c:otherwise>
						<DIV>
							<ul class="product_list">
								<li>
									<dl>
										<dt>
											<a href="#">${li.gh_name}</a>
										</dt>
										<dd class="img">
											<a href="#"><img src="${pageContext.request.contextPath}/resources/gh_image${li.gh_image}" width="700px" height="570px" ></a>
<%--											<a href="#"><img src="C:/gh_image/test.png" width="300px" height="270px" ></a>--%>
<%--											<a href="#"><img src="${pageContext.request.contextPath}/resources/gh_image/test.png" width="300px" height="270px" ></a>--%>
<%--											<a href="#"><img src="/resources/gh_image/test.png" width="300px" height="270px" ></a>--%>

										</dd>
										<dd class="price">13,000</dd>
									</dl>
								</li>
							</ul>
						</DIV>
					</c:otherwise>
				</c:choose>
				</c:forEach>
			</div>
		</center>
		</div>
		<%@ include file="../footer.jsp"%>
</body>
</html>