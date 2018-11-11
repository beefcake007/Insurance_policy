package com.insurance.policy.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.insurance.policy.utils.Serializer.Date2LongSerializer;
import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDTO {

    /**员工工号**/
    private String employeeId;

    /**员工姓名**/
    private String employeeName;

    /**员工密码**/
    private String employeePwd;

    /**员工性别**/
    private String employeeSex;

    /**员工年龄**/
    private Integer employeeAge;

    /**员工电话**/
    private String employeePhone;

    /**员工邮箱**/
    private String employeeMail;

    /**员工是否是管理员**/
    private Integer employeeStatus;

    /**员工职位**/
    private String employeePosition;

    /**员工岗位**/
    private String employeeJob;

    /**员工身份证**/
    private String employeeCardId;

    /**
     * 创建时间
     **/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /**
     * 更新时间
     **/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;
}
