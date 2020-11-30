package com.example.designpattern.strategy;

/**
 * Author: Dongping Wang
 * Date: 2020/11/30
 * Description:计算器
 */
public class Calculator {

    private IOperate operator;

    public Calculator(IOperate operator) {
        this.operator = operator;
    }

    public int operate(int num1, int num2) {
        return operator.operate(num1, num2);
    }
}
