package com.luciuswong.behavioral.observer;


public class PriceObserver implements OrderObserver {
    @Override
    public void updated(Order order) {
        double itemTotal = order.getItemTotal();
        if (itemTotal >= 500) {
            order.setDiscount(20);
        } else if (itemTotal >= 200) {
            order.setDiscount(10);
        }
    }
}