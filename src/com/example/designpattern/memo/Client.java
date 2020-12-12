package com.example.designpattern.memo;

/**
 * Author: Dongping Wang
 * Date: 2020/12/12
 * Description: 情景类
 */
public class Client {

    public static void main(String[] args) {
        // 起始人
        Originator originator = new Originator();
        originator.setState("状态1");
        // 备忘录管理员
        Caretaker caretaker = new Caretaker();
        caretaker.setMemo(originator.createMemo());
        // 更新状态
        originator.setState("状态2");
        System.out.println("getState: " + originator.getState());
        // 恢复状态
        originator.restoreMemo(caretaker.getMemo());
        System.out.println("getState: " + originator.getState());
    }
}
