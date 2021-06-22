package com.javalec.project_zagoga.controller;

import com.javalec.project_zagoga.dto.Board;
import com.javalec.project_zagoga.services.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@RestController("/board")
@Controller
@RequestMapping("/board")
//@RestController 는 뷰페이지 반환 노노 데이터만! 네
public class BoardController {
	private final BoardService boardService;
	public BoardController(BoardService boardService) {

		this.boardService = boardService;
	}
//  	!!자바 정독 필요
	@GetMapping("/getList")
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getList(Model model) {
		//jsp로 넘기고 받아오는거 컨트롤러에서 받은 데이터 jsp에서 사용하기
//		System.out.println(this.boardService.getList().toString());
		List<Board> show = this.boardService.getList();
		System.out.println(show.toString());
//		List<Board> list = boardService.list();
 		model.addAttribute("list", show);
 		//model.add (1이름!, 2어떤값을 넘겨줄건가)
		System.out.println("list");
		return "main";
	}
	//PostMapping insert 사용
	@GetMapping("/insert/{gh_name},{gh_addr1},{gh_addr2},{gh_detail},{gh_hno}")
	public String insert(@PathVariable("gh_name")String gh_name,@PathVariable("gh_addr1")String gh_addr1,@PathVariable("gh_addr2")String gh_addr2,@PathVariable("gh_detail")String gh_detail,@PathVariable("gh_hno")int gh_hno) {
		this.boardService.insert(gh_name, gh_addr1, gh_addr2, gh_detail, Integer.toString(gh_hno));
		return "main";
	}

	@GetMapping("/delete/{GH_NO}")
	public String delete(@PathVariable("GH_NO")int GH_NO){
		this.boardService.delete(GH_NO);
		return "main";
	}

	@GetMapping("/getOne/{GH_NO}")
	public String getOne(Model model, @PathVariable("GH_NO")int GH_NO){
		List<Board> showOne = this.boardService.getOne(GH_NO);
		System.out.println(showOne.toString());
		model.addAttribute("getOne", showOne);
		System.out.println("getOne");
		return "main";
	}
}
