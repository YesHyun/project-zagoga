package com.javalec.project_zagoga.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoomImages {
    private int r_no;
    private String r_name;
    private int r_pmin;
    private int r_pmax;
    private int r_fee;
    private String r_detail;
    private int r_ghno;

    private int i_no;
    private String i_name;
    private String i_path;
    private int i_rno;
}
