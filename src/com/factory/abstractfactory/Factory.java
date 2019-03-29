package com.factory.abstractfactory;

import com.factory.factory.Benci;
import com.factory.factory.BigZh;
import com.factory.factory.Bwm;
import com.factory.factory.car;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:切记<b>忘记重要的一个知识点，抽象类里面如果有抽象方法，子类继承父类必须实现其所有的抽象方法
 * 当然父类里面也可以写一些公用的方法，用来根据自己的情况去实现</b>
 * <a>此类为抽象工厂的实现类</a>
 * @date 2019/3/27 21:24 创建
 **/
public class Factory extends AbstractFactory {



    @Override
    public car big() {
        return new BigZh();
    }

    @Override
    public car benci() {
        return new Benci();
    }

    @Override
    public car bigzh() {
        return new Bwm();
    }
}
