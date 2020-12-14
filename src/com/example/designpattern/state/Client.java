package com.example.designpattern.state;

/**
 * Author: Dongping Wang
 * Date: 2020/12/14
 * Description:
 */
public class Client {
    public static void main(String[] args) {

        IState fight = new FightState();
        IState lazy = new LazyState();
        Context context = new Context();

        context.setState(fight);
        context.doing();
    }
}
