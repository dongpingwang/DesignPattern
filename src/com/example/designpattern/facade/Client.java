package com.example.designpattern.facade;

/**
 * Author: Dongping Wang
 * Date: 2020/12/12
 * Description:情景类
 */
public class Client {
    public static void main(String[] args) {
        // 我们平时去商店买东西，用微信或者支付宝付款过程
        CounterCode counterCode = new CounterCode();
        counterCode.alipayCollect();
    }
}
