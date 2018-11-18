package com.insurance.policy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/insurance_policy")
public class InsurancePolicyController {

    @RequestMapping("/main")
    public String main(){
        return "member/insurancePolicy.html";
    }
}
