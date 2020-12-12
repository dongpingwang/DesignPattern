package com.example.designpattern.memo;

/**
 * Author: Dongping Wang
 * Date: 2020/12/12
 * Description:备忘录管理员角色
 */
public class Caretaker {

    private Memo memo;

    public Memo getMemo() {
        return memo;
    }

    public void setMemo(Memo memo) {
        this.memo = memo;
    }
}
