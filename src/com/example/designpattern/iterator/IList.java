package com.example.designpattern.iterator;

/**
 * Author: Dongping Wang
 * Date: 2020/12/8
 * Description:容器接口
 */
public interface IList {

    void add(int item);
    void remove(int item);
    Iterator iterator();
}
