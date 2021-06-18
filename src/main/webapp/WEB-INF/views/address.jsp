<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
    
    
</head>
<body>

    <form action="image-upload.jsp" method="post">
     	<div class="jumbotron text-center"> <h1 style="font-weight: bolder;">주소 등록하기</h1> <p>소개할 게스트 하우스의 주소를 등록 해보세요!</p> </div>

	<div>
	<script type="text/javascript" src="../util/juso2.js" ></script>
	
		<div class="row">
		  <div class="col-sm-6">
		    <div class="input-group">
		      <input type="text" class="form-control" name="address" id="location_addr" readonly>
		      <span class="input-group-btn">
			<button onclick="goPopup();" class="btn btn-light" type="button">주소찾기</button>
		      </span>
			</div>
		  </div>
		</div>
		
		<div class="title">
			<input type="text" class="form-control" placeholder="상세 주소" name="address_detail">
	    </div>     		
    </div>






    	<div align="center">
			<div class="container" align="center">
				<div class="row">
					<div class="col">
						<button type="submit" class="btn btn-light">다음</button>
						<button type="button" onclick="history.back()" value="뒤로가기" class="btn btn-light">뒤로가기</button>
						
					</div>
				</div>
			</div>	
		</div>
	</form>
</body>
</html>