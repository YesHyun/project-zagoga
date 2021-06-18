<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />  
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
 <link rel="stylesheet" type="text/css" href="resources/css/main2.css">
 	<script type="text/javascript" src="resources/js/guesthouse.js" charset="utf-8"></script>
</head>
<body>
    <div class="container">
        <div class="header">
            <h1><a href="#">ZAGOGA</a></h1>
            <div class="nav">
                <ul>
                    <li><a href="login">LOGIN</a></li>
                    <li><a onclick="checkPopup()">JOIN</a></li>
                </ul>
            </div>
        </div>
        <div class="hero">
            <h2>어디로 여행가시나요?</h2>
            <p>어디에서나, 여행은 살아보는거야!</p>
            <div class="searchArea">
             <form>
                <span>위치</span><input type="text" placeholder="주소" name="">
                <span>체크인</span><input type="text" id="startDate" name="">
                <span>체크아웃</span><input type="text" id="endDate" name="" >
                <span>인원</span><input class="person" type="number" placeholder="인원수" name="">
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
                           <a href="#"><img src="resources/img/busan.jpg" alt=""></a>
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
                           <a href="#"><img src="resources/img/jeju.jpg" alt=""></a>
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
                           <a href="#"><img src="resources/img/kang.jpg" alt=""></a>
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
            <a class="host_register" href="#"><div class="more2">숙소등록하기</div></a>
          </li>
          <li></li>
        </ul>
    </div>
</body>
</html>