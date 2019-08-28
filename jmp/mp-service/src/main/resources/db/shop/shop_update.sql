-- -- 李晓冰 b2c_goods_brand 将记录创建时间添加默认值为当前时间戳，记录修改时间设置为当前记录变化时间戳
-- ALTER TABLE b2c_goods_brand MODIFY COLUMN add_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间';
-- ALTER TABLE b2c_goods_brand MODIFY COLUMN update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间';

-- -- b2c_sort 添加update_time 字段
-- ALTER TABLE b2c_sort ADD COLUMN update_time TIMESTAMP  DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间' AFTER create_time;
-- -- b2c_sort 删除字段keywords
-- ALTER TABLE b2c_sort DROP COLUMN keywords;
-- -- b2c_sort 修改parent_id字段类型，使其和sort_id类型一致
-- ALTER TABLE b2c_sort MODIFY COLUMN parent_id INT NOT NULL;

-- -- 7月3号 李晓冰 设置goods_brand goods_sort 部分字段默认值和非空约束
-- ALTER TABLE b2c_goods_brand MODIFY COLUMN is_recommend TINYINT NOT NULL DEFAULT 0 COMMENT '是否为推荐品牌 0否 1是';
-- ALTER TABLE b2c_goods_brand MODIFY COLUMN classify_id TINYINT NOT NULL DEFAULT 0 COMMENT '品牌所属分类 0未分类 否则是分类id';
-- ALTER TABLE b2c_goods_brand MODIFY COLUMN update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间';

-- ALTER TABLE b2c_sort MODIFY COLUMN sort_name VARCHAR(90) NOT NULL;
-- ALTER TABLE b2c_sort MODIFY COLUMN parent_id INT(11) NOT NULL DEFAULT 0 COMMENT '分类父节点，0表示一级';
-- ALTER TABLE b2c_sort MODIFY COLUMN sort_name VARCHAR(90) NOT NULL;

-- -- 7月4号 修改b2c_group表名为b2c_store_group,字段in_time改为create_time
-- ALTER  TABLE b2c_group RENAME TO b2c_store_group;
-- ALTER TABLE b2c_store_group CHANGE column in_time create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;

-- -- 7月5日 李晓冰  修改b2c_spec和 b2c_spec_val表，添加非空约束，和唯一索引
-- ALTER TABLE b2c_spec
-- MODIFY COLUMN create_time timestamp   not null 	default current_timestamp,
-- MODIFY COLUMN update_time  timestamp   not null  	default current_timestamp on update current_timestamp comment '最后修改时间',
-- ADD UNIQUE INDEX unique_spec_name_goods_id (spec_name,goods_id);

-- ALTER TABLE b2c_spec_vals
-- MODIFY COLUMN create_time timestamp   not null 	default current_timestamp,
-- MODIFY COLUMN update_time  timestamp   not null  	default current_timestamp on update current_timestamp comment '最后修改时间',
-- CHANGE COLUMN specvalid spec_val_id int(11) 	not null auto_increment ,
-- CHANGE COLUMN specvalname spec_val_name VARCHAR(60) not null DEFAULT '',
-- ADD UNIQUE INDEX unique_spec_id_spec_val_name (spec_id,spec_val_name);


-- -- 7月10日 梁晨 b2c_comment_goods 添加is_shop_add  bogus_username  bogus_user_avatar字段
-- ALTER TABLE b2c_comment_goods ADD COLUMN is_shop_add tinyint(1)  not null DEFAULT '0' comment '是否商家增加：0不是，1是';
-- ALTER TABLE b2c_comment_goods ADD COLUMN bogus_username  varchar(32)  not null default '' comment '用户名称：商家添加时使用';
-- ALTER TABLE b2c_comment_goods ADD COLUMN bogus_user_avatar varchar(100)  not null default '' comment '用户头像：商家添加时使用';




-- -- 7月9日 黄壮壮 修改b2c_tag表名in_time为create_time 并且添加字段update_time
-- alter table b2c_tag CHANGE COLUMN in_time create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP;
-- ALTER TABLE b2c_tag ADD COLUMN update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间' AFTER create_time;



-- -- 7月9日添加
-- -- 修改标签组关系表
-- ALTER TABLE b2c_goods_label_couple MODIFY COLUMN label_id INT(11) NOT NULL;

-- -- 7月11日 常乐 创建测评活动相关表结构
-- -- 测评活动表
-- -- drop table if exists `b2c_assess_activity`;
-- create table `b2c_assess_activity` (
--   `id`                int(11)               not null auto_increment,
--   `shop_id`           int(11)               null     default 0 comment '店铺ID',
--   `act_code`          varchar(32)           null     default '' comment '活动编码',
--   `act_name`          varchar(120)          not null default '' comment '活动名称',
--   `start_time`        datetime              not null comment '活动起始时间',
--   `end_time`          datetime              not null comment '活动截止时间',
--   `due_time_type`     tinyint(1)            null     default 0 comment '是否永久有效：0否，1是',
--   `part_times_type`   tinyint(1)            null     default 0 comment '单用户参与次数类型：0不限制，1限制次数',
--   `part_times_day`    int(4)                null     default 1 comment '每天最多参与次数：默认为1,0表示不限制',
--   `part_times_total`  int(4)                null     default 1 comment '累计最多参与次数：默认为1,0表示不限制',
--   `feedback_total`    int(4)                null     default 0 comment '活动总反馈数量：默认为0,0表示不限制',
--   `assess_judge_type` tinyint(1)            null     default 0 comment '测评结果判断条件：0根据选项判断，1根据得分判断',
--   `cover_style_type`  tinyint(1)            null     default 0 comment '封面样式类型：0默认样式，1自定义',
--   `cover_style`       text comment '封面样式内容，json串',
--   `assess_desc`       varchar(500)          not null default '' comment '测评介绍',
--   `create_time`       timestamp       default current_timestamp,
--   `update_time`       timestamp       default current_timestamp on update current_timestamp comment '最后修改时间',
--   `is_block`          tinyint(1)            null     default 0 comment '活动状态：0未停用，1已停用',
--   `del_flag`          tinyint(1)            null     default 0 comment '删除标识：0未删除，1已删除',
--   `pub_flag`          tinyint(1)            null     default 0 comment '发布标识：0未发布，1已发布',
--   primary key (`id`),
--   key `act_name` (`act_name`),
--   key (`shop_id`)
-- );

