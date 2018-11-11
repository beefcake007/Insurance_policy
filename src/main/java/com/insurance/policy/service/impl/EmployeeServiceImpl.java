package com.insurance.policy.service.impl;

import com.insurance.policy.dataobject.Employee;
import com.insurance.policy.repository.EmployeeRepository;
import com.insurance.policy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee employeeLogin(String employeeId, String employeePwd) {
        return employeeRepository.employeeLogin(employeeId, employeePwd);
    }
}
