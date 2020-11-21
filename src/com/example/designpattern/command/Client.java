package com.example.designpattern.command;

import com.example.designpattern.command.command.NextCommand;
import com.example.designpattern.command.command.PlayCommand;

/**
 * Author: Dongping Wang
 * Date: 2020/11/21
 * Description: 情景类
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("晚上十点半，上床听歌睡觉...");
        // 随机来首歌
        Invoker invoker = new Invoker(new PlayCommand());
        invoker.execute();
        // 不太喜欢，切下一曲
        invoker = new Invoker(new NextCommand());
        invoker.execute();
    }
}
