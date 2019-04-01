package com.prototype.simple.myself;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/30 19:32 创建
 **/
public class Teacher {
    String name;
    Integer a ;
    String tar ;
    String bb;

    public Teacher(String name, Integer a, String tar, String bb) {
        this.name = name;
        this.a = a;
        this.tar = tar;
        this.bb = bb;
    }

    public Teacher(String name, Integer a, String tar) {
        this.name = name;
        this.a = a;
        this.tar = tar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public String getTar() {
        return tar;
    }

    public void setTar(String tar) {
        this.tar = tar;
    }

}
