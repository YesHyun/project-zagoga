package com.javalec.project_zagoga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    // ADMIN: 호스트 관리 페이지
	@RequestMapping("/admin/host_list")
	public String host_list() {
		return "/admin/host_list";
	}

	// ADMIN: 사업자 정보 디테일 페이지 ( 사업자 승인/거절 )
	@RequestMapping("/admin/host_reading")
	public String host_reading() {
		return "/admin/host_reading";
	}

	// USER: user 예약 페이지 최종
	@RequestMapping("/user/booking_confirm")
	public String booking_confirm() {
		return "/user/booking_confirm";
	}

    //	 ◆◆◆ URL 변경
	// BOARD: 게스트 하우스 디테일 페이지 ( 게스트 하우스 정보, 룸 목록, 게스트 하우스 평점 )
	@RequestMapping("/board/ghouse/{gh_no}/detail")
	public String booking_detail() {
		return "/user/booking_detail";
	}

    //	 ◆◆◆ URL 변경
	// BOARD: 게스트 하우스 목록 페이지
	@RequestMapping("/board/ghouse/list")
	public String booking_list() {
		return "/user/booking_list";
	}

    //	 ◆◆◆ URL 변경
	// HOST: 게스트 하우스에 예약 신청한 유저에 대한 승인/거부 페이지
	@RequestMapping("/host/booking/????")
	public String user_list() {
		return "/user/user_list";
	}

	// HOST: 게스트 하우스 이용 고객 출력 페이지
//	@RequestMapping("/host/booking/list")
//    public String booking_llksdlfjwoeir() {
//	    return "";
//    }

    //	 ◆◆◆ URL 변경
    // "": host 회원 가입 페이지
	@RequestMapping("/register/host")
	public String host_join() {
		return "/host/host_join";
	}

    //	 ◆◆◆ URL 변경
	// "":  룸 상세 정보 페이지 ( 예약 하기 버튼 있음 )
	@RequestMapping("/board/ghouse/room/{r_no}")
	public String room_detail() {
		return "/user/room_detail";
	}

    //	 ◆◆◆ URL 변경
	// "": 취소 규정
	@RequestMapping("/booking/roomcancel")
	public String roomcancel() {
		return "/user/roomcancel";
	}

//	-----------------------------------------------------------------------------------------------------------------------------

	@RequestMapping("/host/gh_write")
	public String gh_write() {
		return "/host/gh_write";
	}
	@RequestMapping("/host/mypage_host_fix")
	public String mypage_host_fix() {
		return "/host/mypage_host_fix";
	}
	@RequestMapping("/host/mypage_house_fix")
	public String mypage_house_fix() {
		return "/host/mypage_house_fix";
	}
	@RequestMapping("/host/mypage_room_fix")
	public String mypage_room_fix() {
		return "/host/mypage_room_fix";
	}
//	@RequestMapping("/mypage_booking")
//	public String mypage_booking() {
//		return "/mypage_booking";
//	}
	@RequestMapping("/user/user_mypage")
	public String user_mypage() {
		return "/user/user_mypage";
	}
	@RequestMapping("/user/user_fix")
	public String user_fix() {
		return "/user/user_fix";
	}
	@RequestMapping("/user/review")
	public String review() {
		return "/user/review";
	}
	@RequestMapping("/join_check")
	public String join_check() {
		return "/join_check";
	}
}
