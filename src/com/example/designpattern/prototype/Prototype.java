package com.example.designpattern.prototype;

/**
 * Author: Dongping Wang
 * Date: 2020/11/10
 * Description:原型模式
 */
public class Prototype implements Cloneable {
    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
