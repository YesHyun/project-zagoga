package com.javalec.project_zagoga.controller;

import com.javalec.project_zagoga.dto.Users;
import com.javalec.project_zagoga.services.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    private final UsersService usersService;
    public LoginController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("")
    public String loginPage() { return "login"; }

    @PostMapping("/user")
    public String loginUser(Users user, Model model) {
        System.out.println(user.toString());
        Users u = usersService.checkUserMailAndPwd(user);
        model.addAttribute("user", u);
        if (u == null){
            return "login";
        }
        System.out.println(u.toString());
        return "main";
    }

    @PostMapping("/host")
    public void loginHost(){
        // 사업자 로그인

    }

}
