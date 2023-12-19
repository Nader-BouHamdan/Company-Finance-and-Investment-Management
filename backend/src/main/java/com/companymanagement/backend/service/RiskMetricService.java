package com.companymanagement.backend.service;

import java.util.List;

import com.companymanagement.backend.model.RiskMetric;

public interface RiskMetricService {
    String createRiskMetric(RiskMetric RiskMetric);
    String updateRiskMetric(RiskMetric RiskMetric);
    String deleteRiskMetric(Long RiskMetricId);
    RiskMetric getRiskMetric(Long RiskMetricId);
    List<RiskMetric> getAllRiskMetrics();
}

