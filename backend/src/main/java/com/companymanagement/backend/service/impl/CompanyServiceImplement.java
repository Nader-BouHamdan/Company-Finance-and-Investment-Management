package com.companymanagement.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.companymanagement.backend.model.Company;
import com.companymanagement.backend.repository.CompanyRepository;
import com.companymanagement.backend.service.CompanyService;

@Service
public class CompanyServiceImplement implements CompanyService{

    private final CompanyRepository companyRepository;

    public CompanyServiceImplement(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public String createCompany(Company company) {
        companyRepository.save(company);
        return "Successfully created";
    }

    @Override
    public String deleteCompany(Long companyId) {
        companyRepository.deleteById(companyId);
        return "Successfully deleted";
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompany(Long companyId) {
        return companyRepository.findById(companyId).get();
    }

    @Override
    public String updateCompany(Company company) {
        companyRepository.save(company);
        return "Successfully updated";
    }
    
}
