package com.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @description:
 * @date 2019/4/1 17:57 鲁朋博(pengbo.lu@ucarinc.com)创建
 **/
public class Self {
    public synchronized void  add(String Key,Map map){
        Object value = map.get(Key);
        if (value == null) {
            map.put(Key, 1);
        } else {
            map.put(Key,value);
        }
    }

}
