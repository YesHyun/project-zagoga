package com.javalec.project_zagoga.security.provider;

public interface OAuth2Info {
    String getProvider();
    String getProviderID();
    String getNickName();
    String getEmail();
}
