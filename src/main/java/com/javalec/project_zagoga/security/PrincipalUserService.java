package com.javalec.project_zagoga.security;

import com.javalec.project_zagoga.dto.Users;
import com.javalec.project_zagoga.mapper.UsersMapper;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PrincipalUserService implements UserDetailsService {

    private final UsersMapper usersMapper;

//    security 로 일반 로그인 시 자동으로 호출 되는 메소드
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = usersMapper.loadUserByName(username);
        if(user != null) {
            return new PrincipalUser(user);
        }
        return null;
    }
}
