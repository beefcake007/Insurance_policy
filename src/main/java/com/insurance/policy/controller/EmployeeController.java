package com.insurance.policy.controller;

import com.insurance.policy.dataobject.Employee;
import com.insurance.policy.dto.EmployeeDTO;
import com.insurance.policy.dto.PageQuery;
import com.insurance.policy.enums.ResultEnum;
import com.insurance.policy.exception.PolicyException;
import com.insurance.policy.form.EmployeeLoginForm;
import com.insurance.policy.service.EmployeeService;
import com.insurance.policy.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/index")
    public String main() {
        return "login.html";
    }

    @RequestMapping("/member")
    public String member() {
        return "member/main.html";
    }

    @RequestMapping("/manager")
    public String manager() {
        return "manager/main.html";
    }

    @RequestMapping("/employeeManager")
    public String employeeManager(){
        return "manager/employeeManager.html";
    }

    @RequestMapping("/login")
    @ResponseBody
    public ResultVO login(@Valid EmployeeLoginForm employeeLoginForm, BindingResult bindingResult, HttpServletRequest request) {
        Employee employee = employeeService.employeeLogin(employeeLoginForm.getEmployeeId(), employeeLoginForm.getEmployeePwd());
        if (bindingResult.hasErrors()) {
            log.error("【员工登录操作】参数不正确，employeeLoginForm={}", employeeLoginForm);
            throw new PolicyException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        if (employee == null) {
            log.error("【员工登录操作】账号或密码错误");
            throw new PolicyException(ResultEnum.LOGIN_FAIL.getCode(),
                    "账号或密码错误");
        }
        ResultVO resultVO = new ResultVO();
        HttpSession session = request.getSession();
        session.setAttribute("employeeInfo", employee);
        if (employee.getEmployeeStatus() == 0) {
            resultVO.setCode(ResultEnum.LOGIN_MEMBER.getCode());
            return resultVO;
        } else {
            resultVO.setCode(ResultEnum.LOGIN_MANAGER.getCode());
            return resultVO;
        }
    }

    @RequestMapping("/employeeInfo")
    @ResponseBody
    public Employee employeeInfo(HttpServletRequest request) {
        Employee employee = (Employee) request.getSession().getAttribute("employeeInfo");
        return employee;
    }

    @RequestMapping("/employeeList")
    @ResponseBody
    public PageQuery employeeList(@RequestParam(value = "page", defaultValue = "1") String page,
                             @RequestParam(value = "size", defaultValue = "10") String size) {
        PageQuery pageQuery=new PageQuery();
        pageQuery.setPageSize(Integer.parseInt(size));
        pageQuery.setCurrentPage(Integer.parseInt(page));
        List<EmployeeDTO> employeeList=employeeService.findEmployeeList(pageQuery);
        Long total=employeeService.findEmployeeNum();
        pageQuery.setItems(employeeList);
        pageQuery.setTotalRows(total.intValue());
        return pageQuery;
    }
}
