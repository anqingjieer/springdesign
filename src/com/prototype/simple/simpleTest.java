package com.prototype.simple;





/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/30 19:16 创建
 **/

public class simpleTest  {
    public static void main(String[] args) {
        Son son = new Son();
        son.name = "TOm";
        son.names.add("111");
        System.out.println(son);
        try {
            Son son1=(Son) son.clone();
            System.out.println(son1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
