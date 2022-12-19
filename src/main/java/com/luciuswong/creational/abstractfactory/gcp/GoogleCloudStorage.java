package com.luciuswong.creational.abstractfactory.gcp;

import com.luciuswong.creational.abstractfactory.Storage;


public class GoogleCloudStorage implements Storage {
    public GoogleCloudStorage(int capacityInMib) {
        System.out.println("Allocated " + capacityInMib + " on Google cloud storage");
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google Cloud storage";
    }
}
