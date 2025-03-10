package org.example.greenshop.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class LoginDto {

    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;

    public LoginDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public LoginDto() {
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

    @Override
    public String toString() {
        return "LoginDto{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
