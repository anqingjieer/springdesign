package com.strategy;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/31 17:10 创建
 **/
public interface Pay {
    Status pay(String decr,Integer account);
}
