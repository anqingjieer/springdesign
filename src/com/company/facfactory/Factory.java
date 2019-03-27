package com.company.facfactory;

import com.company.factory.car;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:工厂模式的实现，越来越专业，一个工厂专门干一件事情
 * <b>通常应用程序是自己去创建一个对象的，使用工厂模式之后，将对象的创建和使用相分离将对象的创建和舒适化
 * 交给工厂去执行，自己只关心结果不需要过程</b>
 * @date 2019/3/27 21:13 创建
 **/
public interface Factory {
    car createCar();
}
