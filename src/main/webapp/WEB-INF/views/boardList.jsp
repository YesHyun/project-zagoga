<%--
  Created by IntelliJ IDEA.
  User: yeon
  Date: 2021-06-16
  Time: 오후 4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="dto">
    <td style="padding-right: 3px; padding-top: 3px;">
        <a href="booking_detail" style="text-decoration-line: none; color: black;" >
            <div class="w-100 p-3" style="background-color: #eee;" >

                <p><img src="../resources/img/busan.jpg" width="300px" height="270px" ></p>
                <!--  <p><img src="<%=GH_image %>" width="300px" height="270px" ></p> -->

                <p style="padding-right: 5;">${dto.gh_name}</p>
                <!-- <p>평점 :</p> -->
                <p>${dto.gh_addr1}</p>
            </div>
        </a>
    </td>
    </tr>
</c:forEach>
</body>
</html>
