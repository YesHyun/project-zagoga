<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>사용자 회원가입(user용)</title>
	<link href="/resources/css/user_join.css" media="all" rel="Stylesheet" type="text/css" />
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script src="/resources/js/user.js" type="text/javascript"></script>
<script>
	function change(e){
		if(e.value == "선택"){
			document.getElementById('emailAddr').value;
		}else if (e.value=="@naver.com"){
			document.getElementById('emailAddr').value;
		}else if (e.value=="@daum.net"){
			document.getElementById('emailAddr').value;
		}else if (e.value=="@gmail.com"){
			document.getElementById('emailAddr').value;
		}else if (e.value=="@nate.com"){
			document.getElementById('emailAddr').value;
		}
	}
</script>
	<script>
		//이메일 보냄
		function emailSend(){//이메일 보냄
			let clientEmail = document.getElementById('emailID').value + $('#emailAddr option:selected').val();
			console.log('입력한 메일' + clientEmail);
			if(clientEmail != ""){
			$.ajax({
				type:"POST",
				url:"/register/Checkmail",
				data:{ u_mail:clientEmail},
				success: function(data){
					alert("인증번호가 발송되었습니다.");
					console.log('성공',data);
				},
				error: function (e){
					alert("인증번호 발송에 실패하였습니다.")
					console.log('실패',e);
				}
			});
		}
	}
	</script>
	<script>
		function emailCertification(){
			let clientEmail = document.getElementById('emailID').value + $('#emailAddr option:selected').val();
			let inputCode = document.getElementById('certificationNumber').value;
			console.log('이메일' + clientEmail);
			console.log('인증코드' + inputCode);

			$.ajax({
				type:"POST",
				url:"/register/certification.do",
				data:{u_mail:clientEmail, inputCode:inputCode},
				success: function(data){
					console.log(data);
					if(data == true){
						alert('인증완료');
						document.getElementById('certificationYN').value = "true";
						clientEmail.onchange = function(){
							document.getElementById('certificationYN').value = "false";
						}
					}else{
						alert('재시도');
					}
				},
				error: function(e){
					alert('전송오류')
					console.log('에러' + e);
				}
			});
		}
	</script>
	<script>
		//아이디 중복체크
		$(function(){
			$('#emailID').blur(function(){
			var u_mail = document.getElementById('emailID').value + $('#emailAddr option:selected').val();

			console.log(u_mail);
				$.ajax({
					type:"POST",
					url:"/register/checkSignup",
					data:{
						"u_mail":u_mail
					},
					success:function(data){	//data : checkSignup에서 넘겨준 결과값
						if($.trim(data)=="YES"){
							if($('#emailID').val() + $('#emailAddr option:selected').val() !=''){
								$("#mail_check").text("사용 가능한 아이디입니다.");
								$("#mail_check").css("color", "blue");
							}
						}else{
							if($('#emailID').val()+$('#emailAddr option:selected').val() !=''){
								$("#mail_check").text("사용중인 아이디입니다.");
								$("#mail_check").css("color", "red");
								$('#emailText').focus();
							}
						}
					}

				});
			});
		});

		$(function(){
			$('#emailAddr').blur(function(){
				var u_mail = document.getElementById('emailID').value + $('#emailAddr option:selected').val();

				console.log(u_mail);
				$.ajax({
					type:"POST",
					url:"/register/checkSignup",
					data:{
						"u_mail":u_mail
					},
					success:function(data){	//data : checkSignup에서 넘겨준 결과값
						if($.trim(data)=="YES"){
							if($('#emailID').val() + $('#emailAddr option:selected').val() !=''){
								$("#mail_check").text("사용 가능한 아이디입니다.");
								$("#mail_check").css("color", "blue");
							}
						}else{
							if($('#emailID').val()+$('#emailAddr option:selected').val() !=''){
								$("#mail_check").text("사용중인 아이디입니다.");
								$("#mail_check").css("color", "red");
								$('#emailText').focus();
							}
						}
					}

				});
			});
		});
	</script>
</head>
<body>
<%@ include file="../header.jsp" %>
<center>
	<form name="form" action="/register/user" method="post">
		<div class="container">
			<table>
				<tr>
					<td>이름</td>
					<td><input type="text" id="name" name="u_name">
				</tr>
				<tr>
					<td>성별</td> <!--값 제대로 안넘어가면 말씀해주세요 -->
					<td><input type="radio" id="man" name = "u_gender" value="남"><label for="man">남성</label>
						<input type="radio" id="woman" name = "u_gender" value="여" ><label for="woman">여성</label></td>
				</tr>
				<tr>
					<td>닉네임</td>
					<td><input type="text" name="u_nick" id="nick" class="u_nick">
						<div id="msg"></div>
				</tr>
				<tr>
					<td>주민번호</td>
					<td><input type="text" id="jumin1" name="u_jumin" size="10" maxlength="6" onkeyup="$(this).val($(this).val().replace(/\D/g,''));">
						- <input type="password"  id="jumin2" name="u_jumin" size="10" maxlength="7" onkeyup="$(this).val($(this).val().replace(/\D/g,''));"> </td>
				</tr>
				<tr>
					<td>이메일 : </td>
					<td>
						<input type="text" id="emailID" name="u_mail" placeholder="이메일" >
						@ <select id="emailAddr" name="u_mail" onchange="change(this)" >
						<option>선택</option>
						<option value="@naver.com">naver.com</option>
						<option value="@daum.net">daum.net</option>
						<option value="@gmail.com">gmail.com</option>
						<option value="@nate.com">nate.com</option>
					</select>
						<div id="mail_check"></div>
						<div><button id="emailCheck" onclick="emailSend()">인증번호 받기</button></div>
					</td>
				</tr>
				<tr>
					<td>
						인증번호 :
					</td>
					<td>
						<input type="text" id="certificationNumber">&nbsp;&nbsp;
						<input type="button" onclick="emailCertification()" value="인증하기">
						<input type="hidden" id="certificationYN" value="false">
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" id="pw"name="u_pwd" >
				</tr>
				<tr>
					<td>비밀번호 확인</td>
					<td><input type="password" id="pwCheck" name="u_pwd2">
				</tr>
<%--				<tr>--%>
<%--					<td>주소 : </td>--%>
<%--					<td>--%>
<%--						<input type="text" id="sample6_address" name="u_addr" placeholder="주소" readonly>&nbsp;&nbsp;--%>
<%--						<input type="button" onclick="sample6_execDaumPostcode()" value="주소검색"><br>--%>
<%--						<input type="text" id="sample6_detailAddress" name="u_addr" placeholder="상세주소">--%>
<%--					</td>--%>
<%--				</tr>--%>
				<tr>
					<td>전화 번호</td>
					<td>
						<select class="u_phone">
							<option>선택</option>
							<option selected>010</option>
						</select>
						- <input type="text" id="phone1" class="u_phone" maxlength="4" size="5" onkeyup="$(this).val($(this).val().replace(/\D/g,''));">
						- <input type="text" id="phone2" class="u_phone" maxlength="4" size="5" onkeyup="$(this).val($(this).val().replace(/\D/g,''));">
					</td>
				</tr>
				<tr align="center">
					<td colspan="4" class="btn">
						<input type="button" onclick="check()" value="등록">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="button" value="취소" onclick="location.href='/main'">
					</td>
				</tr>
			</table>
		</div>
	</form>
</center>
<%@ include file="../footer.jsp" %>
</body>
</html>