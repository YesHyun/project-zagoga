package com.javalec.project_zagoga.services;

import com.javalec.project_zagoga.dto.Booking;
import com.javalec.project_zagoga.dto.BookingRoomGhouseUsers;
import com.javalec.project_zagoga.dto.Users;
import com.javalec.project_zagoga.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookMapper bookMapper;
    public BookService(BookMapper bookMapper){this.bookMapper=bookMapper;}

    public Users getUserInfo(int u_no){
        return bookMapper.getUserInfo(u_no);
    }

    public List<Booking> bookConfirmInfo(int u_no, int r_no) {
        return bookMapper.bookConfirmInfo(u_no, r_no);
    }

    public int insertBook(Booking booking) {
        return bookMapper.insertBook(booking);
    }

    public List<BookingRoomGhouseUsers> getBookInfo(int u_no, int r_no) {
        return bookMapper.getBookInfo(u_no, r_no);
    }

    public BookingRoomGhouseUsers getBookingConfirm(BookingRoomGhouseUsers info){
        return bookMapper.getBookingConfirm(info);
    }
}
