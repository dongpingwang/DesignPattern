package com.example.designpattern.decorator;

/**
 * Author: Dongping Wang
 * Date: 2020/11/28
 * Description:装饰器
 */
public abstract class BoyDecorator implements IBoy {

    private IBoy boy;

    public BoyDecorator(IBoy boy) {
        this.boy = boy;
    }

    @Override
    public void chat() {
        this.boy.chat();
    }
}
