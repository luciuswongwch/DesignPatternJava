package com.luciuswong.behavioral.strategy;

import java.util.Collection;
import java.util.Iterator;


public class SummaryPrinter implements OrderPrinter {
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("************ Summary report ************");
        Iterator<Order> iterator = orders.iterator();
        double total = 0;
        for (int i = 1; iterator.hasNext(); i++) {
            Order order = iterator.next();
            System.out.println(i + "\tid " + order.getId() + ", date " + order.getDate() + ", itemCount " + order.getItems().size() + ", subtotal " + order.getTotal());
            total += order.getTotal();
        }
        System.out.println("****************************************");
        System.out.println("Order total: " + total);
    }
}