package com.insurance.policy.service.impl;

import com.insurance.policy.dataobject.Employee;
import com.insurance.policy.dto.EmployeeDTO;
import com.insurance.policy.dto.PageQuery;
import com.insurance.policy.repository.EmployeeRepository;
import com.insurance.policy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee employeeLogin(String employeeId, String employeePwd) {
        return employeeRepository.employeeLogin(employeeId, employeePwd);
    }

    @Override
    public List<EmployeeDTO> findEmployeeList(PageQuery pageQuery) {
        return employeeRepository.findEmployeeList(pageQuery);
    }

    @Override
    public Long findEmployeeNum() {
        return employeeRepository.findEmployeeNum();
    }
}
