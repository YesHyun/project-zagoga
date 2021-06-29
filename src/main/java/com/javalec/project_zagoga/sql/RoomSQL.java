package com.javalec.project_zagoga.sql;

import com.javalec.project_zagoga.dto.Room;
import org.apache.ibatis.jdbc.SQL;

public class RoomSQL {
    private static final String TABLE="ROOMS";
    public static final String GET_ROOM_DETAIL="select * from " + TABLE;

    public String insertRoom(Room room){
        return new SQL()
                .INSERT_INTO(TABLE)
                .INTO_COLUMNS("R_NAME", "R_PMIN", "R_PMAX", "R_FEE", "R_DETAIL", "R_GHNO")
                .INTO_VALUES("#{R_NAME}", "#{R_NAME}", "#{R_PMAX}", "#{R_FEE}", "#{R_DETAIL}", "#{R_GHNO}")
                .toString();
    }

    public String getDetail(int r_no){
        return new SQL()
                .SELECT("*")
                .FROM(TABLE)
                .WHERE("R_NO = #{r_no}")
//                .WHERE("R_NO = 4")
                .toString();
    }

    public String update(Room room){
        return new SQL(){{
                UPDATE(TABLE);
                SET("R_NAME = #{room.r_no}");
                SET("R_PMIN = #{room.r_pmin}");
                SET("R_PMAX = #{room.r_pmax}");
                SET("R_FEE = #{room.r_fee}");
                SET("R_DETAIL = #{r_detail}");
                WHERE("R_NO = #{r_no}");
                WHERE("R_GHNO = #{r_ghno");
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
