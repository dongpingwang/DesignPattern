package com.example.designpattern.facade;

/**
 * Author: Dongping Wang
 * Date: 2020/12/12
 * Description:微信收款
 */
public class WXCollectMoney implements ICollectMoney {

    @Override
    public void collect() {
        System.out.println("微信到账10元");
    }
}
