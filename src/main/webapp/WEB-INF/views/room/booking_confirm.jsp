<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String order_id = "", customer_name = "", tel = "", etc = "";
int customer_number = 0, total_stay = 0, rate = 0;

Timestamp check_in = null, check_out = null;
%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="resources/css/reservation_confrim.css" />
<title>Document</title>
</head>
<body>
	<%@ include file="../header.jsp"%>
	<center>
	        <div class="mainbox">
            <h1>고객님의 예약정보를 확인해주세요!</h1>
            <br>
            <fieldset class="main_a"> 예약번호 : 1111-115444</fieldset>
            <br>
            <div class="img-table">
                <table>
                    <tr>
                        <td><img src="resources/img/room1.jpg" class="room"></td>
                        <td><h2>서울스테이 역삼</h2></td>
                    </tr>
                </table>
            </div>
            <br>
            <h4><img src="resources/img/placeholder.png" class="addr">서울,연주로517</h4>
            <br>
            <div class="info-table">
            <table  border="2" class="info" >
                <tr height="20" >
                    <th class="title">연락처</th>
                    <th class="title">예약자</th>
                    <th class="title">인원</th>
                    <th class="title">체크인</th>
                    <th class="title">체크아웃</th>  
                </tr>
                <tr height="20">
                    <td>010-1234-4567</td>
                    <td>박지은</td>
                    <td>2</td>
                    <td>21/06/23</td>
                    <td>21/06/25</td>
                </tr>
            </table>
            </div>
            <div class="price-table">
            <table  border="2" class="price">
                <tr>
                    <th class="title" colspan="2">결제요금내역</th>
                </tr>
                <tr>
                    <td>스탠다드트윈룸</td>
                    <td>₩15,000</td>
                </tr>
                <tr>
                    <th class="title" colspan="2">금액 (전체 투숙객)</th>
                </tr>
                <tr>
                    <td colspan="2" class="total_price"><strong>₩30,000</strong></td>
                </tr>
            </table>
            </div>
            <br>
            <div class="btn">
               <a href="#"><button class="btn-m">확인</button></a>
               <a href="#"><button class="btn-m">취소</button></a>
            </div>
        </div>
        </center>
	 <%@ include file="../footer.jsp"%>
</body>
</html>