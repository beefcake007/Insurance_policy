package com.insurance.policy.dataobject;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeWork
{
    /**员工工号**/
    private String employeeId;

//    录入任务包数量
    private Integer entryTask;

//    录入发票数量
    private Integer entryInvoice;

//    录入时间
    private Date entryDate;
}
