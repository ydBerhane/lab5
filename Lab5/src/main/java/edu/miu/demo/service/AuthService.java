package edu.miu.demo.service;

import edu.miu.demo.domain.dto.request.LoginRequest;
import edu.miu.demo.domain.dto.request.RefreshTokenRequest;
import edu.miu.demo.domain.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
