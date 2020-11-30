package com.example.designpattern.strategy;

/**
 * Author: Dongping Wang
 * Date: 2020/11/30
 * Description:情景类
 */
public class Client {

    public static void main(String[] args) {
        int num1 = 6, num2 = 3;
        // 6 + 3
        AddOperate addOperate = new AddOperate();
        Calculator calc = new Calculator(addOperate);
        int sum = calc.operate(num1, num2);
        System.out.printf("%d + %d = %d \n", num1, num2, sum);
        // 6 - 3
        SubOperate subOperate = new SubOperate();
        calc = new Calculator(subOperate);
        int diff = calc.operate(num1, num2);
        System.out.printf("%d - %d = %d ", num1, num2, diff);

    }
}
