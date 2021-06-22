package com.javalec.project_zagoga.services;


import com.javalec.project_zagoga.dto.Users;
import com.javalec.project_zagoga.mapper.UsersMapper;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UsersMapper usersMapper;
    public UsersService(UsersMapper usersMapper){ this.usersMapper=usersMapper; }

    public Users checkUserMailAndPwd(Users user) {
        return usersMapper.checkUserMailAndPwd(user.getU_mail(), user.getU_pwd());
    }

    public int userInsert(Users user) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        HashMap<String, Object> user_map = objectMapper.convertValue(user, HashMap.class);
//        return usersMapper.insert(user_map);
        return usersMapper.insert(user);
    }

    public int userDelete(Users user) {
        // 유저가 삭제되면 무엇은 지우고 무엇은 유지 할 것 인지 정해야 함
        return  usersMapper.delete(user.getU_no());

    }

}
