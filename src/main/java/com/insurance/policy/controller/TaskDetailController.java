package com.insurance.policy.controller;

import com.insurance.policy.dto.PageQuery;
import com.insurance.policy.dto.TaskDetailDTO;
import com.insurance.policy.service.TaskDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/taskDetail")
@Slf4j
public class TaskDetailController
{
    @Autowired
    private TaskDetailService taskDetailService;

    @RequestMapping("/taskDetailManager")
    public String taskDetailManager(){
        return "manager/taskDetailManager.html";
    }

    @RequestMapping("/taskDetailList")
    @ResponseBody
    public PageQuery taskDetailList(@RequestParam(value = "page", defaultValue = "1") String page,
                                  @RequestParam(value = "size", defaultValue = "10") String size) {
        PageQuery pageQuery=new PageQuery();
        pageQuery.setPageSize(Integer.parseInt(size));
        pageQuery.setCurrentPage(Integer.parseInt(page));
        List<TaskDetailDTO> taskDetailList=taskDetailService.findTaskDetailList(pageQuery);
        Long total=taskDetailService.findTaskDetailListNum();
        pageQuery.setItems(taskDetailList);
        pageQuery.setTotalRows(total.intValue());
        return pageQuery;
    }

}
