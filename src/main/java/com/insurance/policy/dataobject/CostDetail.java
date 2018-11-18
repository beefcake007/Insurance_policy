package com.insurance.policy.dataobject;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CostDetail {

    /**费用名称**/
    private String costName;

    /**费用金额**/
    private BigDecimal costPrice;

    /**数量**/
    private Integer costNum;

    /**自负比例**/
    private BigDecimal selfRatio;

    /**备注**/
    private String costDesc;

    /**ID**/
    private Integer costId;

    /**insurance_policy的主键**/
    private String insurancePolicyId;
}
