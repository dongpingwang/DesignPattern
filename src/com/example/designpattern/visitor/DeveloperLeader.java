package com.example.designpattern.visitor;

/**
 * Author: Dongping Wang
 * Date: 2020/12/13
 * Description:具体的元素
 */
public class DeveloperLeader implements IEmployee {
    @Override
    public void work() {
        System.out.println("软件部主管，开会，安排任务...");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
