package com.example.designpattern.template;

public class AGTeam extends GloryKingGame {

    @Override
    void destroyTurret() {
        System.out.println("推了中路一塔");
        System.out.println("推了中路二塔");
        System.out.println("推了中路高地塔");
        System.out.println("推了水晶");
    }

    @Override
    void killEnemy() {
        System.out.println("开局被敌方拿了一血...");
    }
}