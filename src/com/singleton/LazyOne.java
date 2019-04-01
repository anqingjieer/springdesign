package com.singleton;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:懒汉式线程模式，这个不是线程安全的
 * 如果要是想使线程安全必须给线程枷锁，加同步锁
 * @date 2019/3/28 21:39 创建
 **/
public class LazyOne {

    //静态块，公共内存区域
    private static LazyOne lazy = null;

    public static   synchronized LazyOne getInstance(){

        //调用方法之前，先判断
        //如果没有初始化，将其进行初始化,并且赋值
        //将该实例缓存好
        if(lazy == null){
            //两个线程都会进入这个if里面
            lazy = new LazyOne();
        }
        //如果已经初始化，直接返回之前已经保存好的结果
        return lazy;

    }
}
