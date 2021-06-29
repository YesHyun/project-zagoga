package com.javalec.project_zagoga.security;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final PrincipalOAuth2UserService principalOAuth2UserService;

    @Bean
    public PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/user/**", "/sessionCheck").authenticated()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().permitAll()
            .and()
                .logout()
                .logoutSuccessUrl("/main")
            .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/loginNormal")
                .defaultSuccessUrl("/main")
                .failureUrl("/login")
            .and()
                .oauth2Login()
                .loginPage("/login")
                .defaultSuccessUrl("/main")
                .failureUrl("/login")
                .userInfoEndpoint().userService(principalOAuth2UserService);
    }
}
