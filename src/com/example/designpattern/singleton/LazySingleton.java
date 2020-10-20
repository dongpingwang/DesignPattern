package com.example.designpattern.singleton;

/**
 * Author: Dongping Wang
 * Date: 2020/10/20
 * Description:双重加锁线程安全的懒汉式单例模式
 */
public class LazySingleton {

    private  static volatile LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
