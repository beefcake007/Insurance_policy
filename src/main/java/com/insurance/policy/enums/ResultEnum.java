package com.insurance.policy.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    SUCCESS(0, "成功"),

    PARAM_ERROR(1, "参数不正确"),

    LOGIN_MEMBER(2, "登录成功，员工身份"),

    LOGIN_MANAGER(3, "登录成功，管理员身份"),

    LOGIN_FAIL(25, "登录失败,登录信息不正确"),

    LOGOUT_SUCCESS(25, "登出成功"),;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
