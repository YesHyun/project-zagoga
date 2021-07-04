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

    //룸작성페이지 화면!!
    @GetMapping("/write")
    public String write(){
        return "/room/room_write";
    }

    //정상작동!! 210703 21:52
    @PostMapping("/room_write")
    public String room_write(Room room){
        room.setR_ghno(2);
        System.out.println(room.toString());
        roomService.insertRoom(room);
        return "/room/room_images";
    }
    
    //이미지 업로드 화면!!
    @GetMapping("/images")
    public String image(){return "/room/room_images";}
    
    //이미지업로드 컨트롤러 20210703 정상작동
    @PostMapping("/room_images")
    public String room_images(Images images, @RequestParam("files") List<MultipartFile> files) throws IOException {
        Room room = new Room();
        room.setR_no(4);    // 룸 넘버 가져오는 세션 연결해야함
//        String Path = "/resources/rooms_image/";

        List<String> safeDB = new ArrayList<>();
        List<Integer> r_no = new ArrayList<>();

        try {
            for (int i=0; i<files.toArray().length; i++){
                safeDB.add(System.currentTimeMillis() + "_" + files.get(i).getOriginalFilename());
                r_no.add(room.getR_no());
//                System.out.println(safeDB.get(i));
//                images.setI_name(System.currentTimeMillis() + "_" + files.get(i).getOriginalFilename());
                files.get(i).transferTo(new File("C:\\Users\\yeon\\IdeaProjects\\project_zagoga\\src\\main\\resources\\static\\rooms_image\\"+System.currentTimeMillis()+"_"+files.get(i).getOriginalFilename()));
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
        System.out.println(roomImages.toString());
        System.out.println(roomImages.get(0).toString());
        model.addAttribute("room", roomImages);
        return "/mypage/mypage_room_info";
    }

    //컨트롤러 form 연결은 함,, update할때 사진여러장 선택해제 어떻게할지 생각
    @PostMapping("/update")
    public String update(Room room){
        roomService.update(room);
        return "main";
    }

    //확인
    @RequestMapping("/delete/{r_no},{r_ghno}")    // 9, 3 테스트
    public String delete(@PathVariable("r_no") int r_no, @PathVariable("r_ghno") int r_ghno){
        roomService.delete(r_no, r_ghno);
        return "main";
    }
}
