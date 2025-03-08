package org.example.greenshop.repository;

import org.example.greenshop.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login,Integer> {
}
