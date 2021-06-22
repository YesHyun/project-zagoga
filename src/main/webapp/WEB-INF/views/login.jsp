<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
    <link href="resources/css/login.css" media="all" rel="Stylesheet" type="text/css" />
    
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/resources/js/login.js" type="text/javascript"></script>
    <script src="/resources/js/pwShowToggle.js" type="text/javascript"></script>
    <script src="/resources/js/guesthouse.js" type="text/javascript"></script>
</head>
<body>
<%@ include file="./header.jsp" %>
	<form action="#" method="POST" onsubmit="return blankCheck();">
    <div id = "mainbox">
    <h2>로그인</h2>
        <table aria-describedby="loginTable">
            <th id="loginTable"></th>
                <tr><td class="inputHead">아이디</td></tr>
                <tr><td colspan="2" class="inputID" ><input type="text" id="userID" name="userID" placeholder="please enter your id"></td></tr>
                <tr><td class="inputHead">비밀번호</td></tr>
                <tr>
                    <td class="inputPW"><input type="password" id="userPW" name="userPW" placeholder="please enter your password"></td>
                    <td class="inputPWShow"><input type="image" id="userPWShow" onclick="pwShowToggle(); return false;" src="resources/img/visibility.png" alt="show password"/></td>
                </tr>
                <tr><td colspan="2"><input class="inputButton" type="submit" value="로그인"></td></tr>
                <tr>
                    <td class="inputFinder"><a href="#">아이디/비밀번호 찾기</a></td>
                    <td class="inputRegister"><a href="javascript:checkPopup()">회원가입</a></td>
                </tr>
        </table>
    </div>
    </form>
    <div>
        <a href="/oauth2/authorization/google"><img src="/resources/images/btn_google_signin_light_normal_web.png" alt="구글 로그인"></a>
    </div>
    <%@ include file="./footer.jsp" %>

</body>
</html>