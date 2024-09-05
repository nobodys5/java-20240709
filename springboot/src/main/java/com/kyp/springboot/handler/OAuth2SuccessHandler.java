package com.kyp.springboot.handler;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.kyp.springboot.service.object.CustomOAuth2User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// OAuth2 인증 서비스 로직이 정상적으로 완료되었을 때 실행할 처리기
// - SimpleUrlAuthenticationSuccessHanlder 클래스 확정
// - response 처리 담당
@Component
public class OAuth2SuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    
    @Override
    public void onAuthenticationSuccess(
        HttpServletRequest request,
        HttpServletResponse response,
        // Authentication 매개변수에 서비스의 loadUser 메서드의 반환 값이 담겨있음
        Authentication authentication
    ) throws IOException, ServletException {
                                        // 다운캐스팅해서 강제로 값을넣는다.
        CustomOAuth2User oAuth2User = (CustomOAuth2User) authentication.getPrincipal();

        response.sendRedirect("https://naver.com");

    }

}
