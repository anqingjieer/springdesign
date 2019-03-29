package com.singleton.Test;

import com.singleton.Seriable;

import java.io.*;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/28 22:08 创建
 **/
public class SeriableTest {


    public static void main(String[] args) {
        Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();
        try {
            FileOutputStream fileInputStream = new FileOutputStream("Seriable.obj");
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(fileInputStream);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("Seriable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Seriable)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

}