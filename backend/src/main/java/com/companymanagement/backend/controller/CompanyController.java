package com.companymanagement.backend.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.companymanagement.backend.model.Company;
import com.companymanagement.backend.service.CompanyService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/investment_management_system/company")
public class CompanyController {

    @Autowired
    private final CompanyService companyService;

    
    public CompanyController(CompanyService companyService) throws SQLException {
        this.companyService = companyService;
    }
    
    // Get Specific Company
    @GetMapping("/{companyID}")
    public ResponseEntity<Company> getCompanyDetails(@PathVariable Long companyID) {
        Company company = companyService.getCompany(companyID);
        return ResponseEntity.ok(company);
    }

    // Get All Companies
    @GetMapping
    public List<Company> getAllCompanyDetails() {
        return companyService.getAllCompanies();
    }

    @PostMapping("/create")
    public ResponseEntity<String> createCompanyDetails(@RequestBody Company company) {
        companyService.createCompany(company);
        return ResponseEntity.ok("Company Created Successfully");
    }

    @PutMapping
    public ResponseEntity<String> updateCompanyDetails(@RequestBody Company company) {
        companyService.updateCompany(company);
        return ResponseEntity.ok("Company Updated Successfully");
    }

    @DeleteMapping("{companyID}")
    public ResponseEntity<String> deleteCompanyDetails(@PathVariable Long companyID) {
        companyService.deleteCompany(companyID);
        return ResponseEntity.ok("Company Deleted Successfully");
    }

}
