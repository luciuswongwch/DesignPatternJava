package com.luciuswong.behavioral.template;


public class Client {
	public static void main(String[] args) {
		Order order = new Order("100");
		order.addItem("Soda", 2.50);
		order.addItem("Sandwiches", 11.95);
		order.addItem("Pizza", 15.95);
		OrderPrinter printer = new TextPrinter();
		printer.printOrder(order, "100.txt");
		// OrderPrinter printer = new HtmlPrinter();
		// printer.printOrder(order, "100.html");
	}
}