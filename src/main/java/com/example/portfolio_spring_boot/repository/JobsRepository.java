package com.example.portfolio_spring_boot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.portfolio_spring_boot.model.Jobs;

public interface JobsRepository extends JpaRepository<Jobs, Long> {
  
}
