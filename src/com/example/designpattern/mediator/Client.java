package com.example.designpattern.mediator;

/**
 * Author: Dongping Wang
 * Date: 2020/11/13
 * Description: 情景类
 */
public class Client {

    public static void main(String[] args) {
        // -----购买前纠结
        Saler saler = new Saler();
        saler.discount();
        Shopper shopper = new Shopper();
        shopper.think();
        // -----剁手一直爽
        TaoBao taoBao = new TaoBao();
        taoBao.shopDeal(shopper, saler);
        // -----钱包火葬场
        shopper.after();
    }
}
