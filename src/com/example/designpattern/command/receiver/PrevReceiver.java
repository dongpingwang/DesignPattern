package com.example.designpattern.command.receiver;

/**
 * Author: Dongping Wang
 * Date: 2020/11/21
 * Description: 执行播放命令的接收者
 */
public class PrevReceiver implements IReceiver{
    @Override
    public void action() {
        System.out.println("上一曲");
    }
}
