package com.luciuswong.structural.proxy.dynamic;

import com.luciuswong.structural.proxy.Image;
import javafx.geometry.Point2D;


public class Client {
	public static void main(String[] args) {
		Image img = ImageFactory.getImage("A.bmp");
		img.setLocation(new Point2D(10, 10));
		System.out.println("Image location: " + img.getLocation());
		img.render();
	}
}
