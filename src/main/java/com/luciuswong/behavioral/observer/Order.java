package com.luciuswong.behavioral.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Order {
    private String id;
    private double shippingCost;
    private double itemTotal;
    private double discount;
    private int count;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String id) {
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public double getOrderTotal() {
        return itemTotal - discount + shippingCost;
    }

    public void addItem(double price) {
        itemTotal += price;
        count++;
        observers.forEach(o -> o.updated(this));
    }

    public int getCount() {
        return count;
    }
    public void setShippingCost(double cost) {
        this.shippingCost = cost;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getItemTotal() {
        return itemTotal;
    }

    @Override
    public String toString() {
        return "Order# " + id + "\nItem total: " + itemTotal + "\nNo. of items: " + count
                + "\nShipping cost: " + shippingCost + "\nDiscount: " + discount
                + "\nOrder total: " + getOrderTotal();
    }
}