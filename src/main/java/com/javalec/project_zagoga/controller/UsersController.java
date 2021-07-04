package com.javalec.project_zagoga.controller;

import com.javalec.project_zagoga.mapper.UsersMapper;
import com.javalec.project_zagoga.security.PrincipalUser;
import lombok.AllArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/user")
public class UsersController {

    private final UsersMapper usersMapper;

    //user : 마이페이지 유저 회원정보 변경
    @RequestMapping("/mypage_user_info")
    public String mypage_user_info(@AuthenticationPrincipal PrincipalUser user, Model model) {
         model.addAttribute("user", usersMapper.get(user.getNo()));
        return "/mypage/mypage_user_info";
    }
}
