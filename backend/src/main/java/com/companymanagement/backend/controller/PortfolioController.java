package com.companymanagement.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.companymanagement.backend.model.Portfolio;
import com.companymanagement.backend.service.PortfolioService;

@RestController
@RequestMapping("/investment_management_system/portfolio")
public class PortfolioController {

    PortfolioService portfolioService;

    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping("/{portfolioID}")
    public ResponseEntity<String> getPortfolioDetails(@PathVariable Long portfolioID) {
        return ResponseEntity.ok("Company Recieved Successfully");
    }

    @GetMapping()
    public List<Portfolio> getAllPortfolioDetails() {
        return portfolioService.getAllPortfolios();
    }

    @PostMapping
    public ResponseEntity<String> createPortfolioDetails(@RequestBody Portfolio portfolio){
        portfolioService.createPortfolio(portfolio);
        return ResponseEntity.ok("Company Created Successfully");
    }

    @PutMapping
    public ResponseEntity<String> updatePortfolioDetails(@RequestBody Portfolio portfolio){
        portfolioService.updatePortfolio(portfolio);
        return ResponseEntity.ok("Company Updated Successfully");
    }

    @DeleteMapping("/{portfolioID}")
    public ResponseEntity<String> deletePortfolioDetails(@PathVariable Long portfolioID){
        portfolioService.deletePortfolio(portfolioID);
        return ResponseEntity.ok("Company Deleted Successfully");
    }
}
