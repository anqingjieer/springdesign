package com.strategy;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:策略模式讲究是选择的结果，这样就不用写if,elsele
 * @date 2019/3/31 17:16 创建
 **/
public class OrderTest {


    public static void main(String[] args) {
        Order order = new Order(500, "牙膏", 222);
        order.pay(PayType.WECHAT_PAY.get());
    }

}
