package com.pramodvaddiraju.securevault_backend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class RegisterRequestDto {

    @NotBlank(message = "username must not be blank")
    private String userName;
    @NotBlank(message = "email must not be blank")
    @Email(message = "use valid email")
    private String email;
    @NotBlank(message = "password must not be blank")
    private String password;

    public RegisterRequestDto(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
