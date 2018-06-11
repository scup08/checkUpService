-- -----------------------------------------------------
-- Schema account_db
-- -----------------------------------------------------
CREATE DATABASE `check_db`
	DEFAULT CHARACTER SET utf8
	DEFAULT COLLATE utf8_general_ci;
USE 'check_db';

-- -----------------------------------------------------
-- Table `account_db`.`t_user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `check_db`.`t_check_item`(  
  `id` BIGINT(19) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'uuid',
  `delete_flag` INT DEFAULT 0 COMMENT '0-正常，1-已删除',
  `item_name` VARCHAR(50) COMMENT '检查项名称',
  `item_code` VARCHAR(20) COMMENT '检查项编码',
  `check_list_code` VARCHAR(20) COMMENT '检查列表编码',
  PRIMARY KEY (`id`)
);

-- -----------------------------------------------------
-- Table `account_db`.`t_user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `check_db`.`t_check_list`(  
  `id` BIGINT(19) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'uuid',
  `check_list_name` VARCHAR(50) COMMENT '检查列表名称',
  `check_list_code` VARCHAR(20) COMMENT '检查列表编码',
  PRIMARY KEY (`id`)
);