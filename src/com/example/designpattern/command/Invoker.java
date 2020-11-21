package com.example.designpattern.command;

import com.example.designpattern.command.command.ICommand;

/**
 * Author: Dongping Wang
 * Date: 2020/11/21
 * Description:调用者
 */
public class Invoker {

    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
