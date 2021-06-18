package com.javalec.projectzagoga.Service;

import com.javalec.projectzagoga.Mapper.BoardMapper;
import com.javalec.projectzagoga.dto.board;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BoardService {
	private final BoardMapper boardMapper;
	public BoardService(BoardMapper boardMapper) {

		this.boardMapper=boardMapper;
	}
	
	public List<board> getList(){

		return this.boardMapper.getList();
	}
}
