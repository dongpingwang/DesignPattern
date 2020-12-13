package com.example.designpattern.memo;

/**
 * Author: Dongping Wang
 * Date: 2020/12/12
 * Description:发起人
 */
public class Originator {

    // 自身状态
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建备忘录
    public Memo createMemo() {
        return new Memo(state);
    }
    // 通过备忘录恢复自身状态
    public void restoreMemo(Memo memo) {
        setState(memo.getState());
    }
}
