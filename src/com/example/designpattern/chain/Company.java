package com.example.designpattern.chain;

/**
 * Author: Dongping Wang
 * Date: 2020/11/28
 * Description:
 */
public class Company extends Solider {

    public Company(int level) {
        super(level);
    }

    @Override
    public void task() {
        System.out.println("连长上");
    }
}
