package com.insurance.policy.dataobject;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class InsurancePolicy {

    /**主键，格式"zip包名"**/
    private String insurancePolicyId;

    /**保单号**/
    private String insurancePolicyCode;

    /**被保人**/
    private String recognizee;

    /**被保人证件类型**/
    private String recognizeeCardType;

    /**被保人证件号码**/
    private String recognizeeCard;

    /**被保人电话**/
    private String recognizeePhone;

    /**被保人邮箱**/
    private String recognizeeEmail;

    /**发票总数**/
    private Integer invoiceNum;

    /**账单类型**/
    private Integer insurancePolicyType;

    /**发票金额**/
    private BigDecimal invoicePrice;

    /**就诊日期**/
    private Date seedocDate;

    /**自费金额**/
    private BigDecimal selfpayingPrice;

    /**分类自负金额**/
    private BigDecimal typeSelfpayingPrice;

    /**社保支付金额**/
    private BigDecimal socialSecurityPrice;

    /**是否特需 0是 1否**/
    private Integer special;

    /**医院代码**/
    private String hospitalId;

    /**医院名称**/
    private String hospitalName;

    /**医院级别**/
    private Integer hospitalLevel;

    /**科室代码**/
    private Integer departmentId;

    /**出院日期**/
    private Date hospitalDate;

    /**他方支付**/
    private BigDecimal otherPaying;

    /**问题描述**/
    private String answerDesc;
}
