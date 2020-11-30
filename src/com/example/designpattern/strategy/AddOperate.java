package com.example.designpattern.strategy;

/**
 * Author: Dongping Wang
 * Date: 2020/11/30
 * Description:加法运算
 */
public class AddOperate implements IOperate {
    @Override
    public int operate(int num1, int num2) {
        return num1 + num2;
    }
}
