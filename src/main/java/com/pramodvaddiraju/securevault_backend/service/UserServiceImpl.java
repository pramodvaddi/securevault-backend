package com.pramodvaddiraju.securevault_backend.service;

import com.pramodvaddiraju.securevault_backend.dto.LoginRequestDto;
import com.pramodvaddiraju.securevault_backend.dto.RegisterRequestDto;
import com.pramodvaddiraju.securevault_backend.entity.Role;
import com.pramodvaddiraju.securevault_backend.entity.User;
import com.pramodvaddiraju.securevault_backend.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }



    @Override
    public String registerUser(RegisterRequestDto registerRequestDto) {

        // Check if username already exists
        if(userRepository.existsByUsername(registerRequestDto.getUserName())){
            return "User name already exists";
        }

        // Check if email already exists
        if(userRepository.existsByEmail(registerRequestDto.getEmail())){
            return "Email already exists";
        }

        User user = new User();

        user.setUserName(registerRequestDto.getUserName());
        user.setEmail(registerRequestDto.getEmail());
        user.setPassword(passwordEncoder.encode(registerRequestDto.getPassword()));
        user.setRole(Role.USER);
        userRepository.save(user);

        return "User Registered Successfully";
    }

    @Override
    public String loginUser(LoginRequestDto loginRequestDto) {
        return "Login logic will be handled by spring security";
    }
}
