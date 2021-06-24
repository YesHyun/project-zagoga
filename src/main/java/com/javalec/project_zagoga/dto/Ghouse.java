package com.javalec.project_zagoga.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ghouse {
    private int gh_no;
    private String gh_name;
    private String gh_image;
    private String gh_addr1;
    private String gh_addr2;
    private String gh_detail;
    private int gh_hno;
    private int lowFee;



//    @Override
//    public String toString(){
//        return "board [no=" + no + ", gh_name=" + gh_name + ", gh_image=" + gh_image +
//                ", gh_addr1=" + gh_addr1 + ", gh_addr2=" + gh_addr2 +
//                ", gh_detail=" + gh_detail + ", gh_hno=" + gh_hno + "]\n";
//    }

}
