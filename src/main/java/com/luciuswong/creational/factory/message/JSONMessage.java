package com.luciuswong.creational.factory.message;


public class JSONMessage extends Message {
	@Override
	public String getContent() {
		return "{\"JSON]\":[]}";
	}
}
