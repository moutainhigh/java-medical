package com.vpu.mp.mq.listener;


import com.rabbitmq.client.Channel;
import com.vpu.mp.config.mq.RabbitConfig;
import com.vpu.mp.service.foundation.mq.handler.BaseRabbitHandler;
import com.vpu.mp.service.pojo.shop.market.message.RabbitMessageParam;
import com.vpu.mp.service.pojo.shop.user.user.WxUserInfo;
import com.vpu.mp.service.saas.SaasApplication;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RabbitListener(queues = {RabbitConfig.QUEUE_MESSAGE_SEND},
    containerFactory = "simpleRabbitListenerContainerFactory")
public class MessageTemplateListener implements BaseRabbitHandler {

    @Autowired
    private SaasApplication saas;


    @RabbitHandler
    public void handler(@Payload RabbitMessageParam param, Message message, Channel channel){
        List<WxUserInfo> userInfoList = saas.getShopApp(param.getShopId())
            .wechatMessageTemplateService.getUserInfoList(param.getUserIdList());
        userInfoList.stream().forEach(info->{
            try {
                saas.getShopApp(param.getShopId()).wechatMessageTemplateService.sendMessage(param,info);
            } catch (WxErrorException e) {
                e.printStackTrace();
            }
        });
        //TODO  发送逻辑
        //saas.getShopApp(param.getShopId()).

    }


    @Override
    public void executeException(Object[] datas, Throwable throwable) {

    }
}
