package com.vpu.mp.service.pojo.wxapp.medical.im.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 李晓冰
 * @date 2020年07月21日
 */
@Getter
@Setter
public class ImSessionItemRenderVo extends ImSessionItemVo{
    /**是否是医师话语*/
    private boolean isDoctor;
}
