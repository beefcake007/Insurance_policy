package com.insurance.policy.repository;

import com.insurance.policy.dataobject.Employee;
import org.apache.ibatis.annotations.Param;

public interface EmployeeRepository {

    /*用户登录*/
    Employee employeeLogin(@Param("employeeId") String employeeId, @Param("employeePwd") String employeePwd);
}
