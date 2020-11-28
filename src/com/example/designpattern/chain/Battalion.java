package com.example.designpattern.chain;

/**
 * Author: Dongping Wang
 * Date: 2020/11/28
 * Description:
 */
public class Battalion extends Solider {

    public Battalion(int level) {
        super(level);
    }

    @Override
    public void task() {
        System.out.println("营长上");
    }
}
