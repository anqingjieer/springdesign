package com.singleton.Test;

import com.singleton.Hungry;

import java.util.concurrent.CountDownLatch;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:测试饿汉式单线程模式是否是线程安全性的。
 * @date 2019/3/28 21:28 创建
 **/
public class HungryTest {
    public static void main(String[] args) {

        int count = 200;

        //发令枪，我就能想到运动员
        final CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {

                        try {
                            // 阻塞
                            // count = 0 就会释放所有的共享锁
                            // 万箭齐发
                            latch.await();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        //必然会调用，可能会有很多线程同时去访问getInstance()
                        Hungry obj = new Hungry();
                        System.out.println(System.currentTimeMillis() + ":" + obj.getInstance());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start(); //每循环一次，就启动一个线程,具有一定的随机性

            //每次启动一个线程，count --
            latch.countDown();

        }
    }
}
