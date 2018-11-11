package com.insurance.policy.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class EmployeeLoginForm {

    /**
     * 员工ID
     */
    @NotEmpty(message = "用户ID必填")
    private String employeeId;

    /**
     * 员工密码
     */
    @NotEmpty(message = "员工密码必填")
    private String employeePwd;
}
