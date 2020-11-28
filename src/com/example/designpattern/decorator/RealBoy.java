package com.example.designpattern.decorator;

/**
 * Author: Dongping Wang
 * Date: 2020/11/28
 * Description:
 */
public class RealBoy implements IBoy {

    @Override
    public void chat() {
        System.out.println("陌生人，你好!");
        System.out.println("我是GG，15岁");
    }
}
