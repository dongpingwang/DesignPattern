package com.example.designpattern.decorator;

/**
 * Author: Dongping Wang
 * Date: 2020/11/28
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        // 现实中文静的男孩
        RealBoy realBoy = new RealBoy();
        // 网络的外向活泼的男孩
        InternetBoy internetBoy = new InternetBoy(realBoy);
        realBoy.chat();
        internetBoy.chat();
    }
}
