package com.example.designpattern.visitor;

/**
 * Author: Dongping Wang
 * Date: 2020/12/13
 * Description:情景类
 */
public class Client {

    public static void main(String[] args) {
        // 元素
        CommDeveloper commDeveloper = new CommDeveloper();
        DeveloperLeader developerLeader = new DeveloperLeader();
        // 访问者
        BossVisitor bossVisitor = new BossVisitor();
        // 访问者访问元素
        commDeveloper.accept(bossVisitor);
        developerLeader.accept(bossVisitor);
    }
}
