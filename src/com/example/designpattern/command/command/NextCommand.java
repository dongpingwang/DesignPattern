package com.example.designpattern.command.command;

import com.example.designpattern.command.receiver.NextReceiver;

/**
 * Author: Dongping Wang
 * Date: 2020/11/21
 * Description:暂停命令
 */
public class NextCommand implements ICommand {

    NextReceiver receiver;

    public NextCommand() {
        receiver = new NextReceiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