-- -- 测评活动题目表
-- -- drop table if exists `b2c_assess_topic`;
-- create table `b2c_assess_topic` (
--   `id`                int(8)                not null auto_increment,
--   `shop_id`           int(11)               null     default 0 comment '店铺ID',
--   `assess_id`         int(11)               null     default 0 comment '测评活动ID',
--   `topic_type`        tinyint(1)            null     default 0 comment '题目格式：0文本，1图片，2视频',
--   `topic_type_path`   varchar(200)          null     default '' comment '题目图片、视频路径',
--   `topic_title`       varchar(200)          null     default '' comment '题目标题',
--   `topic_level`       tinyint(2)            null     default 1 comment '题目优先级，越小优先级越大，从1开始',
--   `bg_img_type`       tinyint(1)            null     default 0 comment '题目背景类型：0默认，1自定义',
--   `bg_img_path`       varchar(200)          null     default '' comment '题目背景图片路径',
--   `option_type`       tinyint(1)            null     default 0 comment '选项类型：0单选，1多选',
--   `option_skip_type`  tinyint(1)            null     default 0 comment '多选时跳转类型：1跳转到指定题目，2跳转导致指定结果',
--   `option_skip_value` int(8)                null     default 0 comment '多选时跳转到指定题目ID或者结果ID',
--   `option_content`    text comment '选项内容，json串，包括选项描述、图片和跳转逻辑或者分值',
--   `result_id`         int(11)               null     default 0 comment '对应ID',
--   `create_time`       timestamp       default current_timestamp,
--   `update_time`       timestamp       default current_timestamp on update current_timestamp comment '最后修改时间',
--   `del_flag`          tinyint(1)            null     default 0 comment '删除标识：0未删除，1已删除',
--   primary key (`id`),
--   key `assess_id` (`assess_id`),
--   key (`shop_id`)
-- );

-- -- 测评活动结果表
-- -- drop table if exists `b2c_assess_result`;
-- create table `b2c_assess_result` (
--   `id`                     int(11)                not null auto_increment,
--   `shop_id`                int(11)               null     default 0 comment '店铺ID',
--   `assess_id`              int(11)               null     default 0 comment '测评活动ID',
--   `result`                 varchar(200)          null     default '' comment '测试结果',
--   `min_point`              int(11)               null     default 0 comment '结果分值区间起始值',
--   `max_point`              int(11)               null     default 0 comment '结果分值区间终值',
--   `result_img_path`        varchar(200)          null     default '' comment '测试结果图片路径',
--   `result_desc`            varchar(500)          null     default '' comment '测试结果描述',
--   `reward_type`            tinyint(1)            null     default 0 comment '奖励类型：0不设置，1优惠券，2奖品，3积分，4余额，5自定义',
--   `reward_info`            varchar(300)          null     default '' comment '奖励内容',
--   `reward_limit_type`      tinyint(1)            null     default 0 comment '领奖限制类型：0无限制，1分享好友领奖品，2填写信息领奖品',
--   `reward_limit_condition` varchar(32)           null     default '' comment '领奖限制条件,多选字符串逗号隔开：1真实姓名，2手机号，3身份证号码，4性别，5生日，6婚姻状况，7教育程度，8所在行业，9所在地',
--   `bg_type`                tinyint(1)            null     default 0 comment '结果页背景类型：0默认，1自定义',
--   `bg_img_path`            varchar(132)          null     default '' comment '结果页背景图片路径',
--   `create_time`            timestamp       default current_timestamp,
--   `update_time`            timestamp       default current_timestamp on update current_timestamp comment '最后修改时间',
--   `del_flag`               tinyint(1)            null     default 0 comment '删除标识：0未删除，1已删除',
--   primary key (`id`),
--   key (`assess_id`),
--   key (`shop_id`)
-- );

-- -- 测评活动记录表
-- -- drop table if exists `b2c_assess_record`;
-- create table `b2c_assess_record` (
--   `id`           int(11)               not null  auto_increment,
--   `shop_id`      int(11)               not null  default 0 comment '店铺ID',
--   `user_id`      int(11)               not null  default 0 comment '会员ID',
--   `assess_id`    int(11)               not null  default 0 comment '测评活动ID',
--   `topic_id`     int(11)               not null  default 0 comment '测评得出结果的题目的ID',
--   `result_id`    int(11)               not null  default 0 comment '测评结果ID',
--   `assess_point` varchar(11)           null      default '' comment '测评总得分或者题目的选项编号',
--   `create_time`   timestamp            default current_timestamp,
--   `update_time`   timestamp            default current_timestamp on update current_timestamp comment '最后修改时间',
--   `finish_time`  datetime              not null comment '测评完成时间',
--   `del_flag`     tinyint(1)            not null  default 0 comment '删除标识：0未删除，1已删除',
--   `state_status` tinyint(1)            not null  default 0 comment '测评状态：0测评中，1测评完成待领取奖励，2测评完成已领取，3领取失效，4测评失败',
--   primary key (`id`),
--   key (`assess_id`),
--   key (`shop_id`),
--   key (`user_id`)
-- );

-- -- 测评活动答题记录表
-- -- drop table if exists `b2c_assess_topic_record`;
-- create table `b2c_assess_topic_record` (
--   `id`           int(11)               not null auto_increment,
--   `record_id`    int(11)               not null default 0 comment '测评活动记录表关联ID',
--   `topic_id`     int(11)               not null default 0 comment '测评题目的ID',
--   `topic_option` varchar(11)           not null default '' comment '测评题目选项编号,多选的逗号隔开',
--   `topic_point`  int(8)                not null default 0 comment '测评得分',
--   `result_id`    int(11)               not null default 0 comment '测评结果ID',
--   `create_time`  timestamp       default current_timestamp,
--   `update_time`  timestamp       default current_timestamp on update current_timestamp comment '最后修改时间',
--   primary key (`id`),
--   key (`record_id`),
--   key (`result_id`)
-- );

