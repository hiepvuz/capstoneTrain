package com.example.authendemo.services.wrapper;

import com.example.authendemo.domain.entities.User;
import com.example.authendemo.domain.response.UserResponseDto;

public class UserMapper {
    public static UserResponseDto toUserResponseDto(User user){
        return UserResponseDto.builder().email(user.getEmail()).fullName(user.getFullName())
                .password(user.getPassword()).phoneNumber(user.getPhoneNumber()).token(user.getToken()).build();
    }
}
