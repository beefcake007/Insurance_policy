package com.insurance.policy.handler;

import com.insurance.policy.exception.PolicyAuthorizeException;
import com.insurance.policy.exception.PolicyException;
import com.insurance.policy.utils.ResultVOUtil;
import com.insurance.policy.vo.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class PolicyExceptionHandler {

    //拦截登录异常
    @ExceptionHandler(value = PolicyAuthorizeException.class)
    public ModelAndView handlerAuthorizeException() {
        return new ModelAndView("redirect:http://localhost:8080/Insurance_policy");
    }

    @ExceptionHandler(value = PolicyException.class)
    @ResponseBody
    public ResultVO handlerSellerException(PolicyException e) {
        return ResultVOUtil.error(e.getCode(), e.getMessage());
    }
}
