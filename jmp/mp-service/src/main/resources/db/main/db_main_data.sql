
--password是md5后的admin!@#123
insert into `b2c_system_user` (`user_name`, `password`) values ('system', '20abd48aba9deafd44a823021f43e5fd');


insert into `b2c_article_category` (`category_id`, `category_name`)
values ('1', '新手指南'),
('2', '支付方式'),
('3', '服务保障');

## 帮助文章
INSERT INTO `b2c_article` (`article_id`, `category_id`, `title`, `author`, `keyword`, `desc`, `content`, `is_recommend`, `is_top`, `status`, `pub_time`, `update_time`, `create_time`, `last_visit_time`, `pv`, `head_pic`) VALUES ('1', '1', '购物流程', NULL, '购物流程', '购物流程', NULL, '0', '0', '0', '2019-06-25 18:11:16', '2019-06-25 18:11:16', '2019-06-25 18:11:16', NULL, NULL, NULL);
INSERT INTO `b2c_article` (`article_id`, `category_id`, `title`, `author`, `keyword`, `desc`, `content`, `is_recommend`, `is_top`, `status`, `pub_time`, `update_time`, `create_time`, `last_visit_time`, `pv`, `head_pic`) VALUES ('2', '1', '交易条款', '交易条款', NULL, '交易条款', NULL, '0', '0', '0', '2019-06-25 18:11:16', '2019-06-25 18:11:16', '2019-06-25 18:11:16', NULL, NULL, NULL);
INSERT INTO `b2c_article` (`article_id`, `category_id`, `title`, `author`, `keyword`, `desc`, `content`, `is_recommend`, `is_top`, `status`, `pub_time`, `update_time`, `create_time`, `last_visit_time`, `pv`, `head_pic`) VALUES ('3', '1', '常见问题', NULL, '常见问题', '常见问题', NULL, '0', '0', '0', '2019-06-25 18:11:16', '2019-06-25 18:11:16', '2019-06-25 18:11:16', NULL, NULL, NULL);
INSERT INTO `b2c_article` (`article_id`, `category_id`, `title`, `author`, `keyword`, `desc`, `content`, `is_recommend`, `is_top`, `status`, `pub_time`, `update_time`, `create_time`, `last_visit_time`, `pv`, `head_pic`) VALUES ('4', '1', '商城入驻', NULL, '商城入驻', '商城入驻', NULL, '0', '0', '0', '2019-06-25 18:11:16', '2019-06-25 18:11:16', '2019-06-25 18:11:16', NULL, NULL, NULL);
INSERT INTO `b2c_article` (`article_id`, `category_id`, `title`, `author`, `keyword`, `desc`, `content`, `is_recommend`, `is_top`, `status`, `pub_time`, `update_time`, `create_time`, `last_visit_time`, `pv`, `head_pic`) VALUES ('5', '2', '货到付款', NULL, '货到付款', '货到付款', NULL, '0', '0', '0', '2019-06-25 18:11:16', '2019-06-25 18:11:16', '2019-06-25 18:11:16', NULL, NULL, NULL);
INSERT INTO `b2c_article` (`article_id`, `category_id`, `title`, `author`, `keyword`, `desc`, `content`, `is_recommend`, `is_top`, `status`, `pub_time`, `update_time`, `create_time`, `last_visit_time`, `pv`, `head_pic`) VALUES ('6', '2', '银行卡支付', NULL, '银行卡支付', '银行卡支付', NULL, '0', '0', '0', '2019-06-25 18:11:16', '2019-06-25 18:11:16', '2019-06-25 18:11:16', NULL, NULL, NULL);
INSERT INTO `b2c_article` (`article_id`, `category_id`, `title`, `author`, `keyword`, `desc`, `content`, `is_recommend`, `is_top`, `status`, `pub_time`, `update_time`, `create_time`, `last_visit_time`, `pv`, `head_pic`) VALUES ('7', '2', '支付宝支付', NULL, '支付宝支付', '支付宝支付', NULL, '0', '0', '0', '2019-06-25 18:11:16', '2019-06-25 18:11:16', '2019-06-25 18:11:16', NULL, NULL, NULL);
INSERT INTO `b2c_article` (`article_id`, `category_id`, `title`, `author`, `keyword`, `desc`, `content`, `is_recommend`, `is_top`, `status`, `pub_time`, `update_time`, `create_time`, `last_visit_time`, `pv`, `head_pic`) VALUES ('8', '3', '售后政策', NULL, '售后政策', '售后政策', NULL, '0', '0', '0', '2019-06-25 18:11:16', '2019-06-25 18:11:16', '2019-06-25 18:11:16', NULL, NULL, NULL);
INSERT INTO `b2c_article` (`article_id`, `category_id`, `title`, `author`, `keyword`, `desc`, `content`, `is_recommend`, `is_top`, `status`, `pub_time`, `update_time`, `create_time`, `last_visit_time`, `pv`, `head_pic`) VALUES ('9', '3', '求购服务', NULL, '求购服务', '求购服务', NULL, '0', '0', '0', '2019-06-25 18:11:16', '2019-06-25 18:11:16', '2019-06-25 18:11:16', NULL, NULL, NULL);
INSERT INTO `b2c_article` (`article_id`, `category_id`, `title`, `author`, `keyword`, `desc`, `content`, `is_recommend`, `is_top`, `status`, `pub_time`, `update_time`, `create_time`, `last_visit_time`, `pv`, `head_pic`) VALUES ('10', '3', '接工程服务', NULL, '接工程服务', '接工程服务', NULL, '0', '0', '0', '2019-06-25 18:11:16', '2019-06-25 18:11:16', '2019-06-25 18:11:16', NULL, NULL, NULL);
INSERT INTO `b2c_article` (`article_id`, `category_id`, `title`, `author`, `keyword`, `desc`, `content`, `is_recommend`, `is_top`, `status`, `pub_time`, `update_time`, `create_time`, `last_visit_time`, `pv`, `head_pic`) VALUES ('11', '4', '080623test', NULL, '质量管理', NULL, NULL, '1', '0', '1', '2019-06-25 18:34:07', '2019-06-25 18:34:07', '2019-06-25 18:32:27', NULL, NULL, NULL);

