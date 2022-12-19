package com.luciuswong.creational.abstractfactory.aws;

import com.luciuswong.creational.abstractfactory.Instance;
import com.luciuswong.creational.abstractfactory.ResourceFactory;
import com.luciuswong.creational.abstractfactory.Storage;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }

//    @Override
//    public Network createNetwork(String networkName) {
//        return null;
//    }
}