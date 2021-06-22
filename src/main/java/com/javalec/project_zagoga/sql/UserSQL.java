package com.javalec.project_zagoga.sql;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javalec.project_zagoga.dto.Users;
import org.apache.ibatis.jdbc.SQL;

import java.util.HashMap;

public class UserSQL {

    private static final String TABLE = "USERS";

    public static final String GET_USERS_LIST = "select * from "+TABLE;

//    작성 방법은 아래 페이지 참조
//    https://mybatis.org/mybatis-3/ko/statement-builders.html
    public String checkUserMailAndPwd(String u_mail, String u_pwd) {
        return new SQL()
                .SELECT("*")
                .FROM(TABLE)
                .WHERE("U_MAIL = #{u_mail}")
                .AND()
                .WHERE("U_PWD = #{u_pwd}")
                .toString();
    }


    public String getUserByUNo(int u_no) {
        return new SQL()
                .SELECT("*")
                .FROM(TABLE)
                .WHERE("U_NO = #{u_no}")
                .toString();
    }

    public String insertUser(Users user) {
        ObjectMapper objectMapper = new ObjectMapper();
        HashMap<String, Object> user_map = objectMapper.convertValue(user, HashMap.class);
        return new SQL() {{
            INSERT_INTO(TABLE);
            for(String key: user_map.keySet()){
                if(key.equals("u_no")){ continue; }
                VALUES(key.toUpperCase(), "#{user."+key+"}");
            }
        }}.toString();
    }

    public String updateUser(Users user) {
        return new SQL() {{
            UPDATE(TABLE);
            SET("U_NAME = #{user.u_no}");
            SET("U_NICK = #{user.u_nick}");
            SET("U_MAIL = #{user.u_mail}");
            SET("U_PWD = #{user.u_pwd}");
            SET("U_GENDER = #{user.u_gender}");
            SET("U_JUMIN = #{user.u_jumin}");
            SET("U_PHONE = #{user.u_phone}");
        }}.toString();
    }

    public String deleteUser(int u_no) {
        return new SQL()
                .DELETE_FROM(TABLE)
                .WHERE("U_NO = #{u_no}")
                .toString();
    }

}