##应用表
INSERT INTO `b2c_app` (`app_id`, `app_name`, `app_secret`) VALUES ('200000', 'ERP服务', '36a23c125e6fd10420eb3b6ed48ee057');
insert into `b2c_app` (`app_id`, `app_name`, `app_secret`) values('200001','POS服务','b141fbc4bd328822e955aeed011cfc85');
INSERT INTO `b2c_app` (`app_id`, `app_name`, `app_secret`) VALUES('200002','CRM服务','2b7212759813c4c03ccc316f8cb1c654');
INSERT INTO `b2c_app` (`app_id`, `app_name`, `app_secret`) VALUES('200003','HIS服务',' 7472c1efe6ca4215af1353317938b50a');

insert into `b2c_shop_version` (`version_name`, `level`, `content`, `created`, `flag`) values ('体验版', 'v1', '{"main_config":{"sub_0":["basic_yesterday"],"sub_1":["sort"],"sub_2":["m_member_card","m_voucher","m_video"],"sub_3":["charge_card","count_card","tag","sign_score","pay_score"],"sub_4":["full_cut","pin_group","form_decoration","coupon_split","coupon_grant","coupon_gift"],"sub_5":["store_pay","technician","service"]},"num_config":{"picture_num":"100","video_num":"100","goods_num":"10","store_num":"1","decorate_num":"5","form_num":"20"}}', '2018-07-26 15:30:03', '0');
insert into `b2c_shop_version` (`version_name`, `level`, `content`, `created`, `flag`) values ('基础版', 'v2', '{"main_config":{"sub_0":["basic_yesterday"],"sub_1":["sort"],"sub_2":["m_voucher"],"sub_3":["sign_score","pay_score"],"sub_4":[],"sub_5":["service"]},"num_config":{"picture_num":"500","video_num":"0","goods_num":"500","store_num":"5","decorate_num":"5","form_num":"0"}}', '2018-07-26 15:35:22', '0');
insert into `b2c_shop_version` (`version_name`, `level`, `content`, `created`, `flag`) values ('高级版', 'v3', '{"main_config":{"sub_0":["basic_yesterday","portrait_user","second_view","visit_source"],"sub_1":["sort"],"sub_2":["m_member_card","m_voucher","m_video","authorization"],"sub_3":["charge_card","count_card","tag","sign_score","pay_score"],"sub_4":["full_cut","pin_group","form_decoration","message_template","coupon_split","coupon_grant","coupon_gift"],"sub_5":["store_pay","technician","service"]},"num_config":{"picture_num":"2048","video_num":"2048","goods_num":"-1","store_num":"10","decorate_num":"20","form_num":"20"}}', '2018-07-26 15:37:04', '0');
insert into `b2c_shop_version` (`version_name`, `level`, `content`, `created`, `flag`) values ('旗舰版', 'v4', '{"main_config":{"sub_0":["basic_yesterday","portrait_user","second_view","visit_source"],"sub_1":["sort"],"sub_2":["m_member_card","m_voucher","m_bargain","m_video","authorization"],"sub_3":["charge_card","count_card","tag","sign_score","pay_score"],"sub_4":["full_cut","pin_group","bargain","form_decoration","distribution","message_template","coupon_split","coupon_grant","coupon_gift"],"sub_5":["store_pay","technician","service"]},"num_config":{"picture_num":"10240","video_num":"10240","goods_num":"-1","store_num":"200","decorate_num":"-1","form_num":"-1"}}', '2018-07-26 15:38:12', '0');

