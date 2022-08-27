package com.example.authendemo.controller;

import com.example.authendemo.domain.request.UserRequestDto;
import com.example.authendemo.domain.response.UserResponseDto;
import com.example.authendemo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/users/login")
    public Map<String, UserResponseDto> login(@RequestBody Map<String, UserRequestDto> userRequestDtoMap) {
            return userService.authenticate(userRequestDtoMap);
        }


}
