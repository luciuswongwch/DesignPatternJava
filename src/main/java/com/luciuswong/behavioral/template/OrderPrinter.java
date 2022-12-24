package com.luciuswong.behavioral.template;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class OrderPrinter {
    public void printOrder(Order order, String file) {
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println(start());
            writer.println(formatOrderNumber(order));
            writer.println(formatItems(order));
            writer.println(formatTotal(order));
            writer.println(end());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract String start();
    protected abstract String formatOrderNumber(Order order);
    protected abstract String formatItems(Order order);
    protected abstract String formatTotal(Order order);
    protected abstract String end();
}