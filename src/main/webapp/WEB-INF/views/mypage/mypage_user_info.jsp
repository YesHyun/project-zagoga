<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/resources/css/user_mypage_info.css" media="all" rel="Stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
<%@ include file="../header.jsp"%>
    <center>
        <div class="mainbox">
        <fieldset class="main_a"> ${user.u_name}님의 소중한 개인정보입니다.</fieldset>

        <div class="info-table">
        <table  border="2" class="info" >
            <tr>
                <th class="title">이름</th>
                <td>${user.u_name}</td>
            </tr>
            <tr height="20">
                <th class="title">사용자ID</th>
                <td>${user.u_mail}</td>
            </tr>
            <tr height="20">
                <th class="title">생년월일</th>
                <td>9999년 11 월 22 일</td>
            </tr>
            <tr height="20">
                <th class="title">비밀번호</th>
                <td><button><a href="#">비밀번호수정</a></button></td>
            </tr>
<%--            <tr height="20">--%>
<%--                <th class="title">E-mail</th>  --%>
<%--                <td>aaa@naver.com</td>--%>
<%--            </tr>--%>
            <tr height="20">
                <th class="title">전화번호</th>
                <td>${user.u_phone}<button><a href="#">수정하기</a></button></td>
            </tr>
            <tr height="20">
                <th class="title">주소</th> 
                <td>부산광역시 수영구 &nbsp;&nbsp;&nbsp;<button><a href="#">수정하기</a></button></td>
            </tr>
            <tr height="20">
                <th class="title">상세주소</th> 
                <td>101-111호</td>
            </tr>
        </table>
        </div>

        <div class="btn">
           <a href="#"><button class="btn-m">수정완료</button></a>
           <a href="#"><button class="btn-m">탈퇴하기</button></a>
        </div>
    </div>
    </center>
    <%@ include file="../footer.jsp"%>
</body>
</html>