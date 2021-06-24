<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/resources/css/user_mypage_info.css" media="all" rel="Stylesheet" type="text/css" />
    <script type="text/javascript" src="resources/js/user.js" charset="utf-8"></script>
<title>예약목록(User)</title>
</head>
<body>
<%@ include file="../header.jsp"%>
    <center>
        <div class="mainbox">

        <fieldset class="main_a"> 홍길동님의 예약목록입니다.</fieldset>
        <h4>21/06/01</h4>
        <div class="info-table">
        <table  border="2" class="info" >
            <tr>
                <th class="title">숙소명</th>
                <td>서울스테이</td>
            </tr>
            <tr height="20">
                <th class="title">방 정보</th>
                <td>도미토리</td>
            </tr>
            <tr height="20">
                <th class="title">예약자</th>
                <td>홍길동</td>
            </tr>
            <tr height="20">
                <th class="title">체크인</th>
                <td><button><a href="#">21/06/23</a></button></td>
            </tr>
            <tr height="20">
                <th class="title">체크아웃</th>  
                <td>21/06/25</td>
            </tr>
            <tr height="20">
                <th class="title">위치</th>
                <td>서울 마포구 21-22 &nbsp;&nbsp;&nbsp;<button><a href="#">수정하기</a></button></td>
            </tr>
            <tr height="20">
                <th class="title">숙소연락처</th> 
                <td>010-1111-1111 &nbsp;&nbsp;&nbsp;<button><a href="#">수정하기</a></button></td>
            </tr>
        </table>
        </div>

        <div class="btn">
           <a href="javascript:showPopup()"><button class="btn-m" onclick="showPopup()">후기작성하기</button></a>
        </div>
    </div>
    </center>
    <%@ include file="../footer.jsp"%>
</body>
</html>