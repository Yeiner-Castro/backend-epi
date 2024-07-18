package com.example.repository;

import com.example.entity.Metodo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetodoRepository extends JpaRepository<Metodo, Long> {
}