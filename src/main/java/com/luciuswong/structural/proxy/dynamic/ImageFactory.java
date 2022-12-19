package com.luciuswong.structural.proxy.dynamic;

import java.lang.reflect.Proxy;

import com.luciuswong.structural.proxy.Image;


public class ImageFactory {
	public static Image getImage(String filename) {
		return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[] {Image.class}, new ImageInvocationHandler(filename));
	}
}