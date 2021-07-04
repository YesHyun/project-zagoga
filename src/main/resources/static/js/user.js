function check() {
    var isFillOut =false;
    console.log('here');

    var name = $("#name").val();
    var gender = $(':radio[name="u_gender"]:checked').val();
    var nick = $("#nick").val()
    var jumin1 = $("#jumin1").val();
    var jumin2 = $("#jumin2").val();
    var email = $("#emailID").val();
    var pw = $("#pw").val();
    var pwCheck = $("#pwCheck").val();
    var middle_phone = $("#phone1").val();
    var last_phone = $("#phone2").val();
    console.log(gender);
    if (name == "") {
        alert("이름을 입력해주세요.");
        $("#name").focus();
    }else if(gender == null){
        alert("성별을 선택해주세요");
    }
    else if (nick == "") {
        alert("닉네임을 입력해주세요!");
        $("#nick").focus();
    }else if(jumin1 =="" || jumin2 ==""){
        alert("주민등록번호를 입력해주세요");
        $("#jumin2").focus();
    }else if(email == "") {
        alert("이메일을 입력해주세요");
        $("#emailID").focus();
    }
    else if (pw == "") {
        alert("비밀번호를 입력해주세요!");
        $("#pw").focus();
    }else if (pwCheck == "") {
        alert("비밀번호를 다시 확인해주세요");
        $("#pwCheck").focus();
    }
    else if (pw != pwCheck) {
        alert("비밀번호가 같지 않습니다.");
        $("#userPW").focus();
    }else if(middle_phone == ""){
        alert("전화번호를 입력해주세요");
        $("#phone1").focus();
    }else if(last_phone == ""){
        alert("전화번호를 입력해주세요");
        $("#phone2").focus();
    }
    else {
        isFillOut = true;
        document.form.submit();
    }
    return isFillOut;
}
$(document).ready(function () { // 성별 값 넘기기
    $('#man').click(function () {
        var radioVal = $("input[name='u_gender'][value='남']").prop("checked",true);
        console.log(radioVal);
    });

    $('#woman').click(function () {
        var radioVal = $("input[name='u_gender'][value='여']").prop("checked",true);
        console.log(radioVal);
    });

});



$( function(){
    $( '#emailID' ).on("blur keyup", function() {
        $(this).val( $(this).val().replace( /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣 | ~!@\#$%<>^&*\()\-=+_\’]/g, '' ) );
    });
});

function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample6_detailAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample6_detailAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById("sample6_address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample6_detailAddress").focus();
            }
        }).open();
    }
    
$(function(){//닉네임 중복체크
    $('#nick').blur(function(){
        var u_nick = $("#nick").val();
        console.log(u_nick);
        $.ajax({
            type: "POST",
            url:"/register/nickCheck.do",
            data:{u_nick :u_nick},
            success:function(data){
                console.log(data);
                if($.trim(data)=="Y"){
                    $('#msg').text("사용가능한 닉네임입니다.");
                    $('#msg').css("color","blue");

                }else if($.trim(data)=="N"){//닉네임값 DB에 존재할때,
                    $('#msg').text("사용불가능한 닉네임입니다.");
                    $('#msg').css("color","red");
                    $('#nick').focus();
                }
            },
            error:function (e){
                console.log(e);
                alert("에러발생");
            }
        });
    });
});
    
	
//팝업		
	function showPopup(){window.open("review_write","후기","width=700, height=500,left=300,top=50");}
   
   
$(document).ready(function() {
	 $(".star_rating a").click(function() {
		$(this).parent().children("a").removeClass("on");
	 	$(this).addClass("on").prevAll("a").addClass("on");
	 	return false;
    })
});	        