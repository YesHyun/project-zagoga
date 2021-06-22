<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/review.css"/>
<script src="../resources/js/jquery.js"></script>

	<script type="text/javascript" src="resources/js/user.js" charset="utf-8"></script>
	<title>리뷰 작성 (user용)</title>
</head>
<body><!-- 팝업사이즈 조절 : <body onload="window.resizeTo(400,200)"> -->
<center>
<br>
<br>
<br>
	<p>이용하신 숙소는 어떠셨나요? </p>
	<p>따뜻한 격려의 말은 힘이 됩니다</p>
	<form action="#" method="post">
	<p class="star_rating">
 		<a href="#" value="1">★</a>
        <a href="#" value="2">★</a>
        <a href="#" value="3">★</a>
        <a href="#" value="4">★</a>
        <a href="#" value="5">★</a>
    </p>
    <br>
    <textarea rows="10" cols="30" placeholder="10자 이상 입력해주세요"></textarea>
    <br>
    <br>
    <input type="submit" value="작성">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="button" value="취소" onclick="self.close();">
    </form>
    </center>
</body>
</html>