package com.strategy;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:
 * @date 2019/3/31 17:11 创建
 **/
public class Status {
    String data;
    String msg;
    Integer status;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Status(String data, String msg, Integer status) {
        this.data = data;
        this.msg = msg;
        this.status = status;
    }
}
