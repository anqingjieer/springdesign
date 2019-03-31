package com.prototype.simple;

import java.io.Closeable;
import java.util.ArrayList;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/30 19:05 创建
 **/
public class Son extends people{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
