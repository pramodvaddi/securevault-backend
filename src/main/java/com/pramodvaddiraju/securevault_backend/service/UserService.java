package com.pramodvaddiraju.securevault_backend.service;

import com.pramodvaddiraju.securevault_backend.dto.LoginRequestDto;
import com.pramodvaddiraju.securevault_backend.dto.RegisterRequestDto;

public interface UserService {

    String registerUser(RegisterRequestDto registerRequestDto);
    String loginUser(LoginRequestDto loginRequestDto);
}