-- -- 7月12日 常乐 添加优惠礼包表结构
-- ##优惠券礼包
-- #DROP TABLE IF EXISTS `b2c_coupon_pack`;
-- create table `b2c_coupon_pack` (
--   `id`              int(11)                  not null auto_increment,
--   `act_name`        varchar(100)             not null comment '活动名称',
--   `start_time`      datetime                 not null comment '开始时间',
--   `end_time`        datetime                 not null comment '结束时间',
--   `pack_name`       varchar(20)              not null comment '礼包名称',
--   `limit_get_times` tinyint(5)       		 not null default 0 comment '单用户领取限制次数，0不限制',
--   `total_amount`    int(11)                  not null default '0' comment '总数量',
--   `issued_amount`   int(11)                  not null default '0' comment '已发放数量',
--   `access_mode`     tinyint(1)               not null default '0' comment '获取方式，0：现金购买，1：积分购买，2直接领取',
--   `access_cost`     decimal(10, 2)           null     default 0.00 comment '价格（现金或积分，直接领取时该值为0）',
--   `act_rule`        text collate utf8mb4_bin null comment '活动规则',
--   `state`           tinyint(1)               not null default '1' comment '开启状态1:开启，0:停用',
--   `create_time`     timestamp       default current_timestamp,
--   `update_time`     timestamp       default current_timestamp on update current_timestamp comment '最后修改时间',
--   `del_flag`        tinyint(1)                        default 0,
--   `del_time`        timestamp       default current_timestamp,
--   primary key (`id`)
-- );

-- -- 李晓冰 7月12日添加
-- -- 修改表 b2c_goods_spec_product_bak
-- drop table if exists `b2c_goods_spec_product_bak`;
-- create table `b2c_goods_spec_product_bak` (
--   `prd_bak_id`           int(10)                         	not null auto_increment,
-- 	`del_time`				timestamp													not null DEFAULT current_timestamp,
-- 	`prd_id`					 int(10)													not null default '0',
--   `shop_id`          int(11)                        	not null default '0',
--   `goods_id`         int(10)                        	not null default '0',
--   `prd_price`        decimal(10, 2)                   	not null default '0.00',
--   `prd_market_price` decimal(10, 2)                   	not null default '0.00' 	comment '市场价',
--   `prd_cost_price`   decimal(10, 2) 					not null default '0.00' 	comment '成本价',
--   `prd_number`       int(11)                        	not null default '0' 	comment '当前规格组合产品库存',
--   `prd_sn`           varchar(65)                       	not null default '' 		comment '商家编码',
--   `prd_codes`        varchar(500)                     	not null default '' 		comment '商品条码',
--   `prd_specs`        varchar(1024)                     	not null default '',
--   `prd_desc`         varchar(1024)                     	not null default '' 		comment '规格描述，格式例子：颜色:红色 尺码:s',
--   `del_flag`         tinyint(1)                       	not null default '0',
--   `self_flag`        tinyint(1) 						not null default '0'   	comment '1:商家自己添加商品，其他没用',
--   `low_shop_price`   varchar(1024)                     	not null default '0.00' 	comment '最低售出价格',
--   `prd_img`          varchar(1024)                     	not null default '' 		comment '图片地址',
--   `price_flag`       tinyint(1)                       	not null default '0' 	comment '0:商家未改价，1：商家改价，2：批量改价，3：毛利改价',
--   `create_time`      timestamp    	not null comment '规格记录在原表内的添加时间',
--   `update_time`      timestamp     	not null comment '规格记录在原表内的最后修改时间',
--   primary key (`prd_bak_id`),
--   key `gsp_goods_id` (`goods_id`),
--   key `gsp_goods_codes` (`prd_codes`),
--   key `gsp_prd_sn` (`prd_sn`)
-- );
-- -- 李晓冰 7月12日添加
-- -- b2c_goods 添加主键约束
-- ALTER TABLE b2c_goods  add PRIMARY KEY(goods_id);

-- -- 王兵兵 7月15日
-- -- b2c_service_category 修改表名
-- alter table `b2c_service_category` rename to `b2c_store_service_category`;
-- -- b2c_service_category 统一主键字段类型
-- alter table `b2c_store_service_category` modify  column `cat_id` int(11) NOT NULL AUTO_INCREMENT;

-- --常乐  7月16日 重新设计优惠券表结构
-- -- drop table if exists `b2c_mrking_voucher`;
-- create table `b2c_mrking_voucher` (
--   `id`                   int(11)                not null auto_increment,
--   `shop_id`              int(11)                not null default 0 comment '店铺id',
--   `act_code`             varchar(50)            not null default 'voucher',
--   `act_name`             varchar(120)           not null default '',
--   `start_time`           timestamp              default null,
--   `end_time`             timestamp              default null,
--   `denomination`         decimal(10, 2)         not null default '0' comment '面额',
--   `total_amount`         int(11)                not null default '0' comment '发行量',
--   `type`                 tinyint(1)             default 0 comment '优惠券类型，0普通优惠券；1分裂优惠券',
--   `surplus`              int(11)                not null default '0',
--   `remain_amount`        int(11)                not null default '0',
--   `use_consume_restrict` tinyint(1)             not null default '0' comment '使用限制',
--   `least_consume`        mediumint(5)           not null default '0' comment '满多少可用',
--   `use_explain`          varchar(256)           not null default '',
--   `enabled`              tinyint(1)             not null default '1',
--   `is_random`            tinyint(1)             not null default '0' comment '是否需要积分兑换',
--   `receive_per_person`   smallint(3)            not null default '0' comment '每人限领张数',
--   `suit_goods`           tinyint(1)             not null default '0' comment '0:全店通用,1:指定店铺',
--   `together_used`        tinyint(1)             not null default '0' comment '是否与其他优惠券同时使用',
--   `permit_share`         tinyint(1)             not null default '0' comment '是否允许分享优惠券链接',
--   `remind_owner`         tinyint(1)             not null default '0' comment '是否到期前提醒用户',
--   `giveout_amount`       smallint(4)            not null default '0' comment '发放优惠券数量',
--   `giveout_person`       smallint(4)            not null default '0' comment '发放优惠券人数',
--   `receive_amount`       smallint(4)            not null default '0' comment '领取优惠券数量',
--   `receive_person`       smallint(4)            not null default '0' comment '领取优惠券人数',
--   `used_amount`          smallint(4)            not null default '0' comment '已使用优惠券数量',
--   `alias_code`           varchar(16)            not null default '' comment '唯一活动代码',
--   `validation_code`      varchar(10)            not null default '' comment '领取码',
--   `recommend_goods_id`   text                   comment '指定商品可用',
--   `recommend_cat_id`     text                   comment '指定平台可用',
--   `recommend_sort_id`    text                   comment '指定商家分类可用',
--   `validity`             mediumint(11)      not null default 0    comment '优惠券有效天数',
--   `del_flag`             tinyint(1)             not null default '0' comment '1为删除状态',
--   `action`               tinyint(1)       not null default 1   comment '1:系統创建 2：来自crm',
--   `identity_id`          varchar(50)            default null comment '关联外部优惠券规则唯一码',
--   `recommend_product_id` text                   comment '关联商品规格',
--   `use_score`            tinyint(2)       not null default 0    comment '是否可以积分兑换',
--   `score_number`         int(6)         not null default 0    comment '需要积分数',
--   `card_id`              text                 comment '专属会员卡',
--   `create_time`          timestamp      default current_timestamp,
--   `update_time`          timestamp      default current_timestamp on update current_timestamp comment '最后修改时间',
--   primary key (`id`),
--   unique key `alias_code` (`alias_code`),
--   key `act_name` (`act_name`),
--   key (`shop_id`)
-- );

