package com.example.designpattern.adpter;

/**
 * Author: Dongping Wang
 * Date: 2020/12/6
 * Description:
 */
public class EarPhone_TypeC implements IEarPhone {
    @Override
    public void listenMusic() {
        System.out.println("用TypeC耳机听歌");
    }
}
