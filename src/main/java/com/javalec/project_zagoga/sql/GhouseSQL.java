package com.javalec.project_zagoga.sql;

import com.javalec.project_zagoga.dto.Ghouse;
import org.apache.ibatis.jdbc.SQL;

public class GhouseSQL {
    private static final String TABLE="GHOUSE";
    public static final String GET_ALL_LIST="select * from " + TABLE;

    public String insert(Ghouse ghouse){
        return new SQL()
                .INSERT_INTO(TABLE)
                .INTO_COLUMNS("GH_NAME", "GH_IMAGE", "GH_ADDR1", "GH_ADDR2", "GH_DETAIL", "GH_HNO")
                .INTO_VALUES("#{ghouse.gh_name}", "#{ghouse.gh_image}", "#{ghouse.gh_addr1}", "#{ghouse.gh_addr2}", "#{ghouse.gh_detail}", "#{ghouse.gh_hno}")
                .toString();
    }
//    public String insert(Ghouse ghouse){
//        ObjectMapper objectMapper = new ObjectMapper();
//        HashMap<String, Object> ghouse_map = objectMapper.convertValue(ghouse, HashMap.class);
//        return new SQL() {{
//            INSERT_INTO(TABLE);
//            for(String key: ghouse_map.keySet()){
//                if(key.equals("gh_hno")){ continue; }
//                VALUES(key.toUpperCase(), "#{ghouse."+key+"}");
//            }
//        }}.toString();
//    }


    public String update(Ghouse ghouse){
        return new SQL(){{
            UPDATE(TABLE);
            SET("GH_NAME = #{ghouse.gh_name}");
            SET("GH_IMAGE = #{ghouse.gh_imgae}");
            SET("GH_ADDR1 = #{ghouse.gh_addr1}");
            SET("GH_ADDR2 = #{ghouse.gh_addr2}");
            SET("GH_DETAIL = #{ghouse.gh_detail}");
            WHERE("GH_HNO = #{ghouse.gh_hno");
            WHERE("GH_NO = #{ghouse.gh_no");
        }}.toString();
    }

    public String delete(int gh_no, int gh_hno){
        return new SQL()
                .DELETE_FROM(TABLE)
                .WHERE("GH_HNO = #{gh_hno}")
                .WHERE("GH_NO = #{gh_no}")
                .toString();
    }

    public String selectOne(int gh_no){
        return new SQL()
                .SELECT("*")
                .FROM(TABLE)
//                .WHERE("GH_NO = #{gh_no}")
                .WHERE("GH_NO = 2")
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
