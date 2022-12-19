package com.luciuswong.structural.proxy;


public class ImageFactory {
    public static Image getImage(String filename) {
        return new ImageProxy(filename);
    }
}