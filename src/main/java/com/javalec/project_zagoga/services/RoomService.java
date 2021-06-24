package com.javalec.project_zagoga.services;

import com.javalec.project_zagoga.dto.Room;
import com.javalec.project_zagoga.mapper.RoomMapper;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private final RoomMapper roomMapper;
    public RoomService(RoomMapper roomMapper){
        this.roomMapper=roomMapper;
    }

//    public List<Room> getDetail(int R_NO){
//        return this.roomMapper.getDetail(R_NO);
//    }
//
//    public void insert(String R_NAME, int R_PMIN, int R_PMAX, int R_FEE, String R_DETAIL, int R_GHNO){
//        this.roomMapper.insert(R_NAME, R_PMIN, R_PMAX, R_FEE, R_DETAIL, R_GHNO);
//    }
//    public List<Room> getDetail(Room room){
//        return this.roomMapper.getDetail(room);
//    }

    public Room getDetail(int r_no){
        return roomMapper.getDetail(r_no);
    }


//    public void insert(String R_NAME, int R_PMIN, int R_PMAX, int R_FEE, String R_DETAIL, int R_GHNO){
//        this.roomMapper.insert(R_NAME, R_PMIN, R_PMAX, R_FEE, R_DETAIL, R_GHNO);
//    }

    public int insert(Room room){
        return roomMapper.insert(room);
    }

    public int update(Room room){
        return roomMapper.update(room);
    }

    public int delete(int r_no, int r_ghno){
        return roomMapper.delete(r_no, r_ghno);
    }
}

