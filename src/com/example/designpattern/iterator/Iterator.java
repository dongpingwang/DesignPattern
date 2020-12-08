package com.example.designpattern.iterator;

/**
 * Author: Dongping Wang
 * Date: 2020/12/8
 * Description:迭代器接口
 */
public interface Iterator {
    // 下一个元素
    int next();

    // 删除当前元素
    int remove();

    // 是否存在下个元素
    boolean hasNext();
}
