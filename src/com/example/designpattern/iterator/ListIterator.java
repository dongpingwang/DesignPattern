package com.example.designpattern.iterator;

import java.util.Vector;

/**
 * Author: Dongping Wang
 * Date: 2020/12/8
 * Description:迭代器实现类
 */
public class ListIterator implements Iterator {
    private Vector<Integer> vector;

    private int current = 0;

    public ListIterator(Vector<Integer> vector) {
        this.vector = vector;
    }

    @Override
    public int next() {
        return vector.get(current++);
    }

    @Override
    public int remove() {
        return vector.remove(current);
    }

    @Override
    public boolean hasNext() {
        if (current >= vector.size()) {
            return false;
        } else {
            return true;
        }
    }
}
