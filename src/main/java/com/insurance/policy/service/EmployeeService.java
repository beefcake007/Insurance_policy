package com.insurance.policy.service;

import com.insurance.policy.dataobject.Employee;
import org.apache.ibatis.annotations.Param;

public interface EmployeeService {

    /*用户登录*/
    Employee employeeLogin(@Param("employeeId") String employeeId, @Param("employeePwd") String employeePwd);
}
