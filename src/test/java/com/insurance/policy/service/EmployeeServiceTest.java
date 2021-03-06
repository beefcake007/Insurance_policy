package com.insurance.policy.service;

import com.insurance.policy.repository.EmployeeRepository;
import org.junit.Test;

import static org.junit.Assert.*;
import com.insurance.policy.dataobject.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void employeeLogin() {
        String employeeId = "00000001";
        String employeePwd = "123456";
        Employee employee = employeeRepository.employeeLogin(employeeId, employeePwd);
        System.out.println(employee.toString());
    }
}