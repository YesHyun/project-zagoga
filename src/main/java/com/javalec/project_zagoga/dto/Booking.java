package com.javalec.project_zagoga.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Booking {
    private int b_no;
    private Date b_in;
    private Date b_out;
    private boolean b_state;
    private int b_pno;
    private Timestamp b_join;
    private int b_rno;
    private int b_uno;

}
