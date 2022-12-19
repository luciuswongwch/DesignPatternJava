package com.luciuswong.creational.factory;

import com.luciuswong.creational.factory.message.Message;


public abstract class MessageCreator {
    public Message getMessage() {
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    protected abstract Message createMessage();
}