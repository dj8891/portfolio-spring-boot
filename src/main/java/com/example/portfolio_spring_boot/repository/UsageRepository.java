package com.example.portfolio_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.portfolio_spring_boot.model.Usage;
import java.util.List;

public interface UsageRepository extends JpaRepository<Usage, Long> {
}
