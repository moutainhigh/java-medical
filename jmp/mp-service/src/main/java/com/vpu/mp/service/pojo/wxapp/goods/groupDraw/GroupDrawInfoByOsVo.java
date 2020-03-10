package com.vpu.mp.service.pojo.wxapp.goods.groupDraw;

import lombok.Data;

/**
 * 订单号查询拼图信息返回类
 * @author zhaojianqiang
 * @time   上午10:00:08
 */
@Data
public class GroupDrawInfoByOsVo {
	private Integer groupId;
	private Integer activityId;
	private Integer activityType;
	private Byte status;
	private Byte drawStatus;
	private Byte isGrouper;
}
