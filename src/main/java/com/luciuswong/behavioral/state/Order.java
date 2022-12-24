package com.luciuswong.behavioral.state;


public class Order {
	private OrderState currentState;

	public Order() {
		this.currentState = new New();
	}

	public double cancel() {
		double charges = currentState.handleCancellation();
		currentState = new Cancelled();
		return charges;
	}
	public void paymentSuccessful() {
		currentState = new Paid();
	}
	public void dispatched() {
		currentState = new InTransit();
	}
	public void delivered() {
		currentState = new Delivered();
	}
}