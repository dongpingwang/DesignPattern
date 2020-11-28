package com.example.designpattern.chain;

/**
 * Author: Dongping Wang
 * Date: 2020/11/28
 * Description:
 */
public class War implements IWar {

    private int level;

    public War(int level) {
        this.level = level;
    }

    @Override
    public int getLevel() {
        return level;
    }
}
