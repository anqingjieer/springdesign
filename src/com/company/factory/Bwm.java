package com.company.factory;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/27 20:53 创建
 **/
public class Bwm implements car {
    @Override
    public car createCar() {
        return new Bwm();
    }
}
