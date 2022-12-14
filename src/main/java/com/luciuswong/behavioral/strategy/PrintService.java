package com.luciuswong.behavioral.strategy;

import java.util.LinkedList;


public class PrintService {
    private OrderPrinter printer;

    public PrintService() {
        this.printer = new SummaryPrinter();
    }

    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}