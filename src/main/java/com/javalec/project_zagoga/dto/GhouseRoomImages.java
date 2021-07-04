package com.javalec.project_zagoga.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GhouseRoomImages {
    private int gh_no;
    private String gh_name;
    private String gh_image;
    private String gh_addr1;
    private String gh_addr2;
    private String gh_detail;
    private int gh_hno;

    private int r_no;
    private String r_name;
    private int r_pmin;
    private int r_pmax;
    private int r_fee;
    private String r_detail;
    private int r_ghno;

    private int i_no;
    private List i_name;
    private String i_path;
    private int i_rno;



}
