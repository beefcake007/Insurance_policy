CREATE TABLE `employee` (
  `employee_id` VARCHAR(8) NOT NULL COMMENT '员工工号',
  `employee_name` VARCHAR(16) NOT NULL COMMENT '员工姓名',
  `employee_pwd` VARCHAR(16) NOT NULL COMMENT '员工密码',
  `employee_sex` varchar(2) NOT NULL COMMENT '员工性别',
  `employee_age` INT(3) NOT NULL COMMENT '员工年龄',
  `employee_phone` VARCHAR(16) NOT NULL COMMENT '员工电话',
  `employee_mail` VARCHAR(32) COMMENT '员工邮箱',
  `manager_status` TINYINT(1) NOT NULL COMMENT '员工是否是管理员 1为管理员 0不是',
  `employee_position` VARCHAR(32) NOT NULL COMMENT '员工职位',
  `employee_job` VARCHAR(32) NOT NULL COMMENT '员工岗位',
  `employee_cardId` VARCHAR(32) NOT NULL COMMENT '员工身份证号',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
	PRIMARY KEY (`employee_id`)
) COMMENT '员工表';
