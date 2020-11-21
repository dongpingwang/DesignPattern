package com.example.designpattern.command.command;

import com.example.designpattern.command.receiver.PlayReceiver;

/**
 * Author: Dongping Wang
 * Date: 2020/11/21
 * Description:暂停命令
 */
public class PlayCommand implements ICommand {

    PlayReceiver receiver;

    public PlayCommand() {
        receiver = new PlayReceiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
