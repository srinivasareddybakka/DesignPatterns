package com.designpatterns.commanddesignpattern.remote;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl();
        Light livingRoomLight=new Light("Living Room");
        Light kitchenLight=new Light("Kitchen");
        CeilingFan ceilingFan=new CeilingFan("Living Room");


    }
}
