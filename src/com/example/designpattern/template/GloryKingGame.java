package com.example.designpattern.template;

public abstract class GloryKingGame {
    // 基本方法
    abstract void destroyTurret();
    // 基本方法
    abstract void killEnemy();

    // 模板方法
    public void victory() {
        killEnemy();
        destroyTurret();
        System.out.println("取得胜利！");
    }
}