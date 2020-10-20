package com.example.designpattern.singleton;

/**
 * Author: Dongping Wang
 * Date: 2020/10/20
 * Description: 静态内部类形式的单例模式
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {

    }

    private static class Holder{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return Holder.instance;
    }
}
