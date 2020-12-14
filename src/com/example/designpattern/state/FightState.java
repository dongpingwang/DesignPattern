package com.example.designpattern.state;

/**
 * Author: Dongping Wang
 * Date: 2020/12/14
 * Description:努力奋斗状态
 */
public class FightState implements IState {

    @Override
    public void doing() {
        System.out.println("fight");
    }

    @Override
    public void setContext(Context context) {
        context.setState(this);
    }
}
