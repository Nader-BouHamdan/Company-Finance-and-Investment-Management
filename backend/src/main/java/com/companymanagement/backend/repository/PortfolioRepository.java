package com.companymanagement.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companymanagement.backend.model.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long>{
 
}
