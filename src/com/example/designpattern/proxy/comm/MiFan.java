package com.example.designpattern.proxy.comm;

/**
 * Author: Dongping Wang
 * Date: 2020/11/8
 * Description:米粉
 */
public class MiFan implements IMiPhone {

    @Override
    public void buy() {
        System.out.println("完全抢不到啊，吼吼吼");
    }
}
