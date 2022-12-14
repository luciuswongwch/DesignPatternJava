package com.luciuswong.factory.message;


public abstract class Message {
	public abstract String getContent();
	public void addDefaultHeaders() {
		//Adds some default headers
	}
	public void encrypt() {
		//# Has some code to encrypt the content
	}
}
