package com.insurance.policy.repository;

import com.insurance.policy.dataobject.CostDetail;

import java.util.List;

public interface CostDetailRepository {

    /**
     * 根据insurancePolicyId获取costDetail列表
     * @param insurancePolicyId
     * @return
     */
    List<CostDetail> selectCostDetailListByInsurancePolicyId(String insurancePolicyId);
}
