package com.luciuswong.creational.factory;

import com.luciuswong.creational.factory.message.Message;
import com.luciuswong.creational.factory.message.TextMessage;


public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}