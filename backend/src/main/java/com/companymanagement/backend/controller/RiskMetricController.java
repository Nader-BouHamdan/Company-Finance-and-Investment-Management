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
import com.companymanagement.backend.model.RiskMetric;
import com.companymanagement.backend.service.RiskMetricService;

@RestController
@RequestMapping("/investment_management_system/RiskMetric")
public class RiskMetricController {

    RiskMetricService RiskMetricService;

    public RiskMetricController(RiskMetricService RiskMetricService) {
        this.RiskMetricService = RiskMetricService;
    }

    @GetMapping("/{RiskMetricID}")
    public ResponseEntity<String> getRiskMetricDetails(@PathVariable Long RiskMetricID) {
        return ResponseEntity.ok("Company Recieved Successfully");
    }

    @GetMapping()
    public List<RiskMetric> getAllRiskMetricDetails() {
        return RiskMetricService.getAllRiskMetrics();
    }

    @PostMapping
    public ResponseEntity<String> createRiskMetricDetails(@RequestBody RiskMetric RiskMetric) {
        RiskMetricService.createRiskMetric(RiskMetric);
        return ResponseEntity.ok("Company Created Successfully");
    }

    @PutMapping
    public ResponseEntity<String> updateRiskMetricDetails(@RequestBody RiskMetric RiskMetric) {
        RiskMetricService.updateRiskMetric(RiskMetric);
        return ResponseEntity.ok("Company Updated Successfully");
    }

    @DeleteMapping("/{RiskMetricID}")
    public ResponseEntity<String> deleteRiskMetricDetails(@PathVariable Long RiskMetricID) {
        RiskMetricService.deleteRiskMetric(RiskMetricID);
        return ResponseEntity.ok("Company Deleted Successfully");
    }
}
