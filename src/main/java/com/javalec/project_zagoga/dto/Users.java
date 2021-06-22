package com.javalec.project_zagoga.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Users {
    private int u_no;
    private String u_mail;
    private String u_pwd;
    private String u_name;
    private String u_nick;
    private String u_gender;
    private String u_jumin;
    private String u_phone;
    private String u_join;
}
