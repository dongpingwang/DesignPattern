package com.example.designpattern.visitor;

/**
 * Author: Dongping Wang
 * Date: 2020/12/13
 * Description:具体的访问者
 */
public class BossVisitor implements IVisitor {
    @Override
    public void visit(CommDeveloper commDeveloper) {
        commDeveloper.work();
    }

    @Override
    public void visit(DeveloperLeader developerLeader) {
        developerLeader.work();
    }
}
