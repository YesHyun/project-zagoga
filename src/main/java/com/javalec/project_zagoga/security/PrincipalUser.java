package com.javalec.project_zagoga.security;//package com.proni.lolza.security;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Map;
//
//public class PrincipalUser implements UserDetails, OAuth2User {
//
//    private User user;
//    private Map<String, Object> attributes;
//
////    일반 로그인을 위한 생성자
//    public PrincipalUser(User user) { this.user = user; }
//
////    OAuth2User 로그인을 위한 생성자
//    public PrincipalUser(User user, Map<String, Object> attributes) {
//        this.user = user;
//        this.attributes = attributes;
//    }
//
////   for OAuth2User
//    @Override
//    public <A> A getAttribute(String name) {
//        return OAuth2User.super.getAttribute(name);
//    }
//
//    @Override
//    public Map<String, Object> getAttributes() {
//        return this.attributes;
//    }
//
//
////  for  AuthenticationPrincipal
//    @Override
//    public String getName() {
//        return attributes.get("name").toString();
//    }
//
//
////   for UserDetails
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
////        해당유저의 권한을 반환한다.
//        Collection<GrantedAuthority> collection = new ArrayList<>();
//        collection.add(new GrantedAuthority() {
//            @Override
//            public String getAuthority() {
//                return user.getRole();
//            }
//        });
//        return collection;
//    }
//
//    @Override
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getUsername();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
