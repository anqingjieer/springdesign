package com.company.abstractfactory;


import com.factory.abstractfactory.Factory;

/**
 * @version 1.0
 * @description:相比较于工厂模式，简单
 * @date 2019/3/28 9:32 鲁朋博(pengbo.lu@ucarinc.com)创建
 **/
public class FactoryTest {


    public static void main(String[] args) {
        Factory factory = new Factory();
        System.out.println(factory.benci());
    }
}
