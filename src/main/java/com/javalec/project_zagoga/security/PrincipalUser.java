package com.javalec.project_zagoga.security;

import com.javalec.project_zagoga.dto.Users;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

@NoArgsConstructor
@Data
public class PrincipalUser implements UserDetails, OAuth2User {

    private Users user;
    private Map<String, Object> attributes;

//    일반 로그인을 위한 생성자
    public PrincipalUser(Users user) { this.user = user; }

//    OAuth2User 로그인을 위한 생성자
    public PrincipalUser(Users user, Map<String, Object> attributes) {
        this.user = user;
        this.attributes = attributes;
    }

    //   for OAuth2User
    @Override
    public <A> A getAttribute(String name) {
        return OAuth2User.super.getAttribute(name);
    }
    @Override
    public Map<String, Object> getAttributes() {
        return this.attributes;
    }


//  for  AuthenticationPrincipal
    @Override
    public String getName() {
//        구글만 쓸 거면 의미가 있는데 여러 sns 사용하는 경우 큰 쓸모가 없음.
        return getUsername();
    }

    @Override
    public String getPassword() {
        return user.getU_pwd();
    }

    @Override
    public String getUsername() {
        String name = user.getU_name();
        if(name == null) {
            name = "user";
        }
        return name;
    }

//    Custom Getter
    public String getMail() { return user.getU_mail(); }
    public int getNo() { return user.getU_no(); }
    public String getNickname() { return user.getU_nick(); }
    public String getGender() { return user.getU_gender(); }
//    주민번호 스플릿해서 전달해야지?
//    핸드폰 번호 어떻게 표시 할 건뎅?


//   for UserDetails
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//        해당유저의 권한을 반환한다.
//        Collection<GrantedAuthority> collection = new ArrayList<>();
//        collection.add(new GrantedAuthority() {
//            @Override
//            public String getAuthority() {
//                return user.getU_role();
//            }
//        });
//        return collection;

        Collection<GrantedAuthority> collection = new ArrayList<>();
        collection.add((GrantedAuthority) () -> user.getU_role());
        return collection;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
