package com.luciuswong.behavioral.mediator;


public class Label extends javafx.scene.control.Label implements UIControl {
	private UIMediator mediator;

	public Label(UIMediator mediator) {
		this.mediator = mediator;
		this.setMinWidth(100);
		this.setText("Label");
		mediator.register(this);
	}

	@Override
	public void controlChanged(UIControl control) {
		setText("Changes from " + control.getControlName());
	}

	@Override
	public String getControlValue() {
		return getText();
	}
}