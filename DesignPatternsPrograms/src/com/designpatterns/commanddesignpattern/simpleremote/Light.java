package com.designpatterns.commanddesignpattern.simpleremote;

public class Light {
    private boolean on;

    public void switchOn() {
        on = true;
        System.out.println(" Light is On");
    }

    public void switchOff() {
        on = false;
        System.out.println(" Light is Off");
    }
}
