<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게스트하우스 리스트(user용)</title>
<%
	String GH_name ="111111", GH_image ="",GH_addr1 ="위치테스트", GH_addr2 ="";
%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</head>
<body>
	<%@ include file="../header.jsp" %>
    <section>
        <div class="p-3 mb-2 bg-light text-dark">
            <table class="mx-auto" style="width: 300px;">
                <tr>
    <%
                for(int i = 1; i<=9 ; i++){
    %>
    <%
                    if(i % 2 ==0){
    %>
                    <td style="padding-right: 3px; padding-top: 3px;">
                        <a href="booking_detail" style="text-decoration-line: none; color: black;" >
                        <div class="w-100 p-3" style="background-color: #eee;" >
                        
                           <p><img src="../resources/img/busan.jpg" width="300px" height="270px" ></p> 
                           <!--  <p><img src="<%=GH_image %>" width="300px" height="270px" ></p> -->
                        
                            <p style="padding-right: 5;"><%=GH_name %></p>
                       <!-- <p>평점 :</p> --> 
                            <p><%=GH_addr1%></p>
                        </div>
                        </a>
                    </td>
                 </tr>

    <%
               }else{
    %>
            	    <td style="padding-right: 3px; padding-top: 3px;">
                        <a href="booking_detail" style="text-decoration-line: none; color: black;" >
                        <div class="w-100 p-3" style="background-color: #eee;" >
                            <p><img src="../resources/img/busan.jpg" width="300px" height="270px" ></p> 
                           <!--  <p><img src="<%=GH_image %>" width="300px" height="270px" ></p> -->
                            <p style="padding-right: 5;"><%=GH_name %></p>
                       <!-- <p>평점 :</p> --> 
                            <p><%=GH_addr1%></p>
                        </div>
                        </a>
                    </td>
    <%       	   
               }
        }
    %>
    		
            </table>
        </div>
    </section>
  	<%@ include file="../footer.jsp" %>
</body>
</html>