package com.luciuswong.behavioral.state;


public class Paid implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Cancellation succeed. Full refund will be issued within the next few business days.");
        return 0;
    }
}