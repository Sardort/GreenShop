package org.example.greenshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String repassword;
    @Column(nullable = false)
    private String created_date;
    @Column(nullable = false)
    private String role;
    @Column(nullable = false)
    private String status;

//    public Register(Integer id, String username, String email, String password, String repassword, String created_date, String role, String status) {
//        this.id = id;
//        this.username = username;
//        this.email = email;
//        this.password = password;
//        this.repassword = repassword;
//        this.created_date = created_date;
//        this.role = role;
//        this.status = status;
//    }
//
//    public Register() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
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
//    public String getRepassword() {
//        return repassword;
//    }
//
//    public void setRepassword(String repassword) {
//        this.repassword = repassword;
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
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    @Override
//    public String toString() {
//        return "Register{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", repassword='" + repassword + '\'' +
//                ", created_date='" + created_date + '\'' +
//                ", role='" + role + '\'' +
//                ", status='" + status + '\'' +
//                '}';
//    }
}
