package com.example.designpattern.state;

/**
 * Author: Dongping Wang
 * Date: 2020/12/14
 * Description:上下文
 */
public class Context {

    private IState state;

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void doing() {
        state.doing();
    }

}
