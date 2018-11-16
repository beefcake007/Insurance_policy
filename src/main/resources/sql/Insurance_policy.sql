CREATE TABLE `employee` (
  `employee_id` VARCHAR(8) NOT NULL COMMENT '员工工号',
  `employee_name` VARCHAR(16) NOT NULL COMMENT '员工姓名',
  `employee_pwd` VARCHAR(16) NOT NULL COMMENT '员工密码',
  `employee_sex` varchar(2) NOT NULL COMMENT '员工性别',
  `employee_age` INT(3) NOT NULL COMMENT '员工年龄',
  `employee_phone` VARCHAR(16) NOT NULL COMMENT '员工电话',
  `employee_mail` VARCHAR(32) COMMENT '员工邮箱',
  `employee_status` TINYINT(1) NOT NULL COMMENT '员工是否是管理员 1为管理员 0不是',
  `employee_position` VARCHAR(32) NOT NULL COMMENT '员工职位',
  `employee_job` VARCHAR(32) NOT NULL COMMENT '员工岗位',
  `employee_cardId` VARCHAR(32) NOT NULL COMMENT '员工身份证号',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
	PRIMARY KEY (`employee_id`)
) COMMENT '员工表';

CREATE TABLE `shortcuts` (
  `shortcuts_key` VARCHAR(32) NOT NULL COMMENT '快捷键',
  `shortcuts_value` VARCHAR(32) NOT NULL COMMENT '快捷键解释'
) COMMENT '快捷键表';

CREATE TABLE `department` (
  `department_id` INT NOT NULL COMMENT '科室代码',
  `department_value` VARCHAR(32) NOT NULL COMMENT '科室名称'
) comment '科室表';

CREATE TABLE `hospital` (
  `hospital_id` VARCHAR(16) NOT NULL COMMENT '医院代码',
  `hospital_name` VARCHAR(32) NOT NULL COMMENT '医院名称',
  `hospital_level` INT NOT NULL COMMENT '医院级别',
  `hospital_point` VARCHAR(16) COMMENT '定点',
  `hospital_system` VARCHAR(8) NOT NULL comment '所属系统',
  `hospital_city` VARCHAR(32) NOT NULL comment '所在城市',
   PRIMARY KEY (`hospital_id`)
) COMMENT '医院代码表';

CREATE TABLE `insurance_policy` (
  `insurance_policy_id` VARCHAR(16) NOT NULL COMMENT '保单号',
  `recognizee` VARCHAR(16) NOT NULL COMMENT '被保人',
  `recognizee_card_type` VARCHAR(16) NOT NULL COMMENT '被保人证件类型',
  `recognizee_card` VARCHAR(32) NOT NULL COMMENT '被保人证件号码',
  `recognizee_phone` VARCHAR(16) COMMENT '被保人电话',
  `recognizee_email` VARCHAR(32) COMMENT '被保人邮箱',
  `invoice_num` INT COMMENT '发票总数',
  `insurance_policy_type` TINYINT(1) COMMENT '账单类型',
  `invoice_price` DECIMAL(7,2) NOT NULL COMMENT '发票金额',
  `seedoc_date` DATE NOT NULL COMMENT '就诊日期',
  `selfpaying_price` DECIMAL(7,2) COMMENT '自费金额',
  `type_selfpaying_price` DECIMAL(7,2) COMMENT '分类自负金额',
  `social_security_price` DECIMAL(7,2) COMMENT '社保支付金额',
  `special` TINYINT COMMENT '是否特需 0是 1否',
  `hospital_id` VARCHAR(16) NOT NULL COMMENT '医院代码',
  `hospital_name` VARCHAR(32) NOT NULL COMMENT '医院名称',
  `hospital_level` INT NOT NULL COMMENT '医院级别',
  `department_id` INT NOT NULL COMMENT '科室代码',
  `hospital_date` DATE NOT NULL COMMENT '出院日期',
  `other_paying` DECIMAL(7,2) COMMENT '他方支付',
  `answer_desc` VARCHAR(64) COMMENT '问题描述',
  PRIMARY KEY(`insurance_policy_id`)
) COMMENT '保单';

CREATE TABLE `cost_detail` (
  `cost_name` VARCHAR(64) NOT NULL COMMENT '费用名称',
  `cost_price` DECIMAL(7,2) NOT NULL COMMENT '费用金额',
  `cost_num` INT COMMENT '数量',
  `self_ratio` DECIMAL(3,2) NOT NULL COMMENT '自负比例',
  `cost_desc` VARCHAR(32) COMMENT '备注',
  `cost_id` INT NOT NULL COMMENT 'ID',
  `insurance_policy_id` VARCHAR(16) NOT NULL COMMENT '保单号',
  FOREIGN KEY (insurance_policy_id) REFERENCES insurance_policy(insurance_policy_id)
) COMMENT '费用明细';

CREATE TABLE `task_detail` (
  `original_package_name` VARCHAR(64) NOT NULL COMMENT '原始图像包文件名',
  `original_doc_num` INT NOT NULL COMMENT '原始文档数',
  `original_image_num` INT NOT NULL COMMENT '原始图像数',
  `original_package_date` DATE NOT NULL COMMENT '原始图像包下载时间',
  `danger_people` VARCHAR(16) NOT NULL COMMENT '出险人名字',
  `original_status` TINYINT(1) NOT NULL COMMENT '原始图像包状态 1已导出 0正生产',
  `logic_task_package` VARCHAR(64) NOT NULL COMMENT '逻辑任务包编号',
  `logic_doc_num` INT NOT NULL COMMENT '逻辑文档数',
  `logic_image_num` INT NOT NULL COMMENT '逻辑图像数',
  `logic_status` TINYINT(1) NOT NULL COMMENT '逻辑图像包状态 1已完成 0未完成',
  `entry_group` VARCHAR(32) NOT NULL COMMENT '录入小组',
  `entry_member` VARCHAR(16) NOT NULL COMMENT '录入人员',
  `check_group` VARCHAR(32) NOT NULL COMMENT '质检小组',
  `check_member` VARCHAR(16) NOT NULL COMMENT '质检人员',
  PRIMARY KEY(`original_package_name`)
) COMMENT '任务明细';

CREATE TABLE `employee_work` (
  `employee_id` VARCHAR(8) NOT NULL COMMENT '员工工号',
  `entry_task` INT NOT NULL COMMENT '录入的任务包',
  `entry_invoice` INT NOT NULL COMMENT '录入的发票',
  `entry_date` DATE NOT NULL COMMENT '录入时间',
  PRIMARY KEY(`employee_id`)
) COMMENT '个人工作统计'