UPDATE `b2c_shop_version` SET `version_name` = '体验版', `content` = '{"main_config":{"sub_0":["basic_yesterday"],"sub_1":["sort"],"sub_2":["m_member_card","m_voucher","m_video","m_seckill_goods"],"sub_3":["charge_card","count_card","tag","sign_score","pay_score"],"sub_4":["full_cut","pin_group","form_decoration","coupon_split","coupon_grant","coupon_gift","seckill_goods","purchase_price","reduce_price","pay_reward","activity_reward","package_sale","insteadpay","reduce_price"],"sub_5":["store_pay","technician","service"]},"num_config":{"picture_num":"100","video_num":"100","goods_num":"10","store_num":"1","decorate_num":"5","form_num":"20"}}', `created` = '2018-07-16 19:06:42', `update_time` = '2019-11-06 14:08:00', `desc` = NULL, `flag` = 0, `level` = 'v1' WHERE `id` = 1;
UPDATE `b2c_shop_version` SET `version_name` = '基础版', `content` = '{"main_config":{"sub_0":["basic_yesterday"],"sub_1":["sort"],"sub_2":["m_voucher"],"sub_3":["sign_score","pay_score"],"sub_4":["insteadpay","free_ship"],"sub_5":["service"]},"num_config":{"picture_num":"500","video_num":"0","goods_num":"500","store_num":"5","decorate_num":"5","form_num":"0"}}', `created` = '2018-07-17 09:34:10', `update_time` = '2019-11-06 14:08:00', `desc` = NULL, `flag` = 0, `level` = 'v2' WHERE `id` = 2;
UPDATE `b2c_shop_version` SET `version_name` = '高级版', `content` = '{"main_config":{"sub_0":["basic_yesterday","portrait_user","second_view","visit_source","analysis_visit_source"],"sub_1":["sort"],"sub_2":["m_member_card","m_voucher","m_video","m_integral_goods","m_seckill_goods","authorization","m_group_draw","m_pin_integration","m_nav"],"sub_3":["charge_card","count_card","grade_card","tag","sign_score","pay_score"],"sub_4":["full_cut","pin_group","form_decoration","message_template","pay_reward","coupon_grant","activity_reward","integral_goods","seckill_goods","purchase_price","reduce_price","group_draw","pin_integration","package_sale","pre_sale","insteadpay","gift","free_ship","reduce_price","coupon_package","comment_gift","first_special","share_award"],"sub_5":["store_pay","technician","service"]},"num_config":{"picture_num":"2048","video_num":"2048","goods_num":"-1","store_num":"10","decorate_num":"50","form_num":"20"}}', `created` = '2018-07-17 14:27:16', `update_time` = '2019-11-06 14:08:00', `desc` = NULL, `flag` = 0, `level` = 'v3' WHERE `id` = 3;
UPDATE `b2c_shop_version` SET `version_name` = '旗舰版', `content` = '{"main_config":{"sub_0":["basic_yesterday","portrait_user","second_view","visit_source","analysis_visit_source"],"sub_1":["sort"],"sub_2":["m_member_card","m_voucher","m_bargain","m_video","m_integral_goods","m_seckill_goods","authorization","m_group_draw","m_pin_integration","m_nav"],"sub_3":["charge_card","count_card","grade_card","tag","sign_score","pay_score"],"sub_4":["full_cut","pin_group","bargain","form_decoration","distribution","message_template","pay_reward","coupon_grant","activity_reward","integral_goods","seckill_goods","lottery","purchase_price","reduce_price","group_draw","pin_integration","package_sale","pre_sale","insteadpay","gift","promote","assess","free_ship","reduce_price","coupon_package","comment_gift","first_special","give_gift","share_award","wx_mcode","live_broadcast"],"sub_5":["store_pay","technician","service","service_city"]},"num_config":{"picture_num":"10240","video_num":"10240","goods_num":"-1","store_num":"200","decorate_num":"-1","form_num":"-1"}}', `created` = '2018-07-20 18:22:50', `update_time` = '2019-11-06 14:08:00', `desc` = NULL, `flag` = 0, `level` = 'v4' WHERE `id` = 4;