package com.companymanagement.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companymanagement.backend.model.RiskMetric;
import com.companymanagement.backend.repository.RiskMetricRepository;
import com.companymanagement.backend.service.RiskMetricService;

@Service
public class RiskMetricServiceImplement implements RiskMetricService {

    @Autowired
    private RiskMetricRepository RiskMetricRepository;

    @Override
    public String createRiskMetric(RiskMetric RiskMetric) {
        RiskMetricRepository.save(RiskMetric);
        return "Successfully created";
    }

    @Override
    public String deleteRiskMetric(Long RiskMetricId) {
        RiskMetricRepository.deleteById(RiskMetricId);
        return "Successfully deleted";
    }

    @Override
    public List<RiskMetric> getAllRiskMetrics() {
        return (List<RiskMetric>) RiskMetricRepository.findAll();
    }

    @Override
    public RiskMetric getRiskMetric(Long RiskMetricId) {
        return RiskMetricRepository.findById(RiskMetricId).get();
    }

    @Override
    public String updateRiskMetric(RiskMetric RiskMetric) {
        RiskMetricRepository.save(RiskMetric);
        return "Successfully updated";
    }
}
