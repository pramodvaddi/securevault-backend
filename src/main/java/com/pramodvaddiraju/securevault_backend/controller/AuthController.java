package com.pramodvaddiraju.securevault_backend.controller;

import com.pramodvaddiraju.securevault_backend.dto.LoginRequestDto;
import com.pramodvaddiraju.securevault_backend.dto.RegisterRequestDto;
import com.pramodvaddiraju.securevault_backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private UserService userService;

    public AuthController(UserService userService){
        this.userService = userService;

    }


    @PostMapping("/register")
    ResponseEntity<String> register(@Valid @RequestBody RegisterRequestDto registerRequestDto){
        String response = userService.registerUser(registerRequestDto);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    ResponseEntity<String> login (@Valid LoginRequestDto loginRequestDto){
        String response = userService.loginUser(loginRequestDto);
        return ResponseEntity.ok(response);
    }




}
