package com.example.designpattern.facade;

/**
 * Author: Dongping Wang
 * Date: 2020/12/12
 * Description:柜台二维码
 */
public class CounterCode {
    private ICollectMoney wx, alipay;

    public CounterCode() {
        wx = new WXCollectMoney();
        alipay = new AliPayCollectMoney();
    }


    public void wxCollect() {
        wx.collect();
    }

    public void alipayCollect() {
        alipay.collect();
    }
}
