package com.javalec.project_zagoga.services;

import com.javalec.project_zagoga.dto.Host;
import com.javalec.project_zagoga.mapper.HostMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class HostService {

    private final HostMapper hostMapper;

    public void hostInsert(Host host) {
        // 데이터 수정해서 보내기
        hostMapper.insertHost(host);
    }
}
