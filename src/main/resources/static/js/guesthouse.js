//write.jsp관련 게스트하우스 정보
function write_check_ok(){
    if(document.form.gh_name.value == ""){
        alert("게스트 하우스 상호명을 입력해주세요 ");
        form.gh_name.focus();
		return;
    }else if(document.form.gh_image.value == ""){
        alert("사진을 첨부해주세요");
        form.gh_image.focus();
		return;
    
    }else if(document.form.gh_addr1.value == ""){
        alert("주소를 입력해주세요");
    	form.gh_addr1.focus();
		return;
    }else if(document.form.gh_addr2.value == ""){
        alert("상세주소를 입력해주세요");
        form.gh_addr2.focus();
		return;
    
    }else if(document.form.gh_detail.value == ""){
        alert("소개를 입력해주세요");
        form.gh_detail.focus();
		return;
    }
    document.form.submit();
}

 //주소관련
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

//휴대폰 '-'넣기
function inputPhoneNumber(obj) { 
	var number = obj.value.replace(/[^0-9]/g, ""); 
	var phone = ""; 
	
	if(number.length < 4) {
		return number; 
		} 
	else if(number.length < 7) { 
			phone += number.substr(0, 3);
			phone += "-"; 
			phone += number.substr(3); 
		}
	else if(number.length < 11) {
		phone += number.substr(0, 3);
		phone += "-";
		phone += number.substr(3, 3); 
		phone += "-"; 
		phone += number.substr(6); 
		}
	else { 
		phone += number.substr(0, 3);
		phone += "-"; 
		phone += number.substr(3, 4);
		phone += "-"; 
		phone += number.substr(7); 
		} 
	obj.value = phone; 
	}    
	
//체크인 체크아웃
$(document).ready(
			function() {
				$.datepicker.setDefaults($.datepicker.regional['ko']);
				$("#startDate")
						.datepicker(
								{
									changeMonth : true,
									changeYear : true,
									nextText : '다음 달',
									prevText : '이전 달',
									dayNames : [ '일요일', '월요일', '화요일', '수요일',
											'목요일', '금요일', '토요일' ],
									dayNamesMin : [ '일', '월', '화', '수', '목',
											'금', '토' ],
									monthNamesShort : [ '1월', '2월', '3월', '4월',
											'5월', '6월', '7월', '8월', '9월',
											'10월', '11월', '12월' ],
									monthNames : [ '1월', '2월', '3월', '4월',
											'5월', '6월', '7월', '8월', '9월',
											'10월', '11월', '12월' ],
									dateFormat : "MM/dd일 DD",
									maxDate : 100, // 선택할수있는 최소날짜, ( 0 : 오늘 이후 날짜 선택 불가)
									onClose : function(selectedDate) {
										//시작일(startDate) datepicker가 닫힐때
										//종료일(endDate)의 선택할수있는 최소 날짜(minDate)를 선택한 시작일로 지정
										$("#endDate").datepicker("option",
												"minDate", selectedDate);
									}

								});
				$("#endDate")
						.datepicker(
								{
									changeMonth : true,
									changeYear : true,
									nextText : '다음 달',
									prevText : '이전 달',
									dayNames : [ '일요일', '월요일', '화요일', '수요일',
											'목요일', '금요일', '토요일' ],
									dayNamesMin : [ '일', '월', '화', '수', '목',
											'금', '토' ],
									monthNamesShort : [ '1월', '2월', '3월', '4월',
											'5월', '6월', '7월', '8월', '9월',
											'10월', '11월', '12월' ],
									monthNames : [ '1월', '2월', '3월', '4월',
											'5월', '6월', '7월', '8월', '9월',
											'10월', '11월', '12월' ],
									dateFormat : "MM/dd일 DD",
									maxDate : 100, // 선택할수있는 최대날짜, ( 0 : 오늘 이후 날짜 선택 불가)
									onClose : function(selectedDate) {
										// 종료일(endDate) datepicker가 닫힐때
										// 시작일(startDate)의 선택할수있는 최대 날짜(maxDate)를 선택한 시작일로 지정
										$("#startDate").datepicker("option",
												"maxDate", selectedDate);
									}
					});
});
	
//팝업		
	function showPopup(){window.open
		("review","후기","width=700, height=500,left=300,top=50");}
    
//별점
$(".star_rating a").click(function() {
	$(this).parent().children("a").removeClass("on");
	$(this).addClass("on").prevAll("a").addClass("on");
	return false;

});
	
	
$( document ).ready(function() {
	 $( ".star_rating a" ).click(function() {
		$(this).parent().children("a").removeClass("on");
	 	$(this).addClass("on").prevAll("a").addClass("on");
	 	return false;
    });
});	

function checkPopup(){
	
	window.open("check","check","width=1030, height=350,left=700,top=300");
	
}		
		
function host(){
	opener.document.location.href="regist_business";
	self.close();
}

function user(){
	opener.document.location.href="signup_user";
	self.close();
}				
		