package com.companymanagement.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.companymanagement.backend.model.FinancialInstrument;

public interface FinancialInstrumentRepository extends CrudRepository<FinancialInstrument, Long>{
 
}
