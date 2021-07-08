package com.javalec.project_zagoga.services;

import com.javalec.project_zagoga.dto.Images;
import com.javalec.project_zagoga.dto.Room;
import com.javalec.project_zagoga.dto.RoomImages;
import com.javalec.project_zagoga.mapper.RoomMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomMapper roomMapper;
    public RoomService(RoomMapper roomMapper){
        this.roomMapper=roomMapper;
    }

    public Room detail(int r_ghno){return roomMapper.detail(r_ghno);}

    public List<Room> list(int r_ghno){
        return (List<Room>) roomMapper.list(r_ghno);
    }
//
//    public void insert(String R_NAME, int R_PMIN, int R_PMAX, int R_FEE, String R_DETAIL, int R_GHNO){
//        this.roomMapper.insert(R_NAME, R_PMIN, R_PMAX, R_FEE, R_DETAIL, R_GHNO);
//    }
//    public List<Room> getDetail(Room room){
//        return this.roomMapper.getDetail(room);
//    }

//    public Room getGhouseRoom(int r_ghno){return roomMapper.list(r_ghno);}

    public List<RoomImages> getDetail(int r_no){
        return roomMapper.getDetail(r_no);
    }

    public void imageInsert(Images images){
        roomMapper.imageInsert(images);
    }

    public List<RoomImages> mypageRoomInfo(int r_no){
        return roomMapper.mypageRoomInfo(r_no);
    }

    public int insertRoom(Room room){
        return roomMapper.insertRoom(room);
    }
    public int getGhno(int h_no){return roomMapper.getGhno(h_no);}

    public void update(Room room){
        roomMapper.update(room);
    }

    public int delete(int r_no, int r_ghno){
        return roomMapper.delete(r_no, r_ghno);
    }
}

