package com.pramodvaddiraju.securevault_backend.dto;

import jakarta.validation.constraints.NotBlank;

public class LoginRequestDto {

    @NotBlank(message = "username must not be blank")
    private String userName;
    @NotBlank(message = "password must not be blank")
    private String password;

    public LoginRequestDto(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
