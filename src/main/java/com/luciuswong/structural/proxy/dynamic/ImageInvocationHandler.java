package com.luciuswong.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.luciuswong.structural.proxy.BitmapImage;
import com.luciuswong.structural.proxy.Image;

import javafx.geometry.Point2D;


public class ImageInvocationHandler implements InvocationHandler {
	private BitmapImage bitmapImage;
	private Point2D location;
	private String filename;
	private static final Method setLocationMethod;
	private static final Method getLocationMethod;
	private static final Method renderMethod;

	static {
		try {
			setLocationMethod = Image.class.getMethod("setLocation", new Class[] { Point2D.class });
			getLocationMethod = Image.class.getMethod("getLocation", null);
			renderMethod = Image.class.getMethod("render", null);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}
	}

	public ImageInvocationHandler(String filename) {
		this.filename = filename;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.equals(setLocationMethod)) {
			return handleSetLocation(args);
		} else if (method.equals(getLocationMethod)) {
			return handleGetLocation();
		} else if (method.equals(renderMethod)) {
			return handleRender();
		}
		return null;
	}

	private Object handleRender() {
		if (bitmapImage == null) {
			bitmapImage = new BitmapImage(filename);
		}
		bitmapImage.setLocation(location);
		return null;
	}

	private Point2D handleGetLocation() {
		if (bitmapImage != null) {
			return bitmapImage.getLocation();
		} else {
			return this.location;
		}
	}

	private Object handleSetLocation(Object[] args) {
		if (bitmapImage != null) {
			bitmapImage.setLocation((Point2D) args[0]);
		} else {
			this.location = (Point2D) args[0];
		}
		return null;
	}
}