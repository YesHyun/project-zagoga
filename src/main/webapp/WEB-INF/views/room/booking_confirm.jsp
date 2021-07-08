<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/resources/css/room_completion.css" />
<title>Document</title>
</head>
<body>
	<%@ include file="../header.jsp"%>
<%--        <c:forEach items="users" var="users" varStatus="status">--%>

<%--        </c:forEach>--%>
	        <div class="mainbox">
            <h1>고객님의 예약정보를 확인해주세요!</h1>
            <br>
<%--            <fieldset class="main_a"> 예약번호 : ${Info.b_no}</fieldset>--%>
            <br>
            <div class="img-table">
                <table>
                    <tr>
                        <td><img src="${pageContext.request.contextPath}/resources/gh_image/${Info.gh_image}" class="room"></td>
                        <td><h2>${Info.gh_name}</h2></td>
                    </tr>
                </table>
            </div>
            <br>
            <h4><img src="/resources/img/placeholder.png" class="addr">${Info.gh_addr1}, ${Info.gh_addr2}</h4>
            <br>
            <div class="info-table">
        <form name="form" action="/book/booking/${Info.u_no},${Info.r_no}" method="post">
            <table  border="2" class="info" >
                <tr height="20" >
                    <th class="title">연락처</th>
                    <th class="title">예약자</th>
                    <th class="title">인원</th>
                    <th class="title">체크인</th>
                    <th class="title">체크아웃</th>
                </tr>
                <tr height="20">
                    <td>${Info.u_phone}</td>
                    <td>${Info.u_nick}</td>
                    <td><input type="text" value="${Info.b_pno}" name="b_pno" style="border:none" size="1%" readonly></td>
                    <td><input type="date" value="${Info.b_in}" name="b_in" style="border:none" size="5%" readonly></td>
                    <td><input type="date" value="${Info.b_out}" name="b_out" style="border:none" size="5%" readonly></td>
                </tr>
            </table>
            </div>
            <div class="price-table">
            <table  border="2" class="price">
                <tr>
                    <th class="title" colspan="2">결제요금내역</th>
                </tr>
                <tr>
                    <td>${Info.r_name}</td>
                    <td>₩${Info.r_fee}</td>
                </tr>
                <tr>
                    <th class="title" colspan="2">금액 (전체 투숙객)</th>
                </tr>
                <tr>
<%--                                                            곱하기 더하기 어떻게해야하는지 찾기            --%>
                    <td colspan="2" class="total_price"><strong>₩30,000</strong></td>
                </tr>
            </table>
            </div>
            <br>
            <div class="btn">
              <button type="submit" class="btn-m">에약하기</button>
              <button class="btn-m" onclick="location.href='#'">취소</button>
            </div>
        </form>
        </div>
</body>
</html>
<%@ include file="../footer.jsp"%>