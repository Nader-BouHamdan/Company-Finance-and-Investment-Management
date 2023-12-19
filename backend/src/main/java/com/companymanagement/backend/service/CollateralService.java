package com.companymanagement.backend.service;

import java.util.List;

import com.companymanagement.backend.model.Collateral;

public interface CollateralService {
    String createCollateral(Collateral Collateral);
    String updateCollateral(Collateral Collateral);
    String deleteCollateral(Long CollateralId);
    Collateral getCollateral(Long CollateralId);
    List<Collateral> getAllCollaterals();
}

