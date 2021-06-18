<%@page import="db.WriteDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="wb" class="db.writeBeans.WriteBean"></jsp:useBean>
<jsp:setProperty property="*" name="wb"/>
<%
		
		wb.setTitle(request.getParameter("title"));
		wb.setDetail(request.getParameter("detail"));
		
		WriteDAO wDAO = WriteDAO.getInstance();
		wDAO.GH1Post(wb);
		System.out.println(request.getParameter("title") + request.getParameter("detail"));
%>
<!DOCTYPE html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
    <form action="write_ok.jsp" method="post" enctype="multipart/form-data">
    <div style="background-image: url('praha.jpg');"></div>
     	<div class="jumbotron text-center"> <h1 style="font-weight: bolder;">사진 등록하기</h1><p>소개할 게스트 하우스의 사진을 등록 해보세요!</p></div>
        <div class="custom-file">
            <input type="file" class="custom-file-input" id="customFile" name="image">
            <label class="custom-file-label" for="customFile">파일선택</label>
        </div>
        <br>
        <div class="container" align="center">
        <br>
			<div class="row">
				<div class="col">
					<button type="submit" class="btn btn-light">다음</button>
					<button type="button" onclick="history.back()" value="뒤로가기" class="btn btn-light">뒤로가기</button>
					
				</div>
			</div>
		</div>	
    </form>
</body>
</html>
