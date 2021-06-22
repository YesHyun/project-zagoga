package com.javalec.project_zagoga.services;

import com.javalec.project_zagoga.dto.Board;
import com.javalec.project_zagoga.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BoardService {
	private final BoardMapper boardMapper;
	public BoardService(BoardMapper boardMapper) {

		this.boardMapper=boardMapper;
	}
	
	public List<Board> getList(){

		return this.boardMapper.getList();
	}
	public void insert(String gh_name, String gh_addr1, String gh_addr2, String gh_detail, String gh_hno){
		this.boardMapper.insert(gh_name, gh_addr1, gh_addr2, gh_detail, gh_hno);
	}

	public void delete(int GH_NO){
		this.boardMapper.delete(GH_NO);
	}

	public List<Board> getOne(int GH_NO){
		return this.boardMapper.getOne(GH_NO);
	}
}
