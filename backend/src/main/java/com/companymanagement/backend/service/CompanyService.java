package com.companymanagement.backend.service;

import java.util.List;

import com.companymanagement.backend.model.Company;

public interface CompanyService {
    public String createCompany(Company company);
    public String updateCompany(Company company);
    public String deleteCompany(Long companyId);
    public Company getCompany(Long companyId);
    public List<Company> getAllCompanies();
}
