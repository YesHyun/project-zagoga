package com.javalec.project_zagoga.services;

import com.javalec.project_zagoga.mapper.UsersMapper;
import com.javalec.project_zagoga.util.MailHandler;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Random;

@Service
public class MailService {

    private JavaMailSender mailSender;
    private static final String FROM_ADDRESS = "eeeo5552@gmail.com";

    private final UsersMapper mapper;

    public MailService(UsersMapper UsersMapper, JavaMailSender mailSender){
        mapper = UsersMapper;
        this.mailSender = mailSender;
    }

    public void mailSend(HttpSession session, String u_mail) {
        try {
            MailHandler mailHandler = new MailHandler(mailSender);
            Random random = new Random(System.currentTimeMillis());
            int result = 100000+ random.nextInt(900000);

            // 받는 사람
            mailHandler.setTo(u_mail);
            // 보내는 사람
            mailHandler.setFrom(MailService.FROM_ADDRESS);
            // 제목
            mailHandler.setSubject("zagoga 인증번호 입니다.");
            // HTML Layout
            String htmlContent = "<p> 인증번호 : " + result + "<p>";
            mailHandler.setText(htmlContent, true);
//            String htmlContent = "<p>" + mailDto.getMessage() +"<p> <img src='cid:sample-img'>"; // 이미지 첨부했을 때,
//            mailHandler.setText(htmlContent, true);

//            // 첨부 파일
//            mailHandler.setAttach("newTest.txt", "static/originTest.txt");
//            // 이미지 삽입
//            mailHandler.setInline("sample-img", "static/sample1.jpg");

            mailHandler.send();

            session.setAttribute(""+u_mail, result); //세션 생성
            System.out.println("@@@@@@@#############"+ u_mail);
//            mapper.insert_authKey(result);
//          데이터 넣기

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }



    public int check_mail(String u_mail){
        return  mapper.check_mail(u_mail);
    }

    public boolean certification(HttpSession session, String u_mail, int inputCode){
        try {
            int preparedCode = (int) session.getAttribute(u_mail);
            System.out.println("preparedCode" + preparedCode);
            // u_mail로 보냈던 코드랑 비교하기 위해서 쓰는듯함

            if(preparedCode == inputCode){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }
}
