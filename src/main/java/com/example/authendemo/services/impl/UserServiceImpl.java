package com.example.authendemo.services.impl;

import com.example.authendemo.controller.repositories.UserRepository;
import com.example.authendemo.domain.entities.User;
import com.example.authendemo.domain.request.UserRequestDto;
import com.example.authendemo.domain.response.UserResponseDto;
import com.example.authendemo.services.UserService;
import com.example.authendemo.services.wrapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Map<String, UserResponseDto> authenticate(Map<String, UserRequestDto> userRequestMap) {

        UserRequestDto userRequestDto = userRequestMap.get("user");

        Optional<User> optionalUser = userRepository.findByEmail(userRequestDto.getEmail());

        boolean isAuthen = false;
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (user.getPassword().equals(userRequestDto.getPassword())) {
                isAuthen = true;
            }
        }

        if(!isAuthen){
            System.out.println("User name or password incorrect!");
        }

        Map<String, UserResponseDto> wrapper = new HashMap<>();
        UserResponseDto userResponseDto = UserMapper.toUserResponseDto(optionalUser.get());

        wrapper.put("user", userResponseDto);
        return wrapper;
    }
}
