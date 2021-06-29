package com.javalec.project_zagoga.mapper;

import com.javalec.project_zagoga.dto.Ghouse;
import com.javalec.project_zagoga.sql.GhouseSQL;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface GhouseMapper {
	
//	@Select("SELECT * FROM GHOUSE")
//	public List<Ghouse> getList();

//	@SelectProvider("SELECT * FROM GHOUSE")
//	public List<Board> getList();
	@Select(GhouseSQL.GET_ALL_LIST)
	List<Ghouse> getList();

//	@Insert("INSERT INTO GHOUSE(GH_NAME, GH_ADDR1, GH_ADDR2, GH_DETAIL, GH_HNO) VALUES(#{gh_name}, #{gh_addr1}, #{gh_addr2}, #{gh_detail}, #{gh_hno})")
//	public void insert(@Param("gh_name")String gh_name, @Param("gh_addr1")String gh_addr1, @Param("gh_addr2")String gh_addr2, @Param("gh_detail")String gh_detail, @Param("gh_hno")String gh_hno);
	@InsertProvider(type = GhouseSQL.class, method = "insert")
	int insert(@Param("ghouse")Ghouse ghouse);

	@UpdateProvider(type = GhouseSQL.class, method = "update")
	int update(@Param("ghouse")Ghouse ghouse);


//	@Delete("DELETE FROM GHOUSE WHERE GH_NO = #{GH_NO}")
//	public void delete(@Param("GH_NO")int GH_NO);
	@DeleteProvider(type = GhouseSQL.class, method = "delete")
	int delete(int gh_no, int gh_hno);


//	@Select("SELECT * FROM GHOUSE WHERE GH_NO = #{GH_NO}")
//	public List<Ghouse> getOne(@Param("GH_NO")int GH_NO);
	@SelectProvider(type = GhouseSQL.class, method = "selectOne")
	Ghouse selectOne(int gh_no);

	@SelectProvider(type = GhouseSQL.class, method = "lowFee")
	int lowFee(int gh_no);

}
