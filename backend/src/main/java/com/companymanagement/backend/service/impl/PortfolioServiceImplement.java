package com.companymanagement.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companymanagement.backend.model.Portfolio;
import com.companymanagement.backend.repository.PortfolioRepository;
import com.companymanagement.backend.service.PortfolioService;

@Service
public class PortfolioServiceImplement implements PortfolioService {

    PortfolioRepository portfolioRepository;

    public PortfolioServiceImplement(@Autowired PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @Override
    public String createPortfolio(Portfolio portfolio) {
        portfolioRepository.save(portfolio);
        return "Successfully created";
    }

    @Override
    public String deletePortfolio(Long portfolioId) {
        portfolioRepository.deleteById(portfolioId);
        return "Successfully deleted";
    }

    @Override
    public List<Portfolio> getAllPortfolios() {
        return portfolioRepository.findAll();
    }

    @Override
    public Portfolio getPortfolio(Long portfolioId) {
        return portfolioRepository.findById(portfolioId).get();
    }

    @Override
    public String updatePortfolio(Portfolio portfolio) {
        portfolioRepository.save(portfolio);
        return "Successfully updated";
    }
}
