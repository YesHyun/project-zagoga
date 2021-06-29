package com.javalec.project_zagoga.security;

import com.javalec.project_zagoga.dto.Users;
import com.javalec.project_zagoga.mapper.UsersMapper;
import com.javalec.project_zagoga.security.provider.GoogleUserInfo;
import com.javalec.project_zagoga.security.provider.KakaoUserInfo;
import com.javalec.project_zagoga.security.provider.NaverUserInfo;
import com.javalec.project_zagoga.security.provider.OAuth2Info;
import lombok.AllArgsConstructor;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PrincipalOAuth2UserService extends DefaultOAuth2UserService {

    private final UsersMapper usersMapper;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        String registrationID = userRequest.getClientRegistration().getRegistrationId();
        OAuth2User oAuth2User = super.loadUser(userRequest);
//        System.out.println("registrationID:"+registrationID);
//        System.out.println(oAuth2User.getAttributes());

        OAuth2Info oAuth2Info = null;
        switch(registrationID) {
//        Google 계정
            case "google":
                oAuth2Info = new GoogleUserInfo(oAuth2User.getAttributes());
                break;
            case "naver":
                oAuth2Info = new NaverUserInfo(oAuth2User.getAttributes());
                break;
            case "kakao":
                oAuth2Info = new KakaoUserInfo(oAuth2User.getAttributes());
                break;
        }

        String snsID = oAuth2Info.getProvider()+"_"+oAuth2Info.getProviderID();
        System.out.println("snsID: "+snsID);
        Users user = usersMapper.loadUserBySNS(snsID);
        if (user == null) {
            user = new Users(oAuth2Info.getNickName(), oAuth2Info.getEmail());
            usersMapper.insertUser(user);
            usersMapper.insertBySNS(snsID, user);
        }
        user.setU_role("USER");
//        System.out.println(user.toString());
        return new PrincipalUser(user, oAuth2User.getAttributes());
    }
}
