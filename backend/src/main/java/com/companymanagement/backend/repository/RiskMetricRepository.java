package com.companymanagement.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companymanagement.backend.model.RiskMetric;

public interface RiskMetricRepository extends JpaRepository<RiskMetric, Long>{
 
}
