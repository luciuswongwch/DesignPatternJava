package com.luciuswong.dependencyinversion;

public interface Formatter {
	public String format(Message message) throws FormatException;
}
