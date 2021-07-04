
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
  <title>간단한 지도 표시하기</title>
  <script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=q0a41zgk6j"></script>
    <title>Title</title>
</head>
<body>
<div id="map" style="width:50%;height:400px;"></div>

<script>
  var map = new naver.maps.Map('map', {
  center: new naver.maps.LatLng(37.3595704, 127.105399),
  zoom: 15
});

  var marker = new naver.maps.Marker({
  position: new naver.maps.LatLng(37.3595704, 127.105399),
  map: map
});

</script>
</body>
</html>
