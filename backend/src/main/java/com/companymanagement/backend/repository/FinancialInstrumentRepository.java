package com.companymanagement.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companymanagement.backend.model.FinancialInstrument;

public interface FinancialInstrumentRepository extends JpaRepository<FinancialInstrument, Long>{
 
}
