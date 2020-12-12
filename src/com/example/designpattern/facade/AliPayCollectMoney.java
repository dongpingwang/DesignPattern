package com.example.designpattern.facade;

/**
 * Author: Dongping Wang
 * Date: 2020/12/12
 * Description:支付宝收款
 */
public class AliPayCollectMoney implements ICollectMoney {

    @Override
    public void collect() {
        System.out.println("支付宝到账10元");
    }
}
