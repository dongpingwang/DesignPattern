package com.example.designpattern.mediator;

/**
 * Author: Dongping Wang
 * Date: 2020/11/13
 * Description: 买家
 */
public class Shopper implements IDeal {

    public Shopper() {

    }

    // 自发行为，与卖家无关
    public void think() {
        System.out.println("双十一了啊...对自己好点吧!");
    }
    // 依赖行为，与卖家有关
    @Override
    public void shopDeal() {
        System.out.println("买台MAC，存款-2w元");
    }
    // 自发行为，与卖家无关
    public void after() {
        System.out.println("又要吃土了呜呜呜~");
    }
}
