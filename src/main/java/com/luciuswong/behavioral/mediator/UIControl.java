package com.luciuswong.behavioral.mediator;


public interface UIControl {
	void controlChanged(UIControl control);
	
	String getControlValue();
	
	default String getControlName() {
		return this.getClass().getSimpleName();
	}
}
