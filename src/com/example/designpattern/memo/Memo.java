package com.example.designpattern.memo;

/**
 * Author: Dongping Wang
 * Date: 2020/12/12
 * Description:备忘录
 */
public class Memo {
    private String state;

    public Memo(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
