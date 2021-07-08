package com.javalec.project_zagoga.controller;


import com.javalec.project_zagoga.dto.Images;
import com.javalec.project_zagoga.dto.Room;
import com.javalec.project_zagoga.dto.RoomImages;
import com.javalec.project_zagoga.services.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/room")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    //20210704 02:58 확인 (체크인&아웃 가져와야함..) r_no 4번으로 테스트
    @RequestMapping(value = "/getDetail/{r_no}", method = RequestMethod.GET)
    public String getDetail(@PathVariable("r_no") int r_no, Model model) {

        try {
            List<RoomImages> roomImages = this.roomService.getDetail(r_no);
            if (roomImages.size()!=0){
                model.addAttribute("getDetail", roomImages);
                System.out.println(roomImages.toString());
            }else {
                System.out.println("데이터가 없음");
                return "main";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        roomService.getDetail(r_no);

        return "/room/room_detail";
    }

    //룸작성화면
    @RequestMapping("/write")
    public String write(){
        return "/room/room_write";
    }

//    //게스트하우스 등록후 바로 작성할때?
//    @RequestMapping("/write/{h_no}")
//    public String write(@PathVariable("h_no")int h_no, Model model){
//        int gh_no = roomService.getGhno(h_no);
//        model.addAttribute("gh_no", gh_no);
//        System.out.println("gh_no : " + gh_no);
//        return "/room/room_write";
//    }

//    @PostMapping("/write2/{gh_no},{h_no}")
//    public String write2(@PathVariable("gh_no")int gh_no, @PathVariable("h_no")int h_no){
//        return "/room/room_write/"+gh_no+","+h_no;
//    }

    //정상작동!! 210703 21:52
    @PostMapping("/room_write/{r_ghno}")
    public String room_write(Room room, @PathVariable("r_ghno") int r_ghno){
        room.setR_ghno(r_ghno);
        System.out.println(room.toString());
        roomService.insertRoom(room);

        return "redirect:/room/detail/"+r_ghno;

    }

//  room_write -> detail(이미지 넣기전 방금넣은 room data 가져오기) -> room_images
    @RequestMapping(value = "/detail/{r_ghno}")
    public String detail(@PathVariable("r_ghno")int r_ghno, Model model){
        Room room = roomService.detail(r_ghno);
        model.addAttribute("RM", room);
        System.out.println("room.toString() : " + room.toString());
        return "/room/room_images";

    }
    
    //이미지업로드 컨트롤러 20210703 정상작동
    @PostMapping("/room_images/{r_no1}")
    public String room_images(Images images, @PathVariable("r_no1")int r_no1, @RequestParam("files") List<MultipartFile> files) throws IOException {
//        Room room = roomService.detail(r_ghno);
//        System.out.println("room/room_images = room.toString() : " + room.toString());
//        String Path = "/resources/rooms_image/";
        images.setI_rno(r_no1);
        String fileAddr = "C:\\Users\\yeon\\IdeaProjects\\project-zagoga\\src\\main\\resources\\static\\rooms_image\\";
        List<String> safeDB = new ArrayList<>();
        List<Integer> r_no = new ArrayList<>();

        try {
            for (int i=0; i<files.toArray().length; i++){
//                long imageName = System.currentTimeMillis();
                String imageName = String.valueOf(System.currentTimeMillis());
                String OriginName = files.get(i).getOriginalFilename();
                String transfer = fileAddr + imageName + "_" + OriginName;
                File transferto = new File(transfer);
                System.out.println("room/room_images : " + transfer);

                safeDB.add(imageName + "_" + OriginName);
                r_no.add(images.getI_rno());
//                System.out.println(safeDB.get(i));
//                images.setI_name(System.currentTimeMillis() + "_" + files.get(i).getOriginalFilename());
                files.get(i).transferTo(transferto);
//                System.out.println("in for "+i+" : "+images.toString());
            }
        } catch (IllegalStateException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("safeDB.toString : " + safeDB.toString());
        System.out.println("images.toString : " + images.toString());
        try {
            for (int i=0; i<safeDB.size(); i++){
                images.setI_name(safeDB.get(i));
                images.setI_rno(r_no.get(i));
                images.setI_path("C:\\Users\\yeon\\IdeaProjects\\project_zagoga\\src\\main\\resources\\static\\rooms_image\\");
                roomService.imageInsert(images);
            }
        } catch (IllegalStateException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }


        return "main";
    }

    //0704 03:37 확인
    @RequestMapping(value = "/mypageRoomInfo/{r_no}", method = RequestMethod.GET)
    public String mypageRoomInfo(@PathVariable("r_no")int r_no, Model model){
        List<RoomImages> roomImages = roomService.mypageRoomInfo(r_no);
        System.out.println("roomImages.toString() : "+roomImages.toString());
//        System.out.println(roomImages.get(0).toString());
        model.addAttribute("room", roomImages);
        return "/mypage/mypage_room_info";
    }

//  20210706 15:47 확인
    @PostMapping("/update")
    public String update(Room room){
        System.out.println("room.toString : " + room.toString());
        roomService.update(room);
        return "main";
    }

    //확인 button에서 컨트롤러로 전송방법찾기
    @RequestMapping("/delete/{r_no},{r_ghno}")    // 9, 3 테스트
    public String delete(@PathVariable("r_no") int r_no, @PathVariable("r_ghno") int r_ghno) {
        roomService.delete(r_no, r_ghno);
        return "main";
    }
}
