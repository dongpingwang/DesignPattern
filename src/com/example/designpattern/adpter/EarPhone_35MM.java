package com.example.designpattern.adpter;

/**
 * Author: Dongping Wang
 * Date: 2020/12/6
 * Description:
 */
public class EarPhone_35MM implements IEarPhone {
    @Override
    public void listenMusic() {
        System.out.println("用3.5mm耳机听歌");
    }
}
