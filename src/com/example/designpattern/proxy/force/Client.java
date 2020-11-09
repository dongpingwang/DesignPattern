package com.example.designpattern.proxy.force;

/**
 * Author: Dongping Wang
 * Date: 2020/11/8
 * Description:情景类
 */
public class Client {
    public static void main(String[] args) {
        MiFan miFan = new MiFan();
        miFan.getProxy().buy();
    }
}