-- -- 黄荣刚 7月15日
-- -- 修改
-- ALTER TABLE b2c_service_technician MODIFY COLUMN group_id int(11) DEFAULT 0  COMMENT '技师分组';
-- ALTER TABLE b2c_service_technician_group MODIFY COLUMN group_id int(11) NOT NULL AUTO_INCREMENT COMMENT '技师分组';



-- 黄壮壮 7月16
-- 修改字段in_time与up_time
-- alter table b2c_user_score_set CHANGE COLUMN in_time create_time TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP
-- alter table b2c_user_score_set CHANGE COLUMN up_time update_time TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP



-- 2019-07-17 重新建表 --

-- 王兵兵 201-07-18
alter table `b2c_service_order` add index order_sn(order_sn);

/* liufei 2019-07-19 */
alter table b2c_trades drop index ref_date;

-- 2019-07-23 统计相关表添加 int 主键 --
-- 郑保乐 2019-07-23
alter table b2c_mp_daily_visit
    add id int auto_increment primary key first;

alter table b2c_mp_daily_retain
    add id int auto_increment primary key first ;

alter table b2c_mp_weekly_visit
    add id int auto_increment primary key first;

alter table b2c_mp_weekly_retain
    add id int auto_increment primary key first ;

alter table b2c_mp_monthly_visit
    add id int auto_increment primary key first;

alter table b2c_mp_monthly_retain
    add id int auto_increment primary key first;

alter table b2c_mp_user_portrait
    add id int auto_increment primary key first;

alter table b2c_mp_visit_page
    add id int auto_increment primary key first;

alter table b2c_mp_distribution_visit
    add id int auto_increment primary key first;

-- 王兵兵 201-07-24 补全砍价活动表字段

ALTER TABLE `b2c_bargain` ADD COLUMN `bargain_type` TINYINT(1) DEFAULT 0  NULL   COMMENT '砍价类型0定人1任意价';
ALTER TABLE `b2c_bargain` ADD COLUMN `floor_price` DECIMAL(10,2) DEFAULT 0.00  NULL   COMMENT '任意低价';
ALTER TABLE `b2c_bargain` ADD COLUMN `bargain_money_type` TINYINT(1) DEFAULT 0  NULL   COMMENT '砍价计算模式';
ALTER TABLE `b2c_bargain` ADD COLUMN `bargain_fixed_money` DECIMAL(10,2) DEFAULT 0.00  NULL   COMMENT '固定金额';
ALTER TABLE `b2c_bargain` ADD COLUMN `bargain_min_money` DECIMAL(10,2) DEFAULT 0.00  NULL   COMMENT '最低价';
ALTER TABLE `b2c_bargain` ADD COLUMN `bargain_max_money` DECIMAL(10,2) DEFAULT 0.00  NULL   COMMENT '最高价';
ALTER TABLE `b2c_bargain` ADD COLUMN `free_freight` TINYINT(1) DEFAULT '0' COMMENT '0不免运费，使用原商品运费模板   1免运费';

-- 王兵兵 201-07-25 砍价活动默认状态可用

alter table `b2c_bargain` modify column `status` tinyint(1) not null default '1' comment '状态：1可用，0停用';

-- liufei 2019-07-26 商品备份表添加品牌id字段

alter table b2c_goods_bak add column `brand_id` int(11) not null default 0 comment '品牌id';

-- 孔德成 2019-7-29  修改多人拼团表
-- --  拼团活动定义表
-- drop table if exists `b2c_group_buy__define`;
create table `b2c_group_buy__define`
(
    `id`               int(11)      not null auto_increment,
    `shop_id`          int(11)      not null comment '店铺id',
    `goods_id`         int(11)      not null comment '商品id',
    `name`             varchar(100) not null comment '活动名称',
    `limit_amount`     smallint(6)  not null comment '成团人数',
    `join_limit`       smallint(6)  not null comment '参团限制',
    `open_limit`       smallint(6)  not null comment '开团限制',
    `is_default`       tinyint(1)   not null default 0 comment '默认成团',
    `start_time`       timestamp    null     default null comment '开始时间',
    `end_time`         timestamp    null     default null comment '结束时间',
    `stock`            smallint(6)  not null default 0 comment '总库存',
    `sale_num`         smallint(6)  not null default 0 comment '销量',
    `del_flag`         tinyint(1)   not null default 0,
    `status`           tinyint(1)   not null default 1 comment '状态： 1：启用  0： 禁用 2 代表已无库存',
    `del_time`         int(11)      not null default 0,
    `activity_type`    tinyint(1)   not null default '1' comment '活动类型：1：普通拼团，2：老带新团',
    `is_grouper_cheap` tinyint(1)   not null default '0' comment '是否开启团长优惠：0：不开启，1：开启',
    `reward_coupon_id` varchar(200) null comment '拼团失败发放优惠券',
    `share_config`     text comment '分享设置',
    `create_time`      timestamp             default current_timestamp,
    `update_time`      timestamp             default current_timestamp on update current_timestamp comment '最后修改时间',
    primary key (`id`)
);

-- --  拼团活动产品规格定义表
-- drop table if exists `b2c_group_buy_product_define`;
create table `b2c_group_buy_product_define`
(
    `id`              int(11)        not null auto_increment,
    `activity_id` int(11)        not null comment '拼团定义id',
    `product_id`      int(11)        not null comment '商品规格id',
    `group_price` decimal(10, 2) not null default 0.00 comment '拼团价',
    `stock`           smallint(6)    not null default 0 comment '库存',
    `sale_num`        smallint(6)    not null default 0 comment '销量',
    `grouper_price`   decimal(10, 2) not null default '0.00' comment '团长优惠价',
    `create_time`     timestamp               default current_timestamp,
    `update_time`     timestamp               default current_timestamp on update current_timestamp comment '最后修改时间',
    primary key (`id`)
);

