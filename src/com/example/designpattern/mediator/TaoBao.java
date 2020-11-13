package com.example.designpattern.mediator;

/**
 * Author: Dongping Wang
 * Date: 2020/11/13
 * Description: 淘宝，充当中介角色
 */
public class TaoBao {

    public void shopDeal(Shopper shopper, Saler saler) {
        shopper.shopDeal();
        saler.shopDeal();
    }
}
