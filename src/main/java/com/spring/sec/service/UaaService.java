package com.spring.sec.service;

import com.spring.sec.model.LoginRequest;
import com.spring.sec.model.LoginResponse;
import com.spring.sec.model.RefreshTokenRequest;
import com.spring.sec.model.SignUpRequest;

public interface UaaService {
    LoginResponse login(LoginRequest loginRequest);
    void signUp(SignUpRequest signUpRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
