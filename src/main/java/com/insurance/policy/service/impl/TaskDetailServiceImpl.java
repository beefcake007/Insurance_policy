package com.insurance.policy.service.impl;

import com.insurance.policy.dto.PageQuery;
import com.insurance.policy.dto.TaskDetailDTO;
import com.insurance.policy.repository.TaskDetailRepository;
import com.insurance.policy.service.TaskDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskDetailServiceImpl implements TaskDetailService
{
    @Autowired
    private TaskDetailRepository taskDetailRepository;

    @Override
    public List<TaskDetailDTO> findTaskDetailList(PageQuery pageQuery) {
        return taskDetailRepository.findTaskDetailList(pageQuery);
    }

    @Override
    public Long findTaskDetailListNum() {
        return taskDetailRepository.findTaskDetailListNum();
    }
}
