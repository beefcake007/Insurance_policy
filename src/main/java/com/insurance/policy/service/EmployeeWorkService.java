package com.insurance.policy.service;

import com.insurance.policy.dto.EmployeeWorkDTO;

public interface EmployeeWorkService
{

//    获取用户的任务完成量
    EmployeeWorkDTO getEmployeeWorkByEmployeeId(String employeeId);

}
