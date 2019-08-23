package com.vpu.mp.service.pojo.shop.member.account;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.vpu.mp.service.foundation.data.JsonResultMessage;

import lombok.Data;

/**
 * 
 * @author 黄壮壮
 * @Date:  2019年8月23日
 * @Description: 积分-入参类
 */
@Data
public class ScoreParam {
	/** -备注 */
	private String remark;
	
	/** -需要更新的用户id */
	@NotNull(message=JsonResultMessage.MSG_MEMBER_SCORE_NOT_NULL)
	private Integer[] userId;
	
	/** -积分变动数额 */
	//@Min(message=JsonResultMessage.MSG_MEMBER_SCORE_NOT_BE_NEGATIVE, value = 0)
	@NotNull(message=JsonResultMessage.MSG_MEMBER_SCORE_NOT_NULL)
	private Integer score;
	
	/** -当前积分 -当批量操作时，为所选用户中的最低积分*/
	@Min(message=JsonResultMessage.MSG_MEMBER_SCORE_NOT_BE_NEGATIVE, value = 0)
	@NotNull(message=JsonResultMessage.MSG_MEMBER_SCORE_NOT_NULL)
	private Integer scoreDis;
	
	/** -订单编号 */
	private String orderSn; 
	
	/** -积分状态 {@link com.vpu.mp.service.pojo.shop.member.score.ScoreStatusConstant} */
	private Byte scoreStatus;
	
}
