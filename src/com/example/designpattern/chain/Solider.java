package com.example.designpattern.chain;

/**
 * Author: Dongping Wang
 * Date: 2020/11/28
 * Description: 军人
 */
public abstract class Solider {

    // 军衔
    private int level;
    // 下一级
    private Solider next;

    public Solider(int level) {
        this.level = level;
    }

    // 职责
    public abstract void task();

    // 交给下一级处理
    public void setNext(Solider next) {
        this.next = next;
    }

    // 封装责任链中请求处理
    public void war(int level) {
        if (this.level == level) {
            task();
        } else {
            if (next != null) {
                next.war(level);
            }
        }
    }
}
