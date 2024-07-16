package com.example.portfolio_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.portfolio_spring_boot.model.Projects;
public interface ProjectsRepository extends JpaRepository<Projects, Long> {
  
}
