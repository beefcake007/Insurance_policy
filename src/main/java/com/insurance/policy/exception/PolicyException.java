package com.insurance.policy.exception;

import com.insurance.policy.enums.ResultEnum;
import lombok.Getter;

@Getter
public class PolicyException extends RuntimeException {

    private Integer code;

    public PolicyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public PolicyException(Integer code, String message) {
        super(message);
        this.code = code;
    }

}
