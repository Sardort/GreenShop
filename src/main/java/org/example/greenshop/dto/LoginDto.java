package org.example.greenshop.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginDto {

    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String created_date;

//    public LoginDto(String email, String password, String created_date) {
//        this.email = email;
//        this.password = password;
//        this.created_date = created_date;
//    }
//
//    public LoginDto() {
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getCreated_date() {
//        return created_date;
//    }
//
//    public void setCreated_date(String created_date) {
//        this.created_date = created_date;
//    }
//
//    @Override
//    public String toString() {
//        return "LoginDto{" +
//                "email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", created_date='" + created_date + '\'' +
//                '}';
//    }
}
