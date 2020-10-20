package com.example.designpattern.singleton;

/**
 * Author: Dongping Wang
 * Date: 2020/10/20
 * Description:饿汉式单例模式
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
