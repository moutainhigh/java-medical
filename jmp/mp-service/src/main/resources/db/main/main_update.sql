/***********************2.8********************BEGIN*/




/***********************2.8*********************END*/

/***********************2.10********************BEGIN*/
ALTER TABLE `b2c_shop` ADD COLUMN `expire_time` timestamp NULL COMMENT '到期时间';
/***********************2.10*********************END*/

/***********************2.11********************BEGIN*/
ALTER TABLE `b2c_shop` ADD COLUMN `store_clerk_privilege_list` TEXT NULL DEFAULT NULL COMMENT '门店店员权限列表';
/***********************2.11*********************END*/
