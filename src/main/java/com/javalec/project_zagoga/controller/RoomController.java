package com.javalec.project_zagoga.controller;

import com.javalec.project_zagoga.dto.Room;
import com.javalec.project_zagoga.services.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/room")
public class RoomController {
    private final RoomService roomService;
    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }
//    @GetMapping("/detail")
//    public String getDetail(Model model ,Room room){
//        Room r = roomService.getDetail(room);
//        List<Room> show = this.roomService.getDetail(room);
//        model.addAttribute("detail", show);
//        return "main";
//    }

    @GetMapping("/getDetail")
    public String getDetail(int r_no, Model model){
        Room show = this.roomService.getDetail(r_no);
//        roomService.getDetail(r_no);
        model.addAttribute("getDetail", show);
        return "main";
    }
//    @GetMapping("/insert/{R_NAME},{R_PMIN},{R_PMAX},{R_FEE},{R_DETAIL},{R_GHNO}")
//    public String insert(@PathVariable("R_NAME")String R_NAME, @PathVariable("R_PMIN")int R_PMIN, @PathVariable("R_PMIN")int R_PMAX, @PathVariable("R_FEE")int R_FEE, @PathVariable("R_DEATIL")String R_DETAIL, @PathVariable("R_GHNO")int R_GHNO){
//        this.roomService.insert(R_NAME, R_PMIN, R_PMAX, R_FEE, R_DETAIL, R_GHNO);
//        return "main";
//    }
    @PostMapping("/insert")
    public String insert(Room room){
        roomService.insert(room);
        return "main";
    }

    @PostMapping("/update")
    public String update(Room room){
        roomService.update(room);
        return "main";
    }

    @PostMapping("/delete")
    public String delete(int r_no, int r_ghno){
        roomService.delete(r_no, r_ghno);
        return "main";
    }
}
