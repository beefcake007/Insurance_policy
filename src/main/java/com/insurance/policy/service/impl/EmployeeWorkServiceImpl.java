package com.insurance.policy.service.impl;

import com.insurance.policy.dto.EmployeeWorkDTO;
import com.insurance.policy.repository.EmployeeWorkRepository;
import com.insurance.policy.service.EmployeeWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeWorkServiceImpl implements EmployeeWorkService
{
    @Autowired
    private EmployeeWorkRepository employeeWorkRepository;

    @Override
    public EmployeeWorkDTO getEmployeeWorkByEmployeeId(String employeeId) {
        return employeeWorkRepository.getEmployeeWorkByEmployeeId(employeeId);
    }
}
