package com.companymanagement.backend.service;

import java.util.List;

import com.companymanagement.backend.model.Portfolio;

public interface PortfolioService {
    String createPortfolio(Portfolio portfolio);
    String updatePortfolio(Portfolio portfolio);
    String deletePortfolio(Long portfolioId);
    Portfolio getPortfolio(Long portfolioId);
    List<Portfolio> getAllPortfolios();
}

