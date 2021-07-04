package com.javalec.project_zagoga.services;


import com.javalec.project_zagoga.dto.Users;
import com.javalec.project_zagoga.mapper.UsersMapper;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsersService {

    private final UsersMapper usersMapper;
    private final PasswordEncoder passwordEncoder;
//    public UsersService(UsersMapper usersMapper){ this.usersMapper=usersMapper; }

//    sercurity 사용 전에 필요하던 부분, 지금은 필요 없음
//    public Users checkUserMailAndPwd(Users user) {
//        return usersMapper.checkUserMailAndPwd(user.getU_mail(), user.getU_pwd());
//    }

    public void userInsert(Users user) {
        String eMail = user.getU_mail().replace(",", "");
        String encPwd = passwordEncoder.encode(user.getU_pwd());
        String jumin = user.getU_jumin().replace(",", "");
        String phone = user.getU_phone().replace(",", "");
        user.setU_mail(eMail);
        user.setU_pwd(encPwd);
        user.setU_jumin(jumin);
        user.setU_phone(phone);

        usersMapper.insertUser(user);
    }

    public int userDelete(Users user) {
        // 유저가 삭제되면 무엇은 지우고 무엇은 유지 할 것 인지 정해야 함
        return  usersMapper.delete(user.getU_no());

    }
    public int nickCheck(String u_nick){
        // 닉네임 중복체크
        return usersMapper.nickCheck(u_nick);
    }

}
