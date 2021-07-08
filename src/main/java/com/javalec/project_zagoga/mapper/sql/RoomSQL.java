package com.javalec.project_zagoga.mapper.sql;

import com.javalec.project_zagoga.dto.Images;
import com.javalec.project_zagoga.dto.Room;
import org.apache.ibatis.jdbc.SQL;

public class RoomSQL {
    private static final String TABLE="ROOMS";
    private static final String Images="IMAGES";
    public static final String GET_ROOM_DETAIL="select * from " + TABLE;

    public String detail(int r_ghno){
        return new SQL()
                .SELECT("*")
                .FROM(TABLE)
                .WHERE("R_GHNO = #{r_ghno}")
                .ORDER_BY("R_NO desc")
                .LIMIT(1)
                .toString();
    }

    public String insertRoom(Room room){
        return new SQL()
                .INSERT_INTO(TABLE)
                .INTO_COLUMNS("R_NAME", "R_PMIN", "R_PMAX", "R_FEE", "R_DETAIL", "R_GHNO")
                .INTO_VALUES("#{room.r_name}", "#{room.r_pmin}", "#{room.r_pmax}", "#{room.r_fee}", "#{room.r_detail}", "#{room.r_ghno}")
                .toString();
    }

    public String mypageRoomInfo(int r_no){
        return new SQL()
                .SELECT("*")
                .FROM(TABLE,Images)
                .WHERE("R_NO = #{r_no}")
                .WHERE("I_RNO = #{r_no}")
                .ORDER_BY("I_NO desc")
                .toString();
    }

    public String imageInsert(Images images){
        return new SQL()
                .INSERT_INTO(Images)
                .INTO_COLUMNS("I_NAME", "I_PATH", "I_RNO")
                .INTO_VALUES("#{images.i_name}", "#{images.i_path}", "#{images.i_rno}")
                .toString();
    }

    public String list(int r_ghno){
        return new SQL()
                .SELECT("*")
                .FROM(TABLE)
                .WHERE("R_GHNO = #{r_ghno}")
                .toString();
    }

    public String getGhno(int h_no){
        return new SQL()
                .SELECT("GH_NO")
                .FROM("GHOUSE")
                .WHERE("GH_HNO #{h_no}")
                .ORDER_BY("GH_NO DESC")
                .LIMIT(1)
                .toString();
    }


    public String getDetail(int r_no){
        return new SQL()
                .SELECT("*")
                .FROM(TABLE,Images)
                .WHERE("R_NO = #{r_no}")
                .WHERE("I_RNO = #{r_no}")
                .ORDER_BY("I_NO DESC")
                .toString();
    }

    public String update(Room room){
        return new SQL(){{
                UPDATE(TABLE);
                SET("R_NAME = #{room.r_name}");
                SET("R_PMIN = #{room.r_pmin}");
                SET("R_PMAX = #{room.r_pmax}");
                SET("R_FEE = #{room.r_fee}");
                SET("R_DETAIL = #{room.r_detail}");
                WHERE("R_NO = #{room.r_no}");
                WHERE("R_GHNO = #{room.r_ghno}");
        }}.toString();
    }

    public String delete(int r_no, int r_ghno){
        return new SQL()
                .DELETE_FROM(TABLE)
                .WHERE("R_GHNO = #{r_ghno}")
                .WHERE("R_NO = #{r_no}")
//                .WHERE("R_NO = 1")
                .toString();
    }


}
