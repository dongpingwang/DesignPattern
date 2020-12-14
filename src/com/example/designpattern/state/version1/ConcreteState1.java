package com.example.designpattern.state.version1;

/**
 * Author: Dongping Wang
 * Date: 2020/12/14
 * Description:
 */
public class ConcreteState1 extends State {

    @Override
    public void handle1() {
        System.out.println("handl1");
    }

    @Override
    public void handle2() {
        context.setState(Context.STATE_1);
        context.handle2();
    }
}
