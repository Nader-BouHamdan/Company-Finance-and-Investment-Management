package com.companymanagement.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
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

// @CrossOrigin(origins =  "http://localhost:4200/")
@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    // Get Specific Company
    @GetMapping("{companyID}")
    public ResponseEntity<Company> getCompanyDetails(@PathVariable Long companyID) {
        Company company = companyService.getCompany(companyID);
        return ResponseEntity.ok(company);
    }

    // Get All Companies
    @GetMapping()
    public List<Company> getAllCompanyDetails() {
        return companyService.getAllCompanies();
    }

    @PostMapping
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

    @PostMapping("/validateCredentials")
    public ResponseEntity<?> validateCredentials(@RequestBody Company loginRequest) {
        Company company = companyService.getCompany(loginRequest.getCompanyID());
        String email = loginRequest.getEmailID();
        String password = loginRequest.getPassword();

        if (password.equals(company.getPassword()) && email.equals(company.getEmailID())) {
            return ResponseEntity.ok(company);
        } else {
            System.out.println(HttpStatus.UNAUTHORIZED);
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    // @GetMapping("{emailID}")
    // public ResponseEntity<String> getCompanyEmail(@PathVariable("emailID") String emailID) {
    //     String company = companyService.getCompanyEmail(emailID);
    //     return ResponseEntity.ok(company);
    // }

}
