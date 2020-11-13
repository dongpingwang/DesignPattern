package com.example.designpattern.mediator;

/**
 * Author: Dongping Wang
 * Date: 2020/11/13
 * Description:卖家
 */
public class Saler implements IDeal {

    // 自发行为，与买家无关
    public void discount() {
        System.out.println("趁着双十一来波促销");
    }

    // 依赖行为，与买家有关
    @Override
    public void shopDeal() {
        System.out.println("卖出台MAC，销售额+2w元");
    }

    // 自发行为，与买家无关
    public void total() {
        System.out.println("今年双十一下单10w，销售额为2000w元，赚发了!");
    }
}
