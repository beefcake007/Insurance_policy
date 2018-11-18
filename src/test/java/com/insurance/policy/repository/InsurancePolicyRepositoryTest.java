package com.insurance.policy.repository;

import com.insurance.policy.dto.InsurancePolicyDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InsurancePolicyRepositoryTest {

    @Autowired
    private InsurancePolicyRepository insurancePolicyRepository;

    @Test
    public void selectInsurancePolicy(){
        String insurancePolicyId = "4124124124124";
        InsurancePolicyDTO insurancePolicyDTO = insurancePolicyRepository.selectInsurancePolicy(insurancePolicyId);
        System.out.println(insurancePolicyDTO.toString());
    }
}