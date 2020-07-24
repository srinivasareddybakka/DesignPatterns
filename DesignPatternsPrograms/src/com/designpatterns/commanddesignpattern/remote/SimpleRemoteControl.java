package com.designpatterns.commanddesignpattern.remote;

import com.designpatterns.commanddesignpattern.simpleremote.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
