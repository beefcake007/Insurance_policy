package com.insurance.policy.service;

import com.insurance.policy.dto.PageQuery;
import com.insurance.policy.dto.TaskDetailDTO;

import java.util.List;

public interface TaskDetailService
{

    /*查询员工列表*/
    List<TaskDetailDTO> findTaskDetailList(PageQuery pageQuery);

    /*查询员工个数*/
    Long findTaskDetailListNum();

}
