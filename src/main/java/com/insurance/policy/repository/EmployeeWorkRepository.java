package com.insurance.policy.repository;

import com.insurance.policy.dto.EmployeeWorkDTO;

public interface EmployeeWorkRepository
{
    //    获取用户的任务完成量
    EmployeeWorkDTO getEmployeeWorkByEmployeeId(String employeeId);
}
