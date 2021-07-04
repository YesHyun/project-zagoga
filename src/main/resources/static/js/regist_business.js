function blankCheck() {
    var isFillOut = false;
    console.log('here');

    var brand = $("#brand").val();
    var owner = $("#owner").val();
    var id = $("#userID").val();
    var pw = $("#userPW").val();
    var pwCheck = $("#userPWCheck").val();
    var middle_phone = $("#phone1").val();
    var last_phone = $("#phone2").val();
    var emailID = $("#emailID").val();
    if (brand == "") {
        alert("상호명을 입력해주세요.");
        $("#brand").focus();
    }
    else if (owner == "") {
        alert("대표자명을 입력해주세요.");
        $("#owner").focus();
    }
    else if (id == "") {
        alert("아이디를 입력해주세요!");
        $("#userID").focus();
    }
    else if (pw == "") {
        alert("비밀번호를 입력해주세요!");
        $("#userPW").focus();
    }
    else if (pwCheck == "") {
        alert("비밀번호를 다시 확인해주세요");
        $("#userPWCheck").focus();
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
    }else if(emailID == ""){
        alert("이메일을 입력해주세요");
        $("#emailID").focus();
    }
    else {
        isFillOut = true;
    }

    return isFillOut;
}

function checkBusinessNumber() {
    var bNum = $(".inputHead").children(".businessNum");
    if (bNum[0].value == "" || bNum[1].value == "" || bNum[2].value == "") {
        alert("올바른 사업자 주소가 아닙니다.");
    }
    else {
        abile();
        $(".businessNum")[0].setAttribute("disabled", true);
        $(".businessNum")[1].setAttribute("disabled", true);
        $(".businessNum")[2].setAttribute("disabled", true);
        $("#checkBusinessNumberBtn").attr("disabled", true);
    }
}

$(".businessNum").keyup(function () {
    if (this.value.length == this.maxLength) {
        $(this).next(".businessNum").focus();
    }
})

$( function(){
    $( '#emailID' ).on("blur keyup", function() {
        $(this).val( $(this).val().replace( /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣 | ~!@\#$%<>^&*\()\-=+_\’]/g, '' ) );
    });
})
function abile() {
    $("#brand").attr("disabled", false);
    $("#owner").attr("disabled", false);
    $("#userID").attr("disabled", false);
    $("#userPW").attr("disabled", false);
    $("#userPWCheck").attr("disabled", false);
    $("#userPWShow").attr("disabled", false);
    $(".phoneNum")[0].removeAttribute("disabled");
    $(".phoneNum")[1].removeAttribute("disabled");
    $(".phoneNum")[2].removeAttribute("disabled");
    $("#emailID").attr("disabled", false);
    $("#emailAddr").attr("disabled", false);
    $("#registerButton").attr("disabled", false);
}