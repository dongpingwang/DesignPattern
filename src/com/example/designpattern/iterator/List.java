package com.example.designpattern.iterator;

import java.util.Vector;

/**
 * Author: Dongping Wang
 * Date: 2020/12/8
 * Description:具体的容器
 */
public class List implements IList {
    private Vector<Integer> vector = new Vector<>();

    @Override
    public void add(int item) {
        vector.add(item);
    }

    @Override
    public void remove(int item) {
        vector.remove(item);
    }

    @Override
    public Iterator iterator() {
        return new ListIterator(vector);
    }
}
