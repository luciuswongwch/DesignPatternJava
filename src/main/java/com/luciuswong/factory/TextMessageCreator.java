package com.luciuswong.factory;

import com.luciuswong.factory.message.Message;
import com.luciuswong.factory.message.TextMessage;


public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}