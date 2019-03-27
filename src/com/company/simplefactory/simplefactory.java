package com.company.simplefactory;

import com.company.factory.Benci;
import com.company.factory.BigZh;
import com.company.factory.Bwm;
import com.company.factory.car;

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
