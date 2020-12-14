package com.example.designpattern.state.version1;

/**
 * Author: Dongping Wang
 * Date: 2020/12/14
 * Description:
 */
public class ConcreteState2 extends State {

    @Override
    public void handle1() {
        context.setState(Context.STATE_2);
        context.handle1();
    }

    @Override
    public void handle2() {
        System.out.println("handl2");
    }
}
