<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
  <head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/resources/css/write.css" type="text/css">
	<title>Insert title here</title>
	<script type="text/javascript" src="/resources/js/guesthouse.js" charset="utf-8"></script>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
  </head>
  <body>
  <%@ include file="../header.jsp" %>
	<div class="total">
	  <form name="form" action="/room/room_images" method="post" enctype="multipart/form-data">
	    <h1>방 소개</h1>
	    <div class="section">
		    <div class="title">
		    </div>
	        <div class="title2">
			    <h4>이미지 업로드&nbsp;&nbsp;&nbsp;</h4>
			    <input type="file" name="files" id="files" size="10" multiple>
	        </div>
	      <div class="button">
	        <input type="submit" class="but" value="글 올리기">
	        <button type="reset" class="but">다시쓰기</button>
	        <span><button type="button" value="뒤로가기" onclick="history.back()" class="but">뒤로가기</button></span>
	      </div>
	    </div>
	  </form>
	  <div class="clear"></div>
	</div>
	 <%@ include file="../footer.jsp" %>
  </body>
</html>
