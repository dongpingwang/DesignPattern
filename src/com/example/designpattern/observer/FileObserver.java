package com.example.designpattern.observer;

/**
 * Author: Dongping Wang
 * Date: 2020/12/9
 * Description:观察者实现类
 */
public class FileObserver implements IFileObserver {
    @Override
    public void insertFile() {
        System.out.println("监听到文件新增");
    }

    @Override
    public void deleteFile() {
        System.out.println("监听到文件删除");
    }
}
