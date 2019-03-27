package com.company.facfactory;

import com.company.factory.BigZh;
import com.company.factory.car;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/27 21:11 创建
 **/
public class BigZhfactory implements Factory {

    @Override
    public car createCar() {
        return new BigZh();
    }
}
