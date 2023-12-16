package com.companymanagement.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RiskMetric {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private final Long metricID;
    private String type;
    private String value;
    private Long i = (long) 0;

    public RiskMetric(Long metricID, String type, String value) {
        this.metricID = i++;
        this.type = type;
        this.value = value;
    }

    public Long getMetricID() {
        return metricID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
