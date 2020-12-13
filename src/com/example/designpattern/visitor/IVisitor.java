package com.example.designpattern.visitor;

/**
 * Author: Dongping Wang
 * Date: 2020/12/13
 * Description:访问者接口
 */
public interface IVisitor {
    void visit(CommDeveloper commDeveloper);
    void visit(DeveloperLeader developerLeader);
}
