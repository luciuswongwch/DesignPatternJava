package com.luciuswong.creational.abstractfactory;


public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capMib);
    // Network createNetwork(String networkName);
}