-- --  拼团活动参团明细表
-- drop table if exists `b2c_group_buy_list`;
create table `b2c_group_buy_list`
(
    `id`              int(11)     not null auto_increment,
    `activity_id` int(11)     not null comment '拼团活动定义id',
    `goods_id`        int(11)     not null default 0,
    `group_id`        int(11)     not null default 0 comment '拼团id',
    `user_id`         int(11)     not null,
    `is_grouper`      tinyint(1)  not null default 0 comment '是否为团长 1：是 0：否',
    `order_sn`        varchar(20) not null comment '订单编号',
    `status`          tinyint(1)  not null default 0 comment '0: 拼团中 1:拼团成功 2:拼团失败',
    `start_time`      timestamp   null     default null comment '开团时间',
    `end_time`        timestamp   null     default null comment '成团时间',
    `create_time`     timestamp            default current_timestamp,
    `update_time`     timestamp            default current_timestamp on update current_timestamp comment '最后修改时间',
    primary key (`id`)
);
--  瓜分积分活动配置
-- drop table if exists `b2c_group_integration_define`;
create table `b2c_group_integration_define` (
  `id`            int(11)                                 not null auto_increment,
  `shop_id`       int(11)                                 not null comment '店铺id',
  `name`          varchar(100)  						  not null comment '活动名称',
  `inte_total`    int(11)                                 not null default '0' comment '总抽奖积分',
  `inte_group`    int(11)                                 not null default '0' comment '每个团总积分',
  `limit_amount`  smallint(6)                             not null comment '成团人数',
  `join_limit`    smallint(6)                             not null comment '参团限制',
  `divide_type`   tinyint(1)                              not null default '0' comment '瓜分方式：0：按邀请好友数量瓜分，1：好友均分，2：随机瓜分',
  `start_time`    timestamp null default null comment '开始时间',
  `end_time`      timestamp null default null comment '结束时间',
  `status`        tinyint(1)                               not null default '1' comment '状态： 1：启用  0： 禁用',
  `del_flag`      tinyint(1)                               not null default '0',
  `del_time`	  timestamp      null	default null comment '删除时间',
  `inte_remain`   int(11)                                 not null default '0' comment '剩余积分',
  `is_day_divide` tinyint(1)                              not null comment '是否开团24小时自动开奖',
  `param_n`       float                                   not null default '0' comment '常数n',
  `is_continue`   tinyint(1)                              not null default '1' comment '继续： 1：继续  0： 结束',
  `advertise`     varchar(100)  						  not null comment '活动宣传语',
  `create_time`		timestamp      	default current_timestamp,
  `update_time` 	timestamp      	default current_timestamp on update current_timestamp comment '最后修改时间',
  primary key (`id`)
);

--  参团列表
-- drop table if exists `b2c_group_integration_list`;
create table `b2c_group_integration_list` (
  `id`               int(11)                                not null auto_increment,
  `inte_activity_id` int(11)                                not null comment '瓜分积分活动定义id',
  `group_id`         varchar(60)  							not null default '' comment '拼团id',
  `user_id`          int(11)                                not null,
  `is_grouper`       tinyint(1)                             not null default '0' comment '是否为团长 1：是 0：否',
  `status`           tinyint(1)                             not null default '0' comment '0: 拼团中 1:拼团成功 2:拼团失败',
  `start_time`       timestamp null default null comment '参团时间',
  `end_time`         timestamp null default null comment '成团时间',
  `integration`      int(11)                                not null default '0' comment '瓜分到的积分',
  `invite_num`       smallint(6)                            not null default '0' comment '邀请人的数量',
  `invite_user`      int(11)                                not null default '0' comment '邀请人（被谁邀请）',
  `is_new`           tinyint(1)                             not null default '0' comment '是否是新用户：0：不是，1：是',
  `is_look`          tinyint(1)                             not null default '0' comment '是否看过开奖结果',
  `can_integration`  int(11)                                not null default '0' comment '该团可瓜分积分池',
  `create_time`		timestamp      	default current_timestamp,
  `update_time` 	timestamp      	default current_timestamp on update current_timestamp comment '最后修改时间',
  primary key (`id`)
);
--  退款商品行增加列
alter table b2c_return_order_goods
add COLUMN return_money decimal(10, 2)	not null default '0.00' comment '实际退款金额',
add COLUMN discounted_goods_price decimal(10, 2)	not null default '0.00' comment '实际退款金额';

-- 修改虚拟商品订单表
alter table b2c_card_order
    add goods_type tinyint(2) not null comment '虚拟商品类别：0：会员卡，1：优惠券';
alter table b2c_card_order
    add voucher_id int(11) null comment '优惠券 ID' after card_no;

-- 会员卡订单
-- drop table if exists `b2c_virtual_card_order`;
create table b2c_virtual_card_order
(
    card_order_id mediumint unsigned auto_increment comment '会员卡订单id' primary key,
    order_id      mediumint unsigned comment '主虚拟商品订单id',
    card_id       int         default 0   not null comment '会员卡id',
    card_no       varchar(32) default '0' null comment '会员卡 No'
)
    collate = utf8mb4_unicode_ci;

--分销员数据汇总 常乐 20190801
ALTER TABLE `b2c_user_fanli_statistics` DROP PRIMARY KEY;
ALTER TABLE `b2c_user_fanli_statistics` ADD COLUMN `rebate_level` TINYINT(2) DEFAULT 1  NULL   COMMENT '返利等级0自购1直返2间返' AFTER `fanli_user_id`;

--  孔德成 2019-7-29 16:05:51  增加表 满包邮
--  满包邮详情
-- DROP TABLE IF EXISTS `b2c_free_shipping`;
CREATE TABLE `b2c_free_shipping` (
`id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
`name` VARCHAR ( 100 ) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '活动名称',
`expire_type` TINYINT ( 1 ) DEFAULT '0' COMMENT '0:固定日期 1：永久有效',
`start_time` datetime DEFAULT NULL COMMENT '开始时间',
`end_time` datetime DEFAULT NULL COMMENT '结束时间',
`type` INT ( 11 ) NOT NULL COMMENT '条件 0全部 1部分',
`recommend_goods_id` text COLLATE utf8mb4_unicode_ci COMMENT '指定商品可用',
`recommend_cat_id` text COLLATE utf8mb4_unicode_ci COMMENT '指定分类可用',
`recommend_sort_id` text COLLATE utf8mb4_unicode_ci COMMENT '指定商家分类可用',
`status` TINYINT ( 1 ) DEFAULT '0' COMMENT '1停用',
`create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
`update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
`del_flag` TINYINT ( 1 ) DEFAULT '0' COMMENT '1删除',
`del_time` datetime DEFAULT NULL,
`level` TINYINT ( 2 ) DEFAULT '0' COMMENT '优先级 默认0',
PRIMARY KEY ( `id` )
) ENGINE = INNODB AUTO_INCREMENT = 22 DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;



-- 满包邮规则
-- DROP TABLE IF EXISTS `b2c_free_shipping_rule`;
CREATE TABLE `b2c_free_shipping_rule` (
`id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
`shipping_id` INT ( 11 ) NOT NULL COMMENT '包邮活动ID',
`con_type` INT ( 11 ) NOT NULL COMMENT '包邮条件 0满金额 1满件数',
`money` DECIMAL ( 10, 2 ) NOT NULL COMMENT '满金额',
`num` INT ( 11 ) NOT NULL COMMENT '满件数',
`area` text COLLATE utf8mb4_unicode_ci COMMENT '包邮地区',
`area_list` text COLLATE utf8mb4_unicode_ci COMMENT '包邮地区',
`area_text` text COLLATE utf8mb4_unicode_ci COMMENT '包邮地区',
`create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
`update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
PRIMARY KEY ( `id` ),
KEY `shipping_id` ( `shipping_id` )
) ENGINE = INNODB AUTO_INCREMENT = 39 DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;



