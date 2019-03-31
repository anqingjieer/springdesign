package com.strategy;

/**
 * @author 鲁朋博(pengbo.lu @ ucarinc.com)
 * @version 1.0
 * @description:订单
 * @date 2019/3/31 17:07 创建
 **/
public class Order {
    Integer account;
    String description;
    Integer count;

    public Order(Integer account, String description, Integer count) {
        this.account = account;
        this.description = description;
        this.count = count;
    }
    public Status pay(Pay payType){
        return payType.pay(this.description, this.account);
    }
    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
