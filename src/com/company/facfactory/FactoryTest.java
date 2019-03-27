package com.company.facfactory;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/27 21:16 创建
 **/
public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new BigZhfactory();
        System.out.println(factory.createCar());
    }
}
