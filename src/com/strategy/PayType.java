package com.strategy;

import com.common.EnumValue;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/31 17:32 创建
 **/
public enum PayType  {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WeChatPay());
    private Pay payment;
    PayType(Pay payment){
        this.payment = payment;
    }

    public Pay get(){ return  this.payment;}
}
