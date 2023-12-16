package com.companymanagement.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companymanagement.backend.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{
 
}
