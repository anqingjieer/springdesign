package com.singleton.Test;

import com.singleton.RegisterMap;
import com.singleton.Self;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * @version 1.0
 * @description:
 * @date 2019/4/1 17:31 鲁朋博(pengbo.lu@ucarinc.com)创建
 **/
public class Myself {
    public static void main(String[] args) {

        int count = 2000;

        //发令枪，我就能想到运动员
        final CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    try{

                        try {
                            // 阻塞
                            // count = 0 就会释放所有的共享锁
                            // 万箭齐发
                            latch.await();
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<String,Integer>();
                        Self self = new Self();
                        self.add("1", map);
                        System.out.println(System.currentTimeMillis()+":"+map);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start(); //每循环一次，就启动一个线程,具有一定的随机性
            //每次启动一个线程，count --
            latch.countDown();

        }


    }
}
