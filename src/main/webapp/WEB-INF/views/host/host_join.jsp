<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입 (host용)</title>
    <link href="resources/css/regist_business.css" media="all" rel="Stylesheet" type="text/css" />
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="resources/js/regist_business.js" type="text/javascript"></script>
    <script src="resources/js/pwShowToggle.js" type="text/javascript"></script>
</head>
<body>
<%@ include file="../header.jsp" %>
	<form action="#" method="POST" onsubmit="return blankCheck();">
        <div class="inputHead">
            <h2>사업자 인증</h2>
            <input type="text" class="businessNum" maxlength="3" pattern="[0-9]+"> - <input type="text" class="businessNum" maxlength="2" pattern="[0-9]+"> - <input type="text" class="businessNum" maxlength="5" pattern="[0-9]+">
            <button type="button" id="checkBusinessNumberBtn" onclick="checkBusinessNumber();">인증하기</button>
        </div>
        <h2>정보입력</h2>
        <table aria-describedby="registBusinessTable">
            <th id="registBusinessTable"></th>
            <tr><td class="input"><input type="text" id="brand" name="brand" placeholder="상호명" disabled></td></tr>
            <tr><td class="input"><input type="text" id="owner" name="owner" placeholder="대표자명" disabled></td></tr>
            <tr><td class="input"><input type="text" id="userID" name="userID" placeholder="아이디" disabled></td></tr>
            <tr>
                <td class="inputPW"><input type="password" id="userPW" name="userPW" placeholder="비밀번호" disabled></td>
                <td class="inputPWShow"><input type="image" id="userPWShow" onclick="pwShowToggle(); return false;" src="../resources/img/visibility.png" alt="show password" disabled/></td>
            </tr>
            <tr><td class="inputPW"><input type="password" id="userPWCheck" name="userPWCheck" placeholder="비밀번호 재입력" disabled></td></tr>
            <tr>
                <td>
                    <select class="phoneNum" disabled>
                        <option>선택</option>
                        <option>010</option>
                    </select>
                    - <input type="text" class="phoneNum" maxlength="4" disabled>
                    - <input type="text" class="phoneNum" maxlength="4" disabled>
                </td>
            </tr>
            <tr>
                <td >
                    <input type="text" id="emailID" name="emailID" placeholder="이메일" disabled>
                    @ <select id="emailAddr" name="emailAddr" disabled>
                        <option>선택</option>
                        <option>naver.com</option>
                        <option>daum.net</option>
                        <option>gmail.com</option>
                        <option>nate.com</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="inputButtonLayout">
                    <input class="inputButton" id="registerButton" type="submit" value="회원가입" disabled>
                    <input class="inputButton" type="button" value="취소" onclick="location.href='main'">
                </td>
            </tr>
        </table>
    </form>
<%@ include file="../footer.jsp" %>
</body>
</html>