<%@ page import="com.javalec.project_zagoga.dto.Users" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
    <script src="/resources/js/data.js"></script>
    <script src="/resources/js/guesthouse.js"></script>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main2.css">
 <script type = "text/javascript">
 		$(document).ready(function () {
            $.datepicker.setDefaults($.datepicker.regional['ko']); 
            $( "#startDate" ).datepicker({
                 changeMonth: true, 
                 changeYear: true,
                 nextText: '다음 달',
                 prevText: '이전 달', 
                 dayNames: ['일요일', '월요일', '화요일', '수요일', '목요일', '금요일', '토요일'],
                 dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'], 
                 monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
                 monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
                 dateFormat: "yymmdd",
                 maxDate: 100,                       // 선택할수있는 최소날짜, ( 0 : 오늘 이후 날짜 선택 불가)
                 onClose: function( selectedDate ) {    
                      //시작일(startDate) datepicker가 닫힐때
                      //종료일(endDate)의 선택할수있는 최소 날짜(minDate)를 선택한 시작일로 지정
                     $("#endDate").datepicker( "option", "minDate", selectedDate );
                 }    
 
            });
            $( "#endDate" ).datepicker({
                 changeMonth: true, 
                 changeYear: true,
                 nextText: '다음 달',
                 prevText: '이전 달', 
                 dayNames: ['일요일', '월요일', '화요일', '수요일', '목요일', '금요일', '토요일'],
                 dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'], 
                 monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
                 monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
                 dateFormat: "yymmdd",
                 maxDate: 100,                       // 선택할수있는 최대날짜, ( 0 : 오늘 이후 날짜 선택 불가)
                 onClose: function( selectedDate ) {    
                     // 종료일(endDate) datepicker가 닫힐때
                     // 시작일(startDate)의 선택할수있는 최대 날짜(maxDate)를 선택한 시작일로 지정
                     $("#startDate").datepicker( "option", "maxDate", selectedDate );
                 }    
 
            });    
    });
</script>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
    <div class="container">
        <div class="header">
            <h1><a href="#">ZAGOGA</a></h1>
            <div class="nav">
        <c:set var="session" value="${user }" />
		<c:choose> 
			<c:when test="${empty session }">
                <ul>
                    <li><a href="login">LOGIN</a></li>
                    <li><a href="javascript:checkPopup()">JOIN</a></li>
                </ul>
			</c:when> 
			<c:when test="${!empty session}">
                <ul>
                    <li><a href="logout">LOGOUT</a></li>
                </ul>
			</c:when> 
		</c:choose> 
            </div>
        </div>
        <div class="hero">
            <h2>어디로 여행가시나요?</h2>
            <p>${user}</p> <%-- session 정보 표시 되는 부분--%>
            <p>어디에서나, 여행은 살아보는거야!</p>
            <div class="searchArea">
             <form method="post" action="#">
                <span>위치</span><input type="text" placeholder="주소" name="" id="searchInput">
                 <script>
                     $(function() {	//화면 다 뜨면 시작


                         $("#searchInput").autocomplete({  //오토 컴플릿트 시작


                             source : searchSource,	// source 는 자동 완성 대상
                             select : function(event, ui) {	//아이템 선택시
                                 console.log(ui.item);
                             },
                             focus : function(event, ui) {	//포커스 가면
                                 return false;//한글 에러 잡기용도로 사용됨
                             },
                             minLength: 1,// 최소 글자수
                             autoFocus: true, //첫번째 항목 자동 포커스 기본값 false
                             classes: {	//잘 모르겠음
                                 "ui-autocomplete": "highlight"
                             },
                             delay: 300,	//검색창에 글자 써지고 나서 autocomplete 창 뜰 때 까지 딜레이 시간(ms)
              // 			disabled: true, //자동완성 기능 끄기
                             position: { my : "right top", at: "right bottom" },	//잘 모르겠음
                             close : function(event){	//자동완성창 닫아질때 호출
                                 console.log(event);
                             }
                         });
                         var searchValue =document.getElementById(searchInput);
                         searchValue.val= searchSource;

                     });
                 </script>

                 <span>체크인</span><input type="text" id="startDate" name="">
                <span>체크아웃</span><input type="text" id="endDate" name="" >
                <span>인원</span><input class="person" type="number" placeholder="인원수" name="" min="1">
            </form>
                <button>검색</button>
            </div>
        </div>
    </div>
    <div class="total">
    <center>
       <div class="main">
           <div class="reco">
                <h2>여기는 어때요?</h2>
           </div>
           <ul class="product_list">
               <li>
                   <dl>
                       <dt>
                           <a href="#">무더위엔 바다아이가!</a>
                       </dt>
                       <dd class="img">
                           <a href="#"><img src="${pageContext.request.contextPath}/resources/img/busan.jpg" alt=""></a>
                       </dd>
                       <dd class="price">여름에 가기 좋은 부산 숙소</dd>
                       <dd class="btm">
                       </dd>
                   </dl>
               </li>
               <li>
                   <dl>
                       <dt>
                           <a href="#">떠나요 둘이서 제주섬으로~</a>
                       </dt>
                       <dd class="img">
                           <a href="#"><img src="${pageContext.request.contextPath}/resources/img/jeju.jpg" alt=""></a>
                       </dd>
                       <dd class="price">힐링여행 푸른밤 제주 숙소</dd>
                       </dd>
                   </dl>
               </li>
               <li>
                   <dl>
                       <dt>
                           <a href="#">동해바다가 아름다운 강릉으로~</a>
                       </dt>
                       <dd class="img">
                           <a href="#"><img src="${pageContext.request.contextPath}/resources/img/kang.jpg" alt=""></a>
                       </dd>
                       <dd class="price">산과 바다를 아우르는 강릉숙소</dd>
                       </dd>
                   </dl>
               </li>
    </center>
    </div>
    <div class="main_text2">
        <ul>
          <li>
            <div><h1>호스트가 되어보세요</h1></div>
            <div>숙소를 공유하여 수입을 올리고 새로운 가능성을 만나세요.</div>
            <a class="host_register" href="/ghouse/write"><div class="more2">숙소등록하기</div></a>
          </li>
          <li></li>
        </ul>
    </div>
</body>
</html>