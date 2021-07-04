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

import javax.servlet.http.HttpServletRequest;
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

	@RequestMapping("/write2")
	public String write2() {
		return "/host/gHouse_write";
	}

	//210704 01:05 확인 (g_hno 호스트번호 연결해줘야함)
	@SneakyThrows
	@PostMapping("/insert")
	public String insert(Ghouse ghouse, @RequestParam("files") MultipartFile file) throws IOException {
		Host host = new Host();
		host.setH_no(1);
		System.out.println("ghouse.toString() : " + ghouse.toString());
		String filePath = System.currentTimeMillis() + "_" + file.getOriginalFilename();
		String Path = "/resources/gh_image/";
		System.out.println("filePath : " + filePath);
		try {
			file.transferTo(new File("C:\\Users\\yeon\\IdeaProjects\\project_zagoga\\src\\main\\resources\\static\\gh_image\\"+System.currentTimeMillis()+"_"+file.getOriginalFilename()));

		} catch (IllegalStateException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		ghouse.setGh_hno(host.getH_no());
		ghouse.setGh_image(filePath);
		ghouseService.insert(ghouse);
		return "main";
	}

	//// room이 fk잡혀있어서 삭제안됨
	@PostMapping("/delete/{gh_no},{gh_hno}")
	public String delete(@PathVariable("gh_no") int gh_no,@PathVariable("gh_hno") int gh_hno){
		ghouseService.delete(gh_no, gh_hno);
		return "main";
	}


	//gHouse_detail view 20210704 00:53 정상작동
	@RequestMapping(value = "/detail/{gh_no},{r_no}", method = RequestMethod.GET)
	public String ghouseDetail(@PathVariable("gh_no")int gh_no, @PathVariable("r_no")int r_no, Model model){
		List<GhouseRoomImages> ghouseRoomImages=this.ghouseService.ghouseDetail(gh_no, r_no);
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
		ghouseService.update(ghouse);
		return "main";
	}

	//mypage_room_info.jsp 서비스 맵퍼 sql 작성해야함(roomcontroller 에서 해야함)
	@RequestMapping("/mypageRoomInfo/{r_no}")
	public String mypageRoomInfo(@PathVariable("r_no")int r_no, Model model){
		return "/mypage/mypage_room_info";
	}





	@RequestMapping("/mypage_host")		// host
	public String mypage_host() {
		return "/mypage/mypage_host";
	}
	@RequestMapping("/mypage_host_customerList")	// 접근권한
	public String mypage_host_customerList() {
		return "/host/mypage_host_customerList";
	}
	@RequestMapping("/mypage_host_info")		//접근권한
	public String mypage_host_info() {
		return "/host/mypage_host_info";
	}
	@RequestMapping("/mypage_house_info")	//접근권한
	public String mypage_house_info() {
		return "/host/mypage_house_info";
	}
	@RequestMapping("/mypage_room_info")		//접근권한
	public String mypage_room_info() {
		return "/host/mypage_room_info";
	}
	@RequestMapping("/mypage_user")		//접근권한
	public String mypage_user() {
		return "/host/mypage_user";
	}
	@RequestMapping("/mypage_user_booking")		//접근권한
	public String mypage_user_booking() {
		return "/host/mypage_user_booking";
	}
	@RequestMapping("/room_cancel")		// 안내
	public String room_cancel() {
		return "/room/room_cancel";
	}
	@RequestMapping("/booking_confirm")	// 뭔지모르겠
	public String booking_confirm() {
		return "/room/booking_confirm";
	}

}
