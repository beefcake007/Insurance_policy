package com.insurance.policy.enums;

import lombok.Getter;

@Getter
public enum EmployeeEnum {

    EMPLOYEE(0,"普通员工"),

    ADMINISTRATOR(1,"管理员"),

    EMPLOYEE_ONE(2,"容器一员工"),

    EMPLOYEE_TWO(3,"容器二员工"),

    EMPLOYEE_THREE(4,"容器三员工"),

    EMPLOYEE_CHECK(5,"质检员");

    private Integer code;

    private String message;

    EmployeeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
