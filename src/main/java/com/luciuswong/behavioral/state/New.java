package com.luciuswong.behavioral.state;


public class New implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Cancellation succeed. No fee is charged for cancelling new order.");
        return 0;
    }
}