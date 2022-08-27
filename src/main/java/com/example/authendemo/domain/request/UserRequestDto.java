package com.example.authendemo.domain.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequestDto {
    private String email;
    private String password;
}
