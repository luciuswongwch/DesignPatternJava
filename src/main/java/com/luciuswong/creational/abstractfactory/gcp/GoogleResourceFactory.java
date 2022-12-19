package com.luciuswong.creational.abstractfactory.gcp;

import com.luciuswong.creational.abstractfactory.Instance;
import com.luciuswong.creational.abstractfactory.ResourceFactory;
import com.luciuswong.creational.abstractfactory.Storage;


public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }

//    @Override
//    public Network createNetwork(String networkName) {
//        return null;
//    }
}