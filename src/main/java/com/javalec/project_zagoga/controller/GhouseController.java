package com.javalec.project_zagoga.controller;

import com.javalec.project_zagoga.dto.Ghouse;
import com.javalec.project_zagoga.services.GhouseService;
import com.javalec.project_zagoga.sql.GhouseSQL;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController("/board")
@Controller
@RequestMapping("/ghouse")
//@RestController 는 뷰페이지 반환 노노 데이터만! 네
public class GhouseController {
	private final GhouseService ghouseService;
	public GhouseController(GhouseService ghouseService) {

		this.ghouseService = ghouseService;
	}
//  	!!자바 정독 필요
////	@GetMapping("/getList")
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
//	public String getList(Model model) {
//		//jsp로 넘기고 받아오는거 컨트롤러에서 받은 데이터 jsp에서 사용하기
////		System.out.println(this.boardService.getList().toString());
//		List<Ghouse> show = this.ghouseService.getList();
//		System.out.println(show.toString());
////		List<Board> list = boardService.list();
// 		model.addAttribute("list", show);
// 		//model.add (1이름!, 2어떤값을 넘겨줄건가)
//		System.out.println("list");
//		return "main";
//	}
//	@GetMapping("/getlist")
	@RequestMapping(value = "/getList", method = RequestMethod.GET)
	public String getList(Model model){
		List<Ghouse> show = this.ghouseService.getList();
		System.out.println(show.toString());
		model.addAttribute("list",show);
		System.out.println("list");
		return "/room/gHouse_list_test";
	}

//	@GetMapping("/lowFee")/
	@RequestMapping(value = "/lowFee", method = RequestMethod.GET)
	public String lowFee(Model model){
		int gh_no = 2;
		Ghouse show = this.ghouseService.lowFee(gh_no);
		System.out.println(show.toString());
		model.addAttribute("lowfee", show);
		System.out.println("lowfee");
		return "/room/gHouse_list_test";
	}


	//PostMapping insert 사용
//	@GetMapping("/insert/{gh_name},{gh_addr1},{gh_addr2},{gh_detail},{gh_hno}")
//	public String insert(@PathVariable("gh_name")String gh_name,@PathVariable("gh_addr1")String gh_addr1,@PathVariable("gh_addr2")String gh_addr2,@PathVariable("gh_detail")String gh_detail,@PathVariable("gh_hno")int gh_hno) {
//		this.ghouseService.insert(gh_name, gh_addr1, gh_addr2, gh_detail, Integer.toString(gh_hno));
//		return "main";
//	}
//	@PostMapping("/insert")
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute Ghouse ghouse){
		ghouseService.insert(ghouse);
		System.out.println(ghouse.toString());
		return "redirect:/room/gHouse_write_test";
	}

	@RequestMapping("/write")
	public String gHouse_write() {
		return "/host/gHouse_write_test";
	}


//	@GetMapping("/delete/{GH_NO}")
//	public String delete(@PathVariable("GH_NO")int GH_NO){
//		this.ghouseService.delete(GH_NO);
//		return "main";
//	}
	@PostMapping("/delete")
	public String delete(int gh_no, int gh_hno){
		ghouseService.delete(gh_no, gh_hno);
		return "main";
	}

	@PostMapping("/update")
	public String update(Ghouse ghouse){
		ghouseService.update(ghouse);
		return "main";
	}

//	@GetMapping("/getOne/{GH_NO}")
//	public String getOne(Model model, @PathVariable("GH_NO")int GH_NO){
//		List<Ghouse> showOne = this.ghouseService.getOne(GH_NO);
//		System.out.println(showOne.toString());
//		model.addAttribute("getOne", showOne);
//		System.out.println("getOne");
//		return "main";
//	}
	@GetMapping("/selectOne")
	public String selectOne(Model model, int gh_no){
//		List<Ghouse> showOne = this.ghouseService.selectOne(gh_no);
		Ghouse showOne = this.ghouseService.selectOne(gh_no);
		model.addAttribute("selectOne", showOne);
		return "main";
	}


}
