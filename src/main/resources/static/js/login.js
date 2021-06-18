function blankCheck() {
    var isFillOut = false;

    var id = $("#userID").val();
    var pw = $("#userPW").val();

    if (id == "") {
        alert("아이디를 입력해주세요!");
    }
    else if (pw == "") {
        alert("비밀번호를 입력해주세요!");
    }
    else {
        isFillOut = true;
    }
    return isFillOut;
}