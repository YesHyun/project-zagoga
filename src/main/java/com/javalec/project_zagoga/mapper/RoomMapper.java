package com.javalec.project_zagoga.mapper;

import com.javalec.project_zagoga.dto.Images;
import com.javalec.project_zagoga.dto.Room;
import com.javalec.project_zagoga.dto.RoomImages;
import com.javalec.project_zagoga.mapper.sql.RoomSQL;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface RoomMapper {
//	@Select(RoomSQL.GET_ROOM_DETAIL)
//	List<Room> getRoomDetail();

//	@Select("SELECT * FROM ROOMS WHERE R_NO = #{R_NO}")
//	public List<Room> getDetail(@Param("R_NO") int R_NO);

	@SelectProvider(type = RoomSQL.class, method = "detail")
	Room detail(@Param("r_ghno")int r_ghno);

	@SelectProvider(type = RoomSQL.class, method = "getDetail")
	List<RoomImages> getDetail(@Param("r_no")int r_no);

	@SelectProvider(type = RoomSQL.class, method = "list")
	Room list(@Param("r_ghno")int r_ghno);

//	@Insert("INSERT INTO ROOMS(R_NAME, R_PMIN, R_PMAX, R_FEE, R_DETAIL, R_GHNO) VALUES(#{R_NAME}, #{R_NAME}, #{R_PMAX}, #{R_FEE}, #{R_DETAIL}, #{R_GHNO})")
//	public void insert(@Param("R_NAME")String R_NAME,@Param("R_PMIN")int R_PMIN,@Param("R_PMAX")int R_PMAX,@Param("R_FEE")int R_FEE,@Param("R_DETAIL")String R_DETAIL,@Param("R_GHNO")int R_GHNO);

	@InsertProvider(type = RoomSQL.class,  method = "insertRoom")
	int insertRoom(@Param("room") Room room );

	@SelectProvider(type = RoomSQL.class, method = "mypageRoomInfo")
	List<RoomImages> mypageRoomInfo(@Param("r_no")int r_no);

	@UpdateProvider(type = RoomSQL.class, method = "update")
	void update(@Param("room") Room room);

	@SelectProvider(type = RoomSQL.class, method = "getGhno")
	int getGhno(@Param("h_no")int h_no);

	@InsertProvider(type = RoomSQL.class, method = "imageInsert")
	void imageInsert(@Param("images") Images images);

	@DeleteProvider(type = RoomSQL.class, method = "delete")
	int delete(@Param("r_no")int r_no, @Param("r_ghno")int r_ghno);


}
