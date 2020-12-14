package com.example.designpattern.state;

/**
 * Author: Dongping Wang
 * Date: 2020/12/14
 * Description:懒惰状态
 */
public class LazyState implements IState {

    @Override
    public void doing() {
        System.out.println("lazy");

    }

    @Override
    public void setContext(Context context) {
        context.setState(this);
    }
}
