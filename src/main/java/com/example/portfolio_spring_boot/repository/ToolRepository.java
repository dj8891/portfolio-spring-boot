package com.example.portfolio_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.portfolio_spring_boot.model.Tools;

public interface ToolRepository extends JpaRepository<Tools, Long> {

}
