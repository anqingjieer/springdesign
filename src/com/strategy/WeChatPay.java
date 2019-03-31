package com.strategy;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/31 17:14 创建
 **/
public class WeChatPay implements Pay {
    @Override
    public Status pay(String decr, Integer account) {
        System.out.println("使用微信支付商品：" + decr + "jine"+account);
        return new Status("1", "支付成功",0);
    }
}
