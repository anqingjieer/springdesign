package com.prototype.simple.myself;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/30 19:30 创建
 **/
public class Chrigen {
    String name;
    Integer a ;
    String tar ;

    public Chrigen(String name, Integer a, String tar) {
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
