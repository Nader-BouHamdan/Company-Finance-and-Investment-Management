package com.companymanagement.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companymanagement.backend.model.Collateral;
import com.companymanagement.backend.repository.CollateralRepository;
import com.companymanagement.backend.service.CollateralService;

@Service
public class CollateralServiceImplement implements CollateralService {

    @Autowired
    private CollateralRepository CollateralRepository;

    @Override
    public String createCollateral(Collateral Collateral) {
        CollateralRepository.save(Collateral);
        return "Successfully created";
    }

    @Override
    public String deleteCollateral(Long CollateralId) {
        CollateralRepository.deleteById(CollateralId);
        return "Successfully deleted";
    }

    @Override
    public List<Collateral> getAllCollaterals() {
        return (List<Collateral>) CollateralRepository.findAll();
    }

    @Override
    public Collateral getCollateral(Long CollateralId) {
        return CollateralRepository.findById(CollateralId).get();
    }

    @Override
    public String updateCollateral(Collateral Collateral) {
        CollateralRepository.save(Collateral);
        return "Successfully updated";
    }
}
