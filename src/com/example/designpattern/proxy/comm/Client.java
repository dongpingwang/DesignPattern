package com.example.designpattern.proxy.comm;

/**
 * Author: Dongping Wang
 * Date: 2020/11/8
 * Description:情景类
 */
public class Client {
    public static void main(String[] args) {
        Scalper scalper = new Scalper();
        scalper.buy();
    }
}
