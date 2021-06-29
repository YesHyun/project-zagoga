package com.javalec.project_zagoga.security.provider;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Map;


@NoArgsConstructor
@AllArgsConstructor
public class GoogleUserInfo implements OAuth2Info {

     private Map<String, Object> attributes;

    @Override
    public String getProvider() {
        return "google";
    }

    @Override
    public String getProviderID() {
        return (String) this.attributes.get("sub");
    }

    @Override
    public String getNickName() {
        return (String) this.attributes.get("name");
    }

    @Override
    public String getEmail() {
        return (String) this.attributes.get("email");
    }
}
