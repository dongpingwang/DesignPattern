package com.example.designpattern.observer;

/**
 * Author: Dongping Wang
 * Date: 2020/12/9
 * Description:情景类
 */
public class Client {

    public static void main(String[] args) {
        // 被观察者
        FileSystem fileSystem = new FileSystem();
        // 观察者
        FileObserver fileObserver = new FileObserver();
        // 注册监听
        fileSystem.registerFileObserver(fileObserver);
        fileSystem.insertFile();
    }
}
