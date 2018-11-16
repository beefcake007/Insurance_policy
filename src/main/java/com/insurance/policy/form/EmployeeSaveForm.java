package com.insurance.policy.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
public class EmployeeSaveForm {

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

    /**
     * 员工姓名
     * **/
    @NotEmpty(message = "员工姓名必填")
    private String employeeName;

    /**员工性别**/
    @NotEmpty(message = "用户性别必填")
    private String employeeSex;

    /**员工电话**/
    @NotEmpty(message = "用户电话必填")
    private String employeePhone;

    /**员工邮箱**/
    @NotEmpty(message = "用户邮箱必填")
    private String employeeMail;

    /**员工职位**/
    @NotEmpty(message = "用户职位必填")
    private String employeePosition;

    /**员工岗位**/
    @NotEmpty(message = "用户岗位必填")
    private String employeeJob;

    /**员工身份证**/
    @NotEmpty(message = "用户身份证必填")
    private String employeeCardId;

}