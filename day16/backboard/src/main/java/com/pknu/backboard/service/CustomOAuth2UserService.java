package com.pknu.backboard.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.pknu.backboard.dto.CustomOAuth2User;
import com.pknu.backboard.dto.GoogleResponse;
import com.pknu.backboard.dto.MemberDto;
import com.pknu.backboard.dto.NaverResponse;
import com.pknu.backboard.dto.OAuth2Response;
import com.pknu.backboard.entity.Member;
import com.pknu.backboard.repository.MemberRepository;
import com.pknu.backboard.security.MemberRole;

// import lombok.RequiredArgsConstructor;

@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    @Autowired
    private final MemberRepository memberRepository;

    public CustomOAuth2UserService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2User oAuth2User = super.loadUser(userRequest);
        System.out.println(oAuth2User.getAttributes());

        return null;
    }
}
