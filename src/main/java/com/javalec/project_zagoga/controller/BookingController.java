package com.javalec.project_zagoga.controller;

import com.javalec.project_zagoga.dto.Booking;
import com.javalec.project_zagoga.dto.BookingRoomGhouseUsers;
import com.javalec.project_zagoga.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookingController {
    private final BookService bookService;
    public BookingController(BookService bookService){ this.bookService=bookService;}

    //room_detail->booking_confirm(예약하기전)
    @RequestMapping(value = "/beforeBooking/{u_no},{r_no}")
    public String beforeBooking(@ModelAttribute("BookingRoomGhouseUsers") BookingRoomGhouseUsers info, @PathVariable("u_no")int u_no, @PathVariable("r_no")int r_no, Model model){
        int b_pno = info.getB_pno();
        Date b_in = info.getB_in();
        Date b_out = info.getB_out();
        info.setU_no(u_no);
        info = this.bookService.getBookingConfirm(info);
        info.setR_no(r_no);
        info.setB_in(b_in);
        info.setB_out(b_out);
        info.setB_pno(b_pno);
        System.out.println("beforeBookingbeforeBooking// BookingRoomGhouseUsers.toString"+info.toString());
        model.addAttribute("Info", info);
        return "/room/booking_confirm";
    }

    //예약하기 booking에 insert
    @RequestMapping(value = "/booking/{u_no},{r_no}")
    public String bookConfirmInfo(Booking booking ,@PathVariable("u_no")int u_no, @PathVariable("r_no")int r_no, Model model){
        System.out.println("booking.toString : " + booking.toString());
        booking.setB_uno(u_no);
        booking.setB_rno(r_no);
        bookService.insertBook(booking);
        return "main";
    }


    //
//    @RequestMapping(value = "/confirm2/{u_no},{r_no}")
//    public String bookConfirmInfo2(@PathVariable("u_no")int u_no, @PathVariable("r_no")int r_no){
//        List<Booking> bookings = this.bookService.bookConfirmInfo(u_no, r_no);
//        System.out.println("bookConfirmInfo2 // bookings.toString : " + bookings.toString());
//        return "redirect:/book/getBookInfo/" + u_no +","+ r_no;
//    }

    @RequestMapping(value = "/getBookInfo/{u_no},{r_no}")
    public String getBookInfo(@PathVariable("u_no")int u_no, @PathVariable("r_no")int r_no, Model model){
        List<BookingRoomGhouseUsers> bookInfo = this.bookService.getBookInfo(u_no, r_no);
        System.out.println("bookConfirmInfo2 // BRGU.toString : " + bookInfo.toString());
        model.addAttribute("Info", bookInfo);
        return "/room/booking_confirm";
    }






}
