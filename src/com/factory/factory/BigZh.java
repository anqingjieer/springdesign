package com.factory.factory;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/27 20:55 创建
 **/
public class BigZh implements car {
    public BigZh() {
        System.out.println("我爱你是多么艰苦多么勇敢的力量");
    }
    @Override
    public car createCar() {
        return new BigZh();
    }
}
