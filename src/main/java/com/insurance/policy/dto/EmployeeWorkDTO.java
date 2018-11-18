package com.insurance.policy.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class EmployeeWorkDTO
{
    /**员工工号**/
    private String employeeId;

    //    录入任务包数量
    private Integer entryTask;

    //    录入发票数量
    private Integer entryInvoice;

    //    录入时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date entryDate;
}
