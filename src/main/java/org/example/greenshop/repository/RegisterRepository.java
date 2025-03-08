package org.example.greenshop.repository;

import org.example.greenshop.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, Integer> {
}
