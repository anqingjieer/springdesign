package com.factory.simplefactory;

import com.factory.factory.Benci;
import com.factory.factory.BigZh;
import com.factory.factory.Bwm;
import com.factory.factory.car;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/27 20:56 创建
 **/
public class simplefactory {
    public  car createCar(String carName ){
        if (carName.equals("宝马")) {
            return new Bwm();
        } else if (carName.equals("奔驰")) {
            return new Benci();
        } else if (carName.equals("大众")) {
            return new BigZh();
        } else {
            return null;
        }
    }
}
