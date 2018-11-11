package com.insurance.policy.controller;

import com.insurance.policy.dataobject.Employee;
import com.insurance.policy.enums.ResultEnum;
import com.insurance.policy.exception.PolicyException;
import com.insurance.policy.form.EmployeeLoginForm;
import com.insurance.policy.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(@Valid EmployeeLoginForm employeeLoginForm, BindingResult bindingResult){
        Employee employee = employeeService.employeeLogin(employeeLoginForm.getEmployeeId(),employeeLoginForm.getEmployeePwd());
        if(bindingResult.hasErrors()){
            log.error("【员工登录操作】参数不正确，employeeLoginForm={}", employeeLoginForm);
            throw new PolicyException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        if(employee==null){
            log.error("【员工登录操作】账号或密码错误");
            return "账号或密码错误";
        }
        return "登录成功";
    }
}
