package com.pknu.backboard.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;

import com.pknu.backboard.service.CustomOAuth2UserService;

import lombok.RequiredArgsConstructor;

// 스프링시큐리티 핵심파일!!
@Configuration      // 스프링 환경설정 파일 
@EnableWebSecurity  // 스프링시큐리티를 제어 활성화
@EnableMethodSecurity(prePostEnabled = true)   // 계정세션없는 사용자 방지
@RequiredArgsConstructor
public class SecurityConfig {

    private final CustomOAuth2UserService customOAuth2UserService;  // 원하는 소셜로그인 서비스 정의

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            // 인증되지 않은 모든 페이지 요청을 허락(로그인창 안뜸)
            .authorizeHttpRequests(auth -> auth.requestMatchers("/**").permitAll()
                                               .anyRequest().authenticated())
            // h2-console URL은 CSRF에 예외라고 설정
            .csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"))  
            // h2-console이 Frame방식(구시대방식)으로 개발되어서 필요한 설정
            .headers(hdrs -> hdrs.addHeaderWriter(new XFrameOptionsHeaderWriter(
                XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN    
            )))
            // 로그인URL 접근 지정. 로그인페이지 URL과 로그인성공후 페이지 URL 지정
            .formLogin(fmlg -> fmlg.loginPage("/member/signin")
                                   .defaultSuccessUrl("/"))
            // OAuth2 로그인 설정
            .oauth2Login(oauth -> oauth.loginPage("/member/signin")
                                       .defaultSuccessUrl("/", true)
                                        // TODO : 추가해야할 거 있을때 이걸로 표시
                                        // HACK : 완료하면 이걸로 기록
                                       .userInfoEndpoint(uiep -> uiep.userService(customOAuth2UserService)))
            // 로그아웃URL 지정. POST매핑이 일어나야 함
            .logout(lgot -> lgot.logoutUrl("/member/signout")
                                .logoutSuccessUrl("/")
                                .invalidateHttpSession(true))
        ;  // ;을 분리해놓으면 chain method 추가시 간편함
            
        return http.build();
    }

    // 스프링시큐리티로 MemberSecurityService와 패스워드 등을 내부적으로 사용, 인증 + 권한 부여 프로세스 처리
    @Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    // 회원가입, 로그인시 동일하게 사용(로그인시 스프링 시큐리티가 자동으로 사용)
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  // 회원가입 패스워드 암호화시 사용한 엔코더와 동일
    }
}
