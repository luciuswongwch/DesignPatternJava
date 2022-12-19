package com.luciuswong.structural.bridge;

public class Client {
	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
		collection.offer(100);
		collection.offer(400);
		collection.offer(99);
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		// expected null
		System.out.println(collection.poll());
	}
}