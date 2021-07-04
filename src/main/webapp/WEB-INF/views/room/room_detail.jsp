<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.Timestamp"%>
<%@ page import="com.javalec.project_zagoga.dto.Ghouse" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방 정보(user용)</title>
<%
    Ghouse ghouse = null;
	String GH_name ="111111", GH_image ="",GH_addr1 ="위치테스트", GH_addr2 ="";
	String R_name="",R_detail="",R_image="";
	int R_pmin=0, R_pmax=0, R_fee=0;
	Timestamp B_in =null,B_out=null;
%>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />  
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/css/room.css" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
	<script type="text/javascript" src="resources/js/guesthouse.js" charset="utf-8"></script>
</head>
<body>
	<%@ include file="../header.jsp" %>
    <section>
<%--        <c:set value="${getDetail}" var="dt">--%>
<%--        <c:forEach items="${getDetail}" var="dt" varStatus="status">--%>
        <div class="p-3 mb-2 bg-light text-dark">
            <div class="mx-auto" style="width: 650px;">
        <c:if test="${getDetail.size() != 0}">
                <h3>${getDetail.get(0).r_name}</h3>
<%--                <p><%=ghouse.getGh_name()%></p>--%>
                <br>
                <p>기준 인원 ${getDetail.get(0).r_pmin} (최대: ${getDetail.get(0).r_pmax})</p>
            <c:forEach items="${getDetail}" var="dt" varStatus="status">
                <p><img src="${pageContext.request.contextPath}/resources/rooms_image/${dt.i_name}" width="650px"></p>
            </c:forEach>
        </c:if>
                <div class="room_date">
                      <form>
                          <center>
                              <span>체크인</span><input type="text" id="startDate" name="B_in">
                              <span>체크아웃</span><input type="text" id="endDate" name="B_out" >
                          </center>
                      </form>
                     </div>
                <div class="room">
                    <p style="font-size: smaller;">
                        체크인: 15:00~<br>
                        체크아웃 : ~ 12:00
                    </p>
                    <br>
                    <p style="text-align: right;">
                        가격<br>
                        ${getDetail.get(0).r_fee} 원
                    </p>
                </div>
                <div class="room_spec">
                    <p>기본 정보</p>
                    <ul>
                        <li>공동으로 사용하는 공간인 만큼, 이용규칙을 준수해주세요</li>
                        <li>기준인원 초과시, 현장에서 추가 요금이 발생할 수 있습니다.</li>
                        <li>음식 조리 및 바베큐는 불가 하지만 1층에서 무료 조식이 제공됩니다.<br>(오전 9:00 ~ 9:30)</li>
                        <li>13세 이하 영유아와 애견 출입은 불가합니다.</li>
                        <li>업체의 시설물의 훼손, 분실에 대한 책임은 본인에게 있습니다.</li>
                        <li>객실 내 흡연은 금지입니다. 지정장소를 이용바랍니다.</li>
                        <li>개인용품 보관에 관한 책임은 본인에게 있습니다.</li>
                    </ul>
                    <hr>
                    <p>예약공지</p>
                    <ul>
                        <li>당일예약은 특성상 환불 및 취소가 불가합니다.</li>
                        <li>체크인은 22:00까지 가능합니다. 22:00이후 입실이 불가하며,<br>
                             이 경우, 취소/환불은 불가합니다.</li>
                        <li>객실요금은 기준인원에 따라 다르며, 파티룸 등 특수한 객실의 경우,<br>
                             직접 입실 인원 확인이 필요합니다.</li>
                        <li>미성년자의 입실 가능여부는 제한이 될 수 있으니, 전화로 문의해주세요.</li>
                        <li>미성년자 혼숙예약으로 인해 발생하는 입실 거부에 대해서는 취소/환불이 불가합니다.</li>
                        <li>게스트하우스의 사정에 의한 취소 발생 시 100% 환불 처리 됩니다.</li>
                    </ul>
                    <hr>
                    <p>취소 규정</p>
                    <ul>
                        <li>취소 및 환불 불가</li>
                        <li>상세한 취소 규정은 <a href="room_cancel" style="text-decoration: none">자세히보기</a>에서 확인하실 수 있습니다. </li>
                    </ul>
                    <input type="button" value="예약하기" class="room_spec" onclick="location.href='/user/booking_confirm'">
                </div>
            </div>
        </div>
    </section>
 	<%@ include file="../footer.jsp" %>
</body>
</html>