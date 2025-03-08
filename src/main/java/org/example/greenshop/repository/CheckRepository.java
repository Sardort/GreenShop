package org.example.greenshop.repository;

import org.example.greenshop.model.Check;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckRepository extends JpaRepository<Check,Integer> {
}
