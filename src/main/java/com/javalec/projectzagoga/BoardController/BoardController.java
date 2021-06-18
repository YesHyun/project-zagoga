package com.javalec.projectzagoga.BoardController;

import com.javalec.projectzagoga.Service.BoardService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/board")
public class BoardController {
	private final BoardService boardService;
	public BoardController(BoardService boardService) {

		this.boardService = boardService;
	}
	
	@GetMapping("/getList")
	public String getList(Model model) {
		//jsp로 넘기고 받아오는거 컨트롤러에서 받은 데이터 jsp에서 사용하기
		System.out.println(this.boardService.getList().toString());

		model.addAttribute("value", "hi");

		return "boardList";

	}

}
