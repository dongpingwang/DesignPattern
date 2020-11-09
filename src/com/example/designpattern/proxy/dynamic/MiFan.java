package com.example.designpattern.proxy.dynamic;

/**
 * Author: Dongping Wang
 * Date: 2020/11/8
 * Description:
 */
public class MiFan extends Scalper implements IMiPhone {

    @Override
    public void buy() {
        System.out.println("完全抢不到啊，吼吼吼");
    }
}
