function pwShowToggle() {
    var type = $("#userPW").attr("type");
    if (type == "password") {
        var pwList = $(".inputPW").children("input");
        for (var i = 0; i < pwList.length; i++){
            pwList[i].type = "text";
        }
        // $("#userPW").attr("type", "text");
        $("#userPWShow").attr("src", "/resources/img/visibility_close.png");
    }
    else if (type == "text") {
        var pwList = $(".inputPW").children("input");
        for (var i = 0; i < pwList.length; i++){
            pwList[i].type = "password";
        }
        // $("#userPW").attr("type", "password");
        $("#userPWShow").attr("src", "/resources/img/visibility.png");
    }
}

$("#userPWCheck").change(function () {
    var pw01 = $("#userPW").val();
    var pw02 = $("#userPWCheck").val();
    if (pw01 != pw02) {
        $("#userPW").css("color", "red");
        $("#userPWCheck").css("color", "red");
    }
    else {
        $("#userPW").css("color", "black");
        $("#userPWCheck").css("color", "black");
    }
})
