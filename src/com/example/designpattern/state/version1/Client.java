package com.example.designpattern.state.version1;

/**
 * Author: Dongping Wang
 * Date: 2020/12/14
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteState1());
        context.handle1();
    }
}
