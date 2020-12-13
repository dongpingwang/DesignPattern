package com.example.designpattern.visitor;

/**
 * Author: Dongping Wang
 * Date: 2020/12/13
 * Description:具体的元素
 */
public class CommDeveloper implements IEmployee {
    @Override
    public void work() {
        System.out.println("普通工程师，修复Bug，需求开发...");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
