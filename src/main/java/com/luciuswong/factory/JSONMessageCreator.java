package com.luciuswong.factory;

import com.luciuswong.factory.message.JSONMessage;
import com.luciuswong.factory.message.Message;


public class JSONMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
