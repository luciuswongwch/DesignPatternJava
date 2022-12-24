package com.luciuswong.behavioral.nullobject;


public class Client {
	public static void main(String[] args) {
		ComplexService service = new ComplexService("Simple report", new StorageService());
		service.generateReport();

		service = new ComplexService("Null object report", new NullStorageService());
		service.generateReport();
	}
}