package com.luciuswong.abstractfactory.gcp;

import com.luciuswong.abstractfactory.Instance;
import com.luciuswong.abstractfactory.ResourceFactory;
import com.luciuswong.abstractfactory.Storage;


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