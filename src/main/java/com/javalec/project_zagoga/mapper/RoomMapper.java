package com.javalec.project_zagoga.mapper;

import com.javalec.project_zagoga.dto.Room;
import com.javalec.project_zagoga.sql.RoomSQL;
import org.apache.ibatis.annotations.*;


@Mapper
public interface RoomMapper {
//	@Select(RoomSQL.GET_ROOM_DETAIL)
//	List<Room> getRoomDetail();

//	@Select("SELECT * FROM ROOMS WHERE R_NO = #{R_NO}")
//	public List<Room> getDetail(@Param("R_NO") int R_NO);

	@SelectProvider(type = RoomSQL.class, method = "getDetail")
	Room getDetail(@Param("r_no")int r_no);

//	@Insert("INSERT INTO ROOMS(R_NAME, R_PMIN, R_PMAX, R_FEE, R_DETAIL, R_GHNO) VALUES(#{R_NAME}, #{R_NAME}, #{R_PMAX}, #{R_FEE}, #{R_DETAIL}, #{R_GHNO})")
//	public void insert(@Param("R_NAME")String R_NAME,@Param("R_PMIN")int R_PMIN,@Param("R_PMAX")int R_PMAX,@Param("R_FEE")int R_FEE,@Param("R_DETAIL")String R_DETAIL,@Param("R_GHNO")int R_GHNO);

	@InsertProvider(type = RoomSQL.class, method = "insertRoom")
	int insert(@Param("room") Room room);

	@UpdateProvider(type = RoomSQL.class, method = "update")
	int update(@Param("room") Room room);

	@DeleteProvider(type = RoomSQL.class, method = "delete")
	int delete(@Param("r_no")int r_no, @Param("r_ghno")int r_ghno);


}