--优惠券礼包_礼包内容(优惠券)
--DROP TABLE IF EXISTS `b2c_coupon_pack_voucher`;
create table `b2c_coupon_pack_voucher` (
  `id`                       int(11)               not null auto_increment,
  `voucher_id`               int(11)               not null default 0 comment '优惠券id',
  `act_id`                   int(11)               not null default 0 comment '所属优惠券礼包id',
  `total_amount`             int(11)  unsigned not null default '0' comment '总数量',
  `immediately_grant_amount` int(11)  unsigned not null default '0' comment '立即发放数量',
  `timing_every`             int(11)  unsigned null     default '0' comment '每个时间单位间隔（1为无间隔）',
  `timing_unit`              tinyint(1)        null     default '0' comment '定时发放的时间单位，0：自然天，1：自然周，2自然月',
  `timing_time`              int(11)           null     default '0' comment '定时发放的时间,周1-7，月1-31，自然天不填',
  `timing_amount`            int(11)  unsigned null     default '0' comment '定时发放的数量',
  `del_flag`                 tinyint(1)                 default 0,
  primary key (`id`),
  index `voucher_id` (`voucher_id`),
  index `act_id` (`act_id`)
) ENGINE = INNODB AUTO_INCREMENT = 39 DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

-- 修改虚拟订单表，整合不同商品id字段
alter table b2c_card_order drop column card_id;

alter table b2c_card_order drop column card_no;

alter table b2c_card_order drop column voucher_id;

alter table b2c_card_order
    add virtual_goods_id int not null comment '虚拟商品id';

-- 添加会员卡相关字段
alter table b2c_card_order
    add card_no varchar(32) null comment '会员卡号';

alter table b2c_card_order
    add member_card_balance decimal(10, 2)  not null default '0.00' comment '会员卡消费' AFTER use_score;

alter table b2c_card_order
    add return_card_balance decimal(10, 2) not null default '0.00' comment '会员卡退款' after return_money;

alter table b2c_card_order
	add still_send_flag tinyint(2) not null default '1' comment '退款后是否继续发放优惠劵，1：继续发放，0：停止发放' ;

--增加虚拟商品 优惠劵订单 会员卡余额支付方式的退款金额字段
ALTER TABLE `b2c_refund_card_record`
	ADD COLUMN `member_card_balance`  decimal(10,2) NOT NULL default '0.00' COMMENT '会员卡余额退款金额' AFTER `money_paid`;

-- 王兵兵 201-08-05 秒杀修改
alter table `b2c_sec_kill_define` drop column `shop_id`;

alter table `b2c_group_integration_list` modify column `group_id` int(11) not null comment '拼团ID';

--订单返利表---常乐--2019-08-07
ALTER TABLE `b2c_order_goods_rebate` ADD COLUMN `real_rebate_money` DECIMAL(10,2) DEFAULT 0.00  NULL   COMMENT '实际返利金额';

-- 王兵兵 201-08-09 满折满减
alter table `b2c_mrking_strategy` drop column `shop_id`;
alter table `b2c_mrking_strategy` add column `status` tinyint(1)  not null default '1' comment '状态：1可用，0停用';
alter table `b2c_mrking_strategy` modify column `del_flag`  tinyint(1)  not null default 0;
alter table `b2c_mrking_strategy` modify column `type`  tinyint(1)  not null default 0 comment '类型,1每满减 2满件 3满折 4仅第X件打折';
alter table `b2c_mrking_strategy_condition` drop column `shop_id`;
alter table `b2c_mrking_strategy_condition` drop column `gift`;
alter table `b2c_mrking_strategy_condition` drop column `gift_left`;
alter table `b2c_mrking_strategy_condition` modify column `amount`  int(11)  not null default '0' comment '满几件或第几件（第X件打折）';

-- 李晓冰 8月9号修改
ALTER table b2c_code MODIFY COLUMN param_id varchar(64) NOT NULL DEFAULT '' COMMENT '记录唯一值，由url和对应参数产生';
ALTER table b2c_code CHANGE COLUMN flag del_flag tinyint  NOT NULL DEFAULT 0;

-- 王兵兵 201-08-09
alter table `b2c_mrking_strategy` add column `recommend_sort_id` text comment '指定商家分类可用';
alter table `b2c_mrking_strategy` modify column `recommend_cat_id` text comment '指定平台分类可用';
alter table `b2c_mrking_strategy` modify column `act_type` tinyint(1) not null default '0' comment '活动类型，0-全部商品参与活动；1-选中商品参与活动（由商品、平台分类、商家分类、品牌等ID字符串指定）';

-- 活动有礼 - 郑保乐 - 2019-08-12
ALTER TABLE `b2c_coupon_activity` ADD COLUMN `customize_img_path` varchar(191)  not null default '' comment '活动有礼跳转活动图片路径';
ALTER TABLE `b2c_coupon_activity` ADD COLUMN `customize_url` varchar(191)  not null default '' comment '活动有礼跳转活动链接';
ALTER TABLE `b2c_coupon_activity` CHANGE `activity_action` `activity_action` tinyint(1) DEFAULT '1' COMMENT '活动类型：1：活动送券 2：大转盘抽奖 3：跳转自定义链接';

