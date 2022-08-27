package com.example.authendemo.services;

import com.example.authendemo.domain.request.UserRequestDto;
import com.example.authendemo.domain.response.UserResponseDto;

import java.util.Map;

public interface UserService{
    public Map<String, UserResponseDto> authenticate(Map<String, UserRequestDto> userLoginRequestMap);
}
