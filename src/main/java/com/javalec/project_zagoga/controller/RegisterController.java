package com.javalec.project_zagoga.controller;

import com.javalec.project_zagoga.dto.Host;
import com.javalec.project_zagoga.dto.Users;
import com.javalec.project_zagoga.services.HostService;
import com.javalec.project_zagoga.services.MailService;
import com.javalec.project_zagoga.services.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@AllArgsConstructor
@Controller
@RequestMapping("/register")
public class RegisterController {

    private final UsersService usersService;
    private final HostService hostService;
    private final MailService mailService;

    @GetMapping("/{user_type}_join")
    public String registerPage(@PathVariable("user_type") String user_type) {
        return (user_type+"/"+user_type+"_join");
    }

    @PostMapping("/user")
    public String insertUser(Users user) {
        usersService.userInsert(user);
        return "redirect:/main";
    }

    @PostMapping("/host")
    public String insertHost(Host host) {
        System.out.println(host.toString());
//        hostService.hostInsert(host);
        return "redirect:/main";
    }

    @ResponseBody
    @PostMapping("/Checkmail")
    public void execMail(HttpServletRequest request, String u_mail) {
        HttpSession session = request.getSession(); // 세션얻어옴
        mailService.mailSend(session, u_mail); // 메일보내기
    }



    @RequestMapping(value = "/checkSignup", method = RequestMethod.POST)
    public @ResponseBody String AjaxView(
            @RequestParam(value = "u_mail") String u_mail){
        String str = ""; //값 을 넘겨줄 친구
        int idcheck = mailService.check_mail(u_mail);
        if(idcheck==1){ //이미 존재하는 계정
            str = "NO";
        }else{	//사용 가능한 계정
            str = "YES";
        }
        return str;
    }

    @PostMapping("/certification.do")
    @ResponseBody
    private boolean certification(HttpServletRequest request, String u_mail, String inputCode){
        HttpSession session = request.getSession(); // 세션으로 넘긴값들을 받아옴

        boolean result = mailService.certification(session, u_mail, Integer.parseInt(inputCode));

        return result;
    }


    @PostMapping("/nickCheck.do")
    @ResponseBody
    public String nickCheck(@RequestParam(value = "u_nick") String u_nick){

        String str = ""; // 값을 넘겨줄 친구
        int result =  usersService.nickCheck(u_nick);
        if(result == 0){
            str= "Y";
        }else if(result ==1){
            str="N";
        }
        return str;
    }

}
