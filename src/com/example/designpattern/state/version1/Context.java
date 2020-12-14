package com.example.designpattern.state.version1;

/**
 * Author: Dongping Wang
 * Date: 2020/12/14
 * Description:
 */
public class Context {

    public static final State STATE_1 = new ConcreteState1();
    public static final State STATE_2 = new ConcreteState2();

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle1() {
        System.out.println("context1");
        state.handle1();
    }

    public void handle2() {
        System.out.println("context2");
        state.handle2();
    }
}
