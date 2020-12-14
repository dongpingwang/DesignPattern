package com.example.designpattern.state.version1;

/**
 * Author: Dongping Wang
 * Date: 2020/12/14
 * Description:
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle1();
    public abstract void handle2();
}