-- 8月12日 常乐 分销推广语相关表
-- 分销推广语
-- DROP TABLE IF EXISTS `b2c_promotion_language`;
create table `b2c_promotion_language` (
  `id`                   int(8)       not null  auto_increment,
  `title`                varchar(32)  not null comment '推广语标题',
  `promotion_language`   varchar(400) not null comment '推广语',
  `create_time`          timestamp      default current_timestamp,
  `update_time`          timestamp      default current_timestamp on update current_timestamp comment '最后修改时间',
  `is_block`             tinyint(1)             default 0 comment '是否停用：0否，1是',
  `del_flag`             tinyint(1)             default 0 comment '是否停用：0否，1是',
  primary key (`id`)
);

-- 用户默认分销推广语
-- DROP TABLE IF EXISTS `b2c_user_promotion_language`;
create table `b2c_user_promotion_language` (
  `id`             int(8)   not null  auto_increment,
  `lan_id`         int(8)   not null  default 0 comment '推广语关联ID',
  `user_id`        int(11)  not null  default 0 comment '会员ID',
  `create_time`    timestamp      default current_timestamp,
  `update_time`    timestamp      default current_timestamp on update current_timestamp comment '最后修改时间',
  primary key (`id`),
  key (`user_id`)
);
-- 王帅orderGoods删除营销字段，增加营销分类和营销id
alter table `b2c_order_goods`
drop column `first_special_id`,
drop column `free_ship`,
drop column `purchase_price_id`,
drop column `purchase_price_rule_id`,
drop column `reduce_price_id`,
add column `activity_type`  tinyint(1) NOT NULL DEFAULT '0' COMMENT '营销活动种类',
add column `activity_id` int(11) NOT NULL DEFAULT '0' COMMENT '营销活动id',
add column `activity_rule` int(11) NOT NULL DEFAULT '0' COMMENT '营销活动规则（目前加价购用到）';

-- 王兵兵 201-08-14
alter table `b2c_reduce_price` add column `limit_flag`  tinyint(1)   default '0' comment '超限购买设置标记，1禁止超限购买，0超限全部恢复原价';
alter table `b2c_reduce_price_goods` drop column `is_checked`;

-- 王帅retuen_order删除退款原因，修改退款原因描述，增加退款原因类型
alter table `b2c_return_order`
drop column `reason`,
drop column `return_desc`,
add column `reason_type`  tinyint(1) NOT NULL DEFAULT '0' comment '退款/退货原因类型，0：协商一致退款，1：未按约定时间发货，2：缺货，3：拍错/多拍/不想要，4：其他',
add column `reason_desc` text comment '退款/退货描述';
-- orderinfo修改营销活动id名称
alter table `b2c_order_info`
drop column `pin_group_id`,
add column `activity_id` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '营销活动id';

-- 首单特惠定义表
-- DROP TABLE IF EXISTS `b2c_first_special`;
CREATE TABLE `b2c_first_special` (
   `id`                 int(11) NOT NULL AUTO_INCREMENT,
   `name`               varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '活动名称',
   `start_time`         timestamp NULL DEFAULT NULL COMMENT '开始时间',
   `end_time`           timestamp NULL DEFAULT NULL COMMENT '结束日期',
   `batch_discount`     tinyint(1) DEFAULT '0' COMMENT '批量打几折',
   `batch_reduce`       decimal(10,2) DEFAULT NULL COMMENT '批量减多少',
   `batch_final_price`  decimal(10,2) DEFAULT NULL COMMENT '批量折后价',
   `is_batch_integer`   tinyint(1) DEFAULT '0' COMMENT '是否批量取整',
   `status`             tinyint(1) DEFAULT '1' COMMENT '状态：1：启用 0：禁用',
   `del_flag`           tinyint(1) DEFAULT '0',
   `del_time`           timestamp NULL DEFAULT NULL,
   `limit_amount`       int(11) DEFAULT '0',
   `first`              tinyint(1) DEFAULT '1' COMMENT '优先级',
   `share_config`       text COLLATE utf8mb4_unicode_ci COMMENT '分享设置',
   `is_forever`         tinyint(1) DEFAULT '0' COMMENT '是否永久',
   `limit_flag`         tinyint(1) DEFAULT '0' COMMENT '超限购购买标记',
   `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
   PRIMARY KEY (`id`)
);

-- 首单特惠商品
-- DROP TABLE IF EXISTS `b2c_first_special_goods`;
CREATE TABLE `b2c_first_special_goods` (
   `id`               int(11) NOT NULL AUTO_INCREMENT,
   `first_special_id` int(11) NOT NULL COMMENT '限时减价活动ID',
   `goods_id`         int(11) NOT NULL COMMENT '商品ID',
   `discount`         decimal(10,2) DEFAULT NULL COMMENT '打几折',
   `reduce_price`     decimal(10,2) DEFAULT NULL COMMENT '减多少钱',
   `goods_price`      decimal(10,2) DEFAULT NULL COMMENT '折后价格',
   PRIMARY KEY (`id`)
);

-- 首单特惠商品规格
-- ROP TABLE IF EXISTS `b2c_first_special_product`;
CREATE TABLE `b2c_first_special_product` (
   `id`               int(11) NOT NULL AUTO_INCREMENT,
   `first_special_id` int(11) NOT NULL COMMENT '限时减价活动ID',
   `goods_id`         int(11) NOT NULL COMMENT '商品ID',
   `product_id`       int(11) NOT NULL COMMENT '规格ID',
   `prd_price`        decimal(10,2) DEFAULT NULL COMMENT '折后价格',
   PRIMARY KEY (`id`)
);
-- 修改支付记录表创建时间
ALTER table b2c_payment_record
CHANGE  created create_time timestamp   DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间';
--修改支付记录表金额类型
ALTER table b2c_payment_record
MODIFY total_fee  DECIMAL ( 10, 2 ) NOT NULL DEFAULT '0.00' COMMENT '交易金额';

alter table `b2c_coupon_pack` change column `state` `status` tinyint(1) not null default '1' comment '开启状态1:开启，0:停用';
alter table `b2c_coupon_pack` modify column `limit_get_times` int(11) not null default 0 comment '单用户领取限制次数，0不限制';

DROP TABLE IF EXISTS `b2c_card_order`;
DROP TABLE IF EXISTS `b2c_virtual_order`;
CREATE TABLE `b2c_virtual_order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `order_sn` varchar(20) NOT NULL DEFAULT '' COMMENT '订单编号',
  `user_id` mediumint(8) NOT NULL DEFAULT '0' COMMENT '用户id',
  `order_status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '订单状态',
  `order_status_name` varchar(32) NOT NULL DEFAULT '' COMMENT '订单状态名称',
  `invoice_id` int(11) NOT NULL DEFAULT '0' COMMENT '发票id',
  `invoice_detail` text COMMENT '发票内容：json存储',
  `add_message` varchar(191) NOT NULL DEFAULT '' COMMENT '客户留言',
  `pay_code` varchar(30) DEFAULT NULL COMMENT '支付代号',
  `pay_name` varchar(120) DEFAULT NULL COMMENT '支付名称',
  `prepay_id` varchar(191) DEFAULT NULL COMMENT '微信支付id，用于发送模板消息',
  `pay_sn` varchar(32) DEFAULT NULL COMMENT '支付流水号',
  `money_paid` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '用户消费现金',
  `use_account` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '用户消费余额',
  `use_score` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '用户消费积分',
  `member_card_balance` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '会员卡消费金额',
  `order_amount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '订单总金额',
  `pay_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '支付时间',
  `seller_remark` varchar(512) NOT NULL DEFAULT '' COMMENT '卖家备注',
  `star_flag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '标星订单：0 未标星 1 标星',
  `del_flag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '删除',
  `ali_trade_no` varchar(60) NOT NULL DEFAULT '' COMMENT '支付宝交易单号',
  `return_flag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0:未申请退款，1：退款失败，2：退款成功',
  `return_score` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '退款积分',
  `return_account` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '退款余额',
  `return_money` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '退款现金',
  `return_card_balance` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '会员卡退款余额',
  `return_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '退款时间',
  `del_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '退款时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  `goods_type` tinyint(2) NOT NULL COMMENT '虚拟商品类别：0：会员卡，1：优惠券',
  `virtual_goods_id` int(11) NOT NULL COMMENT '虚拟商品id',
  `card_no` varchar(32) DEFAULT NULL COMMENT '下单使用的会员卡号',
  `still_send_flag` tinyint(2) NOT NULL DEFAULT '1' COMMENT '退款后是否继续发放优惠劵，1：继续发放，0：停止发放',
  PRIMARY KEY (`order_id`) USING BTREE
);

