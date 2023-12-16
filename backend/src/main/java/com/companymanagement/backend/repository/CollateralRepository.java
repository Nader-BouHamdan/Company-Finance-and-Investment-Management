package com.companymanagement.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companymanagement.backend.model.Collateral;

public interface CollateralRepository extends JpaRepository<Collateral, Long>{
 
}
