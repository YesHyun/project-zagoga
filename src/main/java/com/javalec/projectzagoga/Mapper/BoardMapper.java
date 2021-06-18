package com.javalec.projectzagoga.Mapper;

import com.javalec.projectzagoga.dto.board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface BoardMapper {
	
	@Select("SELECT * FROM GHOUSE")
	public List<board> getList();
}
