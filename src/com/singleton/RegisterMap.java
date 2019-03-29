package com.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:单例模式的第三种实现方式
 * <p>注册登记式：每使用一次。都往一个固定的容器中去注册并将使用过得对象进行缓存。下次去对象的时候，就直接从缓存中取，以保证每次取得的都是同一个对象。IOC中的单例模式，就是典型的注册登记式单例模式</p>
 * @date 2019/3/28 21:56 创建
 **/
public class RegisterMap {
    private RegisterMap(){}

    private static Map<String,Object> register = new ConcurrentHashMap<String,Object>();

    public static RegisterMap getInstance(String name){
        if(name == null){
            name = RegisterMap.class.getName();
        }

        if(register.get(name) == null){
            try {
                register.put(name, new RegisterMap());
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        return (RegisterMap)register.get(name);
    }

}
