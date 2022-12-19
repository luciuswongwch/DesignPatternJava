package com.luciuswong.creational.factory;

import com.luciuswong.creational.factory.message.JSONMessage;
import com.luciuswong.creational.factory.message.Message;


public class JSONMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
