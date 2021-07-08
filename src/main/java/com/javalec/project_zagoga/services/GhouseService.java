package com.javalec.project_zagoga.services;

import com.javalec.project_zagoga.dto.Ghouse;
import com.javalec.project_zagoga.dto.GhouseRoom;
import com.javalec.project_zagoga.dto.GhouseRoomImages;
import com.javalec.project_zagoga.mapper.GhouseMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GhouseService {
	private final GhouseMapper ghouseMapper;
	public GhouseService(GhouseMapper ghouseMapper) {
		this.ghouseMapper=ghouseMapper;
	}
	//host user mybatis 응용
//	public List<Ghouse> getList(){
//
//		return this.GhouseMapper.getList();
//	}

	public List<GhouseRoom> roomAndGhouse(int gh_no){
		return ghouseMapper.roomAndGhouse(gh_no);
	}

	public List<GhouseRoomImages> ghouseDetail(int gh_no){
		return ghouseMapper.ghouseDetail(gh_no);
	}

	public List<GhouseRoom> getList(){
//		Ghouse ghouse = null;
//		int gh_no = ghouse.getGh_no(); // 최저가 방 하나  room list
//		int lowFee = (ghouseMapper.lowFee(gh_no));
		return ghouseMapper.getList();
	}

//	public void insert(String gh_name, String gh_addr1, String gh_addr2, String gh_detail, String gh_hno){
//		this.GhouseMapper.insert(gh_name, gh_addr1, gh_addr2, gh_detail, gh_hno);
//	}
	public int insert(Ghouse ghouse){
		return ghouseMapper.insert(ghouse);
	}

	public int update(Ghouse ghouse){
		return ghouseMapper.update(ghouse);
	}

//	public void delete(int GH_NO){ this.GhouseMapper.delete(GH_NO);	}
	public void delete(int gh_no, int gh_hno){
		ghouseMapper.delete(gh_no, gh_hno);
	}

//	public List<Ghouse> getOne(int GH_NO){ return this.GhouseMapper.getOne(GH_NO);}
	public Ghouse selectOne(int gh_no, int r_no){
		return ghouseMapper.selectOne(gh_no);
	}

	public Ghouse updateView(int gh_no){
		return ghouseMapper.selectOne(gh_no);
	}


//	public Ghouse lowFee(int gh_no){
//		return ghouseMapper.lowFee(gh_no);
//	}
}
