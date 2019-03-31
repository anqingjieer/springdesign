package com.singleton;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:使用内部类实现单例模式
 * @date 2019/3/30 16:46 创建
 **/
public class LazyThree {
    private boolean initialized = false;
    private LazyThree(){

        synchronized (LazyThree.class){
            if(initialized == false){
                initialized = !initialized;
            }else{
                throw new RuntimeException("单例已被侵犯");
            }
        }

    }
    //懒汉式单例
    //特点：在外部类被调用的时候内部类才会被加载
    //内部类一定是要在方法调用之前初始化
    //巧妙地避免了线程安全问题

    //这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
    //完美地屏蔽了这两个缺点
    //史上最牛B的单例模式的实现方式
    public final static LazyThree getInstance() {
        return  lz.lz;
    }
    public static class lz{
        private final static LazyThree lz = new LazyThree();
    }
}
