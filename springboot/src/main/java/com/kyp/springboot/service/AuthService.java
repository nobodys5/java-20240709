package com.kyp.springboot.service;

import com.kyp.springboot.dto.PostUserRequestDto;
import com.kyp.springboot.dto.SignInRequestDto;

public interface AuthService {
    String signup(PostUserRequestDto dto);
    String SignIn(SignInRequestDto dto);
}
