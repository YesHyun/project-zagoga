package com.javalec.project_zagoga.mapper;

import com.javalec.project_zagoga.dto.Board;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface BoardMapper {
	
	@Select("SELECT * FROM GHOUSE")
	public List<Board> getList();

	@Insert("INSERT INTO GHOUSE(GH_NAME, GH_ADDR1, GH_ADDR2, GH_DETAIL, GH_HNO) VALUES(#{gh_name}, #{gh_addr1}, #{gh_addr2}, #{gh_detail}, #{gh_hno})")
	public void insert(@Param("gh_name")String gh_name, @Param("gh_addr1")String gh_addr1, @Param("gh_addr2")String gh_addr2, @Param("gh_detail")String gh_detail, @Param("gh_hno")String gh_hno);

	@Delete("DELETE FROM GHOUSE WHERE GH_NO = #{GH_NO}")
	public void delete(@Param("GH_NO")int GH_NO);

	@Select("SELECT * FROM GHOUSE WHERE GH_NO = #{GH_NO}")
	public List<Board> getOne(@Param("GH_NO")int GH_NO);
}
