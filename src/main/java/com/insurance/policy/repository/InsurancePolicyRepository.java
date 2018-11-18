package com.insurance.policy.repository;

import com.insurance.policy.dto.InsurancePolicyDTO;

public interface InsurancePolicyRepository {

    InsurancePolicyDTO selectInsurancePolicy(String insurancePolicyId);
}
