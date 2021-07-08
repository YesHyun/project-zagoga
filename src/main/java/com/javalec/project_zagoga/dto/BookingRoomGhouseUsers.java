package com.javalec.project_zagoga.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookingRoomGhouseUsers {

    private int b_no;
    private Date b_in;
    private Date b_out;
    private boolean b_state;
    private int b_pno;
    private Timestamp b_join;
    private int b_rno;
    private int b_uno;

        private int r_no;
    private String r_name;
    private int r_pmin;
    private int r_pmax;
    private int r_fee;
    private String r_detail;
    private int r_ghno;

    private int gh_no;
    private String gh_name;
    private String gh_image;
    private String gh_addr1;
    private String gh_addr2;
    private String gh_detail;
    private int gh_hno;

    private int u_no;
    private String u_mail;
    private String u_pwd;
    private String u_name;
    private String u_nick;
    private String u_gender;
    private String u_jumin;
    private String u_phone;
    private String u_join;






//    public static int totalFee(Date b_in, Date b_out, int r_fee, int b_pno){
//        long daylong = ((b_out.getTime() - b_in.getTime()) / (24*60*60*1000));
//        int day = (int)daylong;
//        int totalFee = r_fee * b_pno * day;
//        return totalFee;
//    }
}
