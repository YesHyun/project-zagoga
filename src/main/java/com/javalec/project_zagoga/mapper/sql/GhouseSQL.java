package com.javalec.project_zagoga.mapper.sql;

import com.javalec.project_zagoga.dto.Ghouse;
import com.javalec.project_zagoga.dto.GhouseRoom;
import org.apache.ibatis.jdbc.SQL;

public class GhouseSQL {
    private static final String TABLE="GHOUSE";
    private static final String Rooms="ROOMS";
    private static final String Images="IMAGES";
    public static final String GET_ALL_LIST="select * from " + TABLE;

    //select GH_NO, GH_NAME, GH_IMAGE, MIN(R_FEE) from GHOUSE,ROOMS group by GH_NO;
    public String getList(GhouseRoom ghouseRoom){
        return new SQL()
                .SELECT("GH_NO, GH_NAME, GH_IMAGE, MIN(R_FEE)'R_FEE'")
                .FROM(TABLE,Rooms)
                .GROUP_BY("GH_NO")
                .toString();
    }

    public String insert(Ghouse ghouse){
        return new SQL()
                .INSERT_INTO(TABLE)
                .INTO_COLUMNS("GH_NAME", "GH_IMAGE", "GH_ADDR1", "GH_ADDR2", "GH_DETAIL", "GH_HNO")
                .INTO_VALUES("#{ghouse.gh_name}", "#{ghouse.gh_image}", "#{ghouse.gh_addr1}", "#{ghouse.gh_addr2}", "#{ghouse.gh_detail}", "#{ghouse.gh_hno}")
                .toString();
    }

    public String roomAndGhouse(int gh_no){
        return new SQL()
                .SELECT("*")
                .FROM(TABLE,Rooms)
                .WHERE("GH_NO = #{gh_no}")
                .WHERE("R_GHNO = #{gh_no}")
                .toString();
    }

//select * from
// GHOUSE join ROOMS R on GHOUSE.GH_NO = R.R_GHNO join IMAGES I on R.R_NO = I.I_RNO
// where I_RNO >= (select min(R_NO)'R_NO' from ROOMS where R_GHNO = 2)
// and I_RNO <= (select max(R_NO)'R_NO' from ROOMS where R_GHNO = 2)
// order by I_RNO and I_NO desc;
    public String ghouseDetail(int gh_no){
        return new SQL()
                .SELECT("GH_NAME", "GH_IMAGE", "GH_ADDR1", "GH_ADDR2", "GH_DETAIL")
                .FROM("GHOUSE join ROOMS R on GHOUSE.GH_NO = R.R_GHNO join IMAGES I on R.R_NO = I.I_RNO ")
                .WHERE("I_RNO >= (select min(R_NO)'R_NO' from ROOMS where R_GHNO = #{gh_no}) and I_RNO <= (select max(R_NO)'R_NO' from ROOMS where R_GHNO = #{gh_no})")
                .ORDER_BY("I_RNO and I_NO desc")
                .toString();
    }

    public String update(Ghouse ghouse){
        return new SQL(){{
            UPDATE(TABLE);
            SET("GH_NAME = #{ghouse.gh_name}");
            SET("GH_IMAGE = #{ghouse.gh_image}");
            SET("GH_ADDR1 = #{ghouse.gh_addr1}");
            SET("GH_ADDR2 = #{ghouse.gh_addr2}");
            SET("GH_DETAIL = #{ghouse.gh_detail}");
            WHERE("GH_HNO = #{ghouse.gh_hno}");
            WHERE("GH_NO = #{ghouse.gh_no}");
        }}.toString();
    }

    public String delete(int gh_no, int gh_hno){
        return new SQL()
                .DELETE_FROM(Rooms)
                .WHERE("GH_NO = #{gh_no}")
                .WHERE("GH_HNO = #{gh_hno}")
                .toString();
    }

    public String selectOne(int gh_no){
        return new SQL()
                .SELECT("*")
                .FROM(TABLE)
                .WHERE("GH_NO = #{gh_no}")
//                .WHERE("GH_NO = 2")
                .toString();
    }

    public String updateView(int gh_no){
        return new SQL()
                .SELECT("*")
                .FROM(TABLE)
                .WHERE("GH_NO = #{gh_no}")
//                .WHERE("GH_NO = 2")
                .toString();
    }

    public String lowFee(int gh_no){
        return new SQL()
                .SELECT("R_FEE")
                .FROM("ROOMS")
                .WHERE("R_GHNO = ${gh_no}")
                .ORDER_BY("R_FEE ASC")
                .LIMIT(1)
                .toString();
    }
}
