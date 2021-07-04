package com.javalec.project_zagoga.mapper.sql;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javalec.project_zagoga.dto.Users;
import org.apache.ibatis.jdbc.SQL;

import java.util.HashMap;

public class UserSQL {

    private static final String TABLE = "USERS";
    private static final String SNS_TABLE = "SNS_USERS";

    public static final String GET_USERS_LIST = "select * from "+TABLE;

//    작성 방법은 아래 페이지 참조
//    https://mybatis.org/mybatis-3/ko/statement-builders.html
    public String loadUserByName(String username) {
        return new SQL()
                .SELECT("*")
                .FROM(TABLE)
                .WHERE("U_MAIL = #{username}")
                .toString();
    }

    public String loadUserBySNS(String snsID) {
        System.out.println("loadUserBySNS: "+snsID);
        return new SQL()
                .SELECT(TABLE+".*")
                .FROM(TABLE)
                .JOIN(SNS_TABLE+" SNS on "+TABLE+".U_NO = SNS.U_NO" )
                .WHERE("SNS.ID = #{snsID}")
                .toString();
//        테이블 만들어서 조인 문 확인하고 작성하기
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
                if(key.equals("u_no") || key.equals("u_join") || key.equals("u_role")){ continue; }
                VALUES(key.toUpperCase(), "#{user."+key+"}");
            }
        }}.toString();
    }

    public String insertBySNS(String snsID, Users user) {
        return new SQL() {{
            INSERT_INTO(SNS_TABLE);
            VALUES("ID", "#{snsID}");
            VALUES("U_NO", "#{user.u_no}");
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

    public String nickCheck(String u_nick){
        return new SQL()
                .SELECT("count(*)")
                .FROM(TABLE)
                .WHERE("U_NICK = #{U_NICK}")
                .toString();
    }

    public String check_mail(String u_mail){
        return new SQL()
                .SELECT("count(*)")
                .FROM(TABLE)
                .WHERE("U_MAIL=#{U_MAIL}")
                .toString();
    }

}
