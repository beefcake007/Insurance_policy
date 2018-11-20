package com.insurance.policy.dataobject;

import lombok.Data;

import java.util.Date;

@Data
public class TaskDetail
{
    // 原始图像包文件名
    private String originalPackageName;

    // 原始文档数
    private Integer originalDocNum;

    // 原始图像数
    private Integer originalImageNum;

    // 原始图像包下载时间
    private Date originalPackageDate;

    // 出险人名字
    private String dangerPeople;

    // 原始图像包状态 1已导出 0正生产
    private Integer originalStatus;

    // 逻辑任务包编号
    private String logicTaskPackage;

    // 逻辑文档数
    private Integer logicDocNum;

    // 逻辑图像数
    private Integer logicImageNum;

    // 逻辑图像包状态 1已完成 0未完成
    private Integer logicStatus;

    // 录入小组
    private String entryGroup;

    // 录入人员
    private String entryMember;

    // 质检小组
    private String checkGroup;

    // 质检人员
    private String checkMember;


}
