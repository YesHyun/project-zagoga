package com.javalec.project_zagoga.controller;

import com.javalec.project_zagoga.dto.Host;
import com.javalec.project_zagoga.dto.Users;
import com.javalec.project_zagoga.services.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/register")
public class RegisterController {

    private final UsersService usersService;

    @GetMapping("/{user_type}_join")
    public String registerPage(@PathVariable("user_type") String user_type) {
        return (user_type+"/"+user_type+"_join");
    }

    @PostMapping("/user")
    public String insertUser(Users user) {
        usersService.userInsert(user);
        return "redirect:/main";
    }

    @PostMapping("/host_join")
    public String insertHost(Host host) {
        return "redirect:/main";
    }

}
