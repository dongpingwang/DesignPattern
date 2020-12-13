package com.example.designpattern.visitor;

/**
 * Author: Dongping Wang
 * Date: 2020/12/13
 * Description:元素接口
 */
public interface IEmployee {

    void work();

    void accept(IVisitor visitor);
}
