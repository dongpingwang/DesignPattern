package com.example.designpattern.command.command;

import com.example.designpattern.command.receiver.PrevReceiver;

/**
 * Author: Dongping Wang
 * Date: 2020/11/21
 * Description:暂停命令
 */
public class PrevCommand implements ICommand {

    PrevReceiver receiver;

    public PrevCommand() {
        receiver = new PrevReceiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
