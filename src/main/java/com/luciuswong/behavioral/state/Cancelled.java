package com.luciuswong.behavioral.state;


public class Cancelled implements OrderState {
    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Order is already cancelled.");
    }
}