-- 王兵兵 2019-08-21
alter table `b2c_mrking_voucher` modify column `least_consume` decimal(10,2) not null default '0.00' comment '满多少可用';
alter table `b2c_mrking_voucher` drop column `shop_id`;
alter table `b2c_mrking_voucher` drop column `remain_amount`;

alter table `b2c_mrking_voucher` drop column `is_random`;
alter table `b2c_mrking_voucher` add column `validity_type`  tinyint(1)   default '0' comment '优惠券有效期类型标记，1领取后开始指定时间段内有效，0固定时间段有效';
alter table `b2c_mrking_voucher` add column `validity_hour`  mediumint(11) default 0  null comment '优惠券有效小时数';
alter table `b2c_mrking_voucher` add column `validity_minute`  mediumint(11) default 0  null comment '优惠券有效分钟数';


-- 李晓冰2019-8-21修改商品表
ALTER TABLE b2c_goods ADD COLUMN `promotion_language_switch` TINYINT(1) NOT NULL DEFAULT 1 COMMENT '是否使用分销推广语0关闭，1使用';
ALTER TABLE b2c_goods ADD COLUMN `promotion_language` VARCHAR (400) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '推广语';
ALTER TABLE b2c_goods ADD COLUMN `deliver_place` VARCHAR ( 191 ) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '发货地址';
ALTER TABLE b2c_goods ADD COLUMN `share_config` VARCHAR ( 500 ) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '分享配置';
ALTER TABLE b2c_grade_prd ADD COLUMN `del_flag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除0否，1是';
ALTER TABLE b2c_goods_rebate_price ADD COLUMN `del_flag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除0否，1是';

-- 王兵兵 2019-08-22
alter table `b2c_virtual_order` modify column `still_send_flag` tinyint(1) NOT NULL DEFAULT '1' COMMENT '优惠券礼包订单-退款后是否继续发放优惠劵，1：继续发放，0：停止发放';
alter table `b2c_virtual_order` add column `access_mode`  tinyint(1)   default '0' comment '优惠券礼包订单-下单时的领取方式，0：现金购买，1：积分购买，2直接领取';
alter table `b2c_virtual_order` add index `order_sn` (`order_sn`);
alter table `b2c_virtual_order` add index `user_id` (`user_id`);
alter table `b2c_virtual_order` modify column `use_score` int(11) NULL DEFAULT '0' COMMENT '用户消费积分';
alter table `b2c_virtual_order` modify column `return_score` int(11) NULL DEFAULT '0' COMMENT '退款积分';

alter table `b2c_virtual_order` modify column `return_score` int(11) NULL DEFAULT '0' COMMENT '已退款积分';
alter table `b2c_virtual_order` modify column `return_account` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '已退款余额';
alter table `b2c_virtual_order` modify column `return_money` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '已退款现金';
alter table `b2c_virtual_order` modify column `return_card_balance` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '已退款会员卡余额';
alter table `b2c_virtual_order` modify column `del_time` timestamp null COMMENT '删除时间';
alter table `b2c_virtual_order` modify column `return_time` timestamp null COMMENT '退款时间';


DROP TABLE IF EXISTS `b2c_refund_card_record`;
DROP TABLE IF EXISTS `b2c_virtual_order_refund_record`;
create table `b2c_virtual_order_refund_record` (
  `id`              int(11)                        not null auto_increment,
  `order_sn`            varchar(30) collate utf8mb4_unicode_ci not null default '',
  `user_id`             int(11)                        not null default '0',
  `use_score`           int(11)                 not null default '0' comment '退款积分',
  `use_account`         decimal(10, 2)                 not null default '0.00' comment '退款余额',
  `money_paid`          decimal(10, 2)                 not null default '0.00' comment '退款现金',
  `member_card_balance` decimal(10, 2)                 not null default '0.00' comment '退款会员卡余额',
  `refund_time`         timestamp                              not null default CURRENT_TIMESTAMP comment '订单退款时间',
  `is_success`          tinyint(1)                     not null default '0' comment '处理状态，1：退款失败，2：退款成功',
  primary key (`id`),
  key `order_sn` (`order_sn`),
  key `user_id` (`user_id`)
);

-- 黄壮壮： 为表b2c_member_card 添加两个字段
ALTER TABLE b2c_member_card ADD COLUMN `stock` int(11) DEFAULT 0 COMMENT '发放总量';
ALTER TABLE b2c_member_card ADD COLUMN `limit` int(11) DEFAULT 1 COMMENT '领取限制';