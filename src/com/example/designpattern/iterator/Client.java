package com.example.designpattern.iterator;

/**
 * Author: Dongping Wang
 * Date: 2020/12/8
 * Description:情景类
 */
public class Client {

    public static void main(String[] args) {
        IList list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "--");
        }
    }
}
