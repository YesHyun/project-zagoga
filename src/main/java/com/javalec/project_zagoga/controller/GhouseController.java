package com.javalec.project_zagoga.controller;

import com.javalec.project_zagoga.dto.Ghouse;
import com.javalec.project_zagoga.dto.GhouseRoom;
import com.javalec.project_zagoga.dto.GhouseRoomImages;
import com.javalec.project_zagoga.dto.Host;
import com.javalec.project_zagoga.services.GhouseService;
import com.javalec.project_zagoga.services.RoomService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/ghouse")
//@RestController 는 뷰페이지 반환 노노 데이터만! 네
public class GhouseController {
	private final GhouseService ghouseService;
	private final RoomService roomService;
	private ByteArrayInputStream files;

	public GhouseController(GhouseService ghouseService, RoomService roomService) {
		this.ghouseService = ghouseService;
		this.roomService = roomService;
	}
	// 210704 04:03 확인
	@RequestMapping(value = "/getList", method = RequestMethod.GET)
	public String getList(Model model) {
		List<GhouseRoom> show = this.ghouseService.getList();
		System.out.println(show.toString());
		model.addAttribute("list",show);
		System.out.println("list");
		return "/room/gHouse_list";
	}

	@RequestMapping("/write")
	public String write() {
		return "/host/gHouse_write";
	}

	//210704 01:05 확인 (g_hno 호스트번호 연결해줘야함)
	@SneakyThrows
	@PostMapping("/insert")
	public String insert(Ghouse ghouse, @RequestParam("files") MultipartFile file) throws IOException {
		Host host = new Host();
		host.setH_no(1);
		int h_no=host.getH_no();
		String fileAddr = "C:\\Users\\yeon\\IdeaProjects\\project_zagoga\\src\\main\\resources\\static\\gh_image\\";

		String imageName = String.valueOf(System.currentTimeMillis());
		String OriginName = file.getOriginalFilename();
		String transfer = fileAddr + imageName + "_" + OriginName;
		String safeDb = imageName + "_" + OriginName;

		System.out.println("ghouse.toString() : " + ghouse.toString());
//		String filePath = System.currentTimeMillis() + "_" + file.getOriginalFilename();
//		String Path = "/resources/gh_image/";
//		System.out.println("filePath : " + filePath);
		try {
			ghouse.setGh_image(imageName + "_" + OriginName);
			File transfers = new File(transfer);
			file.transferTo(transfers);

		} catch (IllegalStateException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		ghouse.setGh_hno(host.getH_no());
		ghouse.setGh_image(safeDb);
		ghouseService.insert(ghouse);
		return "main";
//		return "redirect:/room/write/"+h_no;
	}

	//// room이 fk잡혀있어서 삭제안됨
	@PostMapping("/delete/{gh_no},{gh_hno}")
	public String delete(@PathVariable("gh_no") int gh_no,@PathVariable("gh_hno") int gh_hno){
		ghouseService.delete(gh_no, gh_hno);
		return "main";
	}


	//gHouse_detail view 20210704 00:53 정상작동
	// 20210705 본체1개, 룸2개, 이미지각각3장씩 총 6줄 출력 / 이미지만 반복시키고 r_no 바뀔때만 출력 2중반복문필요
	@RequestMapping(value = "/detail/{gh_no}", method = RequestMethod.GET)
	public String ghouseDetail(@PathVariable("gh_no")int gh_no, Model model) {
		List<GhouseRoomImages> ghouseRoomImages=this.ghouseService.ghouseDetail(gh_no);
		model.addAttribute("griList", ghouseRoomImages);
		System.out.println("ghouseRoomImages.get(0).toString() : "+ghouseRoomImages.get(0).toString());
//		System.out.println(ghouseRoomImages.toString());
		return "/room/gHouse_detail";
	}

	//mypage_house_info.jsp 업데이트 페이지 뷰용!!! 정상작동
	@RequestMapping("/RoomAndGhouse/{gh_no}")
	public String updateViewAll(@PathVariable("gh_no")int gh_no, Model model){
		List<GhouseRoom> ghouseRoom=this.ghouseService.roomAndGhouse(gh_no);

		model.addAttribute("grList", ghouseRoom);
		System.out.println(ghouseRoom.toString());
		return "/mypage/mypage_house_info";
	}

	@PostMapping("/update")
	public String update(Ghouse ghouse){
		System.out.println("ghouse.toString() : " + ghouse.toString());
		ghouseService.update(ghouse);
		return "main";
	}




	@RequestMapping("/mypageRoomInfo2")	// 방등록현황, 수정페이지 (회원탈퇴는)
	public String mypageRoomInfo2(){
		return "/mypage/mypage_room_info";
	}
	@RequestMapping("/mypage_host")		// 개인정보 사업자정보 뷰, 수정페이지
	public String mypage_host() {
		return "/mypage/mypage_host";
	}

	@RequestMapping("/mypage_host_info")		//사업자 회원정보 변경
	public String mypage_host_info() {
		return "/mypage/mypage_host_info";
	}
	@RequestMapping("/mypage_house_info")	//사업자 등록현황, 등록된 방현황(사업자 정보변경)
	public String mypage_house_info() {	return "/mypage/mypage_house_info";	}
	@RequestMapping("/room_cancel")		// 예약 취소 안내
	public String room_cancel() {
		return "/room/room_cancel";
	}








	@RequestMapping("/booking_confirm")	// 예약신청후 확인페이지, 예약하기 버튼 누르면 예약됨 (booking_confirm 으로 이동)
	public String booking_confirm() {
		return "/room/booking_confirm";
	}
	@RequestMapping("/mypage_user")		// user mypage 정보수정, 예약현황 및 목록(버튼 누르면 mypage_user_booking 으로 이동)
	public String mypage_user() {
		return "/mypage/mypage_user";
	}
	@RequestMapping("/mypage_user_booking")		//user 예약목록
	public String mypage_user_booking() { return "/mypage/mypage_user_booking";	}
	@RequestMapping("/mypage_host_customerList")	// 예약 승인/거부 페이지
	public String mypage_host_customerList() {
		return "/mypage/mypage_host_customerList";
	}

}
