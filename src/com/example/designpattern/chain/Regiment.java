package com.example.designpattern.chain;

/**
 * Author: Dongping Wang
 * Date: 2020/11/28
 * Description:
 */
public class Regiment extends Solider {

    public Regiment(int level) {
        super(level);
    }

    @Override
    public void task() {
        System.out.println("团长上");
    }
}
