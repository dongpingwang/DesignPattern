package com.example.designpattern.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * Author: Dongping Wang
 * Date: 2020/12/9
 * Description: 被观察者
 */
public class FileSystem {

    private List<IFileObserver> observers = new ArrayList<>();

    public FileSystem() {

    }

    public void insertFile() {
        System.out.println("增加一个文件");
        for (IFileObserver observer : observers) {
            observer.insertFile();
        }
    }

    public void deleteFile() {
        System.out.println("删除一个文件");
        for (IFileObserver observer : observers) {
            observer.deleteFile();
        }
    }

    public boolean registerFileObserver(IFileObserver observer) {
        return observer != null && !observers.contains(observer) && observers.add(observer);
    }

    public boolean unregisterFileObserver(IFileObserver observer) {
        return observers.remove(observer);
    }
}
