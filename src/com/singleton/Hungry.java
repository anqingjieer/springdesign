package com.singleton;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:饿汗试单利模式，在实例化之前创建不管你使用不使用，先new出来再说，避免出现线程安全性问题
 * <b>饿汗式单例在类被加载的时候去实现，并且创建单例对象，在用户体验上比懒汉式好一点。运行的效率好一点</b>
 *
 * @date 2019/3/28 21:15 创建
 **/
public class Hungry {

    public Hungry(){};
    /**
     * 先静态后动态，先属性后方法，先上后下
     */
    private final static Hungry h = new Hungry();
    public  Hungry getInstance(){
        return h;
    }

}
