package com.javalec.project_zagoga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    // ADMIN: 사업자 리스트 
	@RequestMapping("/admin/host_list")
	public String host_list() {
		return "/admin/host_list";
	}

	// ADMIN: 사업자 정보 디테일 ( 사업 승인 /거절 )
	@RequestMapping("/admin/host_reading")
	public String host_reading() {
		return "/admin/host_reading";
	}

	// USER: user 예약 페이지
	@RequestMapping("/user/booking_confirm")
	public String booking_confirm() {
		return "/user/booking_confirm";
	}

    //■■■ URL 변경
	// BOARD: 게스트하우스 디테일 페이지 ( 게스트하우스 정보 , 룸 목록 ,게스트 하우스 평점 ,  )
	@RequestMapping("/board/ghouse/{gh_no}/detail")
	public String booking_detail() {
		return "/user/booking_detail";
	}

    //	■■■ URL 변경
	// BOARD: 게스트 하루스 목록페이지
	@RequestMapping("/board/ghouse/list")
	public String booking_list() {
		return "/user/booking_list";
	}

    //	■■■ URL 변경
	// HOST: 게스트하우스 예약 신청한 유저에 대한 승인/거절 페이지
	@RequestMapping("/host/booking/????")
	public String user_list() {
		return "/user/user_list";
	}

	// HOST: 게스트 하우스 이용 고객 출력 페이지
//	@RequestMapping("/host/booking/list")
//    public String booking_llksdlfjwoeir() {
//	    return "";
//    }

    //	 ■■■ URL 변경
    // "": host 회원가입 페이지
	@RequestMapping("/host/host_join")
	public String host_join() {
		return "/host/host_join";
	}

    //	■■■ URL 변경
	// "":  룸 상세 정보페이지  ( 예약하기  )
	@RequestMapping("/board/ghouse/room/{r_no}")
	public String room_detail() {
		return "/user/room_detail";
	}

    //	■■■ URL 변경
	// "": 취소 규정
	@RequestMapping("/booking/roomcancel")
	public String roomcancel() {
		return "/user/roomcancel";
	}

//	-----------------------------------------------------------------------------------------------------------------------------
	//host : 게스트 하우스 글 작성
	@RequestMapping("/host/gHouse_write")
	public String gh_write() {
		return "/host/gHouse_write";
	}
	//mypage : host 정보 변경 ,회원 탈퇴 
	//@RequestMapping("/host/mypage_host_fix")
	//public String mypage_host_fix() {
	//	return "/host/mypage_host_fix";
	//}
	//mypage : 게스트 하우스 정보 변경
	//@RequestMapping("/host/mypage_house_fix")
	//public String mypage_house_fix() {
	//	return "/host/mypage_house_fix";
	//}
	//mypage : 게스트 하우스 룸 정보 변경
	//@RequestMapping("/host/mypage_room_fix")
	//public String mypage_room_fix() {
	//	return "/host/mypage_room_fix";
	//	}
//	@RequestMapping("/mypage_booking")
//	public String mypage_booking() {
//		return "/mypage_booking";
//	}
//	마이 페이지 유저 회원정보 수정 페이지로 변경 예상
//	@RequestMapping("/user/user_fix")
//	public String user_fix() {
//		return "/user/user_fix";
//	}
	
	//user 댓글 기능
	@RequestMapping("/user/review")
	public String review() {
		return "/user/review";
	}
	//회원가입 호스트 유저 구분
	@RequestMapping("/join_check")
	public String join_check() {
		return "/join_check";
	}


//	�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫�뀫

//	�씠由꾩쭞湲�: /沅뚰븳/�럹�씠吏��씠由�/�꽭遺��룞�옉

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	//host : 마이페이지 게스트 하우스 예약자 리스트 (승인/거절)
	@RequestMapping("/host/mypage_host_customerList")
	public String mypage_host_customerList() {
		return "mypage/mypage_host_customerList";
	}
	//host : 마이페이지 호스트 개인정보 변경
	@RequestMapping("host/mypage_host_info")
	public String mypage_host_info() {
		return "mypage/mypage_host_info";
	}
	//host : 마이페이지 게스트 하우스 정보 변경
	@RequestMapping("host/mypage_house_info")
	public String mypage_house_info() {
		return "mypage/mypage_house_info";
	}
	//user : 마이페이지 유저가 예약한 게스트하우스 상태 페이지
	@RequestMapping("user/mypage_user_booking")
	public String mypage_user_booking() {
		return "mypage/mypage_user_booking";
	}
	//user : 마이페이지 유저 회원정보 변경 
	@RequestMapping("user/mypage_user_info")
	public String mypage_user_info() {
		return "mypage/mypage_user_info";
	}
	//user: 유저 마이페이지 메인(회원정보와  예약상태 같이 보여줌)
	@RequestMapping("user/mypage_user")
	public String mypage_user() {
		return "mypage/mypage_user";
	}
	//board : 게스트 하우스 정보 디테일
	@RequestMapping("board/gHouse_detail")
	public String gHouse_detail() {
		return "room/gHouse_detail";
	}
	//board : 게스트 하우스 리스트  
	@RequestMapping("board/gHouse_list")
	public String gHouse_list() {
		return "room/gHouse_list";
	}
	//user : 댓글 추가 기능
	@RequestMapping("user/review_write")
	public String review_write() {
		return "room/review_write";
	}
	//board : 게스트 하우스 예약 취소 페이지 
	@RequestMapping("board/room_cancel")
	public String room_cancel() {
		return "room/room_cancel";
	}
	// user : 유저 회원가입 페이지 
	@RequestMapping("user/user_join")
	public String user_join() {
		return "user/user_join";
	}
	//	@RequestMapping("mypage_booking")
//	public String mypage_booking() {
//		return "mypage_booking";
//	}
}

