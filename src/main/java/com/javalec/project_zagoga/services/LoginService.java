package com.javalec.project_zagoga.services;

import com.javalec.project_zagoga.dto.Users;
import com.javalec.project_zagoga.mapper.UsersMapper;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final UsersMapper usersMapper;
    public LoginService(UsersMapper usersMapper){ this.usersMapper=usersMapper; }

    public Users checkUserMailAndPwd(Users user) {
        return usersMapper.checkUserMailAndPwd(user.getU_mail(), user.getU_pwd());
    }


}
