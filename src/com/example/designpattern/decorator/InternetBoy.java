package com.example.designpattern.decorator;

/**
 * Author: Dongping Wang
 * Date: 2020/11/28
 * Description:
 */
public class InternetBoy extends BoyDecorator {

    public InternetBoy(IBoy boy) {
        super(boy);
    }

    @Override
    public void chat() {
        super.chat();
        fake();
    }

    private void fake() {
        // 下面是一些装饰自己的东西：
        // 比如更换女生头像
        // System.out.println("换一个小清新的MM头像");
        // 现实中文静的人，网络中也可以表现的很外向
        System.out.println("我是一个活泼外向的小男孩");
    }
}
