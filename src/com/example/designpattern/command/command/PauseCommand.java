package com.example.designpattern.command.command;

import com.example.designpattern.command.receiver.PauseReceiver;

/**
 * Author: Dongping Wang
 * Date: 2020/11/21
 * Description:暂停命令
 */
public class PauseCommand implements ICommand {

    PauseReceiver receiver;

    public PauseCommand() {
        receiver = new PauseReceiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
