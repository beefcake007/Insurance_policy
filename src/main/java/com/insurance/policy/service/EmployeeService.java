package com.insurance.policy.service;

import com.insurance.policy.dataobject.Employee;
import com.insurance.policy.dto.EmployeeDTO;
import com.insurance.policy.dto.PageQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeService {

    /*用户登录*/
    Employee employeeLogin(@Param("employeeId") String employeeId, @Param("employeePwd") String employeePwd);

    /*查询员工列表*/
    List<EmployeeDTO> findEmployeeList(PageQuery pageQuery);

    /*查询员工个数*/
    Long findEmployeeNum();
}
