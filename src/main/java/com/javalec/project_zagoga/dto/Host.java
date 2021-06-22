package com.javalec.project_zagoga.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Host {
    private int h_no;
    private String h_bizno;
    private String h_name;
    private String h_jumin;
    private String h_email;
    private String h_phone;
    private  String h_bank;
    private String h_join;
}
