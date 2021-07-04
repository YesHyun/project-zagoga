package com.javalec.project_zagoga.mapper;

import com.javalec.project_zagoga.dto.Users;
import com.javalec.project_zagoga.mapper.sql.UserSQL;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select(UserSQL.GET_USERS_LIST)
    List<Users> getUsersList();

    @SelectProvider(type= UserSQL.class, method = "loadUserByName")
    Users loadUserByName(@Param("username") String username);

    @SelectProvider(type = UserSQL.class, method = "loadUserBySNS")
    Users loadUserBySNS(@Param("snsID") String snsID);

    @SelectProvider(type = UserSQL.class, method = "getUserByUNo")
    Users get(@Param("u_no") int u_no);

    @Options(useGeneratedKeys = true, keyProperty = "u_no")
    @InsertProvider(type = UserSQL.class, method = "insertUser")
    void insertUser(@Param("user") Users user);
//    int insert(HashMap<String, Object> user_map);

    @InsertProvider(type = UserSQL.class, method = "insertBySNS")
    void insertBySNS(@Param("snsID") String snsID, @Param("user") Users user);

    @UpdateProvider(type = UserSQL.class, method = "updateUser")
//    int update(HashMap<String, Object> user_map);
    int update(@Param("user") Users user);

    @DeleteProvider(type = UserSQL.class, method = "deleteUser")
    int delete(int u_no);

    @SelectProvider(type = UserSQL.class, method = "nickCheck")
    int nickCheck(String u_nick);
    // 닉네임 중복체크
    @SelectProvider(type = UserSQL.class, method = "check_mail")
    int check_mail(String u_mail);
    //이메일 중복체크
}
