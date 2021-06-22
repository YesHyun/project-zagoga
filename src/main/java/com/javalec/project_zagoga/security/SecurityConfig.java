package com.javalec.project_zagoga.security;//package com.javalec.project_zagoga.security;
//
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//@AllArgsConstructor
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private OAuth2UserService oAuth2UserService;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .anyRequest().permitAll()
//                .and()
//                .logout()
//                .logoutSuccessUrl("/main")
////                .and()
////                .formLogin()
////                .loginPage("/login")
////                .defaultSuccessUrl("/main")
////                .failureUrl("/login")
//                .and()
//                .oauth2Login()
//                .loginPage("/login")
//                .defaultSuccessUrl("/main")
//                .failureUrl("/login")
//                .userInfoEndpoint().userService(oAuth2UserService);
//    }
//}
