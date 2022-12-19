package com.luciuswong.creational.abstractfactory.aws;

import com.luciuswong.creational.abstractfactory.Storage;


public class S3Storage implements Storage {
    public S3Storage(int capacityInMib) {
        System.out.println("Allocated " + capacityInMib + " on S3");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 storage";
    }
}
