package com.luciuswong.behavioral.template;

import java.util.Map;


public class TextPrinter extends OrderPrinter {
    @Override
    protected String start() {
        return "Order details";
    }
    @Override
    protected String formatOrderNumber(Order order) {
        return "Order #: " + order.getId();
    }
    @Override
    protected String formatItems(Order order) {
        StringBuilder builder = new StringBuilder("--- Item list ---");
        for (Map.Entry<String, Double> entry: order.getItems().entrySet()) {
            builder.append("\n" + entry.getKey() + "\t$" + entry.getValue());
        }
        return builder.toString();
    }
    @Override
    protected String formatTotal(Order order) {
        return "Total: $" + order.getTotal();
    }
    @Override
    protected String end() {
        return "-----------------";
    }
}