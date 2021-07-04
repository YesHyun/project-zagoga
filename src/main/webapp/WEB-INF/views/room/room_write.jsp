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
	  <form name="form" action="/room/room_write" method="post">
	    <h1>방 소개</h1>
	    <div class="section">
		    <div class="title">
		     <h3>제목&nbsp;&nbsp;&nbsp;<input type="text" name="r_name" id="gh_name" width="100"></h3>
			 <h3>가격&nbsp;&nbsp;&nbsp;<input type="text" name="r_fee" width="100"></h3>
			</div>
		<div class="detail">
						<h3>상세 내용</h3>
						<h4>최저 인원수&nbsp;&nbsp;
							<select name="r_pmin" id="r_pmin">
								<option value='1'>1인실</option>
								<option value='2'>2인실</option>
								<option value='4'>4인실</option>
								<option value='8'>8인실</option>
								<option value='16'>16인실</option>
							</select>
						</h4>
						<h4>최대 인원수&nbsp;&nbsp;&nbsp;
							<select name="r_pmax" id="r_pmax">
								<option value='1'>1인실</option>
								<option value='2'>2인실</option>
								<option value='4'>4인실</option>
								<option value='8'>8인실</option>
								<option value='16'>16인실</option>
							</select>
						</h4>
				</div>
	    <div class="content">
	        <h4>소개</h4>
	        <textarea 
	        	style="overflow: auto;" 
	        	rows="20" cols="70" name="r_detail" id="gh_detail">방소개 글</textarea>
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
