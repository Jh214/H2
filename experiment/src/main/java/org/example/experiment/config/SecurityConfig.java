package org.example.experiment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.HttpSecurityBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http
                .authorizeHttpRequests((auth) -> auth
                        .requestMatchers("/study/main", "login").permitAll()/*study/main에서 모든 사용자에게 권한을 줌*/
                        .requestMatchers("/css/**" , "/js/**").permitAll()
                        .requestMatchers("/study/login").permitAll()
                        .requestMatchers("/study/signup").permitAll()
                        .requestMatchers("/study/mypage/**").hasAnyRole("ADMIN", "USER")
                        .anyRequest().authenticated()
                );



        return http.build();
    }

}
