<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>방 세부사항</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    </head>
    <body>
	<%@ include file="../header.jsp" %>
        <section>
            <div class="p-3 mb-2 bg-light text-dark">
                <div class="mx-auto" style="padding: 100px;">
                    <h3>국내 숙소 취소 및 화불 규칙</h3>
                    <br>
                    <br>
                    <br>
                        <p>
                            <b>취소 불가 사항</b>
                        </p>
                        <br>
                        <p>다음의 경우, 예약취소 및 결제금액 환불이 불가능합니다.</p>
                        <br>
                        <br>
                        <ul>
                            <li>입실 시간 경과 (No-Show 포함)또는 실제 입실이 발생한 경우</li>
                            <li>이미 입실한 경우</li>
                            <li>미성년자 투숙인 경우
                                <li>청소년 보호법에 따라 미성년자(만 19세 미만 청소년)의 경우 혼숙이 금지되며, 법정 대리인 동행없이 혼숙이 불가합니다.</li>
                            </li>
                            <li>
                                주차불가 또는 도보전용 객실의 경우
                                <li>취소 불가 시점에 주차불가 사유에 인한 취소처리는 불가합니다.</li>
                            </li>
                        </ul>
                        <br>
                        <p>해당 사유로 인하여 현장에서 입실이 불가할 경우, 취소 및 환불이 불가합니다.</p>
                        <br>
                        <br>
                        <br>
                        <p><b>예외 규정</b></p>
                        <br>
                        <p>천재지변 또는 기상악화에 의한 예외 규정</p>
                        <br>
                        <br>
                        <ul>
                            <li>천재지변 또는 기상악화 등 불가항력적인 원인으로 서비스 이용이 불가한 경우 고객센터를 통해 예외적 취소가 가능합니다.</li>
                            <li>단, 천재지변의 영향정도(시설의 현장상황, 교통수단 및 이동경로 등)를 증명하는 자료의 제출을 요청하거나, 재난의 정도에 따라 예약취소 및 환불이 불가할 수 있습니다.</li>
                        </ul>
                        <br>
                        <br>
                        <p><b>기타 유의사항</b></p>
                        <br>
                        <ul>
                            <li>실기간 예약의 특성상 동일한 객실에 중복 예약이 발생할 수 있으며, 이 경우 먼저 결제완료된 예약 건에 우선권이 있으므로 이후 중복예약 건은 취소될 수 있습니다.</li>
                            <li>성수기 요금의 확정 전, 또는 잘못 등록된 요금으로 고객센터를 통한 안내 후, 예약 취소가 진행 될 수 있습니다.</li>
                            <li>현장에서 발생된 숙박시설과의 분쟁으로 인한 취소/환불 요청시, 당사는 중개플랫폼사로 취소 및 환불처리에 관여하지 않습니다.</li>
                            <li>Zagoga는 예약 중개업자로서 천재지변, 숙박업체의 파업, 항공사사정, 내란 등 여러 사유로 발생한 직, 간접적인 예약 고객님의 피해에 대하여 책임을 지지 않습니다.</li>

                        </ul>
                        <button style="float: right" onclick="history.go(-1)">이전으로 돌아가기</button>
                </div>
            </div>
        </section>
 	<%@ include file="../footer.jsp" %>
    </body>
    </html>